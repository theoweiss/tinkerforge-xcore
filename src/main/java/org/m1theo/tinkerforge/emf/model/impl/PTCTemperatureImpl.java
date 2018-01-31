/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 * Copyright (c) 2018, Thomas Weiss <theo@m1theo.org>.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.m1theo.tinkerforge.emf.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.m1theo.tinkerforge.emf.model.CallbackListener;
import org.m1theo.tinkerforge.emf.model.MBrickletPTC;
import org.m1theo.tinkerforge.emf.model.MSensor;
import org.m1theo.tinkerforge.emf.model.MSubDeviceHolder;
import org.m1theo.tinkerforge.emf.model.MTFConfigConsumer;
import org.m1theo.tinkerforge.emf.model.ModelPackage;
import org.m1theo.tinkerforge.emf.model.PTCTemperature;
import org.m1theo.tinkerforge.emf.model.TFBaseConfiguration;
import org.m1theo.tinkerforge.internal.LoggerConstants;
import org.m1theo.tinkerforge.internal.TinkerforgeErrorHandler;
import org.m1theo.tinkerforge.internal.tools.Tools;
import org.m1theo.tinkerforge.types.DecimalValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tinkerforge.BrickletPTC;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTC Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#isPoll <em>Poll</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getEnabledA <em>Enabled A</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getSubId <em>Sub Id</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getMbrick <em>Mbrick</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getSensorValue <em>Sensor Value</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getTfConfig <em>Tf Config</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getCallbackPeriod <em>Callback Period</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.PTCTemperatureImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTCTemperatureImpl extends MinimalEObjectImpl.Container implements PTCTemperature {
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
   * The default value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getSubId()
   * @generated
   * @ordered
   */
    protected static final String SUB_ID_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getSubId()
   * @generated
   * @ordered
   */
    protected String subId = SUB_ID_EDEFAULT;

    /**
   * The cached value of the '{@link #getSensorValue() <em>Sensor Value</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getSensorValue()
   * @generated
   * @ordered
   */
    protected DecimalValue sensorValue;

    /**
   * The cached value of the '{@link #getTfConfig() <em>Tf Config</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getTfConfig()
   * @generated
   * @ordered
   */
    protected TFBaseConfiguration tfConfig;

    /**
   * The default value of the '{@link #getCallbackPeriod() <em>Callback Period</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getCallbackPeriod()
   * @generated
   * @ordered
   */
    protected static final long CALLBACK_PERIOD_EDEFAULT = 1000L;

    /**
   * The cached value of the '{@link #getCallbackPeriod() <em>Callback Period</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getCallbackPeriod()
   * @generated
   * @ordered
   */
    protected long callbackPeriod = CALLBACK_PERIOD_EDEFAULT;

    /**
   * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDeviceType()
   * @generated
   * @ordered
   */
    protected static final String DEVICE_TYPE_EDEFAULT = "ptc_temperature";

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
   * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
    protected static final BigDecimal THRESHOLD_EDEFAULT = new BigDecimal("2");

    /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
    protected BigDecimal threshold = THRESHOLD_EDEFAULT;

    private BrickletPTC tinkerforgeDevice;

    private TemperatureListener listener;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected PTCTemperatureImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getPTCTemperature();
  }

				/**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public DecimalValue getSensorValue() {
    return sensorValue;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensorValue(DecimalValue newSensorValue) {
    DecimalValue oldSensorValue = sensorValue;
    sensorValue = newSensorValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__SENSOR_VALUE, oldSensorValue, sensorValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__LOGGER, oldLogger, logger));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__POLL, oldPoll, poll));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__ENABLED_A, oldEnabledA, enabledA));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String getSubId() {
    return subId;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setSubId(String newSubId) {
    String oldSubId = subId;
    subId = newSubId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__SUB_ID, oldSubId, subId));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public MBrickletPTC getMbrick() {
    if (eContainerFeatureID() != ModelPackage.PTC_TEMPERATURE__MBRICK) return null;
    return (MBrickletPTC)eContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public MBrickletPTC basicGetMbrick() {
    if (eContainerFeatureID() != ModelPackage.PTC_TEMPERATURE__MBRICK) return null;
    return (MBrickletPTC)eInternalContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetMbrick(MBrickletPTC newMbrick, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newMbrick, ModelPackage.PTC_TEMPERATURE__MBRICK, msgs);
    return msgs;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setMbrick(MBrickletPTC newMbrick) {
    if (newMbrick != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PTC_TEMPERATURE__MBRICK && newMbrick != null)) {
      if (EcoreUtil.isAncestor(this, newMbrick))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newMbrick != null)
        msgs = ((InternalEObject)newMbrick).eInverseAdd(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES, MSubDeviceHolder.class, msgs);
      msgs = basicSetMbrick(newMbrick, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__MBRICK, newMbrick, newMbrick));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public TFBaseConfiguration getTfConfig() {
    return tfConfig;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetTfConfig(TFBaseConfiguration newTfConfig, NotificationChain msgs) {
    TFBaseConfiguration oldTfConfig = tfConfig;
    tfConfig = newTfConfig;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__TF_CONFIG, oldTfConfig, newTfConfig);
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
    public void setTfConfig(TFBaseConfiguration newTfConfig) {
    if (newTfConfig != tfConfig) {
      NotificationChain msgs = null;
      if (tfConfig != null)
        msgs = ((InternalEObject)tfConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PTC_TEMPERATURE__TF_CONFIG, null, msgs);
      if (newTfConfig != null)
        msgs = ((InternalEObject)newTfConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PTC_TEMPERATURE__TF_CONFIG, null, msgs);
      msgs = basicSetTfConfig(newTfConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__TF_CONFIG, newTfConfig, newTfConfig));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public long getCallbackPeriod() {
    return callbackPeriod;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setCallbackPeriod(long newCallbackPeriod) {
    long oldCallbackPeriod = callbackPeriod;
    callbackPeriod = newCallbackPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__CALLBACK_PERIOD, oldCallbackPeriod, callbackPeriod));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public BigDecimal getThreshold() {
    return threshold;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setThreshold(BigDecimal newThreshold) {
    BigDecimal oldThreshold = threshold;
    threshold = newThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PTC_TEMPERATURE__THRESHOLD, oldThreshold, threshold));
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void init() {
        setEnabledA(new AtomicBoolean());
        logger = LoggerFactory.getLogger(PTCTemperatureImpl.class);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void enable() {
        tinkerforgeDevice = getMbrick().getTinkerforgeDevice();
        if (tfConfig != null) {
            if (tfConfig.eIsSet(tfConfig.eClass().getEStructuralFeature("threshold"))) {
                setThreshold(tfConfig.getThreshold());
            }
            if (tfConfig.eIsSet(tfConfig.eClass().getEStructuralFeature("callbackPeriod"))) {
                setCallbackPeriod(tfConfig.getCallbackPeriod());
            }
        }
        try {
            tinkerforgeDevice.setTemperatureCallbackPeriod(getCallbackPeriod());
            listener = new TemperatureListener();
            tinkerforgeDevice.addTemperatureListener(listener);
            fetchSensorValue();
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
    }

    private class TemperatureListener implements BrickletPTC.TemperatureListener {

        @Override
        public void temperature(int temperature) {
            DecimalValue value = Tools.calculate100(temperature);
            logger.trace("{} got new value {}", LoggerConstants.TFMODELUPDATE, value);
            if (value.compareTo(getSensorValue(), getThreshold()) != 0) {
                logger.trace("{} setting new value {}", LoggerConstants.TFMODELUPDATE, value);
                setSensorValue(value);
            } else {
                logger.trace("{} omitting new value {}", LoggerConstants.TFMODELUPDATE, value);
            }
        }

    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void disable() {
        if (listener != null) {
            tinkerforgeDevice.removeTemperatureListener(listener);
        }
        tinkerforgeDevice = null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void fetchSensorValue() {
        try {
            int temperature = tinkerforgeDevice.getTemperature();
            DecimalValue value = Tools.calculate100(temperature);
            setSensorValue(value);
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
    }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelPackage.PTC_TEMPERATURE__MBRICK:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMbrick((MBrickletPTC)otherEnd, msgs);
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
      case ModelPackage.PTC_TEMPERATURE__MBRICK:
        return basicSetMbrick(null, msgs);
      case ModelPackage.PTC_TEMPERATURE__TF_CONFIG:
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
      case ModelPackage.PTC_TEMPERATURE__MBRICK:
        return eInternalContainer().eInverseRemove(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES, MSubDeviceHolder.class, msgs);
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
      case ModelPackage.PTC_TEMPERATURE__LOGGER:
        return getLogger();
      case ModelPackage.PTC_TEMPERATURE__UID:
        return getUid();
      case ModelPackage.PTC_TEMPERATURE__POLL:
        return isPoll();
      case ModelPackage.PTC_TEMPERATURE__ENABLED_A:
        return getEnabledA();
      case ModelPackage.PTC_TEMPERATURE__SUB_ID:
        return getSubId();
      case ModelPackage.PTC_TEMPERATURE__MBRICK:
        if (resolve) return getMbrick();
        return basicGetMbrick();
      case ModelPackage.PTC_TEMPERATURE__SENSOR_VALUE:
        return getSensorValue();
      case ModelPackage.PTC_TEMPERATURE__TF_CONFIG:
        return getTfConfig();
      case ModelPackage.PTC_TEMPERATURE__CALLBACK_PERIOD:
        return getCallbackPeriod();
      case ModelPackage.PTC_TEMPERATURE__DEVICE_TYPE:
        return getDeviceType();
      case ModelPackage.PTC_TEMPERATURE__THRESHOLD:
        return getThreshold();
    }
    return super.eGet(featureID, resolve, coreType);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ModelPackage.PTC_TEMPERATURE__LOGGER:
        setLogger((Logger)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__UID:
        setUid((String)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__POLL:
        setPoll((Boolean)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__ENABLED_A:
        setEnabledA((AtomicBoolean)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__SUB_ID:
        setSubId((String)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__MBRICK:
        setMbrick((MBrickletPTC)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__SENSOR_VALUE:
        setSensorValue((DecimalValue)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__TF_CONFIG:
        setTfConfig((TFBaseConfiguration)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__CALLBACK_PERIOD:
        setCallbackPeriod((Long)newValue);
        return;
      case ModelPackage.PTC_TEMPERATURE__THRESHOLD:
        setThreshold((BigDecimal)newValue);
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
      case ModelPackage.PTC_TEMPERATURE__LOGGER:
        setLogger(LOGGER_EDEFAULT);
        return;
      case ModelPackage.PTC_TEMPERATURE__UID:
        setUid(UID_EDEFAULT);
        return;
      case ModelPackage.PTC_TEMPERATURE__POLL:
        setPoll(POLL_EDEFAULT);
        return;
      case ModelPackage.PTC_TEMPERATURE__ENABLED_A:
        setEnabledA(ENABLED_A_EDEFAULT);
        return;
      case ModelPackage.PTC_TEMPERATURE__SUB_ID:
        setSubId(SUB_ID_EDEFAULT);
        return;
      case ModelPackage.PTC_TEMPERATURE__MBRICK:
        setMbrick((MBrickletPTC)null);
        return;
      case ModelPackage.PTC_TEMPERATURE__SENSOR_VALUE:
        setSensorValue((DecimalValue)null);
        return;
      case ModelPackage.PTC_TEMPERATURE__TF_CONFIG:
        setTfConfig((TFBaseConfiguration)null);
        return;
      case ModelPackage.PTC_TEMPERATURE__CALLBACK_PERIOD:
        setCallbackPeriod(CALLBACK_PERIOD_EDEFAULT);
        return;
      case ModelPackage.PTC_TEMPERATURE__THRESHOLD:
        setThreshold(THRESHOLD_EDEFAULT);
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
      case ModelPackage.PTC_TEMPERATURE__LOGGER:
        return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
      case ModelPackage.PTC_TEMPERATURE__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case ModelPackage.PTC_TEMPERATURE__POLL:
        return poll != POLL_EDEFAULT;
      case ModelPackage.PTC_TEMPERATURE__ENABLED_A:
        return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
      case ModelPackage.PTC_TEMPERATURE__SUB_ID:
        return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
      case ModelPackage.PTC_TEMPERATURE__MBRICK:
        return basicGetMbrick() != null;
      case ModelPackage.PTC_TEMPERATURE__SENSOR_VALUE:
        return sensorValue != null;
      case ModelPackage.PTC_TEMPERATURE__TF_CONFIG:
        return tfConfig != null;
      case ModelPackage.PTC_TEMPERATURE__CALLBACK_PERIOD:
        return callbackPeriod != CALLBACK_PERIOD_EDEFAULT;
      case ModelPackage.PTC_TEMPERATURE__DEVICE_TYPE:
        return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
      case ModelPackage.PTC_TEMPERATURE__THRESHOLD:
        return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
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
    if (baseClass == MSensor.class) {
      switch (derivedFeatureID) {
        case ModelPackage.PTC_TEMPERATURE__SENSOR_VALUE: return ModelPackage.MSENSOR__SENSOR_VALUE;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (derivedFeatureID) {
        case ModelPackage.PTC_TEMPERATURE__TF_CONFIG: return ModelPackage.MTF_CONFIG_CONSUMER__TF_CONFIG;
        default: return -1;
      }
    }
    if (baseClass == CallbackListener.class) {
      switch (derivedFeatureID) {
        case ModelPackage.PTC_TEMPERATURE__CALLBACK_PERIOD: return ModelPackage.CALLBACK_LISTENER__CALLBACK_PERIOD;
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
    if (baseClass == MSensor.class) {
      switch (baseFeatureID) {
        case ModelPackage.MSENSOR__SENSOR_VALUE: return ModelPackage.PTC_TEMPERATURE__SENSOR_VALUE;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (baseFeatureID) {
        case ModelPackage.MTF_CONFIG_CONSUMER__TF_CONFIG: return ModelPackage.PTC_TEMPERATURE__TF_CONFIG;
        default: return -1;
      }
    }
    if (baseClass == CallbackListener.class) {
      switch (baseFeatureID) {
        case ModelPackage.CALLBACK_LISTENER__CALLBACK_PERIOD: return ModelPackage.PTC_TEMPERATURE__CALLBACK_PERIOD;
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
    if (baseClass == MSensor.class) {
      switch (baseOperationID) {
        case ModelPackage.MSENSOR___FETCH_SENSOR_VALUE: return ModelPackage.PTC_TEMPERATURE___FETCH_SENSOR_VALUE;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (baseOperationID) {
        default: return -1;
      }
    }
    if (baseClass == CallbackListener.class) {
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
      case ModelPackage.PTC_TEMPERATURE___FETCH_SENSOR_VALUE:
        fetchSensorValue();
        return null;
      case ModelPackage.PTC_TEMPERATURE___INIT:
        init();
        return null;
      case ModelPackage.PTC_TEMPERATURE___ENABLE:
        enable();
        return null;
      case ModelPackage.PTC_TEMPERATURE___DISABLE:
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
    result.append(", subId: ");
    result.append(subId);
    result.append(", sensorValue: ");
    result.append(sensorValue);
    result.append(", callbackPeriod: ");
    result.append(callbackPeriod);
    result.append(", deviceType: ");
    result.append(deviceType);
    result.append(", threshold: ");
    result.append(threshold);
    result.append(')');
    return result.toString();
  }

} // PTCTemperatureImpl