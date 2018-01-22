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

import com.tinkerforge.BrickletAnalogOutV2;

import java.math.BigDecimal;
import org.m1theo.tinkerforge.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Analog Out V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogOutV2#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogOutV2#getMinValueDevice <em>Min Value Device</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogOutV2#getMaxValueDevice <em>Max Value Device</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletAnalogOutV2()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MSensor&lt;org.m1theo.tinkerforge.emf.internal.model.MDecimalValue&gt; org.m1theo.tinkerforge.emf.internal.model.MDevice&lt;org.m1theo.tinkerforge.emf.internal.model.TinkerBrickletAnalogOutV2&gt; org.m1theo.tinkerforge.emf.internal.model.SetPointActor&lt;org.m1theo.tinkerforge.emf.internal.model.DimmableConfiguration&gt;"
 * @generated
 */
public interface MBrickletAnalogOutV2 extends MSensor<DecimalValue>, MDevice<BrickletAnalogOutV2>, SetPointActor<DimmableConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_analog_out_v2"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletAnalogOutV2_DeviceType()
   * @model default="bricklet_analog_out_v2" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Min Value Device</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value Device</em>' attribute.
   * @see #setMinValueDevice(BigDecimal)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletAnalogOutV2_MinValueDevice()
   * @model default="0" unique="false"
   * @generated
   */
	BigDecimal getMinValueDevice();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogOutV2#getMinValueDevice <em>Min Value Device</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value Device</em>' attribute.
   * @see #getMinValueDevice()
   * @generated
   */
	void setMinValueDevice(BigDecimal value);

	/**
   * Returns the value of the '<em><b>Max Value Device</b></em>' attribute.
   * The default value is <code>"12000"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value Device</em>' attribute.
   * @see #setMaxValueDevice(BigDecimal)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletAnalogOutV2_MaxValueDevice()
   * @model default="12000" unique="false"
   * @generated
   */
	BigDecimal getMaxValueDevice();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletAnalogOutV2#getMaxValueDevice <em>Max Value Device</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value Device</em>' attribute.
   * @see #getMaxValueDevice()
   * @generated
   */
	void setMaxValueDevice(BigDecimal value);

} // MBrickletAnalogOutV2
