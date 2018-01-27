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
package org.m1theo.tinkerforge.emf.internal.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration;
import org.m1theo.tinkerforge.emf.internal.model.MBrickd;
import org.m1theo.tinkerforge.emf.internal.model.MBrickletHumidityV2;
import org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Device;
import org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Humidity;
import org.m1theo.tinkerforge.emf.internal.model.MHumidityV2Temperature;
import org.m1theo.tinkerforge.emf.internal.model.MSubDevice;
import org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder;
import org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer;
import org.m1theo.tinkerforge.emf.internal.model.ModelFactory;
import org.m1theo.tinkerforge.emf.internal.model.ModelPackage;
import org.m1theo.tinkerforge.internal.TinkerforgeErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tinkerforge.BrickletHumidityV2;
import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBricklet Humidity V2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#isPoll <em>Poll</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getEnabledA <em>Enabled A</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getTinkerforgeDevice <em>Tinkerforge Device</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getIpConnection <em>Ip Connection</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getConnectedUid <em>Connected Uid</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getBrickd <em>Brickd</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getMsubdevices <em>Msubdevices</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getTfConfig <em>Tf Config</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getHeaterConfiguration <em>Heater Configuration</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.MBrickletHumidityV2Impl#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBrickletHumidityV2Impl extends MinimalEObjectImpl.Container implements MBrickletHumidityV2 {
    /**
   * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getLogger()
   * @generated
   * @ordered
   */
    protected static final Logger LOGGER_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getLogger()
   * @generated
   * @ordered
   */
    protected Logger logger = LOGGER_EDEFAULT;

    /**
   * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
    protected static final String UID_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getUid()
   * @generated
   * @ordered
   */
    protected String uid = UID_EDEFAULT;

    /**
   * The default value of the '{@link #isPoll() <em>Poll</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #isPoll()
   * @generated
   * @ordered
   */
    protected static final boolean POLL_EDEFAULT = true;

    /**
   * The cached value of the '{@link #isPoll() <em>Poll</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #isPoll()
   * @generated
   * @ordered
   */
    protected boolean poll = POLL_EDEFAULT;

    /**
   * The default value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getEnabledA()
   * @generated
   * @ordered
   */
    protected static final AtomicBoolean ENABLED_A_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getEnabledA()
   * @generated
   * @ordered
   */
    protected AtomicBoolean enabledA = ENABLED_A_EDEFAULT;

    /**
   * The cached value of the '{@link #getTinkerforgeDevice() <em>Tinkerforge Device</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getTinkerforgeDevice()
   * @generated
   * @ordered
   */
    protected BrickletHumidityV2 tinkerforgeDevice;

    /**
   * The default value of the '{@link #getIpConnection() <em>Ip Connection</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getIpConnection()
   * @generated
   * @ordered
   */
    protected static final IPConnection IP_CONNECTION_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getIpConnection() <em>Ip Connection</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getIpConnection()
   * @generated
   * @ordered
   */
    protected IPConnection ipConnection = IP_CONNECTION_EDEFAULT;

    /**
   * The default value of the '{@link #getConnectedUid() <em>Connected Uid</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getConnectedUid()
   * @generated
   * @ordered
   */
    protected static final String CONNECTED_UID_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getConnectedUid() <em>Connected Uid</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getConnectedUid()
   * @generated
   * @ordered
   */
    protected String connectedUid = CONNECTED_UID_EDEFAULT;

    /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
    protected static final char POSITION_EDEFAULT = '\u0000';

    /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
    protected char position = POSITION_EDEFAULT;

    /**
   * The default value of the '{@link #getDeviceIdentifier() <em>Device Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDeviceIdentifier()
   * @generated
   * @ordered
   */
    protected static final int DEVICE_IDENTIFIER_EDEFAULT = 0;

    /**
   * The cached value of the '{@link #getDeviceIdentifier() <em>Device Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDeviceIdentifier()
   * @generated
   * @ordered
   */
    protected int deviceIdentifier = DEVICE_IDENTIFIER_EDEFAULT;

    /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
    protected static final String NAME_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
    protected String name = NAME_EDEFAULT;

    /**
   * The cached value of the '{@link #getMsubdevices() <em>Msubdevices</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getMsubdevices()
   * @generated
   * @ordered
   */
    protected EList<MHumidityV2Device> msubdevices;

    /**
   * The cached value of the '{@link #getTfConfig() <em>Tf Config</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getTfConfig()
   * @generated
   * @ordered
   */
    protected HumidityV2Configuration tfConfig;

    /**
   * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDeviceType()
   * @generated
   * @ordered
   */
    protected static final String DEVICE_TYPE_EDEFAULT = "bricklet_humidityV2";

    /**
   * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDeviceType()
   * @generated
   * @ordered
   */
    protected String deviceType = DEVICE_TYPE_EDEFAULT;

    /**
   * The default value of the '{@link #getHeaterConfiguration() <em>Heater Configuration</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getHeaterConfiguration()
   * @generated
   * @ordered
   */
    protected static final int HEATER_CONFIGURATION_EDEFAULT = 0;

    /**
   * The cached value of the '{@link #getHeaterConfiguration() <em>Heater Configuration</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getHeaterConfiguration()
   * @generated
   * @ordered
   */
    protected int heaterConfiguration = HEATER_CONFIGURATION_EDEFAULT;

    /**
   * The default value of the '{@link #getMovingAverageLengthHumidity() <em>Moving Average Length Humidity</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getMovingAverageLengthHumidity()
   * @generated
   * @ordered
   */
    protected static final int MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT = 100;

    /**
   * The cached value of the '{@link #getMovingAverageLengthHumidity() <em>Moving Average Length Humidity</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getMovingAverageLengthHumidity()
   * @generated
   * @ordered
   */
    protected int movingAverageLengthHumidity = MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT;

    /**
   * The default value of the '{@link #getMovingAverageLengthTemperature() <em>Moving Average Length Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getMovingAverageLengthTemperature()
   * @generated
   * @ordered
   */
    protected static final int MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT = 100;

    /**
   * The cached value of the '{@link #getMovingAverageLengthTemperature() <em>Moving Average Length Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getMovingAverageLengthTemperature()
   * @generated
   * @ordered
   */
    protected int movingAverageLengthTemperature = MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected MBrickletHumidityV2Impl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getMBrickletHumidityV2();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Logger getLogger() {
    return logger;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setLogger(Logger newLogger) {
    Logger oldLogger = logger;
    logger = newLogger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__LOGGER, oldLogger, logger));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String getUid() {
    return uid;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setUid(String newUid) {
    String oldUid = uid;
    uid = newUid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__UID, oldUid, uid));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public boolean isPoll() {
    return poll;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setPoll(boolean newPoll) {
    boolean oldPoll = poll;
    poll = newPoll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__POLL, oldPoll, poll));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public AtomicBoolean getEnabledA() {
    return enabledA;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setEnabledA(AtomicBoolean newEnabledA) {
    AtomicBoolean oldEnabledA = enabledA;
    enabledA = newEnabledA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__ENABLED_A, oldEnabledA, enabledA));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public BrickletHumidityV2 getTinkerforgeDevice() {
    return tinkerforgeDevice;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setTinkerforgeDevice(BrickletHumidityV2 newTinkerforgeDevice) {
    BrickletHumidityV2 oldTinkerforgeDevice = tinkerforgeDevice;
    tinkerforgeDevice = newTinkerforgeDevice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__TINKERFORGE_DEVICE, oldTinkerforgeDevice, tinkerforgeDevice));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public IPConnection getIpConnection() {
    return ipConnection;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setIpConnection(IPConnection newIpConnection) {
    IPConnection oldIpConnection = ipConnection;
    ipConnection = newIpConnection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__IP_CONNECTION, oldIpConnection, ipConnection));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String getConnectedUid() {
    return connectedUid;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setConnectedUid(String newConnectedUid) {
    String oldConnectedUid = connectedUid;
    connectedUid = newConnectedUid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__CONNECTED_UID, oldConnectedUid, connectedUid));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public char getPosition() {
    return position;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setPosition(char newPosition) {
    char oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__POSITION, oldPosition, position));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int getDeviceIdentifier() {
    return deviceIdentifier;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setDeviceIdentifier(int newDeviceIdentifier) {
    int oldDeviceIdentifier = deviceIdentifier;
    deviceIdentifier = newDeviceIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__DEVICE_IDENTIFIER, oldDeviceIdentifier, deviceIdentifier));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String getName() {
    return name;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__NAME, oldName, name));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public MBrickd getBrickd() {
    if (eContainerFeatureID() != ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD) return null;
    return (MBrickd)eContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public MBrickd basicGetBrickd() {
    if (eContainerFeatureID() != ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD) return null;
    return (MBrickd)eInternalContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetBrickd(MBrickd newBrickd, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newBrickd, ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD, msgs);
    return msgs;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setBrickd(MBrickd newBrickd) {
    if (newBrickd != eInternalContainer() || (eContainerFeatureID() != ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD && newBrickd != null)) {
      if (EcoreUtil.isAncestor(this, newBrickd))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newBrickd != null)
        msgs = ((InternalEObject)newBrickd).eInverseAdd(this, ModelPackage.MBRICKD__MDEVICES, MBrickd.class, msgs);
      msgs = basicSetBrickd(newBrickd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD, newBrickd, newBrickd));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public EList<MHumidityV2Device> getMsubdevices() {
    if (msubdevices == null) {
      msubdevices = new EObjectContainmentWithInverseEList<MHumidityV2Device>(MHumidityV2Device.class, this, ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES, ModelPackage.MSUB_DEVICE__MBRICK) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return MSubDevice.class; } };
    }
    return msubdevices;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public HumidityV2Configuration getTfConfig() {
    return tfConfig;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetTfConfig(HumidityV2Configuration newTfConfig, NotificationChain msgs) {
    HumidityV2Configuration oldTfConfig = tfConfig;
    tfConfig = newTfConfig;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG, oldTfConfig, newTfConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setTfConfig(HumidityV2Configuration newTfConfig) {
    if (newTfConfig != tfConfig) {
      NotificationChain msgs = null;
      if (tfConfig != null)
        msgs = ((InternalEObject)tfConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG, null, msgs);
      if (newTfConfig != null)
        msgs = ((InternalEObject)newTfConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG, null, msgs);
      msgs = basicSetTfConfig(newTfConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG, newTfConfig, newTfConfig));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String getDeviceType() {
    return deviceType;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int getHeaterConfiguration() {
    return heaterConfiguration;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setHeaterConfiguration(int newHeaterConfiguration) {
    int oldHeaterConfiguration = heaterConfiguration;
    heaterConfiguration = newHeaterConfiguration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__HEATER_CONFIGURATION, oldHeaterConfiguration, heaterConfiguration));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int getMovingAverageLengthHumidity() {
    return movingAverageLengthHumidity;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setMovingAverageLengthHumidity(int newMovingAverageLengthHumidity) {
    int oldMovingAverageLengthHumidity = movingAverageLengthHumidity;
    movingAverageLengthHumidity = newMovingAverageLengthHumidity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_HUMIDITY, oldMovingAverageLengthHumidity, movingAverageLengthHumidity));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int getMovingAverageLengthTemperature() {
    return movingAverageLengthTemperature;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setMovingAverageLengthTemperature(int newMovingAverageLengthTemperature) {
    int oldMovingAverageLengthTemperature = movingAverageLengthTemperature;
    movingAverageLengthTemperature = newMovingAverageLengthTemperature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_TEMPERATURE, oldMovingAverageLengthTemperature, movingAverageLengthTemperature));
  }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void initSubDevices() {
        ModelFactory factory = ModelFactory.eINSTANCE;
        MHumidityV2Humidity humidity = factory.createMHumidityV2Humidity();
        humidity.setUid(getUid());
        humidity.setSubId("humidity");
        humidity.init();
        humidity.setMbrick(this);

        MHumidityV2Temperature temperature = factory.createMHumidityV2Temperature();
        temperature.setUid(getUid());
        temperature.setSubId("temperature");
        temperature.init();
        temperature.setMbrick(this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void init() {
        setEnabledA(new AtomicBoolean());
        logger = LoggerFactory.getLogger(MBrickletHumidityV2Impl.class);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void enable() {
        if (tfConfig != null) {
            if (tfConfig.eIsSet(tfConfig.eClass().getEStructuralFeature("heaterConfiguration"))) {
                int heaterConfiguration = tfConfig.getHeaterConfiguration();
                logger.debug("heaterConfiguration {}", heaterConfiguration);
                setHeaterConfiguration(heaterConfiguration);
            }
            if (tfConfig.eIsSet(tfConfig.eClass().getEStructuralFeature("movingAverageLengthHumidity"))) {
                int movingAverageLengthHumidity = tfConfig.getMovingAverageLengthHumidity();
                logger.debug("movingAverageLengthHumidity {}", movingAverageLengthHumidity);
                setMovingAverageLengthHumidity(movingAverageLengthHumidity);
            }
            if (tfConfig.eIsSet(tfConfig.eClass().getEStructuralFeature("movingAverageLengthTemperature"))) {
                int movingAverageLengthTemperature = tfConfig.getMovingAverageLengthTemperature();
                logger.debug("movingAverageLengthTemperature {}", movingAverageLengthTemperature);
                setMovingAverageLengthTemperature(movingAverageLengthTemperature);
            }
        }
        try {
            tinkerforgeDevice = new BrickletHumidityV2(getUid(), getIpConnection());
            tinkerforgeDevice.setHeaterConfiguration(getHeaterConfiguration());
            tinkerforgeDevice.setMovingAverageConfiguration(getMovingAverageLengthHumidity(),
                    getMovingAverageLengthTemperature());
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void disable() {
        tinkerforgeDevice = null;
    }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetBrickd((MBrickd)otherEnd, msgs);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getMsubdevices()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD:
        return basicSetBrickd(null, msgs);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES:
        return ((InternalEList<?>)getMsubdevices()).basicRemove(otherEnd, msgs);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG:
        return basicSetTfConfig(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD:
        return eInternalContainer().eInverseRemove(this, ModelPackage.MBRICKD__MDEVICES, MBrickd.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2__LOGGER:
        return getLogger();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__UID:
        return getUid();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POLL:
        return isPoll();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__ENABLED_A:
        return getEnabledA();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TINKERFORGE_DEVICE:
        return getTinkerforgeDevice();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__IP_CONNECTION:
        return getIpConnection();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__CONNECTED_UID:
        return getConnectedUid();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POSITION:
        return getPosition();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__DEVICE_IDENTIFIER:
        return getDeviceIdentifier();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__NAME:
        return getName();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD:
        if (resolve) return getBrickd();
        return basicGetBrickd();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES:
        return getMsubdevices();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG:
        return getTfConfig();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__DEVICE_TYPE:
        return getDeviceType();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__HEATER_CONFIGURATION:
        return getHeaterConfiguration();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_HUMIDITY:
        return getMovingAverageLengthHumidity();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_TEMPERATURE:
        return getMovingAverageLengthTemperature();
    }
    return super.eGet(featureID, resolve, coreType);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2__LOGGER:
        setLogger((Logger)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__UID:
        setUid((String)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POLL:
        setPoll((Boolean)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__ENABLED_A:
        setEnabledA((AtomicBoolean)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TINKERFORGE_DEVICE:
        setTinkerforgeDevice((BrickletHumidityV2)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__IP_CONNECTION:
        setIpConnection((IPConnection)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__CONNECTED_UID:
        setConnectedUid((String)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POSITION:
        setPosition((Character)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__DEVICE_IDENTIFIER:
        setDeviceIdentifier((Integer)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD:
        setBrickd((MBrickd)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES:
        getMsubdevices().clear();
        getMsubdevices().addAll((Collection<? extends MHumidityV2Device>)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG:
        setTfConfig((HumidityV2Configuration)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__HEATER_CONFIGURATION:
        setHeaterConfiguration((Integer)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_HUMIDITY:
        setMovingAverageLengthHumidity((Integer)newValue);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_TEMPERATURE:
        setMovingAverageLengthTemperature((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void eUnset(int featureID) {
    switch (featureID) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2__LOGGER:
        setLogger(LOGGER_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__UID:
        setUid(UID_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POLL:
        setPoll(POLL_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__ENABLED_A:
        setEnabledA(ENABLED_A_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TINKERFORGE_DEVICE:
        setTinkerforgeDevice((BrickletHumidityV2)null);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__IP_CONNECTION:
        setIpConnection(IP_CONNECTION_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__CONNECTED_UID:
        setConnectedUid(CONNECTED_UID_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__DEVICE_IDENTIFIER:
        setDeviceIdentifier(DEVICE_IDENTIFIER_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD:
        setBrickd((MBrickd)null);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES:
        getMsubdevices().clear();
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG:
        setTfConfig((HumidityV2Configuration)null);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__HEATER_CONFIGURATION:
        setHeaterConfiguration(HEATER_CONFIGURATION_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_HUMIDITY:
        setMovingAverageLengthHumidity(MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT);
        return;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_TEMPERATURE:
        setMovingAverageLengthTemperature(MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public boolean eIsSet(int featureID) {
    switch (featureID) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2__LOGGER:
        return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POLL:
        return poll != POLL_EDEFAULT;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__ENABLED_A:
        return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TINKERFORGE_DEVICE:
        return tinkerforgeDevice != null;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__IP_CONNECTION:
        return IP_CONNECTION_EDEFAULT == null ? ipConnection != null : !IP_CONNECTION_EDEFAULT.equals(ipConnection);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__CONNECTED_UID:
        return CONNECTED_UID_EDEFAULT == null ? connectedUid != null : !CONNECTED_UID_EDEFAULT.equals(connectedUid);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__POSITION:
        return position != POSITION_EDEFAULT;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__DEVICE_IDENTIFIER:
        return deviceIdentifier != DEVICE_IDENTIFIER_EDEFAULT;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__BRICKD:
        return basicGetBrickd() != null;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES:
        return msubdevices != null && !msubdevices.isEmpty();
      case ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG:
        return tfConfig != null;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__DEVICE_TYPE:
        return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
      case ModelPackage.MBRICKLET_HUMIDITY_V2__HEATER_CONFIGURATION:
        return heaterConfiguration != HEATER_CONFIGURATION_EDEFAULT;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_HUMIDITY:
        return movingAverageLengthHumidity != MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT;
      case ModelPackage.MBRICKLET_HUMIDITY_V2__MOVING_AVERAGE_LENGTH_TEMPERATURE:
        return movingAverageLengthTemperature != MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == MSubDeviceHolder.class) {
      switch (derivedFeatureID) {
        case ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES: return ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (derivedFeatureID) {
        case ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG: return ModelPackage.MTF_CONFIG_CONSUMER__TF_CONFIG;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == MSubDeviceHolder.class) {
      switch (baseFeatureID) {
        case ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES: return ModelPackage.MBRICKLET_HUMIDITY_V2__MSUBDEVICES;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (baseFeatureID) {
        case ModelPackage.MTF_CONFIG_CONSUMER__TF_CONFIG: return ModelPackage.MBRICKLET_HUMIDITY_V2__TF_CONFIG;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
    if (baseClass == MSubDeviceHolder.class) {
      switch (baseOperationID) {
        case ModelPackage.MSUB_DEVICE_HOLDER___INIT_SUB_DEVICES: return ModelPackage.MBRICKLET_HUMIDITY_V2___INIT_SUB_DEVICES;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (baseOperationID) {
        default: return -1;
      }
    }
    return super.eDerivedOperationID(baseOperationID, baseClass);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case ModelPackage.MBRICKLET_HUMIDITY_V2___INIT_SUB_DEVICES:
        initSubDevices();
        return null;
      case ModelPackage.MBRICKLET_HUMIDITY_V2___INIT:
        init();
        return null;
      case ModelPackage.MBRICKLET_HUMIDITY_V2___ENABLE:
        enable();
        return null;
      case ModelPackage.MBRICKLET_HUMIDITY_V2___DISABLE:
        disable();
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (logger: ");
    result.append(logger);
    result.append(", uid: ");
    result.append(uid);
    result.append(", poll: ");
    result.append(poll);
    result.append(", enabledA: ");
    result.append(enabledA);
    result.append(", tinkerforgeDevice: ");
    result.append(tinkerforgeDevice);
    result.append(", ipConnection: ");
    result.append(ipConnection);
    result.append(", connectedUid: ");
    result.append(connectedUid);
    result.append(", position: ");
    result.append(position);
    result.append(", deviceIdentifier: ");
    result.append(deviceIdentifier);
    result.append(", name: ");
    result.append(name);
    result.append(", deviceType: ");
    result.append(deviceType);
    result.append(", heaterConfiguration: ");
    result.append(heaterConfiguration);
    result.append(", movingAverageLengthHumidity: ");
    result.append(movingAverageLengthHumidity);
    result.append(", movingAverageLengthTemperature: ");
    result.append(movingAverageLengthTemperature);
    result.append(')');
    return result.toString();
  }

} // MBrickletHumidityV2Impl
