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

import com.tinkerforge.BrickletVoltageCurrent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Voltage Current</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent#getAveraging <em>Averaging</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent#getVoltageConversionTime <em>Voltage Conversion Time</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent#getCurrentConversionTime <em>Current Conversion Time</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletVoltageCurrent()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MDevice&lt;org.m1theo.tinkerforge.emf.internal.model.TinkerBrickletVoltageCurrent&gt; org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.internal.model.VoltageCurrentDevice&gt; org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.TFVoltageCurrentConfiguration&gt;"
 * @generated
 */
public interface MBrickletVoltageCurrent extends MDevice<BrickletVoltageCurrent>, MSubDeviceHolder<VoltageCurrentDevice>, MTFConfigConsumer<TFVoltageCurrentConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_voltageCurrent"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletVoltageCurrent_DeviceType()
   * @model default="bricklet_voltageCurrent" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Averaging</b></em>' attribute.
   * The default value is <code>"3"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Averaging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Averaging</em>' attribute.
   * @see #setAveraging(Short)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletVoltageCurrent_Averaging()
   * @model default="3" unique="false"
   * @generated
   */
	Short getAveraging();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent#getAveraging <em>Averaging</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Averaging</em>' attribute.
   * @see #getAveraging()
   * @generated
   */
	void setAveraging(Short value);

	/**
   * Returns the value of the '<em><b>Voltage Conversion Time</b></em>' attribute.
   * The default value is <code>"4"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Conversion Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Voltage Conversion Time</em>' attribute.
   * @see #setVoltageConversionTime(Short)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletVoltageCurrent_VoltageConversionTime()
   * @model default="4" unique="false"
   * @generated
   */
	Short getVoltageConversionTime();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent#getVoltageConversionTime <em>Voltage Conversion Time</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Voltage Conversion Time</em>' attribute.
   * @see #getVoltageConversionTime()
   * @generated
   */
	void setVoltageConversionTime(Short value);

	/**
   * Returns the value of the '<em><b>Current Conversion Time</b></em>' attribute.
   * The default value is <code>"4"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Conversion Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Current Conversion Time</em>' attribute.
   * @see #setCurrentConversionTime(Short)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletVoltageCurrent_CurrentConversionTime()
   * @model default="4" unique="false"
   * @generated
   */
	Short getCurrentConversionTime();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent#getCurrentConversionTime <em>Current Conversion Time</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Conversion Time</em>' attribute.
   * @see #getCurrentConversionTime()
   * @generated
   */
	void setCurrentConversionTime(Short value);

} // MBrickletVoltageCurrent
