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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.m1theo.tinkerforge.emf.internal.model.ModelPackage;
import org.m1theo.tinkerforge.emf.internal.model.TFAnalogInV2Configuration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TF Analog In V2 Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.TFAnalogInV2ConfigurationImpl#getMovingAverage <em>Moving Average</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFAnalogInV2ConfigurationImpl extends TFBaseConfigurationImpl implements TFAnalogInV2Configuration {
    /**
   * The default value of the '{@link #getMovingAverage() <em>Moving Average</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getMovingAverage()
   * @generated
   * @ordered
   */
    protected static final Short MOVING_AVERAGE_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getMovingAverage() <em>Moving Average</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getMovingAverage()
   * @generated
   * @ordered
   */
    protected Short movingAverage = MOVING_AVERAGE_EDEFAULT;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected TFAnalogInV2ConfigurationImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getTFAnalogInV2Configuration();
  }

				/**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Short getMovingAverage() {
    return movingAverage;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setMovingAverage(Short newMovingAverage) {
    Short oldMovingAverage = movingAverage;
    movingAverage = newMovingAverage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TF_ANALOG_IN_V2_CONFIGURATION__MOVING_AVERAGE, oldMovingAverage, movingAverage));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelPackage.TF_ANALOG_IN_V2_CONFIGURATION__MOVING_AVERAGE:
        return getMovingAverage();
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
      case ModelPackage.TF_ANALOG_IN_V2_CONFIGURATION__MOVING_AVERAGE:
        setMovingAverage((Short)newValue);
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
      case ModelPackage.TF_ANALOG_IN_V2_CONFIGURATION__MOVING_AVERAGE:
        setMovingAverage(MOVING_AVERAGE_EDEFAULT);
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
      case ModelPackage.TF_ANALOG_IN_V2_CONFIGURATION__MOVING_AVERAGE:
        return MOVING_AVERAGE_EDEFAULT == null ? movingAverage != null : !MOVING_AVERAGE_EDEFAULT.equals(movingAverage);
    }
    return super.eIsSet(featureID);
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
    result.append(" (movingAverage: ");
    result.append(movingAverage);
    result.append(')');
    return result.toString();
  }

} // TFAnalogInV2ConfigurationImpl
