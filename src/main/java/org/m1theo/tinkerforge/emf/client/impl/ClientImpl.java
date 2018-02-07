package org.m1theo.tinkerforge.emf.client.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.m1theo.tinkerforge.config.ConfigurationHandler;
import org.m1theo.tinkerforge.config.DeviceOptions;
import org.m1theo.tinkerforge.config.Host;
import org.m1theo.tinkerforge.emf.client.Client;
import org.m1theo.tinkerforge.emf.client.DataListener;
import org.m1theo.tinkerforge.emf.client.DeviceAdminListener;
import org.m1theo.tinkerforge.emf.model.*;
import org.m1theo.tinkerforge.types.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class ClientImpl implements Client {
  private Logger logger = LoggerFactory.getLogger(ClientImpl.class);
  private ModelFactory modelFactory;
  private Ecosystem ecosystem;
  private OHConfig ohConfig;

  private ClientImpl() {
    modelFactory = ModelFactory.eINSTANCE;
    ecosystem = modelFactory.createEcosystem();
  }

  public ClientImpl(Map<String, ?> config, DataListener dataListener) {
    this();
    ConfigurationHandler configurationHandler = new ConfigurationHandler();
    ohConfig = configurationHandler.createConfig(config);
    listen2Model(ecosystem, new DeviceAdminListenerImpl(ecosystem, ohConfig), dataListener);
  }

  private void listen2Model(Ecosystem tinkerforgeEcosystem, DeviceAdminListener deviceAdminListener, DataListener dataListener) {
    EContentAdapter modelAdapter = new EContentAdapter() {
      @Override
      public void notifyChanged(Notification notification) {
        super.notifyChanged(notification);
        logger.debug("TinkerforgeNotifier was notified");
        if (notification.getEventType() == Notification.ADD) {
          deviceAdminListener.addDevice(notification);
        } else if (notification.getEventType() == Notification.ADD_MANY) {
          logger.debug("add many called");
        } else if (notification.getEventType() == Notification.REMOVE) {
          deviceAdminListener.removeDevice(notification);
        } else if (notification.getEventType() == Notification.REMOVE_MANY) {
          logger.debug("remove many called");
        } else {
          dataListener.processValue(notification);
        }
      }

    };
    tinkerforgeEcosystem.eAdapters().add(modelAdapter);
  }

  public void connectBrickd(String host, int port, String authkey) {
    MBrickd brickd = ecosystem.getBrickd(host, port);
    if (brickd == null) {
      brickd = modelFactory.createMBrickd();
      brickd.setHost(host);
      brickd.setPort(port);
      brickd.setAuthkey(authkey);
      brickd.setEcosystem(ecosystem);
      ecosystem.getMbrickds().add(brickd);
      brickd.init();
      brickd.connect();
      logger.debug("Tinkerforge new brickd for host: {}", host);
    } else {
      logger.debug("Tinkerforge found existing brickd for host: {}", host);
    }
  }

  @Override
  public void connectBrickds(List<Host> hosts) {
    for (Host host : hosts){
      connectBrickd(host.getHost(), host.getPort(), host.getAuthKey());
    }
  }

  // triggers model udate
  // call it triggermodelupdate
  @Override
  public void fetchSensorValues(String uid, String subId, boolean onlyPollEnabled) {
    MBaseDevice mDevice = ecosystem.getDevice(uid, subId);
    if (mDevice != null && mDevice.getEnabledA().get()) {
      if (onlyPollEnabled && !mDevice.isPoll()) {
        // do nothing
        logger.debug("omitting fetch value for no poll{}:{}", uid, subId);
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

  @Override
  public void fetchSensorValues(String symbolicName, boolean onlyPollEnabled) {
    String[] ids = getDeviceIdsForDeviceName(symbolicName);
    String deviceUid = ids[0];
    String deviceSubId = ids[1];
    fetchSensorValues(deviceUid, deviceSubId, onlyPollEnabled);
  }

  @Override
  public void execute(String symbolicName, TinkerforgeValue command, DeviceOptions options) {
    String[] ids = getDeviceIdsForDeviceName(symbolicName);
    String deviceUid = ids[0];
    String deviceSubId = ids[1];
    execute(deviceUid, deviceSubId, command, options);
  }

  @Override
  public void execute(String uid, String subId, TinkerforgeValue command, DeviceOptions options) {
    logger.debug("received command {} for uid {} subid {}", command, uid, subId);
    MBaseDevice mDevice = ecosystem.getDevice(uid, subId);
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
        if (mDevice instanceof NumberActor) {
          ((NumberActor) mDevice).setNumber(((DecimalValue) command).toBigDecimal());
        } else if (mDevice instanceof SetPointActor) {
          ((SetPointActor<?>) mDevice).setValue(((DecimalValue) command).toBigDecimal(), options);
        } else {
          logger.error("found no number actor");
        }
      } else if (command instanceof HSBValue) {
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
      } else {
        logger.error("{} got unknown command type: {}", command.toString());
      }
    } else {
      logger.error("{} no tinkerforge device found for command for item uid: {} subId: {}", uid, subId);
    }

  }

  /**
   * Gets the uid and the subid of a device from the openhab.cfg, using the device
   * name as input.
   *
   * @param deviceName The symbolic device name as {@code String}.
   * @return A String array with the device uid as first element as {@code String}
   * and the device subid as second element as {@code String} or
   * {@code null}.
   */
  private String[] getDeviceIdsForDeviceName(String deviceName) {
    logger.trace("searching ids for name {}", deviceName);
    OHTFDevice<?, ?> ohtfDevice = ohConfig.getConfigByOHId(deviceName);
    String[] ids = {ohtfDevice.getUid(), ohtfDevice.getSubid()};
    return ids;
  }

  @Override
  public List<MBaseDevice> getDevices() {
    return ecosystem.getDevices();
  }
}
