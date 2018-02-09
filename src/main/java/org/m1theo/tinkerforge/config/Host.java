package org.m1theo.tinkerforge.config;

public class Host {
  private final String host;
  private final int port;
  private final String authKey;
  
  public Host(String host, int port, String authKey) {
    super();
    this.host = host;
    this.port = port;
    this.authKey = authKey;
  }

  public String getHost() {
    return host;
  }

  public int getPort() {
    return port;
  }

  public String getAuthKey() {
    return authKey;
  }

  @Override
  public String toString() {
    return "Host{" +
        "host='" + host + '\'' +
        ", port=" + port +
        ", authKey='" + authKey + '\'' +
        '}';
  }
}
