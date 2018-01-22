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
package org.m1theo.tinkerforge.emf.internal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Humidity V2 Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration#getHeaterConfiguration <em>Heater Configuration</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getHumidityV2Configuration()
 * @model
 * @generated
 */
public interface HumidityV2Configuration extends TFConfig {
	/**
   * Returns the value of the '<em><b>Heater Configuration</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heater Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Heater Configuration</em>' attribute.
   * @see #setHeaterConfiguration(int)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getHumidityV2Configuration_HeaterConfiguration()
   * @model unique="false"
   * @generated
   */
	int getHeaterConfiguration();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration#getHeaterConfiguration <em>Heater Configuration</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heater Configuration</em>' attribute.
   * @see #getHeaterConfiguration()
   * @generated
   */
	void setHeaterConfiguration(int value);

	/**
   * Returns the value of the '<em><b>Moving Average Length Humidity</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moving Average Length Humidity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Moving Average Length Humidity</em>' attribute.
   * @see #setMovingAverageLengthHumidity(int)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getHumidityV2Configuration_MovingAverageLengthHumidity()
   * @model unique="false"
   * @generated
   */
	int getMovingAverageLengthHumidity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moving Average Length Humidity</em>' attribute.
   * @see #getMovingAverageLengthHumidity()
   * @generated
   */
	void setMovingAverageLengthHumidity(int value);

	/**
   * Returns the value of the '<em><b>Moving Average Length Temperature</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moving Average Length Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Moving Average Length Temperature</em>' attribute.
   * @see #setMovingAverageLengthTemperature(int)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getHumidityV2Configuration_MovingAverageLengthTemperature()
   * @model unique="false"
   * @generated
   */
	int getMovingAverageLengthTemperature();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.HumidityV2Configuration#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moving Average Length Temperature</em>' attribute.
   * @see #getMovingAverageLengthTemperature()
   * @generated
   */
	void setMovingAverageLengthTemperature(int value);

} // HumidityV2Configuration
