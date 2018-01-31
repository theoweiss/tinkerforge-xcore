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
package org.m1theo.tinkerforge.emf.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.m1theo.tinkerforge.emf.model.ModelPackage;
import org.m1theo.tinkerforge.emf.model.TFThermocoupleConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TF Thermocouple Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.TFThermocoupleConfigurationImpl#getAveraging <em>Averaging</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.TFThermocoupleConfigurationImpl#getThermocoupleType <em>Thermocouple Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.impl.TFThermocoupleConfigurationImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFThermocoupleConfigurationImpl extends TFBaseConfigurationImpl implements TFThermocoupleConfiguration {
    /**
   * The default value of the '{@link #getAveraging() <em>Averaging</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getAveraging()
   * @generated
   * @ordered
   */
    protected static final Short AVERAGING_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getAveraging() <em>Averaging</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getAveraging()
   * @generated
   * @ordered
   */
    protected Short averaging = AVERAGING_EDEFAULT;

    /**
   * The default value of the '{@link #getThermocoupleType() <em>Thermocouple Type</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getThermocoupleType()
   * @generated
   * @ordered
   */
    protected static final String THERMOCOUPLE_TYPE_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getThermocoupleType() <em>Thermocouple Type</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getThermocoupleType()
   * @generated
   * @ordered
   */
    protected String thermocoupleType = THERMOCOUPLE_TYPE_EDEFAULT;

    /**
   * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
    protected static final String FILTER_EDEFAULT = null;

    /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
    protected String filter = FILTER_EDEFAULT;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected TFThermocoupleConfigurationImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getTFThermocoupleConfiguration();
  }

				/**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Short getAveraging() {
    return averaging;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setAveraging(Short newAveraging) {
    Short oldAveraging = averaging;
    averaging = newAveraging;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__AVERAGING, oldAveraging, averaging));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String getThermocoupleType() {
    return thermocoupleType;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setThermocoupleType(String newThermocoupleType) {
    String oldThermocoupleType = thermocoupleType;
    thermocoupleType = newThermocoupleType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__THERMOCOUPLE_TYPE, oldThermocoupleType, thermocoupleType));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public String getFilter() {
    return filter;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public void setFilter(String newFilter) {
    String oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__FILTER, oldFilter, filter));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__AVERAGING:
        return getAveraging();
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__THERMOCOUPLE_TYPE:
        return getThermocoupleType();
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__FILTER:
        return getFilter();
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
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__AVERAGING:
        setAveraging((Short)newValue);
        return;
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__THERMOCOUPLE_TYPE:
        setThermocoupleType((String)newValue);
        return;
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__FILTER:
        setFilter((String)newValue);
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
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__AVERAGING:
        setAveraging(AVERAGING_EDEFAULT);
        return;
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__THERMOCOUPLE_TYPE:
        setThermocoupleType(THERMOCOUPLE_TYPE_EDEFAULT);
        return;
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__FILTER:
        setFilter(FILTER_EDEFAULT);
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
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__AVERAGING:
        return AVERAGING_EDEFAULT == null ? averaging != null : !AVERAGING_EDEFAULT.equals(averaging);
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__THERMOCOUPLE_TYPE:
        return THERMOCOUPLE_TYPE_EDEFAULT == null ? thermocoupleType != null : !THERMOCOUPLE_TYPE_EDEFAULT.equals(thermocoupleType);
      case ModelPackage.TF_THERMOCOUPLE_CONFIGURATION__FILTER:
        return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
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
    result.append(" (averaging: ");
    result.append(averaging);
    result.append(", thermocoupleType: ");
    result.append(thermocoupleType);
    result.append(", filter: ");
    result.append(filter);
    result.append(')');
    return result.toString();
  }

} // TFThermocoupleConfigurationImpl
