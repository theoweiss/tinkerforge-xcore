package org.m1theo.tinkerforge.config;

import java.util.ArrayList;
import java.util.List;

import org.m1theo.tinkerforge.emf.client.Constants;

public class Utils {
  
  public static List<Host> parseCfgHosts(String cfgHostsLine) {
    ArrayList<Host> hosts = new ArrayList<Host>();
    String[] cfgHostsEntries = cfgHostsLine.split("\\s");
    for (int i = 0; i < cfgHostsEntries.length; i++) {
      String cfgHostEntry = cfgHostsEntries[i];
      String[] cfgHostAndPort = cfgHostEntry.split(":", 3);
      String host = cfgHostAndPort[0];
      int port;
      String authKey = null;
      if (cfgHostAndPort.length > 1) {
        if (!cfgHostAndPort[1].equals("")) {
          port = Integer.parseInt(cfgHostAndPort[1]);
        } else {
          port = Constants.BRICKD_DEFAULT_PORT;
        }
      } else {
        port = Constants.BRICKD_DEFAULT_PORT;
      }
      if (cfgHostAndPort.length == 3) {
        authKey = cfgHostAndPort[2];
      }
      hosts.add(new Host(host, port, authKey));
    }
    return hosts;
  }
}
