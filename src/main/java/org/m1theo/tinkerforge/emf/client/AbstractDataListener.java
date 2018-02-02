package org.m1theo.tinkerforge.emf.client;

import org.eclipse.emf.common.notify.Notification;
import org.m1theo.tinkerforge.emf.model.ColorActor;
import org.m1theo.tinkerforge.emf.model.DigitalActor;
import org.m1theo.tinkerforge.emf.model.DimmableActor;
import org.m1theo.tinkerforge.emf.model.MBaseDevice;
import org.m1theo.tinkerforge.emf.model.MSensor;
import org.m1theo.tinkerforge.emf.model.MSwitchActor;
import org.m1theo.tinkerforge.emf.model.ModelPackage;
import org.m1theo.tinkerforge.emf.model.MoveActor;
import org.m1theo.tinkerforge.emf.model.ProgrammableSwitchActor;
import org.m1theo.tinkerforge.emf.model.SetPointActor;
import org.m1theo.tinkerforge.emf.model.SwitchSensor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractDataListener implements DataListener {
  private Logger logger = LoggerFactory.getLogger(AbstractDataListener.class);
  
  @Override
  public void processValue(Notification notification) {
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
    }
    // TODO hier muss noch was fuer die dimmer und rollershutter rein
    else {
      logger.trace("ignored notifier {}", notification.getNotifier());
    }
  }

  protected abstract void processValue(MBaseDevice device, Notification notification);

}
