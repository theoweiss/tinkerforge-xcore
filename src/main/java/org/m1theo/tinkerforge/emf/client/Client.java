package org.m1theo.tinkerforge.emf.client;

import org.m1theo.tinkerforge.config.ConfigurationException;
import org.m1theo.tinkerforge.config.DeviceOptions;
import org.m1theo.tinkerforge.config.Host;
import org.m1theo.tinkerforge.emf.client.impl.ClientImpl;
import org.m1theo.tinkerforge.emf.model.MBaseDevice;
import org.m1theo.tinkerforge.types.TinkerforgeValue;

import java.util.List;
import java.util.Map;

public interface Client {
   static Client createInstance(Map<String, ?> config, DataListener dataListener) throws ConfigurationException {
    return new ClientImpl(config, dataListener);
  }
  
  void connectBrickd(String host, int port, String authkey);

  void connectBrickds(List<Host> hosts);

  void execute(String uid, String subId, TinkerforgeValue command, DeviceOptions options);

  void fetchSensorValues(String uid, String subId, boolean onlyPollEnabled);

  void fetchSensorValues(String symbolicName, boolean onlyPollEnabled);

  void execute(String symbolicName, TinkerforgeValue command, DeviceOptions options);

  List<MBaseDevice> getDevices();
}
