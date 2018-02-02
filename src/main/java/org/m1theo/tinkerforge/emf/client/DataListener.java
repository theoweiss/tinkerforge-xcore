package org.m1theo.tinkerforge.emf.client;

import org.eclipse.emf.common.notify.Notification;

public interface DataListener {
  static DataListener createLoggingDataListener() {
    return new LoggingDataListener();
  }
  void processValue(Notification notification);
}
