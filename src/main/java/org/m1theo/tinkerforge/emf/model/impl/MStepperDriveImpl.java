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
import org.m1theo.tinkerforge.emf.model.MBrickStepper;
import org.m1theo.tinkerforge.emf.model.MStepperDrive;
import org.m1theo.tinkerforge.emf.model.MSubDeviceHolder;
import org.m1theo.tinkerforge.emf.model.ModelPackage;
import org.slf4j.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MStepper Drive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MStepperDriveImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MStepperDriveImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MStepperDriveImpl#isPoll <em>Poll</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MStepperDriveImpl#getEnabledA <em>Enabled A</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MStepperDriveImpl#getSubId <em>Sub Id</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MStepperDriveImpl#getMbrick <em>Mbrick</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.MStepperDriveImpl#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MStepperDriveImpl extends MinimalEObjectImpl.Container implements MStepperDrive {
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
   * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getDeviceType()
   * @generated
   * @ordered
   */
    protected static final String DEVICE_TYPE_EDEFAULT = "stepper_drive";

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
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected MStepperDriveImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getMStepperDrive();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MSTEPPER_DRIVE__LOGGER, oldLogger, logger));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MSTEPPER_DRIVE__UID, oldUid, uid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MSTEPPER_DRIVE__POLL, oldPoll, poll));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MSTEPPER_DRIVE__ENABLED_A, oldEnabledA, enabledA));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MSTEPPER_DRIVE__SUB_ID, oldSubId, subId));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public MBrickStepper getMbrick() {
    if (eContainerFeatureID() != ModelPackage.MSTEPPER_DRIVE__MBRICK) return null;
    return (MBrickStepper)eContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public MBrickStepper basicGetMbrick() {
    if (eContainerFeatureID() != ModelPackage.MSTEPPER_DRIVE__MBRICK) return null;
    return (MBrickStepper)eInternalContainer();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetMbrick(MBrickStepper newMbrick, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newMbrick, ModelPackage.MSTEPPER_DRIVE__MBRICK, msgs);
    return msgs;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setMbrick(MBrickStepper newMbrick) {
    if (newMbrick != eInternalContainer() || (eContainerFeatureID() != ModelPackage.MSTEPPER_DRIVE__MBRICK && newMbrick != null)) {
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MSTEPPER_DRIVE__MBRICK, newMbrick, newMbrick));
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
    public void init() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void enable() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void disable() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ModelPackage.MSTEPPER_DRIVE__MBRICK:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMbrick((MBrickStepper)otherEnd, msgs);
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
      case ModelPackage.MSTEPPER_DRIVE__MBRICK:
        return basicSetMbrick(null, msgs);
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
      case ModelPackage.MSTEPPER_DRIVE__MBRICK:
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
      case ModelPackage.MSTEPPER_DRIVE__LOGGER:
        return getLogger();
      case ModelPackage.MSTEPPER_DRIVE__UID:
        return getUid();
      case ModelPackage.MSTEPPER_DRIVE__POLL:
        return isPoll();
      case ModelPackage.MSTEPPER_DRIVE__ENABLED_A:
        return getEnabledA();
      case ModelPackage.MSTEPPER_DRIVE__SUB_ID:
        return getSubId();
      case ModelPackage.MSTEPPER_DRIVE__MBRICK:
        if (resolve) return getMbrick();
        return basicGetMbrick();
      case ModelPackage.MSTEPPER_DRIVE__DEVICE_TYPE:
        return getDeviceType();
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
      case ModelPackage.MSTEPPER_DRIVE__LOGGER:
        setLogger((Logger)newValue);
        return;
      case ModelPackage.MSTEPPER_DRIVE__UID:
        setUid((String)newValue);
        return;
      case ModelPackage.MSTEPPER_DRIVE__POLL:
        setPoll((Boolean)newValue);
        return;
      case ModelPackage.MSTEPPER_DRIVE__ENABLED_A:
        setEnabledA((AtomicBoolean)newValue);
        return;
      case ModelPackage.MSTEPPER_DRIVE__SUB_ID:
        setSubId((String)newValue);
        return;
      case ModelPackage.MSTEPPER_DRIVE__MBRICK:
        setMbrick((MBrickStepper)newValue);
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
      case ModelPackage.MSTEPPER_DRIVE__LOGGER:
        setLogger(LOGGER_EDEFAULT);
        return;
      case ModelPackage.MSTEPPER_DRIVE__UID:
        setUid(UID_EDEFAULT);
        return;
      case ModelPackage.MSTEPPER_DRIVE__POLL:
        setPoll(POLL_EDEFAULT);
        return;
      case ModelPackage.MSTEPPER_DRIVE__ENABLED_A:
        setEnabledA(ENABLED_A_EDEFAULT);
        return;
      case ModelPackage.MSTEPPER_DRIVE__SUB_ID:
        setSubId(SUB_ID_EDEFAULT);
        return;
      case ModelPackage.MSTEPPER_DRIVE__MBRICK:
        setMbrick((MBrickStepper)null);
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
      case ModelPackage.MSTEPPER_DRIVE__LOGGER:
        return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
      case ModelPackage.MSTEPPER_DRIVE__UID:
        return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
      case ModelPackage.MSTEPPER_DRIVE__POLL:
        return poll != POLL_EDEFAULT;
      case ModelPackage.MSTEPPER_DRIVE__ENABLED_A:
        return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
      case ModelPackage.MSTEPPER_DRIVE__SUB_ID:
        return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
      case ModelPackage.MSTEPPER_DRIVE__MBRICK:
        return basicGetMbrick() != null;
      case ModelPackage.MSTEPPER_DRIVE__DEVICE_TYPE:
        return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
    }
    return super.eIsSet(featureID);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case ModelPackage.MSTEPPER_DRIVE___INIT:
        init();
        return null;
      case ModelPackage.MSTEPPER_DRIVE___ENABLE:
        enable();
        return null;
      case ModelPackage.MSTEPPER_DRIVE___DISABLE:
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
    result.append(", deviceType: ");
    result.append(deviceType);
    result.append(')');
    return result.toString();
  }

} // MStepperDriveImpl
