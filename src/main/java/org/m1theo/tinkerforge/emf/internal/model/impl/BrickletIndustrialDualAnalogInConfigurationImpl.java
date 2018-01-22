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
import org.m1theo.tinkerforge.emf.internal.model.BrickletIndustrialDualAnalogInConfiguration;
import org.m1theo.tinkerforge.emf.internal.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bricklet Industrial Dual Analog In Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.BrickletIndustrialDualAnalogInConfigurationImpl#getSampleRate <em>Sample Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrickletIndustrialDualAnalogInConfigurationImpl extends TFBaseConfigurationImpl
        implements BrickletIndustrialDualAnalogInConfiguration {
    /**
   * The default value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getSampleRate()
   * @generated
   * @ordered
   */
    protected static final Short SAMPLE_RATE_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getSampleRate()
   * @generated
   * @ordered
   */
    protected Short sampleRate = SAMPLE_RATE_EDEFAULT;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected BrickletIndustrialDualAnalogInConfigurationImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getBrickletIndustrialDualAnalogInConfiguration();
  }

				/**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Short getSampleRate() {
    return sampleRate;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setSampleRate(Short newSampleRate) {
    Short oldSampleRate = sampleRate;
    sampleRate = newSampleRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BRICKLET_INDUSTRIAL_DUAL_ANALOG_IN_CONFIGURATION__SAMPLE_RATE, oldSampleRate, sampleRate));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelPackage.BRICKLET_INDUSTRIAL_DUAL_ANALOG_IN_CONFIGURATION__SAMPLE_RATE:
        return getSampleRate();
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
      case ModelPackage.BRICKLET_INDUSTRIAL_DUAL_ANALOG_IN_CONFIGURATION__SAMPLE_RATE:
        setSampleRate((Short)newValue);
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
      case ModelPackage.BRICKLET_INDUSTRIAL_DUAL_ANALOG_IN_CONFIGURATION__SAMPLE_RATE:
        setSampleRate(SAMPLE_RATE_EDEFAULT);
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
      case ModelPackage.BRICKLET_INDUSTRIAL_DUAL_ANALOG_IN_CONFIGURATION__SAMPLE_RATE:
        return SAMPLE_RATE_EDEFAULT == null ? sampleRate != null : !SAMPLE_RATE_EDEFAULT.equals(sampleRate);
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
    result.append(" (sampleRate: ");
    result.append(sampleRate);
    result.append(')');
    return result.toString();
  }

} // BrickletIndustrialDualAnalogInConfigurationImpl
