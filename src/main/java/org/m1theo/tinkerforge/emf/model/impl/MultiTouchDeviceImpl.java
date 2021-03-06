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
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.m1theo.tinkerforge.emf.model.MBrickletMultiTouch;
import org.m1theo.tinkerforge.emf.model.MSensor;
import org.m1theo.tinkerforge.emf.model.MSubDeviceHolder;
import org.m1theo.tinkerforge.emf.model.MTFConfigConsumer;
import org.m1theo.tinkerforge.emf.model.ModelPackage;
import org.m1theo.tinkerforge.emf.model.MultiTouchDevice;
import org.m1theo.tinkerforge.emf.model.MultiTouchDeviceConfiguration;
import org.m1theo.tinkerforge.internal.LoggerConstants;
import org.m1theo.tinkerforge.internal.TinkerforgeErrorHandler;
import org.m1theo.tinkerforge.types.HighLowValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tinkerforge.BrickletMultiTouch;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Touch Device</b></em>'.
 *
 * @author Theo Weiss
 * @since 1.5.0
 *        <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#isPoll <em>Poll</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getEnabledA <em>Enabled A</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getSubId <em>Sub Id</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getMbrick <em>Mbrick</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getSensorValue <em>Sensor Value</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getTfConfig <em>Tf Config</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MultiTouchDeviceImpl#getDisableElectrode <em>Disable Electrode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiTouchDeviceImpl extends MinimalEObjectImpl.Container implements MultiTouchDevice {
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
    protected HighLowValue sensorValue;

    /**
   * The cached value of the '{@link #getTfConfig() <em>Tf Config</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getTfConfig()
   * @generated
   * @ordered
   */
    protected MultiTouchDeviceConfiguration tfConfig;

    /**
   * The default value of the '{@link #getPin() <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getPin()
   * @generated
   * @ordered
   */
    protected static final int PIN_EDEFAULT = 0;

    /**
   * The cached value of the '{@link #getPin() <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getPin()
   * @generated
   * @ordered
   */
    protected int pin = PIN_EDEFAULT;

    /**
   * The default value of the '{@link #getDisableElectrode() <em>Disable Electrode</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDisableElectrode()
   * @generated
   * @ordered
   */
    protected static final Boolean DISABLE_ELECTRODE_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getDisableElectrode() <em>Disable Electrode</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDisableElectrode()
   * @generated
   * @ordered
   */
    protected Boolean disableElectrode = DISABLE_ELECTRODE_EDEFAULT;

    private int mask;

    private TouchListener touchListener;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected MultiTouchDeviceImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getMultiTouchDevice();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__LOGGER, oldLogger, logger));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__POLL, oldPoll, poll));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__ENABLED_A, oldEnabledA, enabledA));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__SUB_ID, oldSubId, subId));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public MBrickletMultiTouch getMbrick() {
    if (eContainerFeatureID() != ModelPackage.MULTI_TOUCH_DEVICE__MBRICK) return null;
    return (MBrickletMultiTouch)eContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public MBrickletMultiTouch basicGetMbrick() {
    if (eContainerFeatureID() != ModelPackage.MULTI_TOUCH_DEVICE__MBRICK) return null;
    return (MBrickletMultiTouch)eInternalContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetMbrick(MBrickletMultiTouch newMbrick, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newMbrick, ModelPackage.MULTI_TOUCH_DEVICE__MBRICK, msgs);
    return msgs;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setMbrick(MBrickletMultiTouch newMbrick) {
    if (newMbrick != eInternalContainer() || (eContainerFeatureID() != ModelPackage.MULTI_TOUCH_DEVICE__MBRICK && newMbrick != null)) {
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__MBRICK, newMbrick, newMbrick));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public HighLowValue getSensorValue() {
    return sensorValue;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSensorValue(HighLowValue newSensorValue) {
    HighLowValue oldSensorValue = sensorValue;
    sensorValue = newSensorValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__SENSOR_VALUE, oldSensorValue, sensorValue));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public MultiTouchDeviceConfiguration getTfConfig() {
    return tfConfig;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetTfConfig(MultiTouchDeviceConfiguration newTfConfig, NotificationChain msgs) {
    MultiTouchDeviceConfiguration oldTfConfig = tfConfig;
    tfConfig = newTfConfig;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG, oldTfConfig, newTfConfig);
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
    public void setTfConfig(MultiTouchDeviceConfiguration newTfConfig) {
    if (newTfConfig != tfConfig) {
      NotificationChain msgs = null;
      if (tfConfig != null)
        msgs = ((InternalEObject)tfConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG, null, msgs);
      if (newTfConfig != null)
        msgs = ((InternalEObject)newTfConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG, null, msgs);
      msgs = basicSetTfConfig(newTfConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG, newTfConfig, newTfConfig));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int getPin() {
    return pin;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setPin(int newPin) {
    int oldPin = pin;
    pin = newPin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__PIN, oldPin, pin));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Boolean getDisableElectrode() {
    return disableElectrode;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setDisableElectrode(Boolean newDisableElectrode) {
    Boolean oldDisableElectrode = disableElectrode;
    disableElectrode = newDisableElectrode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE, oldDisableElectrode, disableElectrode));
  }

    /**
     *
     * @generated NOT
     */
    private HighLowValue extractValue(int state) {
        HighLowValue value = HighLowValue.UNDEF;
        if ((state & mask) == mask) {
            value = HighLowValue.HIGH;
        } else {
            value = HighLowValue.LOW;
        }
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void fetchSensorValue() {
        HighLowValue value = HighLowValue.UNDEF;
        try {
            value = extractValue(getMbrick().getTinkerforgeDevice().getTouchState());
            setSensorValue(value);
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void init() {
        setEnabledA(new AtomicBoolean());
        logger = LoggerFactory.getLogger(MultiTouchDeviceImpl.class);
        mask = 0000000000001 << getPin();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void enable() {
        if (tfConfig != null) {
            if (tfConfig.eIsSet(tfConfig.eClass().getEStructuralFeature("disableElectrode"))) {
                if (tfConfig.getDisableElectrode()) {
                    logger.debug("{} MultiTouchDevice uid {} subid {} disable electrode {}", LoggerConstants.TFINIT,
                            getUid(), getSubId(), getPin());
                    setDisableElectrode(true);
                }
            }
        }
        MBrickletMultiTouch bricklet = getMbrick();
        if (bricklet == null) {
            logger.error("{} No bricklet found for MultiTouchDevice: {}:{} ", LoggerConstants.TFINIT, getUid(), subId);
        } else {
            try {
                BrickletMultiTouch brickletMultiTouch = bricklet.getTinkerforgeDevice();
                if (getDisableElectrode() != null && getDisableElectrode()) {
                    logger.debug("{} MultiTouchDevice uid {} subid {} disabling electrode {}", LoggerConstants.TFINIT,
                            getUid(), getSubId(), getPin());
                    getEnabledA().set(false);
                    int electrodeConfig = brickletMultiTouch.getElectrodeConfig();
                    electrodeConfig &= ~mask;
                    brickletMultiTouch.setElectrodeConfig(electrodeConfig);
                    return;
                }
                setSensorValue(HighLowValue.UNDEF);
                touchListener = new TouchListener();
                brickletMultiTouch.addTouchStateListener(touchListener);
                fetchSensorValue();

            } catch (TimeoutException e) {
                TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
            } catch (NotConnectedException e) {
                TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
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
        if (touchListener != null) {
            getMbrick().getTinkerforgeDevice().removeTouchStateListener(touchListener);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    private class TouchListener implements BrickletMultiTouch.TouchStateListener {
        @Override
        public void touchState(int state) {
            HighLowValue new_state = extractValue(state);
            if (new_state != getSensorValue()) {
                logger.debug("{} TouchListener updating state for {}:{}", LoggerConstants.TFMODELUPDATE, getUid(),
                        getSubId());
                setSensorValue(extractValue(state));
            }
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
      case ModelPackage.MULTI_TOUCH_DEVICE__MBRICK:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMbrick((MBrickletMultiTouch)otherEnd, msgs);
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
      case ModelPackage.MULTI_TOUCH_DEVICE__MBRICK:
        return basicSetMbrick(null, msgs);
      case ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG:
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
      case ModelPackage.MULTI_TOUCH_DEVICE__MBRICK:
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
      case ModelPackage.MULTI_TOUCH_DEVICE__LOGGER:
        return getLogger();
      case ModelPackage.MULTI_TOUCH_DEVICE__UID:
        return getUid();
      case ModelPackage.MULTI_TOUCH_DEVICE__POLL:
        return isPoll();
      case ModelPackage.MULTI_TOUCH_DEVICE__ENABLED_A:
        return getEnabledA();
      case ModelPackage.MULTI_TOUCH_DEVICE__SUB_ID:
        return getSubId();
      case ModelPackage.MULTI_TOUCH_DEVICE__MBRICK:
        if (resolve) return getMbrick();
        return basicGetMbrick();
      case ModelPackage.MULTI_TOUCH_DEVICE__SENSOR_VALUE:
        return getSensorValue();
      case ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG:
        return getTfConfig();
      case ModelPackage.MULTI_TOUCH_DEVICE__PIN:
        return getPin();
      case ModelPackage.MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE:
        return getDisableElectrode();
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
      case ModelPackage.MULTI_TOUCH_DEVICE__LOGGER:
        setLogger((Logger)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__UID:
        setUid((String)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__POLL:
        setPoll((Boolean)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__ENABLED_A:
        setEnabledA((AtomicBoolean)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__SUB_ID:
        setSubId((String)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__MBRICK:
        setMbrick((MBrickletMultiTouch)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__SENSOR_VALUE:
        setSensorValue((HighLowValue)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG:
        setTfConfig((MultiTouchDeviceConfiguration)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__PIN:
        setPin((Integer)newValue);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE:
        setDisableElectrode((Boolean)newValue);
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
      case ModelPackage.MULTI_TOUCH_DEVICE__LOGGER:
        setLogger(LOGGER_EDEFAULT);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__UID:
        setUid(UID_EDEFAULT);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__POLL:
        setPoll(POLL_EDEFAULT);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__ENABLED_A:
        setEnabledA(ENABLED_A_EDEFAULT);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__SUB_ID:
        setSubId(SUB_ID_EDEFAULT);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__MBRICK:
        setMbrick((MBrickletMultiTouch)null);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__SENSOR_VALUE:
        setSensorValue((HighLowValue)null);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG:
        setTfConfig((MultiTouchDeviceConfiguration)null);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__PIN:
        setPin(PIN_EDEFAULT);
        return;
      case ModelPackage.MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE:
        setDisableElectrode(DISABLE_ELECTRODE_EDEFAULT);
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
      case ModelPackage.MULTI_TOUCH_DEVICE__LOGGER:
        return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
      case ModelPackage.MULTI_TOUCH_DEVICE__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case ModelPackage.MULTI_TOUCH_DEVICE__POLL:
        return poll != POLL_EDEFAULT;
      case ModelPackage.MULTI_TOUCH_DEVICE__ENABLED_A:
        return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
      case ModelPackage.MULTI_TOUCH_DEVICE__SUB_ID:
        return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
      case ModelPackage.MULTI_TOUCH_DEVICE__MBRICK:
        return basicGetMbrick() != null;
      case ModelPackage.MULTI_TOUCH_DEVICE__SENSOR_VALUE:
        return sensorValue != null;
      case ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG:
        return tfConfig != null;
      case ModelPackage.MULTI_TOUCH_DEVICE__PIN:
        return pin != PIN_EDEFAULT;
      case ModelPackage.MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE:
        return DISABLE_ELECTRODE_EDEFAULT == null ? disableElectrode != null : !DISABLE_ELECTRODE_EDEFAULT.equals(disableElectrode);
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
        case ModelPackage.MULTI_TOUCH_DEVICE__SENSOR_VALUE: return ModelPackage.MSENSOR__SENSOR_VALUE;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (derivedFeatureID) {
        case ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG: return ModelPackage.MTF_CONFIG_CONSUMER__TF_CONFIG;
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
        case ModelPackage.MSENSOR__SENSOR_VALUE: return ModelPackage.MULTI_TOUCH_DEVICE__SENSOR_VALUE;
        default: return -1;
      }
    }
    if (baseClass == MTFConfigConsumer.class) {
      switch (baseFeatureID) {
        case ModelPackage.MTF_CONFIG_CONSUMER__TF_CONFIG: return ModelPackage.MULTI_TOUCH_DEVICE__TF_CONFIG;
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
        case ModelPackage.MSENSOR___FETCH_SENSOR_VALUE: return ModelPackage.MULTI_TOUCH_DEVICE___FETCH_SENSOR_VALUE;
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
      case ModelPackage.MULTI_TOUCH_DEVICE___FETCH_SENSOR_VALUE:
        fetchSensorValue();
        return null;
      case ModelPackage.MULTI_TOUCH_DEVICE___INIT:
        init();
        return null;
      case ModelPackage.MULTI_TOUCH_DEVICE___ENABLE:
        enable();
        return null;
      case ModelPackage.MULTI_TOUCH_DEVICE___DISABLE:
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
    result.append(", pin: ");
    result.append(pin);
    result.append(", disableElectrode: ");
    result.append(disableElectrode);
    result.append(')');
    return result.toString();
  }

} // MultiTouchDeviceImpl
