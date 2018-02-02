package org.m1theo.tinkerforge.emf.client;

import java.util.Map;

import org.m1theo.tinkerforge.config.DeviceOptions;
import org.m1theo.tinkerforge.emf.client.impl.ClientImpl;
import org.m1theo.tinkerforge.types.TinkerforgeValue;

public interface Client {
  public static Client createInstance(Map<String, ?> config, DataListener dataListener){
    return new ClientImpl(config, dataListener);
  }
  
  public void connectBrickd(String host, int port, String authkey);

  void execute(String uid, String subId, TinkerforgeValue command, DeviceOptions options);

  void fetchSensorValues(String uid, String subId, boolean onlyPollEnabled);

  void fetchSensorValues(String symbolicName, boolean onlyPollEnabled);

  void execute(String symbolicName, TinkerforgeValue command, DeviceOptions options);
}
