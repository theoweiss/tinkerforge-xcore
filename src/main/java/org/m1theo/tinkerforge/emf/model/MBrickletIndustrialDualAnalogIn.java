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

import com.tinkerforge.BrickletIndustrialDualAnalogIn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Industrial Dual Analog In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletIndustrialDualAnalogIn#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletIndustrialDualAnalogIn#getSampleRate <em>Sample Rate</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletIndustrialDualAnalogIn()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletIndustrialDualAnalogIn&gt; org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.BrickletIndustrialDualAnalogInConfiguration&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.IndustrialDualAnalogInChannel&gt;"
 * @generated
 */
public interface MBrickletIndustrialDualAnalogIn extends MDevice<BrickletIndustrialDualAnalogIn>, MTFConfigConsumer<BrickletIndustrialDualAnalogInConfiguration>, MSubDeviceHolder<IndustrialDualAnalogInChannel> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_industrial_dual_analogin"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletIndustrialDualAnalogIn_DeviceType()
   * @model default="bricklet_industrial_dual_analogin" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Sample Rate</b></em>' attribute.
   * The default value is <code>"6"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Rate</em>' attribute.
   * @see #setSampleRate(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletIndustrialDualAnalogIn_SampleRate()
   * @model default="6" unique="false"
   * @generated
   */
	short getSampleRate();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletIndustrialDualAnalogIn#getSampleRate <em>Sample Rate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sample Rate</em>' attribute.
   * @see #getSampleRate()
   * @generated
   */
	void setSampleRate(short value);

} // MBrickletIndustrialDualAnalogIn
