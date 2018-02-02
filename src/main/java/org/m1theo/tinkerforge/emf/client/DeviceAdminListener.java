package org.m1theo.tinkerforge.emf.client;

import org.eclipse.emf.common.notify.Notification;
import org.m1theo.tinkerforge.emf.client.impl.DeviceAdminListenerImpl;
import org.m1theo.tinkerforge.emf.model.Ecosystem;
import org.m1theo.tinkerforge.emf.model.OHConfig;

public interface DeviceAdminListener {
  static DeviceAdminListener createInstance(Ecosystem ecosystem, OHConfig ohConfig) {
    return new DeviceAdminListenerImpl(ecosystem, ohConfig);
  }
  
  void addDevice(Notification notification);
  void removeDevice(Notification notification);
}
