package org.m1theo.tinkerforge.emf.client;

import org.eclipse.emf.common.notify.Notification;
import org.m1theo.tinkerforge.emf.model.MBaseDevice;
import org.m1theo.tinkerforge.emf.model.MSubDevice;
import org.m1theo.tinkerforge.types.TinkerforgeValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDataListener extends AbstractDataListener {

  private Logger logger = LoggerFactory.getLogger(LoggingDataListener.class);

  @Override
  protected void processValue(MBaseDevice device, Notification notification) {
    TinkerforgeValue newValue = (TinkerforgeValue) notification.getNewValue();
    String uid = device.getUid();
    String subId = null;
    if (device instanceof MSubDevice<?>) {
      subId = ((MSubDevice<?>) device).getSubId();
      logger.trace("MSubDevice sensor value for: {}", subId);
    } else {
      logger.trace("MDevice sensor value for: {}", uid);
    }
    if (subId == null) {
      logger.info("{}: {}", uid, newValue.toString());
    } else {
      logger.info("{}/{}: {}", uid, subId, newValue.toString());
    }
  }

}
