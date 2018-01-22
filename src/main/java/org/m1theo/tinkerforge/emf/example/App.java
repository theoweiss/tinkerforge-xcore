/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 * Copyright (c) 2018, Thomas Weiss <theo@m1theo.org>.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.m1theo.tinkerforge.emf.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.m1theo.tinkerforge.emf.internal.model.ColorActor;
import org.m1theo.tinkerforge.emf.internal.model.DigitalActor;
import org.m1theo.tinkerforge.emf.internal.model.DimmableActor;
import org.m1theo.tinkerforge.emf.internal.model.Ecosystem;
import org.m1theo.tinkerforge.emf.internal.model.GenericDevice;
import org.m1theo.tinkerforge.emf.internal.model.IO4Device;
import org.m1theo.tinkerforge.emf.internal.model.IODevice;
import org.m1theo.tinkerforge.emf.internal.model.MBaseDevice;
import org.m1theo.tinkerforge.emf.internal.model.MBrickd;
import org.m1theo.tinkerforge.emf.internal.model.MDevice;
import org.m1theo.tinkerforge.emf.internal.model.MSensor;
import org.m1theo.tinkerforge.emf.internal.model.MSubDevice;
import org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder;
import org.m1theo.tinkerforge.emf.internal.model.MSwitchActor;
import org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer;
import org.m1theo.tinkerforge.emf.internal.model.MTextActor;
import org.m1theo.tinkerforge.emf.internal.model.ModelFactory;
import org.m1theo.tinkerforge.emf.internal.model.ModelPackage;
import org.m1theo.tinkerforge.emf.internal.model.MoveActor;
import org.m1theo.tinkerforge.emf.internal.model.NumberActor;
import org.m1theo.tinkerforge.emf.internal.model.OHConfig;
import org.m1theo.tinkerforge.emf.internal.model.OHTFDevice;
import org.m1theo.tinkerforge.emf.internal.model.PercentTypeActor;
import org.m1theo.tinkerforge.emf.internal.model.ProgrammableColorActor;
import org.m1theo.tinkerforge.emf.internal.model.ProgrammableSwitchActor;
import org.m1theo.tinkerforge.emf.internal.model.SetPointActor;
import org.m1theo.tinkerforge.emf.internal.model.SimpleColorActor;
import org.m1theo.tinkerforge.emf.internal.model.SwitchSensor;
import org.m1theo.tinkerforge.emf.internal.model.TFConfig;
import org.m1theo.tinkerforge.internal.config.ConfigurationException;
import org.m1theo.tinkerforge.internal.config.ConfigurationHandler;
import org.m1theo.tinkerforge.internal.config.DeviceOptions;
import org.m1theo.tinkerforge.types.DecimalValue;
import org.m1theo.tinkerforge.types.HSBValue;
import org.m1theo.tinkerforge.types.HighLowValue;
import org.m1theo.tinkerforge.types.IncreaseDecreaseValue;
import org.m1theo.tinkerforge.types.OnOffValue;
import org.m1theo.tinkerforge.types.PercentValue;
import org.m1theo.tinkerforge.types.StopMoveValue;
import org.m1theo.tinkerforge.types.StringValue;
import org.m1theo.tinkerforge.types.TinkerforgeValue;
import org.m1theo.tinkerforge.types.UpDownValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static Logger logger = LoggerFactory.getLogger(App.class);
  private static ModelFactory modelFactory;
  private static Ecosystem tinkerforgeEcosystem;
  private static AtomicBoolean isConnected = new AtomicBoolean(false);
  private static final int BRICKD_DEFAULT_PORT = 4223;
  private static final String CONFIG_KEY_HOSTS = "hosts";
  private static OHConfig ohConfig;

  public static void main(String[] args) throws FileNotFoundException, InterruptedException {
    System.out.println(args[0]);
    Scanner scanner = new Scanner(new FileReader(args[0]));

    HashMap<String, String> config = new HashMap<String, String>();

    while (scanner.hasNextLine()) {
      String[] columns = scanner.nextLine().split("=", 2);
      if (columns.length == 2) {
        System.out.println(columns[0] + "=" + columns[1]);
        config.put(columns[0], columns[1]);
      }
    }
    scanner.close();
    modelFactory = ModelFactory.eINSTANCE;
    start(config);
    while (true) {
      Thread.sleep(1000);
    }
  }

  public static void start(Map<String, ?> config) throws ConfigurationException {
    logger.debug("start called");
    if (config != null) {
      String cfgHostsLine = (String) config.get(CONFIG_KEY_HOSTS);
      if (cfgHostsLine == null) {
        throw new ConfigurationException("no hosts configured");
      }
      disconnectModel();
      connectModel();
      ConfigurationHandler configurationHandler = new ConfigurationHandler();
      ohConfig = configurationHandler.createConfig(config);

      // read further config parameters here ...
      // must be done after all other config has been processed
      parseCfgHostsAndConnect(cfgHostsLine);
    } else {
      throw new ConfigurationException("configuration missing");
    }
  }

  public App() {
  }

  private static void parseCfgHostsAndConnect(String cfgHostsLine) {
    String[] cfgHostsEntries = cfgHostsLine.split("\\s");
    for (int i = 0; i < cfgHostsEntries.length; i++) {
      String cfgHostEntry = cfgHostsEntries[i];
      String[] cfgHostAndPort = cfgHostEntry.split(":", 3);
      String host = cfgHostAndPort[0];
      int port;
      String authkey = null;
      if (cfgHostAndPort.length > 1) {
        if (!cfgHostAndPort[1].equals("")) {
          port = Integer.parseInt(cfgHostAndPort[1]);
        } else {
          port = BRICKD_DEFAULT_PORT;
        }
      } else {
        port = BRICKD_DEFAULT_PORT;
      }
      if (cfgHostAndPort.length == 3) {
        authkey = cfgHostAndPort[2];
      }
      logger.debug("parse brickd config: host {}, port {}, authkey is set {}", host, port,
          authkey != null ? true : false);
      connectBrickd(host, port, authkey);
    }
  }

  private static void disconnectModel() {
    if (isConnected.compareAndSet(true, false)) {
      tinkerforgeEcosystem.disconnect();
      tinkerforgeEcosystem = null;
    }
  }

  private static void connectModel() {
    if (isConnected.compareAndSet(false, true)) {
      tinkerforgeEcosystem = modelFactory.createEcosystem();
      listen2Model(tinkerforgeEcosystem);
      logger.debug("connectModel called");
      isConnected.set(true);
    } else {
      logger.warn("already connected");
    }
  }

  private static void connectBrickd(String host, int port, String authkey) {
    MBrickd brickd = tinkerforgeEcosystem.getBrickd(host, port);
    if (brickd == null) {
      brickd = modelFactory.createMBrickd();
      brickd.setHost(host);
      brickd.setPort(port);
      brickd.setAuthkey(authkey);
      brickd.setEcosystem(tinkerforgeEcosystem);
      tinkerforgeEcosystem.getMbrickds().add(brickd);
      brickd.init();
      brickd.connect();
      logger.debug("Tinkerforge new brickd for host: {}", host);
    } else {
      logger.debug("Tinkerforge found existing brickd for host: {}", host);
    }
  }

  private static void listen2Model(Ecosystem tinkerforgeEcosystem) {
    EContentAdapter modelAdapter = new EContentAdapter() {
      @Override
      public void notifyChanged(Notification notification) {
        super.notifyChanged(notification);
        logger.debug("TinkerforgeNotifier was notified");
        if (notification.getEventType() == Notification.ADD || notification.getEventType() == Notification.ADD_MANY
            || notification.getEventType() == Notification.REMOVE
            || notification.getEventType() == Notification.REMOVE_MANY) {
          initializeTFDevices(notification);
        } else {
          processTFDeviceValues(notification);
        }
      }

    };
    tinkerforgeEcosystem.eAdapters().add(modelAdapter);
  }

  private static void initializeTFDevices(Notification notification) {
    logger.trace("notifier {}", notification.getNotifier());
    if (notification.getNotifier() instanceof MBrickd) {
      logger.debug("notifier is Brickd");
      int featureID = notification.getFeatureID(MBrickd.class);
      if (featureID == ModelPackage.MBRICKD__MDEVICES) {
        if (notification.getEventType() == Notification.ADD) {
          MDevice<?> mDevice = (MDevice<?>) notification.getNewValue();
          addMDevice(mDevice, mDevice.getUid(), null);
        } else if (notification.getEventType() == Notification.ADD_MANY) {
          logger.debug("Notifier: add many called");
        } else if (notification.getEventType() == Notification.REMOVE) {
          logger.debug("Notifier: remove called");
          // TODO
          if (notification.getOldValue() instanceof MBaseDevice) {
            logger.debug("{} Notifier: remove called for MBaseDevice");
            MBaseDevice mDevice = (MBaseDevice) notification.getOldValue();
            String uid = mDevice.getUid();
            String subId = null;
          }
        } else {
          logger.debug("{} Notifier: unknown feature {}", notification.getFeature());
        }
      } else if (notification.getNotifier() instanceof MSubDeviceHolder<?>) {
        int featureID1 = notification.getFeatureID(MSubDeviceHolder.class);
        if (featureID1 == ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES) {
          logger.debug("MSubdevices Notifier called");
          if (notification.getEventType() == Notification.ADD) {
            MSubDevice<?> mSubDevice = (MSubDevice<?>) notification.getNewValue();
            addMDevice(mSubDevice, mSubDevice.getUid(), mSubDevice.getSubId());

          }
          if (notification.getEventType() == Notification.REMOVE) {
            logger.debug("{} remove notification from subdeviceholder");
            logger.debug("{} Notifier: remove called for MSubDevice");
            MSubDevice<?> mDevice = (MSubDevice<?>) notification.getOldValue();
            String uid = mDevice.getUid();
            String subId = mDevice.getSubId();
            // TODO
          }
        }
      }
    } else {
      logger.debug("{} unhandled notifier {}", notification.getNotifier());
    }
  }

  @SuppressWarnings("unchecked")
  private static void addMDevice(MBaseDevice device, String uid, String subId) {
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

  private static void processTFDeviceValues(Notification notification) {
    if (notification.getNotifier() instanceof MSensor) {
      MSensor<?> sensor = (MSensor<?>) notification.getNotifier();
      int featureID = notification.getFeatureID(MSensor.class);
      if (featureID == ModelPackage.MSENSOR__SENSOR_VALUE) {
        processValue((MBaseDevice) sensor, notification);
      }
    } else if (notification.getNotifier() instanceof SetPointActor<?>) {
      SetPointActor<?> actor = (SetPointActor<?>) notification.getNotifier();
      int setpointFeatureID = notification.getFeatureID(SetPointActor.class);
      if (setpointFeatureID == ModelPackage.SET_POINT_ACTOR__PERCENT_VALUE) {
        processValue((MBaseDevice) actor, notification);
      }
    } else if (notification.getNotifier() instanceof MoveActor) {
      MoveActor actor = (MoveActor) notification.getNotifier();
      int moveFeatureID = notification.getFeatureID(MoveActor.class);
      if (moveFeatureID == ModelPackage.MOVE_ACTOR__DIRECTION) {
        processValue((MBaseDevice) actor, notification);
      }
    } else if (notification.getNotifier() instanceof MSwitchActor) {
      MSwitchActor switchActor = (MSwitchActor) notification.getNotifier();
      int featureID = notification.getFeatureID(MSwitchActor.class);
      if (featureID == ModelPackage.MSWITCH_ACTOR__SWITCH_STATE) {
        processValue((MBaseDevice) switchActor, notification);
      }
    } else if (notification.getNotifier() instanceof ProgrammableSwitchActor) {
      logger.trace("notification {}", notification);
      logger.trace("notifier {}", notification.getNotifier());
      ProgrammableSwitchActor switchActor = (ProgrammableSwitchActor) notification.getNotifier();
      // use the super type class for getting the featureID. Should not be necessary
      // according to
      // the docs or I misunderstand it. But this approach works.
      int featureID = notification.getFeatureID(SwitchSensor.class);
      logger.trace("notification ProgrammableSwitchActor id {}", featureID);
      if (featureID == ModelPackage.PROGRAMMABLE_SWITCH_ACTOR__SWITCH_STATE) {
        logger.trace("ProgrammableSwitchActor switch state changed sending notification");
        processValue((MBaseDevice) switchActor, notification);
      }
    } else if (notification.getNotifier() instanceof DigitalActor) {
      DigitalActor actor = (DigitalActor) notification.getNotifier();
      int featureID = notification.getFeatureID(DigitalActor.class);
      if (featureID == ModelPackage.DIGITAL_ACTOR__DIGITAL_STATE) {
        processValue((MBaseDevice) actor, notification);
      }
    } else if (notification.getNotifier() instanceof ColorActor) {
      ColorActor actor = (ColorActor) notification.getNotifier();
      int featureID = notification.getFeatureID(ColorActor.class);
      if (featureID == ModelPackage.COLOR_ACTOR__COLOR) {
        processValue((MBaseDevice) actor, notification);
      }
    } else if (notification.getNotifier() instanceof DimmableActor<?>) {
      DimmableActor<?> actor = (DimmableActor<?>) notification.getNotifier();
      processValue((MBaseDevice) actor, notification);
    } else if (notification.getNotifier() instanceof MBrickd) {
      MBrickd brickd = (MBrickd) notification.getNotifier();
      int featureID = notification.getFeatureID(MBrickd.class);
      if (featureID == ModelPackage.MBRICKD__CONNECTED_COUNTER) {
        String subId = "connected_counter";
        processValue(brickd, notification, subId);
      } else if (featureID == ModelPackage.MBRICKD__IS_CONNECTED) {
        String subId = "isconnected";
        processValue(brickd, notification, subId);
      }
    }
    // TODO hier muss noch was fuer die dimmer und rollershutter rein
    else {
      logger.trace("{} ignored notifier {}", notification.getNotifier());
    }
  }

  private static boolean checkDuplicateGenericDevice(GenericDevice device, String uid, String subId) {
    boolean isDuplicate = false;
    final String genericDeviceId = device.getGenericDeviceId();
    final EList<MSubDevice<?>> genericDevicesList = tinkerforgeEcosystem.getDevices4GenericId(uid, genericDeviceId);
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

  private static void processValue(MBaseDevice device, Notification notification) {
    TinkerforgeValue newValue = (TinkerforgeValue) notification.getNewValue();
    String uid = device.getUid();
    String subId = null;
    if (device instanceof MSubDevice<?>) {
      subId = ((MSubDevice<?>) device).getSubId();
      logger.trace("{} Notifier found MSubDevice sensor value for: {}", subId);
    } else {
      logger.trace("{} Notifier found mDevice sensor value for: {}", uid);
    }
    if (subId == null) {
      System.out.println(uid + ": " + newValue.toString());
    } else {
      System.out.println(uid + "/" + subId + ": " + newValue.toString());
    }
  }

  private static void processValue(MBrickd brickd, Notification notification, String subId) {
    TinkerforgeValue newValue = (TinkerforgeValue) notification.getNewValue();
    String uid = brickd.getHost() + ":" + ((Integer) brickd.getPort()).toString();
    logger.trace("{} Notifier found brickd value uid {} subid {}", uid, subId);
    if (subId == null) {
      System.out.println(uid + ": " + newValue.toString());
    } else {
      System.out.println(uid + "/" + subId + ": " + newValue.toString());
    }
  }

  public static void fetchSensorValues(String symbolicName, boolean only_poll_enabled) {
    String[] ids = getDeviceIdsForDeviceName(symbolicName);
    String deviceUid = ids[0];
    String deviceSubId = ids[1];
    fetchSensorValues(deviceUid, deviceSubId, only_poll_enabled);
  }

  /**
   * Triggers an update of state values for all devices.
   *
   * @param only_poll_enabled
   *          Fetch only the values of devices which do not support callback
   *          listeners. These devices are marked with poll "true" flag.
   */
  private static void fetchSensorValues(String deviceUid, String deviceSubId, boolean only_poll_enabled) {
    if (tinkerforgeEcosystem == null) {
      logger.warn("tinkerforge ecosystem not yet ready");
      return;
    }
    MBaseDevice mDevice = tinkerforgeEcosystem.getDevice(deviceUid, deviceSubId);
    if (mDevice != null && mDevice.getEnabledA().get()) {
      if (only_poll_enabled && !mDevice.isPoll()) {
        // do nothing
        logger.debug("omitting fetch value for no poll{}:{}", deviceUid, deviceSubId);
      } else {
        if (mDevice instanceof MSensor) {
          ((MSensor<?>) mDevice).fetchSensorValue();
        } else if (mDevice instanceof SwitchSensor) {
          ((SwitchSensor) mDevice).fetchSwitchState();
        } else if (mDevice instanceof DigitalActor) {
          ((DigitalActor) mDevice).fetchDigitalValue();
        }
      }
    }
  }

  public static void execute(String symbolicName, TinkerforgeValue command, DeviceOptions options) {
    String[] ids = getDeviceIdsForDeviceName(symbolicName);
    String deviceUid = ids[0];
    String deviceSubId = ids[1];
    execute(deviceUid, deviceSubId, command, options);
  }

  private static void execute(String deviceUid, String deviceSubId, TinkerforgeValue command, DeviceOptions options) {
    logger.debug("received command {} for uid {} subid {}", command, deviceUid, deviceSubId);
    MBaseDevice mDevice = tinkerforgeEcosystem.getDevice(deviceUid, deviceSubId);
    if (mDevice != null && mDevice.getEnabledA().get()) {
      if (command instanceof OnOffValue) {
        logger.trace("found onoff command");
        if (mDevice instanceof MSwitchActor) {
          ((MSwitchActor) mDevice).turnSwitch((OnOffValue) command);
        } else if (mDevice instanceof DigitalActor) {
          HighLowValue state = command == OnOffValue.OFF ? HighLowValue.LOW : HighLowValue.HIGH;
          ((DigitalActor) mDevice).turnDigital(state);
        } else if (mDevice instanceof ProgrammableSwitchActor) {
          ((ProgrammableSwitchActor) mDevice).turnSwitch((OnOffValue) command, options);
        } else {
          logger.error("received OnOff command for non-SwitchActor");
        }
      } else if (command instanceof StringValue) {
        logger.trace("found string command");
        if (mDevice instanceof MTextActor) {
          ((MTextActor) mDevice).write(command.toString());
        }
      } else if (command instanceof DecimalValue) {
        logger.debug("found number command");
        if (command instanceof HSBValue) {
          logger.debug("found HSBValue command");
          if (mDevice instanceof ProgrammableColorActor) {
            logger.debug("found ProgrammableColorActor {}");
            ((ProgrammableColorActor) mDevice).setSelectedColor((HSBValue) command, options);
          } else if (mDevice instanceof SimpleColorActor) {
            logger.debug("found SimpleColorActor {}");
            ((SimpleColorActor) mDevice).setSelectedColor((HSBValue) command);
          }
        } else if (command instanceof PercentValue) {
          if (mDevice instanceof SetPointActor) {
            ((SetPointActor<?>) mDevice).setValue(((PercentValue) command), options);
            logger.debug("found SetpointActor");
          } else if (mDevice instanceof PercentTypeActor) {
            ((PercentTypeActor) mDevice).setValue(((PercentValue) command), options);
            logger.debug("found PercentType actor");
          } else {
            logger.error("found no percenttype actor");
          }
        } else {
          if (mDevice instanceof NumberActor) {
            ((NumberActor) mDevice).setNumber(((DecimalValue) command).toBigDecimal());
          } else if (mDevice instanceof SetPointActor) {
            ((SetPointActor<?>) mDevice).setValue(((DecimalValue) command).toBigDecimal(), options);
          } else {
            logger.error("found no number actor");
          }
        }
      } else if (command instanceof UpDownValue) {
        logger.debug("UpDownType command {}");
        if (mDevice instanceof MoveActor) {
          ((MoveActor) mDevice).move((UpDownValue) command, options);
        }
      } else if (command instanceof StopMoveValue) {
        if (mDevice instanceof MoveActor) {
          if (command == StopMoveValue.STOP) {
            ((MoveActor) mDevice).stop();
          } else {
            ((MoveActor) mDevice).moveon(options);
          }
        }
        logger.debug("StopMoveType command");
      } else if (command instanceof IncreaseDecreaseValue) {
        if (mDevice instanceof DimmableActor) {
          ((DimmableActor<?>) mDevice).dimm((IncreaseDecreaseValue) command, options);
        }
        logger.debug("IncreaseDecreaseType command");
      }

      else {
        logger.error("{} got unknown command type: {}", command.toString());
      }
    } else {
      logger.error("{} no tinkerforge device found for command for item uid: {} subId: {}", deviceUid, deviceSubId);
    }
  }

  /**
   * Gets the uid and the subid of a device from the openhab.cfg, using the device
   * name as input.
   *
   * @param deviceName
   *          The symbolic device name as {@code String}.
   * @return A String array with the device uid as first element as {@code String}
   *         and the device subid as second element as {@code String} or
   *         {@code null}.
   */
  private static String[] getDeviceIdsForDeviceName(String deviceName) {
    logger.trace("searching ids for name {}", deviceName);
    OHTFDevice<?, ?> ohtfDevice = ohConfig.getConfigByOHId(deviceName);
    String[] ids = { ohtfDevice.getUid(), ohtfDevice.getSubid() };
    return ids;
  }

}
