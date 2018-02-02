package org.m1theo.tinkerforge.emf.client.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.m1theo.tinkerforge.emf.client.DeviceAdminListener;
import org.m1theo.tinkerforge.emf.model.Ecosystem;
import org.m1theo.tinkerforge.emf.model.GenericDevice;
import org.m1theo.tinkerforge.emf.model.IO4Device;
import org.m1theo.tinkerforge.emf.model.IODevice;
import org.m1theo.tinkerforge.emf.model.MBaseDevice;
import org.m1theo.tinkerforge.emf.model.MBrickd;
import org.m1theo.tinkerforge.emf.model.MDevice;
import org.m1theo.tinkerforge.emf.model.MSubDevice;
import org.m1theo.tinkerforge.emf.model.MSubDeviceHolder;
import org.m1theo.tinkerforge.emf.model.MTFConfigConsumer;
import org.m1theo.tinkerforge.emf.model.ModelPackage;
import org.m1theo.tinkerforge.emf.model.OHConfig;
import org.m1theo.tinkerforge.emf.model.OHTFDevice;
import org.m1theo.tinkerforge.emf.model.TFConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeviceAdminListenerImpl implements DeviceAdminListener {
  private Logger logger = LoggerFactory.getLogger(DeviceAdminListenerImpl.class);
  private OHConfig ohConfig;
  private Ecosystem ecosystem;

  public DeviceAdminListenerImpl(Ecosystem ecosystem, OHConfig ohConfig) {
    this.ecosystem = ecosystem;
    this.ohConfig = ohConfig;
  }

  @Override
  public void addDevice(Notification notification) {
    if (notification.getNotifier() instanceof MBrickd) {
      logger.debug("notifier is Brickd");
      int featureID = notification.getFeatureID(MBrickd.class);
      if (featureID == ModelPackage.MBRICKD__MDEVICES) {
        MDevice<?> mDevice = (MDevice<?>) notification.getNewValue();
        addMDevice(mDevice, mDevice.getUid(), null);
      }

    } else if (notification.getNotifier() instanceof MSubDeviceHolder<?>) {
      logger.trace("notification from subDeviceHolder");
      int featureID1 = notification.getFeatureID(MSubDeviceHolder.class);
      if (featureID1 == ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES) {
        logger.debug("MSubdevices Notifier called");
        MSubDevice<?> mSubDevice = (MSubDevice<?>) notification.getNewValue();
        addMDevice(mSubDevice, mSubDevice.getUid(), mSubDevice.getSubId());
      }
    } else {
      logger.debug("{} unhandled notifier {}", notification.getNotifier());
    }
  }

  @Override
  public void removeDevice(Notification notification) {
    if (notification.getNotifier() instanceof MBrickd) {
      logger.debug("notifier is Brickd");
      int featureID = notification.getFeatureID(MBrickd.class);
      logger.debug("Notifier: remove called");
      // TODO
      if (notification.getOldValue() instanceof MBaseDevice) {
        logger.debug("{} Notifier: remove called for MBaseDevice");
        MBaseDevice mDevice = (MBaseDevice) notification.getOldValue();
        String uid = mDevice.getUid();
        String subId = null;
        logger.debug("remove {} {}", uid, subId);
        // TODO remove from model?
        mDevice.disable();
      }
      if (featureID == ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES) {
        logger.debug("MSubdevices Notifier called");
        logger.debug("Notifier: remove called for MSubDevice");
        MSubDevice<?> mDevice = (MSubDevice<?>) notification.getOldValue();
        String uid = mDevice.getUid();
        String subId = mDevice.getSubId();
        logger.debug("remove {} {}", uid, subId);
        // TODO remove from model?
        mDevice.disable();
      }
    } else {
      logger.debug("{} unhandled notifier {}", notification.getNotifier());
    }
  }

   @SuppressWarnings("unchecked")
  private void addMDevice(MBaseDevice device, String uid, String subId) {
    String logId = subId == null ? uid : uid + " " + subId;
    OHTFDevice<?, ?> deviceConfig = ohConfig.getConfigByTFId(uid, subId);
    if (deviceConfig == null) {
      logger.debug("found no device configuration for uid \"{}\" subid \"{}\"", uid, subId);
    }
    if (device.getEnabledA().compareAndSet(false, true)) {
      if (subId != null) {
        MDevice<?> masterDevice = (MDevice<?>) device.eContainer();
        // recursion for adding the master device
        if (!masterDevice.getEnabledA().get()) {
          logger.debug("{} enabling masterDevice {}", masterDevice.getUid());
          addMDevice(masterDevice, uid, null);
        }
      }
      if (device instanceof MTFConfigConsumer<?> && deviceConfig != null) {
        logger.debug("{} found MTFConfigConsumer id {}", logId);
        if (device instanceof GenericDevice && checkDuplicateGenericDevice((GenericDevice) device, uid, subId)) {
          logger.error("ignoring duplicate device uid: {}, subId {}, genericId {}. Fix your openhab.cfg!", uid, subId);
          device.getEnabledA().compareAndSet(true, false);
        } else {
          TFConfig deviceTfConfig = EcoreUtil.copy(deviceConfig.getTfConfig());
          logger.debug("{} setting tfConfig for {}", logId);
          logger.debug("{} adding/enabling device {} with config: {}", logId, deviceTfConfig);
          ((MTFConfigConsumer<EObject>) device).setTfConfig(deviceTfConfig);
          device.enable();
        }
      } else if (device instanceof IODevice || device instanceof IO4Device) {
        logger.debug("{} ignoring unconfigured  IODevice: {}", logId);
        // set the device disabled, this is needed for not getting
        // states
        // through execute method
        device.getEnabledA().compareAndSet(true, false);
      } else {
        device.enable();
        logger.debug("{} adding/enabling device: {}", logId);
      }
    }
  }

  private boolean checkDuplicateGenericDevice(GenericDevice device, String uid, String subId) {
    boolean isDuplicate = false;
    final String genericDeviceId = device.getGenericDeviceId();
    final EList<MSubDevice<?>> genericDevicesList = ecosystem.getDevices4GenericId(uid, genericDeviceId);
    if (genericDevicesList.size() != 0) {
      for (MSubDevice<?> gd : genericDevicesList) {
        if (!gd.getSubId().equals(subId) && gd.getEnabledA().get()) {
          isDuplicate = true;
          logger.error("{} existing device is uid {} subId {}", gd.getUid(), gd.getSubId());
        }
      }
    }
    return isDuplicate;
  }

}
