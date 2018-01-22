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
package org.m1theo.tinkerforge.emf.internal.model.util;

import com.tinkerforge.Device;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.m1theo.tinkerforge.emf.internal.model.*;
import org.m1theo.tinkerforge.types.TinkerforgeValue;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static ModelPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ModelAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = ModelPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
      @Override
      public Adapter caseEcosystem(Ecosystem object) {
        return createEcosystemAdapter();
      }
      @Override
      public Adapter caseMBrickd(MBrickd object) {
        return createMBrickdAdapter();
      }
      @Override
      public Adapter caseSubDeviceAdmin(SubDeviceAdmin object) {
        return createSubDeviceAdminAdapter();
      }
      @Override
      public <TFC> Adapter caseMTFConfigConsumer(MTFConfigConsumer<TFC> object) {
        return createMTFConfigConsumerAdapter();
      }
      @Override
      public Adapter caseMBaseDevice(MBaseDevice object) {
        return createMBaseDeviceAdapter();
      }
      @Override
      public <TF extends Device> Adapter caseMDevice(MDevice<TF> object) {
        return createMDeviceAdapter();
      }
      @Override
      public <S extends MSubDevice<?>> Adapter caseMSubDeviceHolder(MSubDeviceHolder<S> object) {
        return createMSubDeviceHolderAdapter();
      }
      @Override
      public Adapter caseMActor(MActor object) {
        return createMActorAdapter();
      }
      @Override
      public Adapter caseSwitchSensor(SwitchSensor object) {
        return createSwitchSensorAdapter();
      }
      @Override
      public Adapter caseMSwitchActor(MSwitchActor object) {
        return createMSwitchActorAdapter();
      }
      @Override
      public Adapter caseProgrammableSwitchActor(ProgrammableSwitchActor object) {
        return createProgrammableSwitchActorAdapter();
      }
      @Override
      public Adapter caseMInSwitchActor(MInSwitchActor object) {
        return createMInSwitchActorAdapter();
      }
      @Override
      public Adapter caseGenericDevice(GenericDevice object) {
        return createGenericDeviceAdapter();
      }
      @Override
      public Adapter caseIODevice(IODevice object) {
        return createIODeviceAdapter();
      }
      @Override
      public <B extends MSubDeviceHolder<?>> Adapter caseMSubDevice(MSubDevice<B> object) {
        return createMSubDeviceAdapter();
      }
      @Override
      public Adapter caseCallbackListener(CallbackListener object) {
        return createCallbackListenerAdapter();
      }
      @Override
      public Adapter caseInterruptListener(InterruptListener object) {
        return createInterruptListenerAdapter();
      }
      @Override
      public <DeviceValue extends TinkerforgeValue> Adapter caseMSensor(MSensor<DeviceValue> object) {
        return createMSensorAdapter();
      }
      @Override
      public Adapter caseProgrammableActor(ProgrammableActor object) {
        return createProgrammableActorAdapter();
      }
      @Override
      public Adapter caseMTextActor(MTextActor object) {
        return createMTextActorAdapter();
      }
      @Override
      public Adapter caseMLCDSubDevice(MLCDSubDevice object) {
        return createMLCDSubDeviceAdapter();
      }
      @Override
      public Adapter caseDigitalActor(DigitalActor object) {
        return createDigitalActorAdapter();
      }
      @Override
      public Adapter caseNumberActor(NumberActor object) {
        return createNumberActorAdapter();
      }
      @Override
      public Adapter caseColorActor(ColorActor object) {
        return createColorActorAdapter();
      }
      @Override
      public Adapter caseProgrammableColorActor(ProgrammableColorActor object) {
        return createProgrammableColorActorAdapter();
      }
      @Override
      public Adapter caseSimpleColorActor(SimpleColorActor object) {
        return createSimpleColorActorAdapter();
      }
      @Override
      public Adapter caseMoveActor(MoveActor object) {
        return createMoveActorAdapter();
      }
      @Override
      public <TC extends DimmableConfiguration> Adapter caseDimmableActor(DimmableActor<TC> object) {
        return createDimmableActorAdapter();
      }
      @Override
      public Adapter casePercentTypeActor(PercentTypeActor object) {
        return createPercentTypeActorAdapter();
      }
      @Override
      public <C extends DimmableConfiguration> Adapter caseSetPointActor(SetPointActor<C> object) {
        return createSetPointActorAdapter();
      }
      @Override
      public Adapter caseMBrickletDualButton(MBrickletDualButton object) {
        return createMBrickletDualButtonAdapter();
      }
      @Override
      public Adapter caseDualButtonDevice(DualButtonDevice object) {
        return createDualButtonDeviceAdapter();
      }
      @Override
      public Adapter caseMBrickletPiezoSpeaker(MBrickletPiezoSpeaker object) {
        return createMBrickletPiezoSpeakerAdapter();
      }
      @Override
      public Adapter caseDualButtonButton(DualButtonButton object) {
        return createDualButtonButtonAdapter();
      }
      @Override
      public Adapter caseMBrickletAccelerometer(MBrickletAccelerometer object) {
        return createMBrickletAccelerometerAdapter();
      }
      @Override
      public Adapter caseAccelerometerDevice(AccelerometerDevice object) {
        return createAccelerometerDeviceAdapter();
      }
      @Override
      public Adapter caseAccelerometerDirection(AccelerometerDirection object) {
        return createAccelerometerDirectionAdapter();
      }
      @Override
      public Adapter caseAccelerometerTemperature(AccelerometerTemperature object) {
        return createAccelerometerTemperatureAdapter();
      }
      @Override
      public Adapter caseAccelerometerLed(AccelerometerLed object) {
        return createAccelerometerLedAdapter();
      }
      @Override
      public Adapter caseMBrickletLaserRangeFinder(MBrickletLaserRangeFinder object) {
        return createMBrickletLaserRangeFinderAdapter();
      }
      @Override
      public Adapter caseLaserRangeFinderDevice(LaserRangeFinderDevice object) {
        return createLaserRangeFinderDeviceAdapter();
      }
      @Override
      public Adapter caseLaserRangeFinderLaser(LaserRangeFinderLaser object) {
        return createLaserRangeFinderLaserAdapter();
      }
      @Override
      public Adapter caseLaserRangeFinderDistance(LaserRangeFinderDistance object) {
        return createLaserRangeFinderDistanceAdapter();
      }
      @Override
      public Adapter caseLaserRangeFinderVelocity(LaserRangeFinderVelocity object) {
        return createLaserRangeFinderVelocityAdapter();
      }
      @Override
      public Adapter caseMBrickletLoadCell(MBrickletLoadCell object) {
        return createMBrickletLoadCellAdapter();
      }
      @Override
      public Adapter caseLoadCellDevice(LoadCellDevice object) {
        return createLoadCellDeviceAdapter();
      }
      @Override
      public Adapter caseLoadCellWeight(LoadCellWeight object) {
        return createLoadCellWeightAdapter();
      }
      @Override
      public Adapter caseLoadCellLed(LoadCellLed object) {
        return createLoadCellLedAdapter();
      }
      @Override
      public Adapter caseMBrickletColor(MBrickletColor object) {
        return createMBrickletColorAdapter();
      }
      @Override
      public Adapter caseBrickletColorDevice(BrickletColorDevice object) {
        return createBrickletColorDeviceAdapter();
      }
      @Override
      public Adapter caseColorColor(ColorColor object) {
        return createColorColorAdapter();
      }
      @Override
      public Adapter caseColorIlluminance(ColorIlluminance object) {
        return createColorIlluminanceAdapter();
      }
      @Override
      public Adapter caseColorColorTemperature(ColorColorTemperature object) {
        return createColorColorTemperatureAdapter();
      }
      @Override
      public Adapter caseColorLed(ColorLed object) {
        return createColorLedAdapter();
      }
      @Override
      public Adapter caseDualButtonLed(DualButtonLed object) {
        return createDualButtonLedAdapter();
      }
      @Override
      public Adapter caseMBrickletLinearPoti(MBrickletLinearPoti object) {
        return createMBrickletLinearPotiAdapter();
      }
      @Override
      public Adapter caseMBrickletRotaryEncoder(MBrickletRotaryEncoder object) {
        return createMBrickletRotaryEncoderAdapter();
      }
      @Override
      public Adapter caseRotaryEncoderDevice(RotaryEncoderDevice object) {
        return createRotaryEncoderDeviceAdapter();
      }
      @Override
      public Adapter caseRotaryEncoder(RotaryEncoder object) {
        return createRotaryEncoderAdapter();
      }
      @Override
      public Adapter caseRotaryEncoderButton(RotaryEncoderButton object) {
        return createRotaryEncoderButtonAdapter();
      }
      @Override
      public Adapter caseMBrickletJoystick(MBrickletJoystick object) {
        return createMBrickletJoystickAdapter();
      }
      @Override
      public Adapter caseJoystickDevice(JoystickDevice object) {
        return createJoystickDeviceAdapter();
      }
      @Override
      public Adapter caseJoystickXPosition(JoystickXPosition object) {
        return createJoystickXPositionAdapter();
      }
      @Override
      public Adapter caseJoystickYPosition(JoystickYPosition object) {
        return createJoystickYPositionAdapter();
      }
      @Override
      public Adapter caseJoystickButton(JoystickButton object) {
        return createJoystickButtonAdapter();
      }
      @Override
      public Adapter caseMBrickletAnalogOutV2(MBrickletAnalogOutV2 object) {
        return createMBrickletAnalogOutV2Adapter();
      }
      @Override
      public Adapter caseMBrickServo(MBrickServo object) {
        return createMBrickServoAdapter();
      }
      @Override
      public Adapter caseMServo(MServo object) {
        return createMServoAdapter();
      }
      @Override
      public Adapter caseMBrickDC(MBrickDC object) {
        return createMBrickDCAdapter();
      }
      @Override
      public Adapter caseMBrickStepper(MBrickStepper object) {
        return createMBrickStepperAdapter();
      }
      @Override
      public Adapter caseTFBrickStepperConfiguration(TFBrickStepperConfiguration object) {
        return createTFBrickStepperConfigurationAdapter();
      }
      @Override
      public Adapter caseMStepperDevice(MStepperDevice object) {
        return createMStepperDeviceAdapter();
      }
      @Override
      public Adapter caseMStepperDrive(MStepperDrive object) {
        return createMStepperDriveAdapter();
      }
      @Override
      public Adapter caseMStepperVelocity(MStepperVelocity object) {
        return createMStepperVelocityAdapter();
      }
      @Override
      public Adapter caseMStepperCurrent(MStepperCurrent object) {
        return createMStepperCurrentAdapter();
      }
      @Override
      public Adapter caseMStepperPosition(MStepperPosition object) {
        return createMStepperPositionAdapter();
      }
      @Override
      public Adapter caseMStepperSteps(MStepperSteps object) {
        return createMStepperStepsAdapter();
      }
      @Override
      public Adapter caseMStepperStackVoltage(MStepperStackVoltage object) {
        return createMStepperStackVoltageAdapter();
      }
      @Override
      public Adapter caseMStepperExternalVoltage(MStepperExternalVoltage object) {
        return createMStepperExternalVoltageAdapter();
      }
      @Override
      public Adapter caseMStepperConsumption(MStepperConsumption object) {
        return createMStepperConsumptionAdapter();
      }
      @Override
      public Adapter caseMStepperUnderVoltage(MStepperUnderVoltage object) {
        return createMStepperUnderVoltageAdapter();
      }
      @Override
      public Adapter caseMStepperState(MStepperState object) {
        return createMStepperStateAdapter();
      }
      @Override
      public Adapter caseMStepperChipTemperature(MStepperChipTemperature object) {
        return createMStepperChipTemperatureAdapter();
      }
      @Override
      public Adapter caseMStepperStatusLed(MStepperStatusLed object) {
        return createMStepperStatusLedAdapter();
      }
      @Override
      public Adapter caseMDualRelayBricklet(MDualRelayBricklet object) {
        return createMDualRelayBrickletAdapter();
      }
      @Override
      public Adapter caseMIndustrialQuadRelayBricklet(MIndustrialQuadRelayBricklet object) {
        return createMIndustrialQuadRelayBrickletAdapter();
      }
      @Override
      public Adapter caseMIndustrialQuadRelay(MIndustrialQuadRelay object) {
        return createMIndustrialQuadRelayAdapter();
      }
      @Override
      public Adapter caseMBrickletIndustrialDigitalIn4(MBrickletIndustrialDigitalIn4 object) {
        return createMBrickletIndustrialDigitalIn4Adapter();
      }
      @Override
      public Adapter caseMIndustrialDigitalIn(MIndustrialDigitalIn object) {
        return createMIndustrialDigitalInAdapter();
      }
      @Override
      public Adapter caseMBrickletIndustrialDigitalOut4(MBrickletIndustrialDigitalOut4 object) {
        return createMBrickletIndustrialDigitalOut4Adapter();
      }
      @Override
      public Adapter caseDigitalActorDigitalOut4(DigitalActorDigitalOut4 object) {
        return createDigitalActorDigitalOut4Adapter();
      }
      @Override
      public Adapter caseMBrickletSegmentDisplay4x7(MBrickletSegmentDisplay4x7 object) {
        return createMBrickletSegmentDisplay4x7Adapter();
      }
      @Override
      public Adapter caseMBrickletLEDStrip(MBrickletLEDStrip object) {
        return createMBrickletLEDStripAdapter();
      }
      @Override
      public Adapter caseLEDGroup(LEDGroup object) {
        return createLEDGroupAdapter();
      }
      @Override
      public Adapter caseDigitalActorIO16(DigitalActorIO16 object) {
        return createDigitalActorIO16Adapter();
      }
      @Override
      public Adapter caseMBrickletIO16(MBrickletIO16 object) {
        return createMBrickletIO16Adapter();
      }
      @Override
      public Adapter caseDigitalSensor(DigitalSensor object) {
        return createDigitalSensorAdapter();
      }
      @Override
      public Adapter caseMBrickletIO4(MBrickletIO4 object) {
        return createMBrickletIO4Adapter();
      }
      @Override
      public Adapter caseIO4Device(IO4Device object) {
        return createIO4DeviceAdapter();
      }
      @Override
      public Adapter caseDigitalSensorIO4(DigitalSensorIO4 object) {
        return createDigitalSensorIO4Adapter();
      }
      @Override
      public Adapter caseDigitalActorIO4(DigitalActorIO4 object) {
        return createDigitalActorIO4Adapter();
      }
      @Override
      public Adapter caseMBrickletMultiTouch(MBrickletMultiTouch object) {
        return createMBrickletMultiTouchAdapter();
      }
      @Override
      public Adapter caseMultiTouchDevice(MultiTouchDevice object) {
        return createMultiTouchDeviceAdapter();
      }
      @Override
      public Adapter caseElectrode(Electrode object) {
        return createElectrodeAdapter();
      }
      @Override
      public Adapter caseProximity(Proximity object) {
        return createProximityAdapter();
      }
      @Override
      public Adapter caseMBrickletMotionDetector(MBrickletMotionDetector object) {
        return createMBrickletMotionDetectorAdapter();
      }
      @Override
      public Adapter caseMBrickletHallEffect(MBrickletHallEffect object) {
        return createMBrickletHallEffectAdapter();
      }
      @Override
      public Adapter caseMDualRelay(MDualRelay object) {
        return createMDualRelayAdapter();
      }
      @Override
      public Adapter caseMBrickletRemoteSwitch(MBrickletRemoteSwitch object) {
        return createMBrickletRemoteSwitchAdapter();
      }
      @Override
      public Adapter caseRemoteSwitch(RemoteSwitch object) {
        return createRemoteSwitchAdapter();
      }
      @Override
      public Adapter caseRemoteSwitchA(RemoteSwitchA object) {
        return createRemoteSwitchAAdapter();
      }
      @Override
      public Adapter caseRemoteSwitchB(RemoteSwitchB object) {
        return createRemoteSwitchBAdapter();
      }
      @Override
      public Adapter caseRemoteSwitchC(RemoteSwitchC object) {
        return createRemoteSwitchCAdapter();
      }
      @Override
      public Adapter caseMBrickletHumidity(MBrickletHumidity object) {
        return createMBrickletHumidityAdapter();
      }
      @Override
      public Adapter caseMBrickletDistanceIR(MBrickletDistanceIR object) {
        return createMBrickletDistanceIRAdapter();
      }
      @Override
      public Adapter caseMBrickletSolidStateRelay(MBrickletSolidStateRelay object) {
        return createMBrickletSolidStateRelayAdapter();
      }
      @Override
      public Adapter caseMBrickletIndustrialDual020mA(MBrickletIndustrialDual020mA object) {
        return createMBrickletIndustrialDual020mAAdapter();
      }
      @Override
      public Adapter caseDual020mADevice(Dual020mADevice object) {
        return createDual020mADeviceAdapter();
      }
      @Override
      public Adapter caseMBrickletPTC(MBrickletPTC object) {
        return createMBrickletPTCAdapter();
      }
      @Override
      public Adapter casePTCDevice(PTCDevice object) {
        return createPTCDeviceAdapter();
      }
      @Override
      public Adapter casePTCTemperature(PTCTemperature object) {
        return createPTCTemperatureAdapter();
      }
      @Override
      public Adapter casePTCResistance(PTCResistance object) {
        return createPTCResistanceAdapter();
      }
      @Override
      public Adapter casePTCConnected(PTCConnected object) {
        return createPTCConnectedAdapter();
      }
      @Override
      public Adapter caseMBrickletTemperature(MBrickletTemperature object) {
        return createMBrickletTemperatureAdapter();
      }
      @Override
      public Adapter caseMBrickletThermocouple(MBrickletThermocouple object) {
        return createMBrickletThermocoupleAdapter();
      }
      @Override
      public Adapter caseMBrickletUVLight(MBrickletUVLight object) {
        return createMBrickletUVLightAdapter();
      }
      @Override
      public Adapter caseMBrickletCO2(MBrickletCO2 object) {
        return createMBrickletCO2Adapter();
      }
      @Override
      public Adapter caseMBrickletTemperatureIR(MBrickletTemperatureIR object) {
        return createMBrickletTemperatureIRAdapter();
      }
      @Override
      public Adapter caseMTemperatureIRDevice(MTemperatureIRDevice object) {
        return createMTemperatureIRDeviceAdapter();
      }
      @Override
      public Adapter caseObjectTemperature(ObjectTemperature object) {
        return createObjectTemperatureAdapter();
      }
      @Override
      public Adapter caseAmbientTemperature(AmbientTemperature object) {
        return createAmbientTemperatureAdapter();
      }
      @Override
      public Adapter caseMBrickletTilt(MBrickletTilt object) {
        return createMBrickletTiltAdapter();
      }
      @Override
      public Adapter caseMBrickletVoltageCurrent(MBrickletVoltageCurrent object) {
        return createMBrickletVoltageCurrentAdapter();
      }
      @Override
      public Adapter caseVoltageCurrentDevice(VoltageCurrentDevice object) {
        return createVoltageCurrentDeviceAdapter();
      }
      @Override
      public Adapter caseVCDeviceVoltage(VCDeviceVoltage object) {
        return createVCDeviceVoltageAdapter();
      }
      @Override
      public Adapter caseVCDeviceCurrent(VCDeviceCurrent object) {
        return createVCDeviceCurrentAdapter();
      }
      @Override
      public Adapter caseVCDevicePower(VCDevicePower object) {
        return createVCDevicePowerAdapter();
      }
      @Override
      public Adapter caseMBrickletHumidityV2(MBrickletHumidityV2 object) {
        return createMBrickletHumidityV2Adapter();
      }
      @Override
      public Adapter caseMHumidityV2Device(MHumidityV2Device object) {
        return createMHumidityV2DeviceAdapter();
      }
      @Override
      public Adapter caseMHumidityV2Temperature(MHumidityV2Temperature object) {
        return createMHumidityV2TemperatureAdapter();
      }
      @Override
      public Adapter caseMHumidityV2Humidity(MHumidityV2Humidity object) {
        return createMHumidityV2HumidityAdapter();
      }
      @Override
      public Adapter caseMBrickletBarometer(MBrickletBarometer object) {
        return createMBrickletBarometerAdapter();
      }
      @Override
      public Adapter caseMBarometerTemperature(MBarometerTemperature object) {
        return createMBarometerTemperatureAdapter();
      }
      @Override
      public Adapter caseMBrickletAmbientLight(MBrickletAmbientLight object) {
        return createMBrickletAmbientLightAdapter();
      }
      @Override
      public Adapter caseMBrickletAmbientLightV2(MBrickletAmbientLightV2 object) {
        return createMBrickletAmbientLightV2Adapter();
      }
      @Override
      public Adapter caseMBrickletIndustrialDualAnalogIn(MBrickletIndustrialDualAnalogIn object) {
        return createMBrickletIndustrialDualAnalogInAdapter();
      }
      @Override
      public Adapter caseIndustrialDualAnalogInChannel(IndustrialDualAnalogInChannel object) {
        return createIndustrialDualAnalogInChannelAdapter();
      }
      @Override
      public Adapter caseMBrickletSoundIntensity(MBrickletSoundIntensity object) {
        return createMBrickletSoundIntensityAdapter();
      }
      @Override
      public Adapter caseMBrickletDustDetector(MBrickletDustDetector object) {
        return createMBrickletDustDetectorAdapter();
      }
      @Override
      public Adapter caseMBrickletMoisture(MBrickletMoisture object) {
        return createMBrickletMoistureAdapter();
      }
      @Override
      public Adapter caseMBrickletAnalogInV2(MBrickletAnalogInV2 object) {
        return createMBrickletAnalogInV2Adapter();
      }
      @Override
      public Adapter caseMBrickletAnalogIn(MBrickletAnalogIn object) {
        return createMBrickletAnalogInAdapter();
      }
      @Override
      public Adapter caseMBrickletDistanceUS(MBrickletDistanceUS object) {
        return createMBrickletDistanceUSAdapter();
      }
      @Override
      public Adapter caseMBrickletLCD20x4(MBrickletLCD20x4 object) {
        return createMBrickletLCD20x4Adapter();
      }
      @Override
      public Adapter caseOLEDBricklet(OLEDBricklet object) {
        return createOLEDBrickletAdapter();
      }
      @Override
      public Adapter caseMBrickletOLED128x64(MBrickletOLED128x64 object) {
        return createMBrickletOLED128x64Adapter();
      }
      @Override
      public Adapter caseMBrickletOLE64x48(MBrickletOLE64x48 object) {
        return createMBrickletOLE64x48Adapter();
      }
      @Override
      public Adapter caseMLCD20x4Backlight(MLCD20x4Backlight object) {
        return createMLCD20x4BacklightAdapter();
      }
      @Override
      public Adapter caseMLCD20x4Button(MLCD20x4Button object) {
        return createMLCD20x4ButtonAdapter();
      }
      @Override
      public Adapter caseTFConfig(TFConfig object) {
        return createTFConfigAdapter();
      }
      @Override
      public <TFC extends TFConfig, IDS extends Enum> Adapter caseOHTFDevice(OHTFDevice<TFC, IDS> object) {
        return createOHTFDeviceAdapter();
      }
      @Override
      public <TFC extends TFConfig, IDS extends Enum> Adapter caseOHTFSubDeviceAdminDevice(OHTFSubDeviceAdminDevice<TFC, IDS> object) {
        return createOHTFSubDeviceAdminDeviceAdapter();
      }
      @Override
      public Adapter caseOHConfig(OHConfig object) {
        return createOHConfigAdapter();
      }
      @Override
      public Adapter caseTFNullConfiguration(TFNullConfiguration object) {
        return createTFNullConfigurationAdapter();
      }
      @Override
      public Adapter caseTFPTCBrickletConfiguration(TFPTCBrickletConfiguration object) {
        return createTFPTCBrickletConfigurationAdapter();
      }
      @Override
      public Adapter caseTFIndustrialDual020mAConfiguration(TFIndustrialDual020mAConfiguration object) {
        return createTFIndustrialDual020mAConfigurationAdapter();
      }
      @Override
      public Adapter caseTFBaseConfiguration(TFBaseConfiguration object) {
        return createTFBaseConfigurationAdapter();
      }
      @Override
      public Adapter caseLoadCellConfiguration(LoadCellConfiguration object) {
        return createLoadCellConfigurationAdapter();
      }
      @Override
      public Adapter caseLaserRangeFinderConfiguration(LaserRangeFinderConfiguration object) {
        return createLaserRangeFinderConfigurationAdapter();
      }
      @Override
      public Adapter caseHumidityV2Configuration(HumidityV2Configuration object) {
        return createHumidityV2ConfigurationAdapter();
      }
      @Override
      public Adapter caseAmbientLightV2Configuration(AmbientLightV2Configuration object) {
        return createAmbientLightV2ConfigurationAdapter();
      }
      @Override
      public Adapter caseBrickletIndustrialDualAnalogInConfiguration(BrickletIndustrialDualAnalogInConfiguration object) {
        return createBrickletIndustrialDualAnalogInConfigurationAdapter();
      }
      @Override
      public Adapter caseTFTemperatureConfiguration(TFTemperatureConfiguration object) {
        return createTFTemperatureConfigurationAdapter();
      }
      @Override
      public Adapter caseTFThermocoupleConfiguration(TFThermocoupleConfiguration object) {
        return createTFThermocoupleConfigurationAdapter();
      }
      @Override
      public Adapter caseTFObjectTemperatureConfiguration(TFObjectTemperatureConfiguration object) {
        return createTFObjectTemperatureConfigurationAdapter();
      }
      @Override
      public Adapter caseTFMoistureBrickletConfiguration(TFMoistureBrickletConfiguration object) {
        return createTFMoistureBrickletConfigurationAdapter();
      }
      @Override
      public Adapter caseTFAnalogInConfiguration(TFAnalogInConfiguration object) {
        return createTFAnalogInConfigurationAdapter();
      }
      @Override
      public Adapter caseTFAnalogInV2Configuration(TFAnalogInV2Configuration object) {
        return createTFAnalogInV2ConfigurationAdapter();
      }
      @Override
      public Adapter caseTFDistanceUSBrickletConfiguration(TFDistanceUSBrickletConfiguration object) {
        return createTFDistanceUSBrickletConfigurationAdapter();
      }
      @Override
      public Adapter caseTFVoltageCurrentConfiguration(TFVoltageCurrentConfiguration object) {
        return createTFVoltageCurrentConfigurationAdapter();
      }
      @Override
      public Adapter caseTFBrickDCConfiguration(TFBrickDCConfiguration object) {
        return createTFBrickDCConfigurationAdapter();
      }
      @Override
      public Adapter caseTFIOActorConfiguration(TFIOActorConfiguration object) {
        return createTFIOActorConfigurationAdapter();
      }
      @Override
      public Adapter caseTFInterruptListenerConfiguration(TFInterruptListenerConfiguration object) {
        return createTFInterruptListenerConfigurationAdapter();
      }
      @Override
      public Adapter caseTFIOSensorConfiguration(TFIOSensorConfiguration object) {
        return createTFIOSensorConfigurationAdapter();
      }
      @Override
      public Adapter caseTFServoConfiguration(TFServoConfiguration object) {
        return createTFServoConfigurationAdapter();
      }
      @Override
      public Adapter caseBrickletRemoteSwitchConfiguration(BrickletRemoteSwitchConfiguration object) {
        return createBrickletRemoteSwitchConfigurationAdapter();
      }
      @Override
      public Adapter caseRemoteSwitchAConfiguration(RemoteSwitchAConfiguration object) {
        return createRemoteSwitchAConfigurationAdapter();
      }
      @Override
      public Adapter caseRemoteSwitchBConfiguration(RemoteSwitchBConfiguration object) {
        return createRemoteSwitchBConfigurationAdapter();
      }
      @Override
      public Adapter caseRemoteSwitchCConfiguration(RemoteSwitchCConfiguration object) {
        return createRemoteSwitchCConfigurationAdapter();
      }
      @Override
      public Adapter caseMultiTouchDeviceConfiguration(MultiTouchDeviceConfiguration object) {
        return createMultiTouchDeviceConfigurationAdapter();
      }
      @Override
      public Adapter caseBrickletMultiTouchConfiguration(BrickletMultiTouchConfiguration object) {
        return createBrickletMultiTouchConfigurationAdapter();
      }
      @Override
      public Adapter caseDimmableConfiguration(DimmableConfiguration object) {
        return createDimmableConfigurationAdapter();
      }
      @Override
      public Adapter caseButtonConfiguration(ButtonConfiguration object) {
        return createButtonConfigurationAdapter();
      }
      @Override
      public Adapter caseDualButtonLEDConfiguration(DualButtonLEDConfiguration object) {
        return createDualButtonLEDConfigurationAdapter();
      }
      @Override
      public Adapter caseLEDStripConfiguration(LEDStripConfiguration object) {
        return createLEDStripConfigurationAdapter();
      }
      @Override
      public Adapter caseLEDGroupConfiguration(LEDGroupConfiguration object) {
        return createLEDGroupConfigurationAdapter();
      }
      @Override
      public Adapter caseBrickletColorConfiguration(BrickletColorConfiguration object) {
        return createBrickletColorConfigurationAdapter();
      }
      @Override
      public Adapter caseBrickletAccelerometerConfiguration(BrickletAccelerometerConfiguration object) {
        return createBrickletAccelerometerConfigurationAdapter();
      }
      @Override
      public Adapter caseBrickletOLEDConfiguration(BrickletOLEDConfiguration object) {
        return createBrickletOLEDConfigurationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.Ecosystem <em>Ecosystem</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.Ecosystem
   * @generated
   */
	public Adapter createEcosystemAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickd <em>MBrickd</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickd
   * @generated
   */
	public Adapter createMBrickdAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.SubDeviceAdmin <em>Sub Device Admin</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.SubDeviceAdmin
   * @generated
   */
	public Adapter createSubDeviceAdminAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer <em>MTF Config Consumer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer
   * @generated
   */
	public Adapter createMTFConfigConsumerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBaseDevice <em>MBase Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBaseDevice
   * @generated
   */
	public Adapter createMBaseDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MDevice <em>MDevice</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MDevice
   * @generated
   */
	public Adapter createMDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder <em>MSub Device Holder</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder
   * @generated
   */
	public Adapter createMSubDeviceHolderAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MActor <em>MActor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MActor
   * @generated
   */
	public Adapter createMActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.SwitchSensor <em>Switch Sensor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.SwitchSensor
   * @generated
   */
	public Adapter createSwitchSensorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MSwitchActor <em>MSwitch Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MSwitchActor
   * @generated
   */
	public Adapter createMSwitchActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ProgrammableSwitchActor <em>Programmable Switch Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ProgrammableSwitchActor
   * @generated
   */
	public Adapter createProgrammableSwitchActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MInSwitchActor <em>MIn Switch Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MInSwitchActor
   * @generated
   */
	public Adapter createMInSwitchActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.GenericDevice <em>Generic Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.GenericDevice
   * @generated
   */
	public Adapter createGenericDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.IODevice <em>IO Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.IODevice
   * @generated
   */
	public Adapter createIODeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MSubDevice <em>MSub Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MSubDevice
   * @generated
   */
	public Adapter createMSubDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.CallbackListener <em>Callback Listener</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.CallbackListener
   * @generated
   */
	public Adapter createCallbackListenerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.InterruptListener <em>Interrupt Listener</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.InterruptListener
   * @generated
   */
	public Adapter createInterruptListenerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MSensor <em>MSensor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MSensor
   * @generated
   */
	public Adapter createMSensorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ProgrammableActor <em>Programmable Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ProgrammableActor
   * @generated
   */
	public Adapter createProgrammableActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MTextActor <em>MText Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MTextActor
   * @generated
   */
	public Adapter createMTextActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MLCDSubDevice <em>MLCD Sub Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MLCDSubDevice
   * @generated
   */
	public Adapter createMLCDSubDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalActor <em>Digital Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DigitalActor
   * @generated
   */
	public Adapter createDigitalActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.NumberActor <em>Number Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.NumberActor
   * @generated
   */
	public Adapter createNumberActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ColorActor <em>Color Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ColorActor
   * @generated
   */
	public Adapter createColorActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ProgrammableColorActor <em>Programmable Color Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ProgrammableColorActor
   * @generated
   */
	public Adapter createProgrammableColorActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.SimpleColorActor <em>Simple Color Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.SimpleColorActor
   * @generated
   */
	public Adapter createSimpleColorActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MoveActor <em>Move Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MoveActor
   * @generated
   */
	public Adapter createMoveActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DimmableActor <em>Dimmable Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DimmableActor
   * @generated
   */
	public Adapter createDimmableActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.PercentTypeActor <em>Percent Type Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.PercentTypeActor
   * @generated
   */
	public Adapter createPercentTypeActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.SetPointActor <em>Set Point Actor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.SetPointActor
   * @generated
   */
	public Adapter createSetPointActorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletDualButton <em>MBricklet Dual Button</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletDualButton
   * @generated
   */
	public Adapter createMBrickletDualButtonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DualButtonDevice <em>Dual Button Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DualButtonDevice
   * @generated
   */
	public Adapter createDualButtonDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletPiezoSpeaker <em>MBricklet Piezo Speaker</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletPiezoSpeaker
   * @generated
   */
	public Adapter createMBrickletPiezoSpeakerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DualButtonButton <em>Dual Button Button</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DualButtonButton
   * @generated
   */
	public Adapter createDualButtonButtonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAccelerometer <em>MBricklet Accelerometer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletAccelerometer
   * @generated
   */
	public Adapter createMBrickletAccelerometerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.AccelerometerDevice <em>Accelerometer Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.AccelerometerDevice
   * @generated
   */
	public Adapter createAccelerometerDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.AccelerometerDirection <em>Accelerometer Direction</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.AccelerometerDirection
   * @generated
   */
	public Adapter createAccelerometerDirectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.AccelerometerTemperature <em>Accelerometer Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.AccelerometerTemperature
   * @generated
   */
	public Adapter createAccelerometerTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.AccelerometerLed <em>Accelerometer Led</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.AccelerometerLed
   * @generated
   */
	public Adapter createAccelerometerLedAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletLaserRangeFinder <em>MBricklet Laser Range Finder</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletLaserRangeFinder
   * @generated
   */
	public Adapter createMBrickletLaserRangeFinderAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderDevice <em>Laser Range Finder Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderDevice
   * @generated
   */
	public Adapter createLaserRangeFinderDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderLaser <em>Laser Range Finder Laser</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderLaser
   * @generated
   */
	public Adapter createLaserRangeFinderLaserAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderDistance <em>Laser Range Finder Distance</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderDistance
   * @generated
   */
	public Adapter createLaserRangeFinderDistanceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderVelocity <em>Laser Range Finder Velocity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderVelocity
   * @generated
   */
	public Adapter createLaserRangeFinderVelocityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletLoadCell <em>MBricklet Load Cell</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletLoadCell
   * @generated
   */
	public Adapter createMBrickletLoadCellAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LoadCellDevice <em>Load Cell Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LoadCellDevice
   * @generated
   */
	public Adapter createLoadCellDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LoadCellWeight <em>Load Cell Weight</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LoadCellWeight
   * @generated
   */
	public Adapter createLoadCellWeightAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LoadCellLed <em>Load Cell Led</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LoadCellLed
   * @generated
   */
	public Adapter createLoadCellLedAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletColor <em>MBricklet Color</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletColor
   * @generated
   */
	public Adapter createMBrickletColorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.BrickletColorDevice <em>Bricklet Color Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.BrickletColorDevice
   * @generated
   */
	public Adapter createBrickletColorDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ColorColor <em>Color Color</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ColorColor
   * @generated
   */
	public Adapter createColorColorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ColorIlluminance <em>Color Illuminance</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ColorIlluminance
   * @generated
   */
	public Adapter createColorIlluminanceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ColorColorTemperature <em>Color Color Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ColorColorTemperature
   * @generated
   */
	public Adapter createColorColorTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ColorLed <em>Color Led</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ColorLed
   * @generated
   */
	public Adapter createColorLedAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DualButtonLed <em>Dual Button Led</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DualButtonLed
   * @generated
   */
	public Adapter createDualButtonLedAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletLinearPoti <em>MBricklet Linear Poti</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletLinearPoti
   * @generated
   */
	public Adapter createMBrickletLinearPotiAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletRotaryEncoder <em>MBricklet Rotary Encoder</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletRotaryEncoder
   * @generated
   */
	public Adapter createMBrickletRotaryEncoderAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RotaryEncoderDevice <em>Rotary Encoder Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RotaryEncoderDevice
   * @generated
   */
	public Adapter createRotaryEncoderDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RotaryEncoder <em>Rotary Encoder</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RotaryEncoder
   * @generated
   */
	public Adapter createRotaryEncoderAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RotaryEncoderButton <em>Rotary Encoder Button</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RotaryEncoderButton
   * @generated
   */
	public Adapter createRotaryEncoderButtonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletJoystick <em>MBricklet Joystick</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletJoystick
   * @generated
   */
	public Adapter createMBrickletJoystickAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.JoystickDevice <em>Joystick Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.JoystickDevice
   * @generated
   */
	public Adapter createJoystickDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.JoystickXPosition <em>Joystick XPosition</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.JoystickXPosition
   * @generated
   */
	public Adapter createJoystickXPositionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.JoystickYPosition <em>Joystick YPosition</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.JoystickYPosition
   * @generated
   */
	public Adapter createJoystickYPositionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.JoystickButton <em>Joystick Button</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.JoystickButton
   * @generated
   */
	public Adapter createJoystickButtonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogOutV2 <em>MBricklet Analog Out V2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogOutV2
   * @generated
   */
	public Adapter createMBrickletAnalogOutV2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickServo <em>MBrick Servo</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickServo
   * @generated
   */
	public Adapter createMBrickServoAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MServo <em>MServo</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MServo
   * @generated
   */
	public Adapter createMServoAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickDC <em>MBrick DC</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickDC
   * @generated
   */
	public Adapter createMBrickDCAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickStepper <em>MBrick Stepper</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickStepper
   * @generated
   */
	public Adapter createMBrickStepperAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFBrickStepperConfiguration <em>TF Brick Stepper Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFBrickStepperConfiguration
   * @generated
   */
	public Adapter createTFBrickStepperConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperDevice <em>MStepper Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperDevice
   * @generated
   */
	public Adapter createMStepperDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperDrive <em>MStepper Drive</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperDrive
   * @generated
   */
	public Adapter createMStepperDriveAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperVelocity <em>MStepper Velocity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperVelocity
   * @generated
   */
	public Adapter createMStepperVelocityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperCurrent <em>MStepper Current</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperCurrent
   * @generated
   */
	public Adapter createMStepperCurrentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperPosition <em>MStepper Position</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperPosition
   * @generated
   */
	public Adapter createMStepperPositionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperSteps <em>MStepper Steps</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperSteps
   * @generated
   */
	public Adapter createMStepperStepsAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperStackVoltage <em>MStepper Stack Voltage</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperStackVoltage
   * @generated
   */
	public Adapter createMStepperStackVoltageAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperExternalVoltage <em>MStepper External Voltage</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperExternalVoltage
   * @generated
   */
	public Adapter createMStepperExternalVoltageAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperConsumption <em>MStepper Consumption</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperConsumption
   * @generated
   */
	public Adapter createMStepperConsumptionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperUnderVoltage <em>MStepper Under Voltage</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperUnderVoltage
   * @generated
   */
	public Adapter createMStepperUnderVoltageAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperState <em>MStepper State</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperState
   * @generated
   */
	public Adapter createMStepperStateAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperChipTemperature <em>MStepper Chip Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperChipTemperature
   * @generated
   */
	public Adapter createMStepperChipTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MStepperStatusLed <em>MStepper Status Led</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MStepperStatusLed
   * @generated
   */
	public Adapter createMStepperStatusLedAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MDualRelayBricklet <em>MDual Relay Bricklet</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MDualRelayBricklet
   * @generated
   */
	public Adapter createMDualRelayBrickletAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MIndustrialQuadRelayBricklet <em>MIndustrial Quad Relay Bricklet</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MIndustrialQuadRelayBricklet
   * @generated
   */
	public Adapter createMIndustrialQuadRelayBrickletAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MIndustrialQuadRelay <em>MIndustrial Quad Relay</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MIndustrialQuadRelay
   * @generated
   */
	public Adapter createMIndustrialQuadRelayAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDigitalIn4 <em>MBricklet Industrial Digital In4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDigitalIn4
   * @generated
   */
	public Adapter createMBrickletIndustrialDigitalIn4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MIndustrialDigitalIn <em>MIndustrial Digital In</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MIndustrialDigitalIn
   * @generated
   */
	public Adapter createMIndustrialDigitalInAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDigitalOut4 <em>MBricklet Industrial Digital Out4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDigitalOut4
   * @generated
   */
	public Adapter createMBrickletIndustrialDigitalOut4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalActorDigitalOut4 <em>Digital Actor Digital Out4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DigitalActorDigitalOut4
   * @generated
   */
	public Adapter createDigitalActorDigitalOut4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletSegmentDisplay4x7 <em>MBricklet Segment Display4x7</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletSegmentDisplay4x7
   * @generated
   */
	public Adapter createMBrickletSegmentDisplay4x7Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletLEDStrip <em>MBricklet LED Strip</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletLEDStrip
   * @generated
   */
	public Adapter createMBrickletLEDStripAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LEDGroup <em>LED Group</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LEDGroup
   * @generated
   */
	public Adapter createLEDGroupAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalActorIO16 <em>Digital Actor IO16</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DigitalActorIO16
   * @generated
   */
	public Adapter createDigitalActorIO16Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIO16 <em>MBricklet IO16</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletIO16
   * @generated
   */
	public Adapter createMBrickletIO16Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor <em>Digital Sensor</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DigitalSensor
   * @generated
   */
	public Adapter createDigitalSensorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIO4 <em>MBricklet IO4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletIO4
   * @generated
   */
	public Adapter createMBrickletIO4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.IO4Device <em>IO4 Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.IO4Device
   * @generated
   */
	public Adapter createIO4DeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensorIO4 <em>Digital Sensor IO4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DigitalSensorIO4
   * @generated
   */
	public Adapter createDigitalSensorIO4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalActorIO4 <em>Digital Actor IO4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DigitalActorIO4
   * @generated
   */
	public Adapter createDigitalActorIO4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch <em>MBricklet Multi Touch</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch
   * @generated
   */
	public Adapter createMBrickletMultiTouchAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MultiTouchDevice <em>Multi Touch Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MultiTouchDevice
   * @generated
   */
	public Adapter createMultiTouchDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.Electrode <em>Electrode</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.Electrode
   * @generated
   */
	public Adapter createElectrodeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.Proximity <em>Proximity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.Proximity
   * @generated
   */
	public Adapter createProximityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMotionDetector <em>MBricklet Motion Detector</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletMotionDetector
   * @generated
   */
	public Adapter createMBrickletMotionDetectorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletHallEffect <em>MBricklet Hall Effect</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletHallEffect
   * @generated
   */
	public Adapter createMBrickletHallEffectAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MDualRelay <em>MDual Relay</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MDualRelay
   * @generated
   */
	public Adapter createMDualRelayAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletRemoteSwitch <em>MBricklet Remote Switch</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletRemoteSwitch
   * @generated
   */
	public Adapter createMBrickletRemoteSwitchAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitch <em>Remote Switch</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RemoteSwitch
   * @generated
   */
	public Adapter createRemoteSwitchAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchA <em>Remote Switch A</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchA
   * @generated
   */
	public Adapter createRemoteSwitchAAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchB <em>Remote Switch B</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchB
   * @generated
   */
	public Adapter createRemoteSwitchBAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchC <em>Remote Switch C</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchC
   * @generated
   */
	public Adapter createRemoteSwitchCAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletHumidity <em>MBricklet Humidity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletHumidity
   * @generated
   */
	public Adapter createMBrickletHumidityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletDistanceIR <em>MBricklet Distance IR</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletDistanceIR
   * @generated
   */
	public Adapter createMBrickletDistanceIRAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletSolidStateRelay <em>MBricklet Solid State Relay</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletSolidStateRelay
   * @generated
   */
	public Adapter createMBrickletSolidStateRelayAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDual020mA <em>MBricklet Industrial Dual020m A</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDual020mA
   * @generated
   */
	public Adapter createMBrickletIndustrialDual020mAAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.Dual020mADevice <em>Dual020m ADevice</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.Dual020mADevice
   * @generated
   */
	public Adapter createDual020mADeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletPTC <em>MBricklet PTC</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletPTC
   * @generated
   */
	public Adapter createMBrickletPTCAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.PTCDevice <em>PTC Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.PTCDevice
   * @generated
   */
	public Adapter createPTCDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.PTCTemperature <em>PTC Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.PTCTemperature
   * @generated
   */
	public Adapter createPTCTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.PTCResistance <em>PTC Resistance</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.PTCResistance
   * @generated
   */
	public Adapter createPTCResistanceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.PTCConnected <em>PTC Connected</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.PTCConnected
   * @generated
   */
	public Adapter createPTCConnectedAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletTemperature <em>MBricklet Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletTemperature
   * @generated
   */
	public Adapter createMBrickletTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletThermocouple <em>MBricklet Thermocouple</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletThermocouple
   * @generated
   */
	public Adapter createMBrickletThermocoupleAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletUVLight <em>MBricklet UV Light</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletUVLight
   * @generated
   */
	public Adapter createMBrickletUVLightAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletCO2 <em>MBricklet CO2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletCO2
   * @generated
   */
	public Adapter createMBrickletCO2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletTemperatureIR <em>MBricklet Temperature IR</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletTemperatureIR
   * @generated
   */
	public Adapter createMBrickletTemperatureIRAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MTemperatureIRDevice <em>MTemperature IR Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MTemperatureIRDevice
   * @generated
   */
	public Adapter createMTemperatureIRDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ObjectTemperature <em>Object Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ObjectTemperature
   * @generated
   */
	public Adapter createObjectTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.AmbientTemperature <em>Ambient Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.AmbientTemperature
   * @generated
   */
	public Adapter createAmbientTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletTilt <em>MBricklet Tilt</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletTilt
   * @generated
   */
	public Adapter createMBrickletTiltAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent <em>MBricklet Voltage Current</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent
   * @generated
   */
	public Adapter createMBrickletVoltageCurrentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.VoltageCurrentDevice <em>Voltage Current Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.VoltageCurrentDevice
   * @generated
   */
	public Adapter createVoltageCurrentDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.VCDeviceVoltage <em>VC Device Voltage</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.VCDeviceVoltage
   * @generated
   */
	public Adapter createVCDeviceVoltageAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.VCDeviceCurrent <em>VC Device Current</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.VCDeviceCurrent
   * @generated
   */
	public Adapter createVCDeviceCurrentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.VCDevicePower <em>VC Device Power</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.VCDevicePower
   * @generated
   */
	public Adapter createVCDevicePowerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletHumidityV2 <em>MBricklet Humidity V2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletHumidityV2
   * @generated
   */
	public Adapter createMBrickletHumidityV2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Device <em>MHumidity V2 Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Device
   * @generated
   */
	public Adapter createMHumidityV2DeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Temperature <em>MHumidity V2 Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Temperature
   * @generated
   */
	public Adapter createMHumidityV2TemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Humidity <em>MHumidity V2 Humidity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Humidity
   * @generated
   */
	public Adapter createMHumidityV2HumidityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletBarometer <em>MBricklet Barometer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletBarometer
   * @generated
   */
	public Adapter createMBrickletBarometerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBarometerTemperature <em>MBarometer Temperature</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBarometerTemperature
   * @generated
   */
	public Adapter createMBarometerTemperatureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAmbientLight <em>MBricklet Ambient Light</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletAmbientLight
   * @generated
   */
	public Adapter createMBrickletAmbientLightAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAmbientLightV2 <em>MBricklet Ambient Light V2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletAmbientLightV2
   * @generated
   */
	public Adapter createMBrickletAmbientLightV2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDualAnalogIn <em>MBricklet Industrial Dual Analog In</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDualAnalogIn
   * @generated
   */
	public Adapter createMBrickletIndustrialDualAnalogInAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.IndustrialDualAnalogInChannel <em>Industrial Dual Analog In Channel</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.IndustrialDualAnalogInChannel
   * @generated
   */
	public Adapter createIndustrialDualAnalogInChannelAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletSoundIntensity <em>MBricklet Sound Intensity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletSoundIntensity
   * @generated
   */
	public Adapter createMBrickletSoundIntensityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletDustDetector <em>MBricklet Dust Detector</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletDustDetector
   * @generated
   */
	public Adapter createMBrickletDustDetectorAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMoisture <em>MBricklet Moisture</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletMoisture
   * @generated
   */
	public Adapter createMBrickletMoistureAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogInV2 <em>MBricklet Analog In V2</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogInV2
   * @generated
   */
	public Adapter createMBrickletAnalogInV2Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogIn <em>MBricklet Analog In</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogIn
   * @generated
   */
	public Adapter createMBrickletAnalogInAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletDistanceUS <em>MBricklet Distance US</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletDistanceUS
   * @generated
   */
	public Adapter createMBrickletDistanceUSAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletLCD20x4 <em>MBricklet LCD2 0x4</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletLCD20x4
   * @generated
   */
	public Adapter createMBrickletLCD20x4Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.OLEDBricklet <em>OLED Bricklet</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.OLEDBricklet
   * @generated
   */
	public Adapter createOLEDBrickletAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletOLED128x64 <em>MBricklet OLED12 8x64</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletOLED128x64
   * @generated
   */
	public Adapter createMBrickletOLED128x64Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletOLE64x48 <em>MBricklet OLE6 4x48</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickletOLE64x48
   * @generated
   */
	public Adapter createMBrickletOLE64x48Adapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MLCD20x4Backlight <em>MLCD2 0x4 Backlight</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MLCD20x4Backlight
   * @generated
   */
	public Adapter createMLCD20x4BacklightAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MLCD20x4Button <em>MLCD2 0x4 Button</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MLCD20x4Button
   * @generated
   */
	public Adapter createMLCD20x4ButtonAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFConfig <em>TF Config</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFConfig
   * @generated
   */
	public Adapter createTFConfigAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.OHTFDevice <em>OHTF Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.OHTFDevice
   * @generated
   */
	public Adapter createOHTFDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.OHTFSubDeviceAdminDevice <em>OHTF Sub Device Admin Device</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.OHTFSubDeviceAdminDevice
   * @generated
   */
	public Adapter createOHTFSubDeviceAdminDeviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.OHConfig <em>OH Config</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.OHConfig
   * @generated
   */
	public Adapter createOHConfigAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFNullConfiguration <em>TF Null Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFNullConfiguration
   * @generated
   */
	public Adapter createTFNullConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFPTCBrickletConfiguration <em>TFPTC Bricklet Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFPTCBrickletConfiguration
   * @generated
   */
	public Adapter createTFPTCBrickletConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFIndustrialDual020mAConfiguration <em>TF Industrial Dual020m AConfiguration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFIndustrialDual020mAConfiguration
   * @generated
   */
	public Adapter createTFIndustrialDual020mAConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFBaseConfiguration <em>TF Base Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFBaseConfiguration
   * @generated
   */
	public Adapter createTFBaseConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LoadCellConfiguration <em>Load Cell Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LoadCellConfiguration
   * @generated
   */
	public Adapter createLoadCellConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration <em>Laser Range Finder Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration
   * @generated
   */
	public Adapter createLaserRangeFinderConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration <em>Humidity V2 Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration
   * @generated
   */
	public Adapter createHumidityV2ConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.AmbientLightV2Configuration <em>Ambient Light V2 Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.AmbientLightV2Configuration
   * @generated
   */
	public Adapter createAmbientLightV2ConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.BrickletIndustrialDualAnalogInConfiguration <em>Bricklet Industrial Dual Analog In Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.BrickletIndustrialDualAnalogInConfiguration
   * @generated
   */
	public Adapter createBrickletIndustrialDualAnalogInConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFTemperatureConfiguration <em>TF Temperature Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFTemperatureConfiguration
   * @generated
   */
	public Adapter createTFTemperatureConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFThermocoupleConfiguration <em>TF Thermocouple Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFThermocoupleConfiguration
   * @generated
   */
	public Adapter createTFThermocoupleConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFObjectTemperatureConfiguration <em>TF Object Temperature Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFObjectTemperatureConfiguration
   * @generated
   */
	public Adapter createTFObjectTemperatureConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFMoistureBrickletConfiguration <em>TF Moisture Bricklet Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFMoistureBrickletConfiguration
   * @generated
   */
	public Adapter createTFMoistureBrickletConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFAnalogInConfiguration <em>TF Analog In Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFAnalogInConfiguration
   * @generated
   */
	public Adapter createTFAnalogInConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFAnalogInV2Configuration <em>TF Analog In V2 Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFAnalogInV2Configuration
   * @generated
   */
	public Adapter createTFAnalogInV2ConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFDistanceUSBrickletConfiguration <em>TF Distance US Bricklet Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFDistanceUSBrickletConfiguration
   * @generated
   */
	public Adapter createTFDistanceUSBrickletConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFVoltageCurrentConfiguration <em>TF Voltage Current Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFVoltageCurrentConfiguration
   * @generated
   */
	public Adapter createTFVoltageCurrentConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFBrickDCConfiguration <em>TF Brick DC Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFBrickDCConfiguration
   * @generated
   */
	public Adapter createTFBrickDCConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFIOActorConfiguration <em>TFIO Actor Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFIOActorConfiguration
   * @generated
   */
	public Adapter createTFIOActorConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFInterruptListenerConfiguration <em>TF Interrupt Listener Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFInterruptListenerConfiguration
   * @generated
   */
	public Adapter createTFInterruptListenerConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFIOSensorConfiguration <em>TFIO Sensor Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFIOSensorConfiguration
   * @generated
   */
	public Adapter createTFIOSensorConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.TFServoConfiguration <em>TF Servo Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.TFServoConfiguration
   * @generated
   */
	public Adapter createTFServoConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.BrickletRemoteSwitchConfiguration <em>Bricklet Remote Switch Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.BrickletRemoteSwitchConfiguration
   * @generated
   */
	public Adapter createBrickletRemoteSwitchConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchAConfiguration <em>Remote Switch AConfiguration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchAConfiguration
   * @generated
   */
	public Adapter createRemoteSwitchAConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration <em>Remote Switch BConfiguration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration
   * @generated
   */
	public Adapter createRemoteSwitchBConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchCConfiguration <em>Remote Switch CConfiguration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchCConfiguration
   * @generated
   */
	public Adapter createRemoteSwitchCConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.MultiTouchDeviceConfiguration <em>Multi Touch Device Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.MultiTouchDeviceConfiguration
   * @generated
   */
	public Adapter createMultiTouchDeviceConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.BrickletMultiTouchConfiguration <em>Bricklet Multi Touch Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.BrickletMultiTouchConfiguration
   * @generated
   */
	public Adapter createBrickletMultiTouchConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DimmableConfiguration <em>Dimmable Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DimmableConfiguration
   * @generated
   */
	public Adapter createDimmableConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.ButtonConfiguration <em>Button Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.ButtonConfiguration
   * @generated
   */
	public Adapter createButtonConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.DualButtonLEDConfiguration <em>Dual Button LED Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.DualButtonLEDConfiguration
   * @generated
   */
	public Adapter createDualButtonLEDConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LEDStripConfiguration <em>LED Strip Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LEDStripConfiguration
   * @generated
   */
	public Adapter createLEDStripConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.LEDGroupConfiguration <em>LED Group Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.LEDGroupConfiguration
   * @generated
   */
	public Adapter createLEDGroupConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.BrickletColorConfiguration <em>Bricklet Color Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.BrickletColorConfiguration
   * @generated
   */
	public Adapter createBrickletColorConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.BrickletAccelerometerConfiguration <em>Bricklet Accelerometer Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.BrickletAccelerometerConfiguration
   * @generated
   */
	public Adapter createBrickletAccelerometerConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.m1theo.tinkerforge.emf.internal.model.BrickletOLEDConfiguration <em>Bricklet OLED Configuration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.m1theo.tinkerforge.emf.internal.model.BrickletOLEDConfiguration
   * @generated
   */
	public Adapter createBrickletOLEDConfigurationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //ModelAdapterFactory
