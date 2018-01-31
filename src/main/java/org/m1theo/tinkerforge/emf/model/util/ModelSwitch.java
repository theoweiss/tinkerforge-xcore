/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 * Copyright (c) 2018, Thomas Weiss <theo@m1theo.org>.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/**
 */
package org.m1theo.tinkerforge.emf.model.util;

import com.tinkerforge.Device;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.m1theo.tinkerforge.emf.model.*;
import org.m1theo.tinkerforge.types.TinkerforgeValue;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static ModelPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModelSwitch() {
    if (modelPackage == null) {
      modelPackage = ModelPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case ModelPackage.ECOSYSTEM: {
        Ecosystem ecosystem = (Ecosystem)theEObject;
        T result = caseEcosystem(ecosystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKD: {
        MBrickd mBrickd = (MBrickd)theEObject;
        T result = caseMBrickd(mBrickd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.SUB_DEVICE_ADMIN: {
        SubDeviceAdmin subDeviceAdmin = (SubDeviceAdmin)theEObject;
        T result = caseSubDeviceAdmin(subDeviceAdmin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MTF_CONFIG_CONSUMER: {
        MTFConfigConsumer<?> mtfConfigConsumer = (MTFConfigConsumer<?>)theEObject;
        T result = caseMTFConfigConsumer(mtfConfigConsumer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBASE_DEVICE: {
        MBaseDevice mBaseDevice = (MBaseDevice)theEObject;
        T result = caseMBaseDevice(mBaseDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MDEVICE: {
        MDevice<?> mDevice = (MDevice<?>)theEObject;
        T result = caseMDevice(mDevice);
        if (result == null) result = caseMBaseDevice(mDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSUB_DEVICE_HOLDER: {
        MSubDeviceHolder<?> mSubDeviceHolder = (MSubDeviceHolder<?>)theEObject;
        T result = caseMSubDeviceHolder(mSubDeviceHolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MACTOR: {
        MActor mActor = (MActor)theEObject;
        T result = caseMActor(mActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.SWITCH_SENSOR: {
        SwitchSensor switchSensor = (SwitchSensor)theEObject;
        T result = caseSwitchSensor(switchSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSWITCH_ACTOR: {
        MSwitchActor mSwitchActor = (MSwitchActor)theEObject;
        T result = caseMSwitchActor(mSwitchActor);
        if (result == null) result = caseSwitchSensor(mSwitchActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PROGRAMMABLE_SWITCH_ACTOR: {
        ProgrammableSwitchActor programmableSwitchActor = (ProgrammableSwitchActor)theEObject;
        T result = caseProgrammableSwitchActor(programmableSwitchActor);
        if (result == null) result = caseSwitchSensor(programmableSwitchActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MIN_SWITCH_ACTOR: {
        MInSwitchActor mInSwitchActor = (MInSwitchActor)theEObject;
        T result = caseMInSwitchActor(mInSwitchActor);
        if (result == null) result = caseMSwitchActor(mInSwitchActor);
        if (result == null) result = caseSwitchSensor(mInSwitchActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.GENERIC_DEVICE: {
        GenericDevice genericDevice = (GenericDevice)theEObject;
        T result = caseGenericDevice(genericDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.IO_DEVICE: {
        IODevice ioDevice = (IODevice)theEObject;
        T result = caseIODevice(ioDevice);
        if (result == null) result = caseMSubDevice(ioDevice);
        if (result == null) result = caseGenericDevice(ioDevice);
        if (result == null) result = caseMBaseDevice(ioDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSUB_DEVICE: {
        MSubDevice<?> mSubDevice = (MSubDevice<?>)theEObject;
        T result = caseMSubDevice(mSubDevice);
        if (result == null) result = caseMBaseDevice(mSubDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.CALLBACK_LISTENER: {
        CallbackListener callbackListener = (CallbackListener)theEObject;
        T result = caseCallbackListener(callbackListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.INTERRUPT_LISTENER: {
        InterruptListener interruptListener = (InterruptListener)theEObject;
        T result = caseInterruptListener(interruptListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSENSOR: {
        MSensor<?> mSensor = (MSensor<?>)theEObject;
        T result = caseMSensor(mSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PROGRAMMABLE_ACTOR: {
        ProgrammableActor programmableActor = (ProgrammableActor)theEObject;
        T result = caseProgrammableActor(programmableActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MTEXT_ACTOR: {
        MTextActor mTextActor = (MTextActor)theEObject;
        T result = caseMTextActor(mTextActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MLCD_SUB_DEVICE: {
        MLCDSubDevice mlcdSubDevice = (MLCDSubDevice)theEObject;
        T result = caseMLCDSubDevice(mlcdSubDevice);
        if (result == null) result = caseMSubDevice(mlcdSubDevice);
        if (result == null) result = caseMBaseDevice(mlcdSubDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIGITAL_ACTOR: {
        DigitalActor digitalActor = (DigitalActor)theEObject;
        T result = caseDigitalActor(digitalActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.NUMBER_ACTOR: {
        NumberActor numberActor = (NumberActor)theEObject;
        T result = caseNumberActor(numberActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.COLOR_ACTOR: {
        ColorActor colorActor = (ColorActor)theEObject;
        T result = caseColorActor(colorActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PROGRAMMABLE_COLOR_ACTOR: {
        ProgrammableColorActor programmableColorActor = (ProgrammableColorActor)theEObject;
        T result = caseProgrammableColorActor(programmableColorActor);
        if (result == null) result = caseColorActor(programmableColorActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.SIMPLE_COLOR_ACTOR: {
        SimpleColorActor simpleColorActor = (SimpleColorActor)theEObject;
        T result = caseSimpleColorActor(simpleColorActor);
        if (result == null) result = caseColorActor(simpleColorActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MOVE_ACTOR: {
        MoveActor moveActor = (MoveActor)theEObject;
        T result = caseMoveActor(moveActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIMMABLE_ACTOR: {
        DimmableActor<?> dimmableActor = (DimmableActor<?>)theEObject;
        T result = caseDimmableActor(dimmableActor);
        if (result == null) result = caseMTFConfigConsumer(dimmableActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PERCENT_TYPE_ACTOR: {
        PercentTypeActor percentTypeActor = (PercentTypeActor)theEObject;
        T result = casePercentTypeActor(percentTypeActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.SET_POINT_ACTOR: {
        SetPointActor<?> setPointActor = (SetPointActor<?>)theEObject;
        T result = caseSetPointActor(setPointActor);
        if (result == null) result = caseDimmableActor(setPointActor);
        if (result == null) result = casePercentTypeActor(setPointActor);
        if (result == null) result = caseMTFConfigConsumer(setPointActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_DUAL_BUTTON: {
        MBrickletDualButton mBrickletDualButton = (MBrickletDualButton)theEObject;
        T result = caseMBrickletDualButton(mBrickletDualButton);
        if (result == null) result = caseMDevice(mBrickletDualButton);
        if (result == null) result = caseMSubDeviceHolder(mBrickletDualButton);
        if (result == null) result = caseMBaseDevice(mBrickletDualButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DUAL_BUTTON_DEVICE: {
        DualButtonDevice dualButtonDevice = (DualButtonDevice)theEObject;
        T result = caseDualButtonDevice(dualButtonDevice);
        if (result == null) result = caseMSubDevice(dualButtonDevice);
        if (result == null) result = caseMBaseDevice(dualButtonDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_PIEZO_SPEAKER: {
        MBrickletPiezoSpeaker mBrickletPiezoSpeaker = (MBrickletPiezoSpeaker)theEObject;
        T result = caseMBrickletPiezoSpeaker(mBrickletPiezoSpeaker);
        if (result == null) result = caseMDevice(mBrickletPiezoSpeaker);
        if (result == null) result = caseProgrammableSwitchActor(mBrickletPiezoSpeaker);
        if (result == null) result = caseMBaseDevice(mBrickletPiezoSpeaker);
        if (result == null) result = caseSwitchSensor(mBrickletPiezoSpeaker);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DUAL_BUTTON_BUTTON: {
        DualButtonButton dualButtonButton = (DualButtonButton)theEObject;
        T result = caseDualButtonButton(dualButtonButton);
        if (result == null) result = caseDualButtonDevice(dualButtonButton);
        if (result == null) result = caseMSensor(dualButtonButton);
        if (result == null) result = caseMTFConfigConsumer(dualButtonButton);
        if (result == null) result = caseMSubDevice(dualButtonButton);
        if (result == null) result = caseMBaseDevice(dualButtonButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_ACCELEROMETER: {
        MBrickletAccelerometer mBrickletAccelerometer = (MBrickletAccelerometer)theEObject;
        T result = caseMBrickletAccelerometer(mBrickletAccelerometer);
        if (result == null) result = caseMDevice(mBrickletAccelerometer);
        if (result == null) result = caseMSubDeviceHolder(mBrickletAccelerometer);
        if (result == null) result = caseMTFConfigConsumer(mBrickletAccelerometer);
        if (result == null) result = caseMBaseDevice(mBrickletAccelerometer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ACCELEROMETER_DEVICE: {
        AccelerometerDevice accelerometerDevice = (AccelerometerDevice)theEObject;
        T result = caseAccelerometerDevice(accelerometerDevice);
        if (result == null) result = caseMSubDevice(accelerometerDevice);
        if (result == null) result = caseMBaseDevice(accelerometerDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ACCELEROMETER_DIRECTION: {
        AccelerometerDirection accelerometerDirection = (AccelerometerDirection)theEObject;
        T result = caseAccelerometerDirection(accelerometerDirection);
        if (result == null) result = caseAccelerometerDevice(accelerometerDirection);
        if (result == null) result = caseMSensor(accelerometerDirection);
        if (result == null) result = caseMTFConfigConsumer(accelerometerDirection);
        if (result == null) result = caseCallbackListener(accelerometerDirection);
        if (result == null) result = caseMSubDevice(accelerometerDirection);
        if (result == null) result = caseMBaseDevice(accelerometerDirection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ACCELEROMETER_TEMPERATURE: {
        AccelerometerTemperature accelerometerTemperature = (AccelerometerTemperature)theEObject;
        T result = caseAccelerometerTemperature(accelerometerTemperature);
        if (result == null) result = caseAccelerometerDevice(accelerometerTemperature);
        if (result == null) result = caseMSensor(accelerometerTemperature);
        if (result == null) result = caseMSubDevice(accelerometerTemperature);
        if (result == null) result = caseMBaseDevice(accelerometerTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ACCELEROMETER_LED: {
        AccelerometerLed accelerometerLed = (AccelerometerLed)theEObject;
        T result = caseAccelerometerLed(accelerometerLed);
        if (result == null) result = caseAccelerometerDevice(accelerometerLed);
        if (result == null) result = caseDigitalActor(accelerometerLed);
        if (result == null) result = caseMSubDevice(accelerometerLed);
        if (result == null) result = caseMBaseDevice(accelerometerLed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_LASER_RANGE_FINDER: {
        MBrickletLaserRangeFinder mBrickletLaserRangeFinder = (MBrickletLaserRangeFinder)theEObject;
        T result = caseMBrickletLaserRangeFinder(mBrickletLaserRangeFinder);
        if (result == null) result = caseMDevice(mBrickletLaserRangeFinder);
        if (result == null) result = caseMSubDeviceHolder(mBrickletLaserRangeFinder);
        if (result == null) result = caseMTFConfigConsumer(mBrickletLaserRangeFinder);
        if (result == null) result = caseMBaseDevice(mBrickletLaserRangeFinder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LASER_RANGE_FINDER_DEVICE: {
        LaserRangeFinderDevice laserRangeFinderDevice = (LaserRangeFinderDevice)theEObject;
        T result = caseLaserRangeFinderDevice(laserRangeFinderDevice);
        if (result == null) result = caseMSubDevice(laserRangeFinderDevice);
        if (result == null) result = caseMBaseDevice(laserRangeFinderDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LASER_RANGE_FINDER_LASER: {
        LaserRangeFinderLaser laserRangeFinderLaser = (LaserRangeFinderLaser)theEObject;
        T result = caseLaserRangeFinderLaser(laserRangeFinderLaser);
        if (result == null) result = caseLaserRangeFinderDevice(laserRangeFinderLaser);
        if (result == null) result = caseDigitalActor(laserRangeFinderLaser);
        if (result == null) result = caseMSubDevice(laserRangeFinderLaser);
        if (result == null) result = caseMBaseDevice(laserRangeFinderLaser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LASER_RANGE_FINDER_DISTANCE: {
        LaserRangeFinderDistance laserRangeFinderDistance = (LaserRangeFinderDistance)theEObject;
        T result = caseLaserRangeFinderDistance(laserRangeFinderDistance);
        if (result == null) result = caseLaserRangeFinderDevice(laserRangeFinderDistance);
        if (result == null) result = caseMTFConfigConsumer(laserRangeFinderDistance);
        if (result == null) result = caseMSensor(laserRangeFinderDistance);
        if (result == null) result = caseCallbackListener(laserRangeFinderDistance);
        if (result == null) result = caseMSubDevice(laserRangeFinderDistance);
        if (result == null) result = caseMBaseDevice(laserRangeFinderDistance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LASER_RANGE_FINDER_VELOCITY: {
        LaserRangeFinderVelocity laserRangeFinderVelocity = (LaserRangeFinderVelocity)theEObject;
        T result = caseLaserRangeFinderVelocity(laserRangeFinderVelocity);
        if (result == null) result = caseLaserRangeFinderDevice(laserRangeFinderVelocity);
        if (result == null) result = caseMTFConfigConsumer(laserRangeFinderVelocity);
        if (result == null) result = caseMSensor(laserRangeFinderVelocity);
        if (result == null) result = caseCallbackListener(laserRangeFinderVelocity);
        if (result == null) result = caseMSubDevice(laserRangeFinderVelocity);
        if (result == null) result = caseMBaseDevice(laserRangeFinderVelocity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_LOAD_CELL: {
        MBrickletLoadCell mBrickletLoadCell = (MBrickletLoadCell)theEObject;
        T result = caseMBrickletLoadCell(mBrickletLoadCell);
        if (result == null) result = caseMDevice(mBrickletLoadCell);
        if (result == null) result = caseMSubDeviceHolder(mBrickletLoadCell);
        if (result == null) result = caseMBaseDevice(mBrickletLoadCell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LOAD_CELL_DEVICE: {
        LoadCellDevice loadCellDevice = (LoadCellDevice)theEObject;
        T result = caseLoadCellDevice(loadCellDevice);
        if (result == null) result = caseMSubDevice(loadCellDevice);
        if (result == null) result = caseMBaseDevice(loadCellDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LOAD_CELL_WEIGHT: {
        LoadCellWeight loadCellWeight = (LoadCellWeight)theEObject;
        T result = caseLoadCellWeight(loadCellWeight);
        if (result == null) result = caseLoadCellDevice(loadCellWeight);
        if (result == null) result = caseMSensor(loadCellWeight);
        if (result == null) result = caseMTFConfigConsumer(loadCellWeight);
        if (result == null) result = caseCallbackListener(loadCellWeight);
        if (result == null) result = caseMSubDevice(loadCellWeight);
        if (result == null) result = caseMBaseDevice(loadCellWeight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LOAD_CELL_LED: {
        LoadCellLed loadCellLed = (LoadCellLed)theEObject;
        T result = caseLoadCellLed(loadCellLed);
        if (result == null) result = caseLoadCellDevice(loadCellLed);
        if (result == null) result = caseDigitalActor(loadCellLed);
        if (result == null) result = caseMSubDevice(loadCellLed);
        if (result == null) result = caseMBaseDevice(loadCellLed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_COLOR: {
        MBrickletColor mBrickletColor = (MBrickletColor)theEObject;
        T result = caseMBrickletColor(mBrickletColor);
        if (result == null) result = caseMDevice(mBrickletColor);
        if (result == null) result = caseMSubDeviceHolder(mBrickletColor);
        if (result == null) result = caseMTFConfigConsumer(mBrickletColor);
        if (result == null) result = caseMBaseDevice(mBrickletColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BRICKLET_COLOR_DEVICE: {
        BrickletColorDevice brickletColorDevice = (BrickletColorDevice)theEObject;
        T result = caseBrickletColorDevice(brickletColorDevice);
        if (result == null) result = caseMSubDevice(brickletColorDevice);
        if (result == null) result = caseMBaseDevice(brickletColorDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.COLOR_COLOR: {
        ColorColor colorColor = (ColorColor)theEObject;
        T result = caseColorColor(colorColor);
        if (result == null) result = caseBrickletColorDevice(colorColor);
        if (result == null) result = caseMSensor(colorColor);
        if (result == null) result = caseMTFConfigConsumer(colorColor);
        if (result == null) result = caseCallbackListener(colorColor);
        if (result == null) result = caseMSubDevice(colorColor);
        if (result == null) result = caseMBaseDevice(colorColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.COLOR_ILLUMINANCE: {
        ColorIlluminance colorIlluminance = (ColorIlluminance)theEObject;
        T result = caseColorIlluminance(colorIlluminance);
        if (result == null) result = caseBrickletColorDevice(colorIlluminance);
        if (result == null) result = caseMSensor(colorIlluminance);
        if (result == null) result = caseMTFConfigConsumer(colorIlluminance);
        if (result == null) result = caseCallbackListener(colorIlluminance);
        if (result == null) result = caseMSubDevice(colorIlluminance);
        if (result == null) result = caseMBaseDevice(colorIlluminance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.COLOR_COLOR_TEMPERATURE: {
        ColorColorTemperature colorColorTemperature = (ColorColorTemperature)theEObject;
        T result = caseColorColorTemperature(colorColorTemperature);
        if (result == null) result = caseBrickletColorDevice(colorColorTemperature);
        if (result == null) result = caseMSensor(colorColorTemperature);
        if (result == null) result = caseMTFConfigConsumer(colorColorTemperature);
        if (result == null) result = caseCallbackListener(colorColorTemperature);
        if (result == null) result = caseMSubDevice(colorColorTemperature);
        if (result == null) result = caseMBaseDevice(colorColorTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.COLOR_LED: {
        ColorLed colorLed = (ColorLed)theEObject;
        T result = caseColorLed(colorLed);
        if (result == null) result = caseBrickletColorDevice(colorLed);
        if (result == null) result = caseDigitalActor(colorLed);
        if (result == null) result = caseMSubDevice(colorLed);
        if (result == null) result = caseMBaseDevice(colorLed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DUAL_BUTTON_LED: {
        DualButtonLed dualButtonLed = (DualButtonLed)theEObject;
        T result = caseDualButtonLed(dualButtonLed);
        if (result == null) result = caseDualButtonDevice(dualButtonLed);
        if (result == null) result = caseDigitalActor(dualButtonLed);
        if (result == null) result = caseMTFConfigConsumer(dualButtonLed);
        if (result == null) result = caseMSubDevice(dualButtonLed);
        if (result == null) result = caseMBaseDevice(dualButtonLed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_LINEAR_POTI: {
        MBrickletLinearPoti mBrickletLinearPoti = (MBrickletLinearPoti)theEObject;
        T result = caseMBrickletLinearPoti(mBrickletLinearPoti);
        if (result == null) result = caseMDevice(mBrickletLinearPoti);
        if (result == null) result = caseCallbackListener(mBrickletLinearPoti);
        if (result == null) result = caseMTFConfigConsumer(mBrickletLinearPoti);
        if (result == null) result = caseMSensor(mBrickletLinearPoti);
        if (result == null) result = caseMBaseDevice(mBrickletLinearPoti);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_ROTARY_ENCODER: {
        MBrickletRotaryEncoder mBrickletRotaryEncoder = (MBrickletRotaryEncoder)theEObject;
        T result = caseMBrickletRotaryEncoder(mBrickletRotaryEncoder);
        if (result == null) result = caseMDevice(mBrickletRotaryEncoder);
        if (result == null) result = caseMSubDeviceHolder(mBrickletRotaryEncoder);
        if (result == null) result = caseMBaseDevice(mBrickletRotaryEncoder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ROTARY_ENCODER_DEVICE: {
        RotaryEncoderDevice rotaryEncoderDevice = (RotaryEncoderDevice)theEObject;
        T result = caseRotaryEncoderDevice(rotaryEncoderDevice);
        if (result == null) result = caseMSubDevice(rotaryEncoderDevice);
        if (result == null) result = caseMBaseDevice(rotaryEncoderDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ROTARY_ENCODER: {
        RotaryEncoder rotaryEncoder = (RotaryEncoder)theEObject;
        T result = caseRotaryEncoder(rotaryEncoder);
        if (result == null) result = caseRotaryEncoderDevice(rotaryEncoder);
        if (result == null) result = caseMSensor(rotaryEncoder);
        if (result == null) result = caseCallbackListener(rotaryEncoder);
        if (result == null) result = caseMTFConfigConsumer(rotaryEncoder);
        if (result == null) result = caseMSubDevice(rotaryEncoder);
        if (result == null) result = caseMBaseDevice(rotaryEncoder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ROTARY_ENCODER_BUTTON: {
        RotaryEncoderButton rotaryEncoderButton = (RotaryEncoderButton)theEObject;
        T result = caseRotaryEncoderButton(rotaryEncoderButton);
        if (result == null) result = caseRotaryEncoderDevice(rotaryEncoderButton);
        if (result == null) result = caseMSensor(rotaryEncoderButton);
        if (result == null) result = caseMTFConfigConsumer(rotaryEncoderButton);
        if (result == null) result = caseMSubDevice(rotaryEncoderButton);
        if (result == null) result = caseMBaseDevice(rotaryEncoderButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_JOYSTICK: {
        MBrickletJoystick mBrickletJoystick = (MBrickletJoystick)theEObject;
        T result = caseMBrickletJoystick(mBrickletJoystick);
        if (result == null) result = caseMDevice(mBrickletJoystick);
        if (result == null) result = caseMSubDeviceHolder(mBrickletJoystick);
        if (result == null) result = caseCallbackListener(mBrickletJoystick);
        if (result == null) result = caseMTFConfigConsumer(mBrickletJoystick);
        if (result == null) result = caseMBaseDevice(mBrickletJoystick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.JOYSTICK_DEVICE: {
        JoystickDevice joystickDevice = (JoystickDevice)theEObject;
        T result = caseJoystickDevice(joystickDevice);
        if (result == null) result = caseMSubDevice(joystickDevice);
        if (result == null) result = caseMBaseDevice(joystickDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.JOYSTICK_XPOSITION: {
        JoystickXPosition joystickXPosition = (JoystickXPosition)theEObject;
        T result = caseJoystickXPosition(joystickXPosition);
        if (result == null) result = caseJoystickDevice(joystickXPosition);
        if (result == null) result = caseMSensor(joystickXPosition);
        if (result == null) result = caseMSubDevice(joystickXPosition);
        if (result == null) result = caseMBaseDevice(joystickXPosition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.JOYSTICK_YPOSITION: {
        JoystickYPosition joystickYPosition = (JoystickYPosition)theEObject;
        T result = caseJoystickYPosition(joystickYPosition);
        if (result == null) result = caseJoystickDevice(joystickYPosition);
        if (result == null) result = caseMSensor(joystickYPosition);
        if (result == null) result = caseMSubDevice(joystickYPosition);
        if (result == null) result = caseMBaseDevice(joystickYPosition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.JOYSTICK_BUTTON: {
        JoystickButton joystickButton = (JoystickButton)theEObject;
        T result = caseJoystickButton(joystickButton);
        if (result == null) result = caseJoystickDevice(joystickButton);
        if (result == null) result = caseMSensor(joystickButton);
        if (result == null) result = caseMTFConfigConsumer(joystickButton);
        if (result == null) result = caseMSubDevice(joystickButton);
        if (result == null) result = caseMBaseDevice(joystickButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_ANALOG_OUT_V2: {
        MBrickletAnalogOutV2 mBrickletAnalogOutV2 = (MBrickletAnalogOutV2)theEObject;
        T result = caseMBrickletAnalogOutV2(mBrickletAnalogOutV2);
        if (result == null) result = caseMSensor(mBrickletAnalogOutV2);
        if (result == null) result = caseMDevice(mBrickletAnalogOutV2);
        if (result == null) result = caseSetPointActor(mBrickletAnalogOutV2);
        if (result == null) result = caseMBaseDevice(mBrickletAnalogOutV2);
        if (result == null) result = caseDimmableActor(mBrickletAnalogOutV2);
        if (result == null) result = casePercentTypeActor(mBrickletAnalogOutV2);
        if (result == null) result = caseMTFConfigConsumer(mBrickletAnalogOutV2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICK_SERVO: {
        MBrickServo mBrickServo = (MBrickServo)theEObject;
        T result = caseMBrickServo(mBrickServo);
        if (result == null) result = caseMDevice(mBrickServo);
        if (result == null) result = caseMSubDeviceHolder(mBrickServo);
        if (result == null) result = caseMBaseDevice(mBrickServo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSERVO: {
        MServo mServo = (MServo)theEObject;
        T result = caseMServo(mServo);
        if (result == null) result = caseMSensor(mServo);
        if (result == null) result = caseProgrammableSwitchActor(mServo);
        if (result == null) result = caseMSubDevice(mServo);
        if (result == null) result = caseMoveActor(mServo);
        if (result == null) result = caseSetPointActor(mServo);
        if (result == null) result = caseSwitchSensor(mServo);
        if (result == null) result = caseMBaseDevice(mServo);
        if (result == null) result = caseDimmableActor(mServo);
        if (result == null) result = casePercentTypeActor(mServo);
        if (result == null) result = caseMTFConfigConsumer(mServo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICK_DC: {
        MBrickDC mBrickDC = (MBrickDC)theEObject;
        T result = caseMBrickDC(mBrickDC);
        if (result == null) result = caseMSensor(mBrickDC);
        if (result == null) result = caseProgrammableSwitchActor(mBrickDC);
        if (result == null) result = caseMDevice(mBrickDC);
        if (result == null) result = caseMoveActor(mBrickDC);
        if (result == null) result = caseSetPointActor(mBrickDC);
        if (result == null) result = caseCallbackListener(mBrickDC);
        if (result == null) result = caseSwitchSensor(mBrickDC);
        if (result == null) result = caseMBaseDevice(mBrickDC);
        if (result == null) result = caseDimmableActor(mBrickDC);
        if (result == null) result = casePercentTypeActor(mBrickDC);
        if (result == null) result = caseMTFConfigConsumer(mBrickDC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICK_STEPPER: {
        MBrickStepper mBrickStepper = (MBrickStepper)theEObject;
        T result = caseMBrickStepper(mBrickStepper);
        if (result == null) result = caseMDevice(mBrickStepper);
        if (result == null) result = caseMSubDeviceHolder(mBrickStepper);
        if (result == null) result = caseMTFConfigConsumer(mBrickStepper);
        if (result == null) result = caseMBaseDevice(mBrickStepper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_BRICK_STEPPER_CONFIGURATION: {
        TFBrickStepperConfiguration tfBrickStepperConfiguration = (TFBrickStepperConfiguration)theEObject;
        T result = caseTFBrickStepperConfiguration(tfBrickStepperConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfBrickStepperConfiguration);
        if (result == null) result = caseTFConfig(tfBrickStepperConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_DEVICE: {
        MStepperDevice mStepperDevice = (MStepperDevice)theEObject;
        T result = caseMStepperDevice(mStepperDevice);
        if (result == null) result = caseMSubDevice(mStepperDevice);
        if (result == null) result = caseMBaseDevice(mStepperDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_DRIVE: {
        MStepperDrive mStepperDrive = (MStepperDrive)theEObject;
        T result = caseMStepperDrive(mStepperDrive);
        if (result == null) result = caseMStepperDevice(mStepperDrive);
        if (result == null) result = caseMSubDevice(mStepperDrive);
        if (result == null) result = caseMBaseDevice(mStepperDrive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_VELOCITY: {
        MStepperVelocity mStepperVelocity = (MStepperVelocity)theEObject;
        T result = caseMStepperVelocity(mStepperVelocity);
        if (result == null) result = caseMStepperDevice(mStepperVelocity);
        if (result == null) result = caseMSensor(mStepperVelocity);
        if (result == null) result = caseMSubDevice(mStepperVelocity);
        if (result == null) result = caseMBaseDevice(mStepperVelocity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_CURRENT: {
        MStepperCurrent mStepperCurrent = (MStepperCurrent)theEObject;
        T result = caseMStepperCurrent(mStepperCurrent);
        if (result == null) result = caseMStepperDevice(mStepperCurrent);
        if (result == null) result = caseMSensor(mStepperCurrent);
        if (result == null) result = caseMSubDevice(mStepperCurrent);
        if (result == null) result = caseMBaseDevice(mStepperCurrent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_POSITION: {
        MStepperPosition mStepperPosition = (MStepperPosition)theEObject;
        T result = caseMStepperPosition(mStepperPosition);
        if (result == null) result = caseMStepperDevice(mStepperPosition);
        if (result == null) result = caseMSensor(mStepperPosition);
        if (result == null) result = caseMSubDevice(mStepperPosition);
        if (result == null) result = caseMBaseDevice(mStepperPosition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_STEPS: {
        MStepperSteps mStepperSteps = (MStepperSteps)theEObject;
        T result = caseMStepperSteps(mStepperSteps);
        if (result == null) result = caseMStepperDevice(mStepperSteps);
        if (result == null) result = caseMSensor(mStepperSteps);
        if (result == null) result = caseMSubDevice(mStepperSteps);
        if (result == null) result = caseMBaseDevice(mStepperSteps);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_STACK_VOLTAGE: {
        MStepperStackVoltage mStepperStackVoltage = (MStepperStackVoltage)theEObject;
        T result = caseMStepperStackVoltage(mStepperStackVoltage);
        if (result == null) result = caseMStepperDevice(mStepperStackVoltage);
        if (result == null) result = caseMSensor(mStepperStackVoltage);
        if (result == null) result = caseMSubDevice(mStepperStackVoltage);
        if (result == null) result = caseMBaseDevice(mStepperStackVoltage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_EXTERNAL_VOLTAGE: {
        MStepperExternalVoltage mStepperExternalVoltage = (MStepperExternalVoltage)theEObject;
        T result = caseMStepperExternalVoltage(mStepperExternalVoltage);
        if (result == null) result = caseMStepperDevice(mStepperExternalVoltage);
        if (result == null) result = caseMSensor(mStepperExternalVoltage);
        if (result == null) result = caseMSubDevice(mStepperExternalVoltage);
        if (result == null) result = caseMBaseDevice(mStepperExternalVoltage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_CONSUMPTION: {
        MStepperConsumption mStepperConsumption = (MStepperConsumption)theEObject;
        T result = caseMStepperConsumption(mStepperConsumption);
        if (result == null) result = caseMStepperDevice(mStepperConsumption);
        if (result == null) result = caseMSensor(mStepperConsumption);
        if (result == null) result = caseMSubDevice(mStepperConsumption);
        if (result == null) result = caseMBaseDevice(mStepperConsumption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_UNDER_VOLTAGE: {
        MStepperUnderVoltage mStepperUnderVoltage = (MStepperUnderVoltage)theEObject;
        T result = caseMStepperUnderVoltage(mStepperUnderVoltage);
        if (result == null) result = caseMStepperDevice(mStepperUnderVoltage);
        if (result == null) result = caseMSensor(mStepperUnderVoltage);
        if (result == null) result = caseMSubDevice(mStepperUnderVoltage);
        if (result == null) result = caseMBaseDevice(mStepperUnderVoltage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_STATE: {
        MStepperState mStepperState = (MStepperState)theEObject;
        T result = caseMStepperState(mStepperState);
        if (result == null) result = caseMStepperDevice(mStepperState);
        if (result == null) result = caseMSensor(mStepperState);
        if (result == null) result = caseMSubDevice(mStepperState);
        if (result == null) result = caseMBaseDevice(mStepperState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_CHIP_TEMPERATURE: {
        MStepperChipTemperature mStepperChipTemperature = (MStepperChipTemperature)theEObject;
        T result = caseMStepperChipTemperature(mStepperChipTemperature);
        if (result == null) result = caseMStepperDevice(mStepperChipTemperature);
        if (result == null) result = caseMSensor(mStepperChipTemperature);
        if (result == null) result = caseMSubDevice(mStepperChipTemperature);
        if (result == null) result = caseMBaseDevice(mStepperChipTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MSTEPPER_STATUS_LED: {
        MStepperStatusLed mStepperStatusLed = (MStepperStatusLed)theEObject;
        T result = caseMStepperStatusLed(mStepperStatusLed);
        if (result == null) result = caseMStepperDevice(mStepperStatusLed);
        if (result == null) result = caseDigitalActor(mStepperStatusLed);
        if (result == null) result = caseMSubDevice(mStepperStatusLed);
        if (result == null) result = caseMBaseDevice(mStepperStatusLed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MDUAL_RELAY_BRICKLET: {
        MDualRelayBricklet mDualRelayBricklet = (MDualRelayBricklet)theEObject;
        T result = caseMDualRelayBricklet(mDualRelayBricklet);
        if (result == null) result = caseMDevice(mDualRelayBricklet);
        if (result == null) result = caseMSubDeviceHolder(mDualRelayBricklet);
        if (result == null) result = caseMBaseDevice(mDualRelayBricklet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MINDUSTRIAL_QUAD_RELAY_BRICKLET: {
        MIndustrialQuadRelayBricklet mIndustrialQuadRelayBricklet = (MIndustrialQuadRelayBricklet)theEObject;
        T result = caseMIndustrialQuadRelayBricklet(mIndustrialQuadRelayBricklet);
        if (result == null) result = caseMDevice(mIndustrialQuadRelayBricklet);
        if (result == null) result = caseMSubDeviceHolder(mIndustrialQuadRelayBricklet);
        if (result == null) result = caseMBaseDevice(mIndustrialQuadRelayBricklet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MINDUSTRIAL_QUAD_RELAY: {
        MIndustrialQuadRelay mIndustrialQuadRelay = (MIndustrialQuadRelay)theEObject;
        T result = caseMIndustrialQuadRelay(mIndustrialQuadRelay);
        if (result == null) result = caseMInSwitchActor(mIndustrialQuadRelay);
        if (result == null) result = caseMSubDevice(mIndustrialQuadRelay);
        if (result == null) result = caseMSwitchActor(mIndustrialQuadRelay);
        if (result == null) result = caseMBaseDevice(mIndustrialQuadRelay);
        if (result == null) result = caseSwitchSensor(mIndustrialQuadRelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_INDUSTRIAL_DIGITAL_IN4: {
        MBrickletIndustrialDigitalIn4 mBrickletIndustrialDigitalIn4 = (MBrickletIndustrialDigitalIn4)theEObject;
        T result = caseMBrickletIndustrialDigitalIn4(mBrickletIndustrialDigitalIn4);
        if (result == null) result = caseMSubDeviceHolder(mBrickletIndustrialDigitalIn4);
        if (result == null) result = caseMDevice(mBrickletIndustrialDigitalIn4);
        if (result == null) result = caseInterruptListener(mBrickletIndustrialDigitalIn4);
        if (result == null) result = caseMTFConfigConsumer(mBrickletIndustrialDigitalIn4);
        if (result == null) result = caseMBaseDevice(mBrickletIndustrialDigitalIn4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MINDUSTRIAL_DIGITAL_IN: {
        MIndustrialDigitalIn mIndustrialDigitalIn = (MIndustrialDigitalIn)theEObject;
        T result = caseMIndustrialDigitalIn(mIndustrialDigitalIn);
        if (result == null) result = caseMSubDevice(mIndustrialDigitalIn);
        if (result == null) result = caseMSensor(mIndustrialDigitalIn);
        if (result == null) result = caseMBaseDevice(mIndustrialDigitalIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_INDUSTRIAL_DIGITAL_OUT4: {
        MBrickletIndustrialDigitalOut4 mBrickletIndustrialDigitalOut4 = (MBrickletIndustrialDigitalOut4)theEObject;
        T result = caseMBrickletIndustrialDigitalOut4(mBrickletIndustrialDigitalOut4);
        if (result == null) result = caseMDevice(mBrickletIndustrialDigitalOut4);
        if (result == null) result = caseMSubDeviceHolder(mBrickletIndustrialDigitalOut4);
        if (result == null) result = caseMBaseDevice(mBrickletIndustrialDigitalOut4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIGITAL_ACTOR_DIGITAL_OUT4: {
        DigitalActorDigitalOut4 digitalActorDigitalOut4 = (DigitalActorDigitalOut4)theEObject;
        T result = caseDigitalActorDigitalOut4(digitalActorDigitalOut4);
        if (result == null) result = caseDigitalActor(digitalActorDigitalOut4);
        if (result == null) result = caseMSubDevice(digitalActorDigitalOut4);
        if (result == null) result = caseMBaseDevice(digitalActorDigitalOut4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_SEGMENT_DISPLAY4X7: {
        MBrickletSegmentDisplay4x7 mBrickletSegmentDisplay4x7 = (MBrickletSegmentDisplay4x7)theEObject;
        T result = caseMBrickletSegmentDisplay4x7(mBrickletSegmentDisplay4x7);
        if (result == null) result = caseNumberActor(mBrickletSegmentDisplay4x7);
        if (result == null) result = caseMDevice(mBrickletSegmentDisplay4x7);
        if (result == null) result = caseMBaseDevice(mBrickletSegmentDisplay4x7);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_LED_STRIP: {
        MBrickletLEDStrip mBrickletLEDStrip = (MBrickletLEDStrip)theEObject;
        T result = caseMBrickletLEDStrip(mBrickletLEDStrip);
        if (result == null) result = caseProgrammableColorActor(mBrickletLEDStrip);
        if (result == null) result = caseMDevice(mBrickletLEDStrip);
        if (result == null) result = caseMTFConfigConsumer(mBrickletLEDStrip);
        if (result == null) result = caseMSubDeviceHolder(mBrickletLEDStrip);
        if (result == null) result = caseColorActor(mBrickletLEDStrip);
        if (result == null) result = caseMBaseDevice(mBrickletLEDStrip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LED_GROUP: {
        LEDGroup ledGroup = (LEDGroup)theEObject;
        T result = caseLEDGroup(ledGroup);
        if (result == null) result = caseMSubDevice(ledGroup);
        if (result == null) result = caseSimpleColorActor(ledGroup);
        if (result == null) result = caseMSwitchActor(ledGroup);
        if (result == null) result = caseMTFConfigConsumer(ledGroup);
        if (result == null) result = caseMBaseDevice(ledGroup);
        if (result == null) result = caseColorActor(ledGroup);
        if (result == null) result = caseSwitchSensor(ledGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIGITAL_ACTOR_IO16: {
        DigitalActorIO16 digitalActorIO16 = (DigitalActorIO16)theEObject;
        T result = caseDigitalActorIO16(digitalActorIO16);
        if (result == null) result = caseDigitalActor(digitalActorIO16);
        if (result == null) result = caseIODevice(digitalActorIO16);
        if (result == null) result = caseMTFConfigConsumer(digitalActorIO16);
        if (result == null) result = caseMSubDevice(digitalActorIO16);
        if (result == null) result = caseGenericDevice(digitalActorIO16);
        if (result == null) result = caseMBaseDevice(digitalActorIO16);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_IO16: {
        MBrickletIO16 mBrickletIO16 = (MBrickletIO16)theEObject;
        T result = caseMBrickletIO16(mBrickletIO16);
        if (result == null) result = caseMDevice(mBrickletIO16);
        if (result == null) result = caseMSubDeviceHolder(mBrickletIO16);
        if (result == null) result = caseInterruptListener(mBrickletIO16);
        if (result == null) result = caseMTFConfigConsumer(mBrickletIO16);
        if (result == null) result = caseMBaseDevice(mBrickletIO16);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIGITAL_SENSOR: {
        DigitalSensor digitalSensor = (DigitalSensor)theEObject;
        T result = caseDigitalSensor(digitalSensor);
        if (result == null) result = caseIODevice(digitalSensor);
        if (result == null) result = caseMSensor(digitalSensor);
        if (result == null) result = caseMTFConfigConsumer(digitalSensor);
        if (result == null) result = caseMSubDevice(digitalSensor);
        if (result == null) result = caseGenericDevice(digitalSensor);
        if (result == null) result = caseMBaseDevice(digitalSensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_IO4: {
        MBrickletIO4 mBrickletIO4 = (MBrickletIO4)theEObject;
        T result = caseMBrickletIO4(mBrickletIO4);
        if (result == null) result = caseMDevice(mBrickletIO4);
        if (result == null) result = caseMSubDeviceHolder(mBrickletIO4);
        if (result == null) result = caseInterruptListener(mBrickletIO4);
        if (result == null) result = caseMTFConfigConsumer(mBrickletIO4);
        if (result == null) result = caseMBaseDevice(mBrickletIO4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.IO4_DEVICE: {
        IO4Device io4Device = (IO4Device)theEObject;
        T result = caseIO4Device(io4Device);
        if (result == null) result = caseMSubDevice(io4Device);
        if (result == null) result = caseGenericDevice(io4Device);
        if (result == null) result = caseMBaseDevice(io4Device);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIGITAL_SENSOR_IO4: {
        DigitalSensorIO4 digitalSensorIO4 = (DigitalSensorIO4)theEObject;
        T result = caseDigitalSensorIO4(digitalSensorIO4);
        if (result == null) result = caseIO4Device(digitalSensorIO4);
        if (result == null) result = caseMSensor(digitalSensorIO4);
        if (result == null) result = caseMTFConfigConsumer(digitalSensorIO4);
        if (result == null) result = caseMSubDevice(digitalSensorIO4);
        if (result == null) result = caseGenericDevice(digitalSensorIO4);
        if (result == null) result = caseMBaseDevice(digitalSensorIO4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIGITAL_ACTOR_IO4: {
        DigitalActorIO4 digitalActorIO4 = (DigitalActorIO4)theEObject;
        T result = caseDigitalActorIO4(digitalActorIO4);
        if (result == null) result = caseDigitalActor(digitalActorIO4);
        if (result == null) result = caseIO4Device(digitalActorIO4);
        if (result == null) result = caseMTFConfigConsumer(digitalActorIO4);
        if (result == null) result = caseMSubDevice(digitalActorIO4);
        if (result == null) result = caseGenericDevice(digitalActorIO4);
        if (result == null) result = caseMBaseDevice(digitalActorIO4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_MULTI_TOUCH: {
        MBrickletMultiTouch mBrickletMultiTouch = (MBrickletMultiTouch)theEObject;
        T result = caseMBrickletMultiTouch(mBrickletMultiTouch);
        if (result == null) result = caseMDevice(mBrickletMultiTouch);
        if (result == null) result = caseMSubDeviceHolder(mBrickletMultiTouch);
        if (result == null) result = caseMTFConfigConsumer(mBrickletMultiTouch);
        if (result == null) result = caseMBaseDevice(mBrickletMultiTouch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MULTI_TOUCH_DEVICE: {
        MultiTouchDevice multiTouchDevice = (MultiTouchDevice)theEObject;
        T result = caseMultiTouchDevice(multiTouchDevice);
        if (result == null) result = caseMSubDevice(multiTouchDevice);
        if (result == null) result = caseMSensor(multiTouchDevice);
        if (result == null) result = caseMTFConfigConsumer(multiTouchDevice);
        if (result == null) result = caseMBaseDevice(multiTouchDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.ELECTRODE: {
        Electrode electrode = (Electrode)theEObject;
        T result = caseElectrode(electrode);
        if (result == null) result = caseMultiTouchDevice(electrode);
        if (result == null) result = caseMSubDevice(electrode);
        if (result == null) result = caseMSensor(electrode);
        if (result == null) result = caseMTFConfigConsumer(electrode);
        if (result == null) result = caseMBaseDevice(electrode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PROXIMITY: {
        Proximity proximity = (Proximity)theEObject;
        T result = caseProximity(proximity);
        if (result == null) result = caseMultiTouchDevice(proximity);
        if (result == null) result = caseMSubDevice(proximity);
        if (result == null) result = caseMSensor(proximity);
        if (result == null) result = caseMTFConfigConsumer(proximity);
        if (result == null) result = caseMBaseDevice(proximity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_MOTION_DETECTOR: {
        MBrickletMotionDetector mBrickletMotionDetector = (MBrickletMotionDetector)theEObject;
        T result = caseMBrickletMotionDetector(mBrickletMotionDetector);
        if (result == null) result = caseMDevice(mBrickletMotionDetector);
        if (result == null) result = caseMSensor(mBrickletMotionDetector);
        if (result == null) result = caseMBaseDevice(mBrickletMotionDetector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_HALL_EFFECT: {
        MBrickletHallEffect mBrickletHallEffect = (MBrickletHallEffect)theEObject;
        T result = caseMBrickletHallEffect(mBrickletHallEffect);
        if (result == null) result = caseMDevice(mBrickletHallEffect);
        if (result == null) result = caseMSensor(mBrickletHallEffect);
        if (result == null) result = caseCallbackListener(mBrickletHallEffect);
        if (result == null) result = caseMTFConfigConsumer(mBrickletHallEffect);
        if (result == null) result = caseMBaseDevice(mBrickletHallEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MDUAL_RELAY: {
        MDualRelay mDualRelay = (MDualRelay)theEObject;
        T result = caseMDualRelay(mDualRelay);
        if (result == null) result = caseMInSwitchActor(mDualRelay);
        if (result == null) result = caseMSubDevice(mDualRelay);
        if (result == null) result = caseMSwitchActor(mDualRelay);
        if (result == null) result = caseMBaseDevice(mDualRelay);
        if (result == null) result = caseSwitchSensor(mDualRelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_REMOTE_SWITCH: {
        MBrickletRemoteSwitch mBrickletRemoteSwitch = (MBrickletRemoteSwitch)theEObject;
        T result = caseMBrickletRemoteSwitch(mBrickletRemoteSwitch);
        if (result == null) result = caseMDevice(mBrickletRemoteSwitch);
        if (result == null) result = caseMSubDeviceHolder(mBrickletRemoteSwitch);
        if (result == null) result = caseSubDeviceAdmin(mBrickletRemoteSwitch);
        if (result == null) result = caseMTFConfigConsumer(mBrickletRemoteSwitch);
        if (result == null) result = caseMBaseDevice(mBrickletRemoteSwitch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.REMOTE_SWITCH: {
        RemoteSwitch remoteSwitch = (RemoteSwitch)theEObject;
        T result = caseRemoteSwitch(remoteSwitch);
        if (result == null) result = caseMInSwitchActor(remoteSwitch);
        if (result == null) result = caseMSubDevice(remoteSwitch);
        if (result == null) result = caseMSwitchActor(remoteSwitch);
        if (result == null) result = caseMBaseDevice(remoteSwitch);
        if (result == null) result = caseSwitchSensor(remoteSwitch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.REMOTE_SWITCH_A: {
        RemoteSwitchA remoteSwitchA = (RemoteSwitchA)theEObject;
        T result = caseRemoteSwitchA(remoteSwitchA);
        if (result == null) result = caseRemoteSwitch(remoteSwitchA);
        if (result == null) result = caseMTFConfigConsumer(remoteSwitchA);
        if (result == null) result = caseMInSwitchActor(remoteSwitchA);
        if (result == null) result = caseMSubDevice(remoteSwitchA);
        if (result == null) result = caseMSwitchActor(remoteSwitchA);
        if (result == null) result = caseMBaseDevice(remoteSwitchA);
        if (result == null) result = caseSwitchSensor(remoteSwitchA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.REMOTE_SWITCH_B: {
        RemoteSwitchB remoteSwitchB = (RemoteSwitchB)theEObject;
        T result = caseRemoteSwitchB(remoteSwitchB);
        if (result == null) result = caseMSensor(remoteSwitchB);
        if (result == null) result = caseRemoteSwitch(remoteSwitchB);
        if (result == null) result = caseDimmableActor(remoteSwitchB);
        if (result == null) result = casePercentTypeActor(remoteSwitchB);
        if (result == null) result = caseMInSwitchActor(remoteSwitchB);
        if (result == null) result = caseMSubDevice(remoteSwitchB);
        if (result == null) result = caseMTFConfigConsumer(remoteSwitchB);
        if (result == null) result = caseMSwitchActor(remoteSwitchB);
        if (result == null) result = caseMBaseDevice(remoteSwitchB);
        if (result == null) result = caseSwitchSensor(remoteSwitchB);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.REMOTE_SWITCH_C: {
        RemoteSwitchC remoteSwitchC = (RemoteSwitchC)theEObject;
        T result = caseRemoteSwitchC(remoteSwitchC);
        if (result == null) result = caseRemoteSwitch(remoteSwitchC);
        if (result == null) result = caseMTFConfigConsumer(remoteSwitchC);
        if (result == null) result = caseMInSwitchActor(remoteSwitchC);
        if (result == null) result = caseMSubDevice(remoteSwitchC);
        if (result == null) result = caseMSwitchActor(remoteSwitchC);
        if (result == null) result = caseMBaseDevice(remoteSwitchC);
        if (result == null) result = caseSwitchSensor(remoteSwitchC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_HUMIDITY: {
        MBrickletHumidity mBrickletHumidity = (MBrickletHumidity)theEObject;
        T result = caseMBrickletHumidity(mBrickletHumidity);
        if (result == null) result = caseMSensor(mBrickletHumidity);
        if (result == null) result = caseMDevice(mBrickletHumidity);
        if (result == null) result = caseMTFConfigConsumer(mBrickletHumidity);
        if (result == null) result = caseCallbackListener(mBrickletHumidity);
        if (result == null) result = caseMBaseDevice(mBrickletHumidity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_DISTANCE_IR: {
        MBrickletDistanceIR mBrickletDistanceIR = (MBrickletDistanceIR)theEObject;
        T result = caseMBrickletDistanceIR(mBrickletDistanceIR);
        if (result == null) result = caseMDevice(mBrickletDistanceIR);
        if (result == null) result = caseMSensor(mBrickletDistanceIR);
        if (result == null) result = caseMTFConfigConsumer(mBrickletDistanceIR);
        if (result == null) result = caseCallbackListener(mBrickletDistanceIR);
        if (result == null) result = caseMBaseDevice(mBrickletDistanceIR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_SOLID_STATE_RELAY: {
        MBrickletSolidStateRelay mBrickletSolidStateRelay = (MBrickletSolidStateRelay)theEObject;
        T result = caseMBrickletSolidStateRelay(mBrickletSolidStateRelay);
        if (result == null) result = caseMDevice(mBrickletSolidStateRelay);
        if (result == null) result = caseMSwitchActor(mBrickletSolidStateRelay);
        if (result == null) result = caseMBaseDevice(mBrickletSolidStateRelay);
        if (result == null) result = caseSwitchSensor(mBrickletSolidStateRelay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_INDUSTRIAL_DUAL020M_A: {
        MBrickletIndustrialDual020mA mBrickletIndustrialDual020mA = (MBrickletIndustrialDual020mA)theEObject;
        T result = caseMBrickletIndustrialDual020mA(mBrickletIndustrialDual020mA);
        if (result == null) result = caseMDevice(mBrickletIndustrialDual020mA);
        if (result == null) result = caseMSubDeviceHolder(mBrickletIndustrialDual020mA);
        if (result == null) result = caseMTFConfigConsumer(mBrickletIndustrialDual020mA);
        if (result == null) result = caseMBaseDevice(mBrickletIndustrialDual020mA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DUAL020M_ADEVICE: {
        Dual020mADevice dual020mADevice = (Dual020mADevice)theEObject;
        T result = caseDual020mADevice(dual020mADevice);
        if (result == null) result = caseMSubDevice(dual020mADevice);
        if (result == null) result = caseMSensor(dual020mADevice);
        if (result == null) result = caseCallbackListener(dual020mADevice);
        if (result == null) result = caseMTFConfigConsumer(dual020mADevice);
        if (result == null) result = caseMBaseDevice(dual020mADevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_PTC: {
        MBrickletPTC mBrickletPTC = (MBrickletPTC)theEObject;
        T result = caseMBrickletPTC(mBrickletPTC);
        if (result == null) result = caseMDevice(mBrickletPTC);
        if (result == null) result = caseMTFConfigConsumer(mBrickletPTC);
        if (result == null) result = caseMSubDeviceHolder(mBrickletPTC);
        if (result == null) result = caseMBaseDevice(mBrickletPTC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PTC_DEVICE: {
        PTCDevice ptcDevice = (PTCDevice)theEObject;
        T result = casePTCDevice(ptcDevice);
        if (result == null) result = caseMSubDevice(ptcDevice);
        if (result == null) result = caseMBaseDevice(ptcDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PTC_TEMPERATURE: {
        PTCTemperature ptcTemperature = (PTCTemperature)theEObject;
        T result = casePTCTemperature(ptcTemperature);
        if (result == null) result = casePTCDevice(ptcTemperature);
        if (result == null) result = caseMSensor(ptcTemperature);
        if (result == null) result = caseMTFConfigConsumer(ptcTemperature);
        if (result == null) result = caseCallbackListener(ptcTemperature);
        if (result == null) result = caseMSubDevice(ptcTemperature);
        if (result == null) result = caseMBaseDevice(ptcTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PTC_RESISTANCE: {
        PTCResistance ptcResistance = (PTCResistance)theEObject;
        T result = casePTCResistance(ptcResistance);
        if (result == null) result = casePTCDevice(ptcResistance);
        if (result == null) result = caseMSensor(ptcResistance);
        if (result == null) result = caseMTFConfigConsumer(ptcResistance);
        if (result == null) result = caseCallbackListener(ptcResistance);
        if (result == null) result = caseMSubDevice(ptcResistance);
        if (result == null) result = caseMBaseDevice(ptcResistance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.PTC_CONNECTED: {
        PTCConnected ptcConnected = (PTCConnected)theEObject;
        T result = casePTCConnected(ptcConnected);
        if (result == null) result = casePTCDevice(ptcConnected);
        if (result == null) result = caseMSensor(ptcConnected);
        if (result == null) result = caseMSubDevice(ptcConnected);
        if (result == null) result = caseMBaseDevice(ptcConnected);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_TEMPERATURE: {
        MBrickletTemperature mBrickletTemperature = (MBrickletTemperature)theEObject;
        T result = caseMBrickletTemperature(mBrickletTemperature);
        if (result == null) result = caseMDevice(mBrickletTemperature);
        if (result == null) result = caseMSensor(mBrickletTemperature);
        if (result == null) result = caseMTFConfigConsumer(mBrickletTemperature);
        if (result == null) result = caseCallbackListener(mBrickletTemperature);
        if (result == null) result = caseMBaseDevice(mBrickletTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_THERMOCOUPLE: {
        MBrickletThermocouple mBrickletThermocouple = (MBrickletThermocouple)theEObject;
        T result = caseMBrickletThermocouple(mBrickletThermocouple);
        if (result == null) result = caseMDevice(mBrickletThermocouple);
        if (result == null) result = caseMSensor(mBrickletThermocouple);
        if (result == null) result = caseMTFConfigConsumer(mBrickletThermocouple);
        if (result == null) result = caseCallbackListener(mBrickletThermocouple);
        if (result == null) result = caseMBaseDevice(mBrickletThermocouple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_UV_LIGHT: {
        MBrickletUVLight mBrickletUVLight = (MBrickletUVLight)theEObject;
        T result = caseMBrickletUVLight(mBrickletUVLight);
        if (result == null) result = caseMDevice(mBrickletUVLight);
        if (result == null) result = caseMSensor(mBrickletUVLight);
        if (result == null) result = caseMTFConfigConsumer(mBrickletUVLight);
        if (result == null) result = caseCallbackListener(mBrickletUVLight);
        if (result == null) result = caseMBaseDevice(mBrickletUVLight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_CO2: {
        MBrickletCO2 mBrickletCO2 = (MBrickletCO2)theEObject;
        T result = caseMBrickletCO2(mBrickletCO2);
        if (result == null) result = caseMDevice(mBrickletCO2);
        if (result == null) result = caseMSensor(mBrickletCO2);
        if (result == null) result = caseMTFConfigConsumer(mBrickletCO2);
        if (result == null) result = caseCallbackListener(mBrickletCO2);
        if (result == null) result = caseMBaseDevice(mBrickletCO2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_TEMPERATURE_IR: {
        MBrickletTemperatureIR mBrickletTemperatureIR = (MBrickletTemperatureIR)theEObject;
        T result = caseMBrickletTemperatureIR(mBrickletTemperatureIR);
        if (result == null) result = caseMDevice(mBrickletTemperatureIR);
        if (result == null) result = caseMSubDeviceHolder(mBrickletTemperatureIR);
        if (result == null) result = caseMBaseDevice(mBrickletTemperatureIR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MTEMPERATURE_IR_DEVICE: {
        MTemperatureIRDevice mTemperatureIRDevice = (MTemperatureIRDevice)theEObject;
        T result = caseMTemperatureIRDevice(mTemperatureIRDevice);
        if (result == null) result = caseMSensor(mTemperatureIRDevice);
        if (result == null) result = caseMSubDevice(mTemperatureIRDevice);
        if (result == null) result = caseCallbackListener(mTemperatureIRDevice);
        if (result == null) result = caseMBaseDevice(mTemperatureIRDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.OBJECT_TEMPERATURE: {
        ObjectTemperature objectTemperature = (ObjectTemperature)theEObject;
        T result = caseObjectTemperature(objectTemperature);
        if (result == null) result = caseMTemperatureIRDevice(objectTemperature);
        if (result == null) result = caseMTFConfigConsumer(objectTemperature);
        if (result == null) result = caseMSensor(objectTemperature);
        if (result == null) result = caseMSubDevice(objectTemperature);
        if (result == null) result = caseCallbackListener(objectTemperature);
        if (result == null) result = caseMBaseDevice(objectTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.AMBIENT_TEMPERATURE: {
        AmbientTemperature ambientTemperature = (AmbientTemperature)theEObject;
        T result = caseAmbientTemperature(ambientTemperature);
        if (result == null) result = caseMTemperatureIRDevice(ambientTemperature);
        if (result == null) result = caseMTFConfigConsumer(ambientTemperature);
        if (result == null) result = caseMSensor(ambientTemperature);
        if (result == null) result = caseMSubDevice(ambientTemperature);
        if (result == null) result = caseCallbackListener(ambientTemperature);
        if (result == null) result = caseMBaseDevice(ambientTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_TILT: {
        MBrickletTilt mBrickletTilt = (MBrickletTilt)theEObject;
        T result = caseMBrickletTilt(mBrickletTilt);
        if (result == null) result = caseMDevice(mBrickletTilt);
        if (result == null) result = caseMSensor(mBrickletTilt);
        if (result == null) result = caseMBaseDevice(mBrickletTilt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_VOLTAGE_CURRENT: {
        MBrickletVoltageCurrent mBrickletVoltageCurrent = (MBrickletVoltageCurrent)theEObject;
        T result = caseMBrickletVoltageCurrent(mBrickletVoltageCurrent);
        if (result == null) result = caseMDevice(mBrickletVoltageCurrent);
        if (result == null) result = caseMSubDeviceHolder(mBrickletVoltageCurrent);
        if (result == null) result = caseMTFConfigConsumer(mBrickletVoltageCurrent);
        if (result == null) result = caseMBaseDevice(mBrickletVoltageCurrent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.VOLTAGE_CURRENT_DEVICE: {
        VoltageCurrentDevice voltageCurrentDevice = (VoltageCurrentDevice)theEObject;
        T result = caseVoltageCurrentDevice(voltageCurrentDevice);
        if (result == null) result = caseMSensor(voltageCurrentDevice);
        if (result == null) result = caseMSubDevice(voltageCurrentDevice);
        if (result == null) result = caseCallbackListener(voltageCurrentDevice);
        if (result == null) result = caseMTFConfigConsumer(voltageCurrentDevice);
        if (result == null) result = caseMBaseDevice(voltageCurrentDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.VC_DEVICE_VOLTAGE: {
        VCDeviceVoltage vcDeviceVoltage = (VCDeviceVoltage)theEObject;
        T result = caseVCDeviceVoltage(vcDeviceVoltage);
        if (result == null) result = caseVoltageCurrentDevice(vcDeviceVoltage);
        if (result == null) result = caseMSensor(vcDeviceVoltage);
        if (result == null) result = caseMSubDevice(vcDeviceVoltage);
        if (result == null) result = caseCallbackListener(vcDeviceVoltage);
        if (result == null) result = caseMTFConfigConsumer(vcDeviceVoltage);
        if (result == null) result = caseMBaseDevice(vcDeviceVoltage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.VC_DEVICE_CURRENT: {
        VCDeviceCurrent vcDeviceCurrent = (VCDeviceCurrent)theEObject;
        T result = caseVCDeviceCurrent(vcDeviceCurrent);
        if (result == null) result = caseVoltageCurrentDevice(vcDeviceCurrent);
        if (result == null) result = caseMSensor(vcDeviceCurrent);
        if (result == null) result = caseMSubDevice(vcDeviceCurrent);
        if (result == null) result = caseCallbackListener(vcDeviceCurrent);
        if (result == null) result = caseMTFConfigConsumer(vcDeviceCurrent);
        if (result == null) result = caseMBaseDevice(vcDeviceCurrent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.VC_DEVICE_POWER: {
        VCDevicePower vcDevicePower = (VCDevicePower)theEObject;
        T result = caseVCDevicePower(vcDevicePower);
        if (result == null) result = caseVoltageCurrentDevice(vcDevicePower);
        if (result == null) result = caseMSensor(vcDevicePower);
        if (result == null) result = caseMSubDevice(vcDevicePower);
        if (result == null) result = caseCallbackListener(vcDevicePower);
        if (result == null) result = caseMTFConfigConsumer(vcDevicePower);
        if (result == null) result = caseMBaseDevice(vcDevicePower);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_HUMIDITY_V2: {
        MBrickletHumidityV2 mBrickletHumidityV2 = (MBrickletHumidityV2)theEObject;
        T result = caseMBrickletHumidityV2(mBrickletHumidityV2);
        if (result == null) result = caseMDevice(mBrickletHumidityV2);
        if (result == null) result = caseMSubDeviceHolder(mBrickletHumidityV2);
        if (result == null) result = caseMTFConfigConsumer(mBrickletHumidityV2);
        if (result == null) result = caseMBaseDevice(mBrickletHumidityV2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MHUMIDITY_V2_DEVICE: {
        MHumidityV2Device mHumidityV2Device = (MHumidityV2Device)theEObject;
        T result = caseMHumidityV2Device(mHumidityV2Device);
        if (result == null) result = caseMSubDevice(mHumidityV2Device);
        if (result == null) result = caseMSensor(mHumidityV2Device);
        if (result == null) result = caseMTFConfigConsumer(mHumidityV2Device);
        if (result == null) result = caseCallbackListener(mHumidityV2Device);
        if (result == null) result = caseMBaseDevice(mHumidityV2Device);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MHUMIDITY_V2_TEMPERATURE: {
        MHumidityV2Temperature mHumidityV2Temperature = (MHumidityV2Temperature)theEObject;
        T result = caseMHumidityV2Temperature(mHumidityV2Temperature);
        if (result == null) result = caseMHumidityV2Device(mHumidityV2Temperature);
        if (result == null) result = caseMSubDevice(mHumidityV2Temperature);
        if (result == null) result = caseMSensor(mHumidityV2Temperature);
        if (result == null) result = caseMTFConfigConsumer(mHumidityV2Temperature);
        if (result == null) result = caseCallbackListener(mHumidityV2Temperature);
        if (result == null) result = caseMBaseDevice(mHumidityV2Temperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MHUMIDITY_V2_HUMIDITY: {
        MHumidityV2Humidity mHumidityV2Humidity = (MHumidityV2Humidity)theEObject;
        T result = caseMHumidityV2Humidity(mHumidityV2Humidity);
        if (result == null) result = caseMHumidityV2Device(mHumidityV2Humidity);
        if (result == null) result = caseMSubDevice(mHumidityV2Humidity);
        if (result == null) result = caseMSensor(mHumidityV2Humidity);
        if (result == null) result = caseMTFConfigConsumer(mHumidityV2Humidity);
        if (result == null) result = caseCallbackListener(mHumidityV2Humidity);
        if (result == null) result = caseMBaseDevice(mHumidityV2Humidity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_BAROMETER: {
        MBrickletBarometer mBrickletBarometer = (MBrickletBarometer)theEObject;
        T result = caseMBrickletBarometer(mBrickletBarometer);
        if (result == null) result = caseMDevice(mBrickletBarometer);
        if (result == null) result = caseMSensor(mBrickletBarometer);
        if (result == null) result = caseMTFConfigConsumer(mBrickletBarometer);
        if (result == null) result = caseMSubDeviceHolder(mBrickletBarometer);
        if (result == null) result = caseCallbackListener(mBrickletBarometer);
        if (result == null) result = caseMBaseDevice(mBrickletBarometer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBAROMETER_TEMPERATURE: {
        MBarometerTemperature mBarometerTemperature = (MBarometerTemperature)theEObject;
        T result = caseMBarometerTemperature(mBarometerTemperature);
        if (result == null) result = caseMSensor(mBarometerTemperature);
        if (result == null) result = caseMSubDevice(mBarometerTemperature);
        if (result == null) result = caseMBaseDevice(mBarometerTemperature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_AMBIENT_LIGHT: {
        MBrickletAmbientLight mBrickletAmbientLight = (MBrickletAmbientLight)theEObject;
        T result = caseMBrickletAmbientLight(mBrickletAmbientLight);
        if (result == null) result = caseMDevice(mBrickletAmbientLight);
        if (result == null) result = caseMSensor(mBrickletAmbientLight);
        if (result == null) result = caseMTFConfigConsumer(mBrickletAmbientLight);
        if (result == null) result = caseCallbackListener(mBrickletAmbientLight);
        if (result == null) result = caseMBaseDevice(mBrickletAmbientLight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_AMBIENT_LIGHT_V2: {
        MBrickletAmbientLightV2 mBrickletAmbientLightV2 = (MBrickletAmbientLightV2)theEObject;
        T result = caseMBrickletAmbientLightV2(mBrickletAmbientLightV2);
        if (result == null) result = caseMDevice(mBrickletAmbientLightV2);
        if (result == null) result = caseMSensor(mBrickletAmbientLightV2);
        if (result == null) result = caseMTFConfigConsumer(mBrickletAmbientLightV2);
        if (result == null) result = caseCallbackListener(mBrickletAmbientLightV2);
        if (result == null) result = caseMBaseDevice(mBrickletAmbientLightV2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_INDUSTRIAL_DUAL_ANALOG_IN: {
        MBrickletIndustrialDualAnalogIn mBrickletIndustrialDualAnalogIn = (MBrickletIndustrialDualAnalogIn)theEObject;
        T result = caseMBrickletIndustrialDualAnalogIn(mBrickletIndustrialDualAnalogIn);
        if (result == null) result = caseMDevice(mBrickletIndustrialDualAnalogIn);
        if (result == null) result = caseMTFConfigConsumer(mBrickletIndustrialDualAnalogIn);
        if (result == null) result = caseMSubDeviceHolder(mBrickletIndustrialDualAnalogIn);
        if (result == null) result = caseMBaseDevice(mBrickletIndustrialDualAnalogIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.INDUSTRIAL_DUAL_ANALOG_IN_CHANNEL: {
        IndustrialDualAnalogInChannel industrialDualAnalogInChannel = (IndustrialDualAnalogInChannel)theEObject;
        T result = caseIndustrialDualAnalogInChannel(industrialDualAnalogInChannel);
        if (result == null) result = caseMSensor(industrialDualAnalogInChannel);
        if (result == null) result = caseMSubDevice(industrialDualAnalogInChannel);
        if (result == null) result = caseMTFConfigConsumer(industrialDualAnalogInChannel);
        if (result == null) result = caseCallbackListener(industrialDualAnalogInChannel);
        if (result == null) result = caseMBaseDevice(industrialDualAnalogInChannel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_SOUND_INTENSITY: {
        MBrickletSoundIntensity mBrickletSoundIntensity = (MBrickletSoundIntensity)theEObject;
        T result = caseMBrickletSoundIntensity(mBrickletSoundIntensity);
        if (result == null) result = caseMDevice(mBrickletSoundIntensity);
        if (result == null) result = caseMSensor(mBrickletSoundIntensity);
        if (result == null) result = caseMTFConfigConsumer(mBrickletSoundIntensity);
        if (result == null) result = caseCallbackListener(mBrickletSoundIntensity);
        if (result == null) result = caseMBaseDevice(mBrickletSoundIntensity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_DUST_DETECTOR: {
        MBrickletDustDetector mBrickletDustDetector = (MBrickletDustDetector)theEObject;
        T result = caseMBrickletDustDetector(mBrickletDustDetector);
        if (result == null) result = caseMDevice(mBrickletDustDetector);
        if (result == null) result = caseMSensor(mBrickletDustDetector);
        if (result == null) result = caseMTFConfigConsumer(mBrickletDustDetector);
        if (result == null) result = caseCallbackListener(mBrickletDustDetector);
        if (result == null) result = caseMBaseDevice(mBrickletDustDetector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_MOISTURE: {
        MBrickletMoisture mBrickletMoisture = (MBrickletMoisture)theEObject;
        T result = caseMBrickletMoisture(mBrickletMoisture);
        if (result == null) result = caseMDevice(mBrickletMoisture);
        if (result == null) result = caseMSensor(mBrickletMoisture);
        if (result == null) result = caseMTFConfigConsumer(mBrickletMoisture);
        if (result == null) result = caseCallbackListener(mBrickletMoisture);
        if (result == null) result = caseMBaseDevice(mBrickletMoisture);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_ANALOG_IN_V2: {
        MBrickletAnalogInV2 mBrickletAnalogInV2 = (MBrickletAnalogInV2)theEObject;
        T result = caseMBrickletAnalogInV2(mBrickletAnalogInV2);
        if (result == null) result = caseMDevice(mBrickletAnalogInV2);
        if (result == null) result = caseMSensor(mBrickletAnalogInV2);
        if (result == null) result = caseMTFConfigConsumer(mBrickletAnalogInV2);
        if (result == null) result = caseCallbackListener(mBrickletAnalogInV2);
        if (result == null) result = caseMBaseDevice(mBrickletAnalogInV2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_ANALOG_IN: {
        MBrickletAnalogIn mBrickletAnalogIn = (MBrickletAnalogIn)theEObject;
        T result = caseMBrickletAnalogIn(mBrickletAnalogIn);
        if (result == null) result = caseMDevice(mBrickletAnalogIn);
        if (result == null) result = caseMSensor(mBrickletAnalogIn);
        if (result == null) result = caseMTFConfigConsumer(mBrickletAnalogIn);
        if (result == null) result = caseCallbackListener(mBrickletAnalogIn);
        if (result == null) result = caseMBaseDevice(mBrickletAnalogIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_DISTANCE_US: {
        MBrickletDistanceUS mBrickletDistanceUS = (MBrickletDistanceUS)theEObject;
        T result = caseMBrickletDistanceUS(mBrickletDistanceUS);
        if (result == null) result = caseMDevice(mBrickletDistanceUS);
        if (result == null) result = caseMSensor(mBrickletDistanceUS);
        if (result == null) result = caseMTFConfigConsumer(mBrickletDistanceUS);
        if (result == null) result = caseCallbackListener(mBrickletDistanceUS);
        if (result == null) result = caseMBaseDevice(mBrickletDistanceUS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_LCD2_0X4: {
        MBrickletLCD20x4 mBrickletLCD20x4 = (MBrickletLCD20x4)theEObject;
        T result = caseMBrickletLCD20x4(mBrickletLCD20x4);
        if (result == null) result = caseMDevice(mBrickletLCD20x4);
        if (result == null) result = caseMTextActor(mBrickletLCD20x4);
        if (result == null) result = caseMSubDeviceHolder(mBrickletLCD20x4);
        if (result == null) result = caseMBaseDevice(mBrickletLCD20x4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.OLED_BRICKLET: {
        OLEDBricklet oledBricklet = (OLEDBricklet)theEObject;
        T result = caseOLEDBricklet(oledBricklet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_OLED12_8X64: {
        MBrickletOLED128x64 mBrickletOLED128x64 = (MBrickletOLED128x64)theEObject;
        T result = caseMBrickletOLED128x64(mBrickletOLED128x64);
        if (result == null) result = caseOLEDBricklet(mBrickletOLED128x64);
        if (result == null) result = caseMDevice(mBrickletOLED128x64);
        if (result == null) result = caseMTextActor(mBrickletOLED128x64);
        if (result == null) result = caseMTFConfigConsumer(mBrickletOLED128x64);
        if (result == null) result = caseMBaseDevice(mBrickletOLED128x64);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MBRICKLET_OLE6_4X48: {
        MBrickletOLE64x48 mBrickletOLE64x48 = (MBrickletOLE64x48)theEObject;
        T result = caseMBrickletOLE64x48(mBrickletOLE64x48);
        if (result == null) result = caseOLEDBricklet(mBrickletOLE64x48);
        if (result == null) result = caseMDevice(mBrickletOLE64x48);
        if (result == null) result = caseMTextActor(mBrickletOLE64x48);
        if (result == null) result = caseMTFConfigConsumer(mBrickletOLE64x48);
        if (result == null) result = caseMBaseDevice(mBrickletOLE64x48);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MLCD2_0X4_BACKLIGHT: {
        MLCD20x4Backlight mlcd20x4Backlight = (MLCD20x4Backlight)theEObject;
        T result = caseMLCD20x4Backlight(mlcd20x4Backlight);
        if (result == null) result = caseMInSwitchActor(mlcd20x4Backlight);
        if (result == null) result = caseMLCDSubDevice(mlcd20x4Backlight);
        if (result == null) result = caseMSwitchActor(mlcd20x4Backlight);
        if (result == null) result = caseMSubDevice(mlcd20x4Backlight);
        if (result == null) result = caseSwitchSensor(mlcd20x4Backlight);
        if (result == null) result = caseMBaseDevice(mlcd20x4Backlight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MLCD2_0X4_BUTTON: {
        MLCD20x4Button mlcd20x4Button = (MLCD20x4Button)theEObject;
        T result = caseMLCD20x4Button(mlcd20x4Button);
        if (result == null) result = caseMSensor(mlcd20x4Button);
        if (result == null) result = caseMLCDSubDevice(mlcd20x4Button);
        if (result == null) result = caseMTFConfigConsumer(mlcd20x4Button);
        if (result == null) result = caseMSubDevice(mlcd20x4Button);
        if (result == null) result = caseMBaseDevice(mlcd20x4Button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_CONFIG: {
        TFConfig tfConfig = (TFConfig)theEObject;
        T result = caseTFConfig(tfConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.OHTF_DEVICE: {
        OHTFDevice<?, ?> ohtfDevice = (OHTFDevice<?, ?>)theEObject;
        T result = caseOHTFDevice(ohtfDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.OHTF_SUB_DEVICE_ADMIN_DEVICE: {
        OHTFSubDeviceAdminDevice<?, ?> ohtfSubDeviceAdminDevice = (OHTFSubDeviceAdminDevice<?, ?>)theEObject;
        T result = caseOHTFSubDeviceAdminDevice(ohtfSubDeviceAdminDevice);
        if (result == null) result = caseOHTFDevice(ohtfSubDeviceAdminDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.OH_CONFIG: {
        OHConfig ohConfig = (OHConfig)theEObject;
        T result = caseOHConfig(ohConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_NULL_CONFIGURATION: {
        TFNullConfiguration tfNullConfiguration = (TFNullConfiguration)theEObject;
        T result = caseTFNullConfiguration(tfNullConfiguration);
        if (result == null) result = caseTFConfig(tfNullConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TFPTC_BRICKLET_CONFIGURATION: {
        TFPTCBrickletConfiguration tfptcBrickletConfiguration = (TFPTCBrickletConfiguration)theEObject;
        T result = caseTFPTCBrickletConfiguration(tfptcBrickletConfiguration);
        if (result == null) result = caseTFConfig(tfptcBrickletConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_INDUSTRIAL_DUAL020M_ACONFIGURATION: {
        TFIndustrialDual020mAConfiguration tfIndustrialDual020mAConfiguration = (TFIndustrialDual020mAConfiguration)theEObject;
        T result = caseTFIndustrialDual020mAConfiguration(tfIndustrialDual020mAConfiguration);
        if (result == null) result = caseTFConfig(tfIndustrialDual020mAConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_BASE_CONFIGURATION: {
        TFBaseConfiguration tfBaseConfiguration = (TFBaseConfiguration)theEObject;
        T result = caseTFBaseConfiguration(tfBaseConfiguration);
        if (result == null) result = caseTFConfig(tfBaseConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LOAD_CELL_CONFIGURATION: {
        LoadCellConfiguration loadCellConfiguration = (LoadCellConfiguration)theEObject;
        T result = caseLoadCellConfiguration(loadCellConfiguration);
        if (result == null) result = caseTFBaseConfiguration(loadCellConfiguration);
        if (result == null) result = caseTFConfig(loadCellConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LASER_RANGE_FINDER_CONFIGURATION: {
        LaserRangeFinderConfiguration laserRangeFinderConfiguration = (LaserRangeFinderConfiguration)theEObject;
        T result = caseLaserRangeFinderConfiguration(laserRangeFinderConfiguration);
        if (result == null) result = caseTFConfig(laserRangeFinderConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.HUMIDITY_V2_CONFIGURATION: {
        HumidityV2Configuration humidityV2Configuration = (HumidityV2Configuration)theEObject;
        T result = caseHumidityV2Configuration(humidityV2Configuration);
        if (result == null) result = caseTFConfig(humidityV2Configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.AMBIENT_LIGHT_V2_CONFIGURATION: {
        AmbientLightV2Configuration ambientLightV2Configuration = (AmbientLightV2Configuration)theEObject;
        T result = caseAmbientLightV2Configuration(ambientLightV2Configuration);
        if (result == null) result = caseTFBaseConfiguration(ambientLightV2Configuration);
        if (result == null) result = caseTFConfig(ambientLightV2Configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BRICKLET_INDUSTRIAL_DUAL_ANALOG_IN_CONFIGURATION: {
        BrickletIndustrialDualAnalogInConfiguration brickletIndustrialDualAnalogInConfiguration = (BrickletIndustrialDualAnalogInConfiguration)theEObject;
        T result = caseBrickletIndustrialDualAnalogInConfiguration(brickletIndustrialDualAnalogInConfiguration);
        if (result == null) result = caseTFBaseConfiguration(brickletIndustrialDualAnalogInConfiguration);
        if (result == null) result = caseTFConfig(brickletIndustrialDualAnalogInConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_TEMPERATURE_CONFIGURATION: {
        TFTemperatureConfiguration tfTemperatureConfiguration = (TFTemperatureConfiguration)theEObject;
        T result = caseTFTemperatureConfiguration(tfTemperatureConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfTemperatureConfiguration);
        if (result == null) result = caseTFConfig(tfTemperatureConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION: {
        TFThermocoupleConfiguration tfThermocoupleConfiguration = (TFThermocoupleConfiguration)theEObject;
        T result = caseTFThermocoupleConfiguration(tfThermocoupleConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfThermocoupleConfiguration);
        if (result == null) result = caseTFConfig(tfThermocoupleConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_OBJECT_TEMPERATURE_CONFIGURATION: {
        TFObjectTemperatureConfiguration tfObjectTemperatureConfiguration = (TFObjectTemperatureConfiguration)theEObject;
        T result = caseTFObjectTemperatureConfiguration(tfObjectTemperatureConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfObjectTemperatureConfiguration);
        if (result == null) result = caseTFConfig(tfObjectTemperatureConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_MOISTURE_BRICKLET_CONFIGURATION: {
        TFMoistureBrickletConfiguration tfMoistureBrickletConfiguration = (TFMoistureBrickletConfiguration)theEObject;
        T result = caseTFMoistureBrickletConfiguration(tfMoistureBrickletConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfMoistureBrickletConfiguration);
        if (result == null) result = caseTFConfig(tfMoistureBrickletConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_ANALOG_IN_CONFIGURATION: {
        TFAnalogInConfiguration tfAnalogInConfiguration = (TFAnalogInConfiguration)theEObject;
        T result = caseTFAnalogInConfiguration(tfAnalogInConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfAnalogInConfiguration);
        if (result == null) result = caseTFConfig(tfAnalogInConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_ANALOG_IN_V2_CONFIGURATION: {
        TFAnalogInV2Configuration tfAnalogInV2Configuration = (TFAnalogInV2Configuration)theEObject;
        T result = caseTFAnalogInV2Configuration(tfAnalogInV2Configuration);
        if (result == null) result = caseTFBaseConfiguration(tfAnalogInV2Configuration);
        if (result == null) result = caseTFConfig(tfAnalogInV2Configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_DISTANCE_US_BRICKLET_CONFIGURATION: {
        TFDistanceUSBrickletConfiguration tfDistanceUSBrickletConfiguration = (TFDistanceUSBrickletConfiguration)theEObject;
        T result = caseTFDistanceUSBrickletConfiguration(tfDistanceUSBrickletConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfDistanceUSBrickletConfiguration);
        if (result == null) result = caseTFConfig(tfDistanceUSBrickletConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_VOLTAGE_CURRENT_CONFIGURATION: {
        TFVoltageCurrentConfiguration tfVoltageCurrentConfiguration = (TFVoltageCurrentConfiguration)theEObject;
        T result = caseTFVoltageCurrentConfiguration(tfVoltageCurrentConfiguration);
        if (result == null) result = caseTFConfig(tfVoltageCurrentConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_BRICK_DC_CONFIGURATION: {
        TFBrickDCConfiguration tfBrickDCConfiguration = (TFBrickDCConfiguration)theEObject;
        T result = caseTFBrickDCConfiguration(tfBrickDCConfiguration);
        if (result == null) result = caseDimmableConfiguration(tfBrickDCConfiguration);
        if (result == null) result = caseTFBaseConfiguration(tfBrickDCConfiguration);
        if (result == null) result = caseTFConfig(tfBrickDCConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TFIO_ACTOR_CONFIGURATION: {
        TFIOActorConfiguration tfioActorConfiguration = (TFIOActorConfiguration)theEObject;
        T result = caseTFIOActorConfiguration(tfioActorConfiguration);
        if (result == null) result = caseTFConfig(tfioActorConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_INTERRUPT_LISTENER_CONFIGURATION: {
        TFInterruptListenerConfiguration tfInterruptListenerConfiguration = (TFInterruptListenerConfiguration)theEObject;
        T result = caseTFInterruptListenerConfiguration(tfInterruptListenerConfiguration);
        if (result == null) result = caseTFConfig(tfInterruptListenerConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TFIO_SENSOR_CONFIGURATION: {
        TFIOSensorConfiguration tfioSensorConfiguration = (TFIOSensorConfiguration)theEObject;
        T result = caseTFIOSensorConfiguration(tfioSensorConfiguration);
        if (result == null) result = caseTFConfig(tfioSensorConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.TF_SERVO_CONFIGURATION: {
        TFServoConfiguration tfServoConfiguration = (TFServoConfiguration)theEObject;
        T result = caseTFServoConfiguration(tfServoConfiguration);
        if (result == null) result = caseDimmableConfiguration(tfServoConfiguration);
        if (result == null) result = caseTFConfig(tfServoConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BRICKLET_REMOTE_SWITCH_CONFIGURATION: {
        BrickletRemoteSwitchConfiguration brickletRemoteSwitchConfiguration = (BrickletRemoteSwitchConfiguration)theEObject;
        T result = caseBrickletRemoteSwitchConfiguration(brickletRemoteSwitchConfiguration);
        if (result == null) result = caseTFConfig(brickletRemoteSwitchConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.REMOTE_SWITCH_ACONFIGURATION: {
        RemoteSwitchAConfiguration remoteSwitchAConfiguration = (RemoteSwitchAConfiguration)theEObject;
        T result = caseRemoteSwitchAConfiguration(remoteSwitchAConfiguration);
        if (result == null) result = caseTFConfig(remoteSwitchAConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.REMOTE_SWITCH_BCONFIGURATION: {
        RemoteSwitchBConfiguration remoteSwitchBConfiguration = (RemoteSwitchBConfiguration)theEObject;
        T result = caseRemoteSwitchBConfiguration(remoteSwitchBConfiguration);
        if (result == null) result = caseDimmableConfiguration(remoteSwitchBConfiguration);
        if (result == null) result = caseTFConfig(remoteSwitchBConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.REMOTE_SWITCH_CCONFIGURATION: {
        RemoteSwitchCConfiguration remoteSwitchCConfiguration = (RemoteSwitchCConfiguration)theEObject;
        T result = caseRemoteSwitchCConfiguration(remoteSwitchCConfiguration);
        if (result == null) result = caseTFConfig(remoteSwitchCConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.MULTI_TOUCH_DEVICE_CONFIGURATION: {
        MultiTouchDeviceConfiguration multiTouchDeviceConfiguration = (MultiTouchDeviceConfiguration)theEObject;
        T result = caseMultiTouchDeviceConfiguration(multiTouchDeviceConfiguration);
        if (result == null) result = caseTFConfig(multiTouchDeviceConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BRICKLET_MULTI_TOUCH_CONFIGURATION: {
        BrickletMultiTouchConfiguration brickletMultiTouchConfiguration = (BrickletMultiTouchConfiguration)theEObject;
        T result = caseBrickletMultiTouchConfiguration(brickletMultiTouchConfiguration);
        if (result == null) result = caseTFConfig(brickletMultiTouchConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DIMMABLE_CONFIGURATION: {
        DimmableConfiguration dimmableConfiguration = (DimmableConfiguration)theEObject;
        T result = caseDimmableConfiguration(dimmableConfiguration);
        if (result == null) result = caseTFConfig(dimmableConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BUTTON_CONFIGURATION: {
        ButtonConfiguration buttonConfiguration = (ButtonConfiguration)theEObject;
        T result = caseButtonConfiguration(buttonConfiguration);
        if (result == null) result = caseTFConfig(buttonConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.DUAL_BUTTON_LED_CONFIGURATION: {
        DualButtonLEDConfiguration dualButtonLEDConfiguration = (DualButtonLEDConfiguration)theEObject;
        T result = caseDualButtonLEDConfiguration(dualButtonLEDConfiguration);
        if (result == null) result = caseTFConfig(dualButtonLEDConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LED_STRIP_CONFIGURATION: {
        LEDStripConfiguration ledStripConfiguration = (LEDStripConfiguration)theEObject;
        T result = caseLEDStripConfiguration(ledStripConfiguration);
        if (result == null) result = caseTFConfig(ledStripConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.LED_GROUP_CONFIGURATION: {
        LEDGroupConfiguration ledGroupConfiguration = (LEDGroupConfiguration)theEObject;
        T result = caseLEDGroupConfiguration(ledGroupConfiguration);
        if (result == null) result = caseTFConfig(ledGroupConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BRICKLET_COLOR_CONFIGURATION: {
        BrickletColorConfiguration brickletColorConfiguration = (BrickletColorConfiguration)theEObject;
        T result = caseBrickletColorConfiguration(brickletColorConfiguration);
        if (result == null) result = caseTFConfig(brickletColorConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BRICKLET_ACCELEROMETER_CONFIGURATION: {
        BrickletAccelerometerConfiguration brickletAccelerometerConfiguration = (BrickletAccelerometerConfiguration)theEObject;
        T result = caseBrickletAccelerometerConfiguration(brickletAccelerometerConfiguration);
        if (result == null) result = caseTFConfig(brickletAccelerometerConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelPackage.BRICKLET_OLED_CONFIGURATION: {
        BrickletOLEDConfiguration brickletOLEDConfiguration = (BrickletOLEDConfiguration)theEObject;
        T result = caseBrickletOLEDConfiguration(brickletOLEDConfiguration);
        if (result == null) result = caseTFConfig(brickletOLEDConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ecosystem</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ecosystem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEcosystem(Ecosystem object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBrickd</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBrickd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickd(MBrickd object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sub Device Admin</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Device Admin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSubDeviceAdmin(SubDeviceAdmin object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MTF Config Consumer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MTF Config Consumer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <TFC> T caseMTFConfigConsumer(MTFConfigConsumer<TFC> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBase Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBase Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBaseDevice(MBaseDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MDevice</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MDevice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <TF extends Device> T caseMDevice(MDevice<TF> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MSub Device Holder</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MSub Device Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <S extends MSubDevice<?>> T caseMSubDeviceHolder(MSubDeviceHolder<S> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MActor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MActor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMActor(MActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Switch Sensor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSwitchSensor(SwitchSensor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MSwitch Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MSwitch Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMSwitchActor(MSwitchActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Programmable Switch Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Programmable Switch Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProgrammableSwitchActor(ProgrammableSwitchActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MIn Switch Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MIn Switch Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMInSwitchActor(MInSwitchActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Generic Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGenericDevice(GenericDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>IO Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IO Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseIODevice(IODevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MSub Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MSub Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <B extends MSubDeviceHolder<?>> T caseMSubDevice(MSubDevice<B> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Callback Listener</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCallbackListener(CallbackListener object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Interrupt Listener</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interrupt Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInterruptListener(InterruptListener object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MSensor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MSensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <DeviceValue extends TinkerforgeValue> T caseMSensor(MSensor<DeviceValue> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Programmable Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Programmable Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProgrammableActor(ProgrammableActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MText Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MText Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMTextActor(MTextActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MLCD Sub Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MLCD Sub Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMLCDSubDevice(MLCDSubDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Digital Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDigitalActor(DigitalActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Number Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNumberActor(NumberActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorActor(ColorActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Programmable Color Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Programmable Color Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProgrammableColorActor(ProgrammableColorActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Simple Color Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Color Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSimpleColorActor(SimpleColorActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Move Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMoveActor(MoveActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dimmable Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimmable Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <TC extends DimmableConfiguration> T caseDimmableActor(DimmableActor<TC> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Percent Type Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Percent Type Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePercentTypeActor(PercentTypeActor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Set Point Actor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Point Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <C extends DimmableConfiguration> T caseSetPointActor(SetPointActor<C> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Dual Button</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Dual Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletDualButton(MBrickletDualButton object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dual Button Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dual Button Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDualButtonDevice(DualButtonDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Piezo Speaker</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Piezo Speaker</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletPiezoSpeaker(MBrickletPiezoSpeaker object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dual Button Button</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dual Button Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDualButtonButton(DualButtonButton object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Accelerometer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Accelerometer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletAccelerometer(MBrickletAccelerometer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Accelerometer Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accelerometer Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAccelerometerDevice(AccelerometerDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Accelerometer Direction</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accelerometer Direction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAccelerometerDirection(AccelerometerDirection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Accelerometer Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accelerometer Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAccelerometerTemperature(AccelerometerTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Accelerometer Led</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accelerometer Led</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAccelerometerLed(AccelerometerLed object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Laser Range Finder</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Laser Range Finder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletLaserRangeFinder(MBrickletLaserRangeFinder object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Laser Range Finder Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laser Range Finder Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaserRangeFinderDevice(LaserRangeFinderDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Laser Range Finder Laser</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laser Range Finder Laser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaserRangeFinderLaser(LaserRangeFinderLaser object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Laser Range Finder Distance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laser Range Finder Distance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaserRangeFinderDistance(LaserRangeFinderDistance object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Laser Range Finder Velocity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laser Range Finder Velocity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaserRangeFinderVelocity(LaserRangeFinderVelocity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Load Cell</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Load Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletLoadCell(MBrickletLoadCell object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Load Cell Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Cell Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLoadCellDevice(LoadCellDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Load Cell Weight</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Cell Weight</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLoadCellWeight(LoadCellWeight object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Load Cell Led</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Cell Led</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLoadCellLed(LoadCellLed object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Color</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletColor(MBrickletColor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bricklet Color Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bricklet Color Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBrickletColorDevice(BrickletColorDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Color</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorColor(ColorColor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Illuminance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Illuminance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorIlluminance(ColorIlluminance object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Color Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Color Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorColorTemperature(ColorColorTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Color Led</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Led</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorLed(ColorLed object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dual Button Led</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dual Button Led</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDualButtonLed(DualButtonLed object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Linear Poti</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Linear Poti</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletLinearPoti(MBrickletLinearPoti object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Rotary Encoder</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Rotary Encoder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletRotaryEncoder(MBrickletRotaryEncoder object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rotary Encoder Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotary Encoder Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRotaryEncoderDevice(RotaryEncoderDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rotary Encoder</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotary Encoder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRotaryEncoder(RotaryEncoder object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Rotary Encoder Button</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotary Encoder Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRotaryEncoderButton(RotaryEncoderButton object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Joystick</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Joystick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletJoystick(MBrickletJoystick object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Joystick Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joystick Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseJoystickDevice(JoystickDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Joystick XPosition</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joystick XPosition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseJoystickXPosition(JoystickXPosition object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Joystick YPosition</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joystick YPosition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseJoystickYPosition(JoystickYPosition object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Joystick Button</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Joystick Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseJoystickButton(JoystickButton object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Analog Out V2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Analog Out V2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletAnalogOutV2(MBrickletAnalogOutV2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBrick Servo</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBrick Servo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickServo(MBrickServo object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MServo</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MServo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMServo(MServo object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBrick DC</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBrick DC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickDC(MBrickDC object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBrick Stepper</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBrick Stepper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickStepper(MBrickStepper object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Brick Stepper Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Brick Stepper Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFBrickStepperConfiguration(TFBrickStepperConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperDevice(MStepperDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Drive</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Drive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperDrive(MStepperDrive object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Velocity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Velocity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperVelocity(MStepperVelocity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Current</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Current</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperCurrent(MStepperCurrent object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Position</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperPosition(MStepperPosition object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Steps</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Steps</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperSteps(MStepperSteps object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Stack Voltage</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Stack Voltage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperStackVoltage(MStepperStackVoltage object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper External Voltage</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper External Voltage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperExternalVoltage(MStepperExternalVoltage object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Consumption</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Consumption</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperConsumption(MStepperConsumption object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Under Voltage</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Under Voltage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperUnderVoltage(MStepperUnderVoltage object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper State</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperState(MStepperState object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Chip Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Chip Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperChipTemperature(MStepperChipTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MStepper Status Led</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MStepper Status Led</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMStepperStatusLed(MStepperStatusLed object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MDual Relay Bricklet</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MDual Relay Bricklet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMDualRelayBricklet(MDualRelayBricklet object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MIndustrial Quad Relay Bricklet</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MIndustrial Quad Relay Bricklet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMIndustrialQuadRelayBricklet(MIndustrialQuadRelayBricklet object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MIndustrial Quad Relay</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MIndustrial Quad Relay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMIndustrialQuadRelay(MIndustrialQuadRelay object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Industrial Digital In4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Industrial Digital In4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletIndustrialDigitalIn4(MBrickletIndustrialDigitalIn4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MIndustrial Digital In</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MIndustrial Digital In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMIndustrialDigitalIn(MIndustrialDigitalIn object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Industrial Digital Out4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Industrial Digital Out4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletIndustrialDigitalOut4(MBrickletIndustrialDigitalOut4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Digital Actor Digital Out4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Actor Digital Out4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDigitalActorDigitalOut4(DigitalActorDigitalOut4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Segment Display4x7</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Segment Display4x7</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletSegmentDisplay4x7(MBrickletSegmentDisplay4x7 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet LED Strip</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet LED Strip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletLEDStrip(MBrickletLEDStrip object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>LED Group</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LED Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLEDGroup(LEDGroup object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Digital Actor IO16</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Actor IO16</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDigitalActorIO16(DigitalActorIO16 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet IO16</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet IO16</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletIO16(MBrickletIO16 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Digital Sensor</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDigitalSensor(DigitalSensor object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet IO4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet IO4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletIO4(MBrickletIO4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>IO4 Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IO4 Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseIO4Device(IO4Device object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Digital Sensor IO4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Sensor IO4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDigitalSensorIO4(DigitalSensorIO4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Digital Actor IO4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Digital Actor IO4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDigitalActorIO4(DigitalActorIO4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Multi Touch</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Multi Touch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletMultiTouch(MBrickletMultiTouch object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Multi Touch Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Touch Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMultiTouchDevice(MultiTouchDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Electrode</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Electrode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseElectrode(Electrode object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Proximity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proximity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProximity(Proximity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Motion Detector</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Motion Detector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletMotionDetector(MBrickletMotionDetector object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Hall Effect</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Hall Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletHallEffect(MBrickletHallEffect object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MDual Relay</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MDual Relay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMDualRelay(MDualRelay object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Remote Switch</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Remote Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletRemoteSwitch(MBrickletRemoteSwitch object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Remote Switch</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRemoteSwitch(RemoteSwitch object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Remote Switch A</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Switch A</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRemoteSwitchA(RemoteSwitchA object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Remote Switch B</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Switch B</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRemoteSwitchB(RemoteSwitchB object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Remote Switch C</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Switch C</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRemoteSwitchC(RemoteSwitchC object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Humidity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Humidity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletHumidity(MBrickletHumidity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Distance IR</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Distance IR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletDistanceIR(MBrickletDistanceIR object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Solid State Relay</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Solid State Relay</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletSolidStateRelay(MBrickletSolidStateRelay object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Industrial Dual020m A</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Industrial Dual020m A</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletIndustrialDual020mA(MBrickletIndustrialDual020mA object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dual020m ADevice</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dual020m ADevice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDual020mADevice(Dual020mADevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet PTC</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet PTC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletPTC(MBrickletPTC object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>PTC Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PTC Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePTCDevice(PTCDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>PTC Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PTC Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePTCTemperature(PTCTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>PTC Resistance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PTC Resistance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePTCResistance(PTCResistance object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>PTC Connected</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PTC Connected</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePTCConnected(PTCConnected object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletTemperature(MBrickletTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Thermocouple</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Thermocouple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletThermocouple(MBrickletThermocouple object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet UV Light</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet UV Light</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletUVLight(MBrickletUVLight object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet CO2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet CO2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletCO2(MBrickletCO2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Temperature IR</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Temperature IR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletTemperatureIR(MBrickletTemperatureIR object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MTemperature IR Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MTemperature IR Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMTemperatureIRDevice(MTemperatureIRDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Object Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObjectTemperature(ObjectTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ambient Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ambient Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAmbientTemperature(AmbientTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Tilt</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Tilt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletTilt(MBrickletTilt object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Voltage Current</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Voltage Current</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletVoltageCurrent(MBrickletVoltageCurrent object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Voltage Current Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Voltage Current Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVoltageCurrentDevice(VoltageCurrentDevice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>VC Device Voltage</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VC Device Voltage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVCDeviceVoltage(VCDeviceVoltage object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>VC Device Current</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VC Device Current</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVCDeviceCurrent(VCDeviceCurrent object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>VC Device Power</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VC Device Power</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseVCDevicePower(VCDevicePower object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Humidity V2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Humidity V2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletHumidityV2(MBrickletHumidityV2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MHumidity V2 Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MHumidity V2 Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMHumidityV2Device(MHumidityV2Device object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MHumidity V2 Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MHumidity V2 Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMHumidityV2Temperature(MHumidityV2Temperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MHumidity V2 Humidity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MHumidity V2 Humidity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMHumidityV2Humidity(MHumidityV2Humidity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Barometer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Barometer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletBarometer(MBrickletBarometer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBarometer Temperature</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBarometer Temperature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBarometerTemperature(MBarometerTemperature object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Ambient Light</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Ambient Light</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletAmbientLight(MBrickletAmbientLight object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Ambient Light V2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Ambient Light V2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletAmbientLightV2(MBrickletAmbientLightV2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Industrial Dual Analog In</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Industrial Dual Analog In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletIndustrialDualAnalogIn(MBrickletIndustrialDualAnalogIn object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Industrial Dual Analog In Channel</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Industrial Dual Analog In Channel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseIndustrialDualAnalogInChannel(IndustrialDualAnalogInChannel object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Sound Intensity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Sound Intensity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletSoundIntensity(MBrickletSoundIntensity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Dust Detector</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Dust Detector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletDustDetector(MBrickletDustDetector object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Moisture</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Moisture</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletMoisture(MBrickletMoisture object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Analog In V2</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Analog In V2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletAnalogInV2(MBrickletAnalogInV2 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Analog In</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Analog In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletAnalogIn(MBrickletAnalogIn object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet Distance US</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet Distance US</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletDistanceUS(MBrickletDistanceUS object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet LCD2 0x4</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet LCD2 0x4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletLCD20x4(MBrickletLCD20x4 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>OLED Bricklet</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OLED Bricklet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOLEDBricklet(OLEDBricklet object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet OLED12 8x64</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet OLED12 8x64</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletOLED128x64(MBrickletOLED128x64 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MBricklet OLE6 4x48</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBricklet OLE6 4x48</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMBrickletOLE64x48(MBrickletOLE64x48 object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MLCD2 0x4 Backlight</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MLCD2 0x4 Backlight</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMLCD20x4Backlight(MLCD20x4Backlight object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>MLCD2 0x4 Button</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MLCD2 0x4 Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMLCD20x4Button(MLCD20x4Button object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Config</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFConfig(TFConfig object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>OHTF Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OHTF Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <TFC extends TFConfig, IDS extends Enum> T caseOHTFDevice(OHTFDevice<TFC, IDS> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>OHTF Sub Device Admin Device</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OHTF Sub Device Admin Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public <TFC extends TFConfig, IDS extends Enum> T caseOHTFSubDeviceAdminDevice(OHTFSubDeviceAdminDevice<TFC, IDS> object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>OH Config</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OH Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOHConfig(OHConfig object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Null Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Null Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFNullConfiguration(TFNullConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TFPTC Bricklet Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TFPTC Bricklet Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFPTCBrickletConfiguration(TFPTCBrickletConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Industrial Dual020m AConfiguration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Industrial Dual020m AConfiguration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFIndustrialDual020mAConfiguration(TFIndustrialDual020mAConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Base Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Base Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFBaseConfiguration(TFBaseConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Load Cell Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Cell Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLoadCellConfiguration(LoadCellConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Laser Range Finder Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Laser Range Finder Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLaserRangeFinderConfiguration(LaserRangeFinderConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Humidity V2 Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Humidity V2 Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseHumidityV2Configuration(HumidityV2Configuration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Ambient Light V2 Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ambient Light V2 Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAmbientLightV2Configuration(AmbientLightV2Configuration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bricklet Industrial Dual Analog In Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bricklet Industrial Dual Analog In Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBrickletIndustrialDualAnalogInConfiguration(BrickletIndustrialDualAnalogInConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Temperature Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Temperature Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFTemperatureConfiguration(TFTemperatureConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Thermocouple Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Thermocouple Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFThermocoupleConfiguration(TFThermocoupleConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Object Temperature Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Object Temperature Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFObjectTemperatureConfiguration(TFObjectTemperatureConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Moisture Bricklet Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Moisture Bricklet Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFMoistureBrickletConfiguration(TFMoistureBrickletConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Analog In Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Analog In Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFAnalogInConfiguration(TFAnalogInConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Analog In V2 Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Analog In V2 Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFAnalogInV2Configuration(TFAnalogInV2Configuration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Distance US Bricklet Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Distance US Bricklet Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFDistanceUSBrickletConfiguration(TFDistanceUSBrickletConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Voltage Current Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Voltage Current Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFVoltageCurrentConfiguration(TFVoltageCurrentConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Brick DC Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Brick DC Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFBrickDCConfiguration(TFBrickDCConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TFIO Actor Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TFIO Actor Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFIOActorConfiguration(TFIOActorConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Interrupt Listener Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Interrupt Listener Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFInterruptListenerConfiguration(TFInterruptListenerConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TFIO Sensor Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TFIO Sensor Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFIOSensorConfiguration(TFIOSensorConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>TF Servo Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TF Servo Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTFServoConfiguration(TFServoConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bricklet Remote Switch Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bricklet Remote Switch Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBrickletRemoteSwitchConfiguration(BrickletRemoteSwitchConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Remote Switch AConfiguration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Switch AConfiguration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRemoteSwitchAConfiguration(RemoteSwitchAConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Remote Switch BConfiguration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Switch BConfiguration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRemoteSwitchBConfiguration(RemoteSwitchBConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Remote Switch CConfiguration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Switch CConfiguration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRemoteSwitchCConfiguration(RemoteSwitchCConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Multi Touch Device Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Touch Device Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMultiTouchDeviceConfiguration(MultiTouchDeviceConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bricklet Multi Touch Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bricklet Multi Touch Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBrickletMultiTouchConfiguration(BrickletMultiTouchConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dimmable Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimmable Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDimmableConfiguration(DimmableConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Button Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseButtonConfiguration(ButtonConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Dual Button LED Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dual Button LED Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseDualButtonLEDConfiguration(DualButtonLEDConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>LED Strip Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LED Strip Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLEDStripConfiguration(LEDStripConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>LED Group Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LED Group Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseLEDGroupConfiguration(LEDGroupConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bricklet Color Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bricklet Color Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBrickletColorConfiguration(BrickletColorConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bricklet Accelerometer Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bricklet Accelerometer Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBrickletAccelerometerConfiguration(BrickletAccelerometerConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bricklet OLED Configuration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bricklet OLED Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBrickletOLEDConfiguration(BrickletOLEDConfiguration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //ModelSwitch
