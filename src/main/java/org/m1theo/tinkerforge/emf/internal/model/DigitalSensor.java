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

import org.m1theo.tinkerforge.types.HighLowValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor#isPullUpResistorEnabled <em>Pull Up Resistor Enabled</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor#getPort <em>Port</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getDigitalSensor()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.IODevice org.m1theo.tinkerforge.emf.internal.model.MSensor&lt;org.m1theo.tinkerforge.emf.internal.model.DigitalValue&gt; org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.TFIOSensorConfiguration&gt;"
 * @generated
 */
public interface DigitalSensor extends IODevice, MSensor<HighLowValue>, MTFConfigConsumer<TFIOSensorConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"iosensor"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getDigitalSensor_DeviceType()
   * @model default="iosensor" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Pull Up Resistor Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pull Up Resistor Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pull Up Resistor Enabled</em>' attribute.
   * @see #setPullUpResistorEnabled(boolean)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getDigitalSensor_PullUpResistorEnabled()
   * @model unique="false"
   * @generated
   */
	boolean isPullUpResistorEnabled();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor#isPullUpResistorEnabled <em>Pull Up Resistor Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pull Up Resistor Enabled</em>' attribute.
   * @see #isPullUpResistorEnabled()
   * @generated
   */
	void setPullUpResistorEnabled(boolean value);

	/**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(char)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getDigitalSensor_Port()
   * @model unique="false"
   * @generated
   */
	char getPort();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
	void setPort(char value);

	/**
   * Returns the value of the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pin</em>' attribute.
   * @see #setPin(int)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getDigitalSensor_Pin()
   * @model unique="false"
   * @generated
   */
	int getPin();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalSensor#getPin <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin</em>' attribute.
   * @see #getPin()
   * @generated
   */
	void setPin(int value);

} // DigitalSensor
