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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration;
import org.m1theo.tinkerforge.emf.internal.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Humidity V2 Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.HumidityV2ConfigurationImpl#getHeaterConfiguration <em>Heater Configuration</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.HumidityV2ConfigurationImpl#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.impl.HumidityV2ConfigurationImpl#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumidityV2ConfigurationImpl extends MinimalEObjectImpl.Container implements HumidityV2Configuration {
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
    protected static final int MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT = 0;

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
    protected static final int MOVING_AVERAGE_LENGTH_TEMPERATURE_EDEFAULT = 0;

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
    protected HumidityV2ConfigurationImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getHumidityV2Configuration();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getHeaterConfiguration() {
    return heaterConfiguration;
  }

				/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setHeaterConfiguration(int newHeaterConfiguration) {
    int oldHeaterConfiguration = heaterConfiguration;
    heaterConfiguration = newHeaterConfiguration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HUMIDITY_V2_CONFIGURATION__HEATER_CONFIGURATION, oldHeaterConfiguration, heaterConfiguration));
  }

				/**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public int getMovingAverageLengthHumidity() {
    return movingAverageLengthHumidity;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setMovingAverageLengthHumidity(int newMovingAverageLengthHumidity) {
    int oldMovingAverageLengthHumidity = movingAverageLengthHumidity;
    movingAverageLengthHumidity = newMovingAverageLengthHumidity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY, oldMovingAverageLengthHumidity, movingAverageLengthHumidity));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public int getMovingAverageLengthTemperature() {
    return movingAverageLengthTemperature;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setMovingAverageLengthTemperature(int newMovingAverageLengthTemperature) {
    int oldMovingAverageLengthTemperature = movingAverageLengthTemperature;
    movingAverageLengthTemperature = newMovingAverageLengthTemperature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE, oldMovingAverageLengthTemperature, movingAverageLengthTemperature));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__HEATER_CONFIGURATION:
        return getHeaterConfiguration();
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
        return getMovingAverageLengthHumidity();
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
        return getMovingAverageLengthTemperature();
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
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__HEATER_CONFIGURATION:
        setHeaterConfiguration((Integer)newValue);
        return;
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
        setMovingAverageLengthHumidity((Integer)newValue);
        return;
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
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
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__HEATER_CONFIGURATION:
        setHeaterConfiguration(HEATER_CONFIGURATION_EDEFAULT);
        return;
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
        setMovingAverageLengthHumidity(MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT);
        return;
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
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
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__HEATER_CONFIGURATION:
        return heaterConfiguration != HEATER_CONFIGURATION_EDEFAULT;
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_HUMIDITY:
        return movingAverageLengthHumidity != MOVING_AVERAGE_LENGTH_HUMIDITY_EDEFAULT;
      case ModelPackage.HUMIDITY_V2_CONFIGURATION__MOVING_AVERAGE_LENGTH_TEMPERATURE:
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
    public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (heaterConfiguration: ");
    result.append(heaterConfiguration);
    result.append(", movingAverageLengthHumidity: ");
    result.append(movingAverageLengthHumidity);
    result.append(", movingAverageLengthTemperature: ");
    result.append(movingAverageLengthTemperature);
    result.append(')');
    return result.toString();
  }

} //HumidityV2ConfigurationImpl
