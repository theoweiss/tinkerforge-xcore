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
package org.m1theo.tinkerforge.emf.model;

import com.tinkerforge.BrickletHumidityV2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Humidity V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2#getHeaterConfiguration <em>Heater Configuration</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletHumidityV2()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletHumidityV2&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.MHumidityV2Device&gt; org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.HumidityV2Configuration&gt;"
 * @generated
 */
public interface MBrickletHumidityV2 extends MDevice<BrickletHumidityV2>, MSubDeviceHolder<MHumidityV2Device>, MTFConfigConsumer<HumidityV2Configuration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_humidityV2"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletHumidityV2_DeviceType()
   * @model default="bricklet_humidityV2" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Heater Configuration</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heater Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Heater Configuration</em>' attribute.
   * @see #setHeaterConfiguration(int)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletHumidityV2_HeaterConfiguration()
   * @model default="0" unique="false"
   * @generated
   */
	int getHeaterConfiguration();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2#getHeaterConfiguration <em>Heater Configuration</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heater Configuration</em>' attribute.
   * @see #getHeaterConfiguration()
   * @generated
   */
	void setHeaterConfiguration(int value);

  /**
   * Returns the value of the '<em><b>Moving Average Length Humidity</b></em>' attribute.
   * The default value is <code>"100"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moving Average Length Humidity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moving Average Length Humidity</em>' attribute.
   * @see #setMovingAverageLengthHumidity(int)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletHumidityV2_MovingAverageLengthHumidity()
   * @model default="100" unique="false"
   * @generated
   */
  int getMovingAverageLengthHumidity();

  /**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2#getMovingAverageLengthHumidity <em>Moving Average Length Humidity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moving Average Length Humidity</em>' attribute.
   * @see #getMovingAverageLengthHumidity()
   * @generated
   */
  void setMovingAverageLengthHumidity(int value);

  /**
   * Returns the value of the '<em><b>Moving Average Length Temperature</b></em>' attribute.
   * The default value is <code>"100"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moving Average Length Temperature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moving Average Length Temperature</em>' attribute.
   * @see #setMovingAverageLengthTemperature(int)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletHumidityV2_MovingAverageLengthTemperature()
   * @model default="100" unique="false"
   * @generated
   */
  int getMovingAverageLengthTemperature();

  /**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2#getMovingAverageLengthTemperature <em>Moving Average Length Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moving Average Length Temperature</em>' attribute.
   * @see #getMovingAverageLengthTemperature()
   * @generated
   */
  void setMovingAverageLengthTemperature(int value);

} // MBrickletHumidityV2
