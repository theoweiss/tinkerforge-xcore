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

import com.tinkerforge.BrickletTemperatureIR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Temperature IR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletTemperatureIR#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletTemperatureIR()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletTemperatureIR&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.MTemperatureIRDevice&gt;"
 * @generated
 */
public interface MBrickletTemperatureIR extends MDevice<BrickletTemperatureIR>, MSubDeviceHolder<MTemperatureIRDevice> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_temperatureIR"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletTemperatureIR_DeviceType()
   * @model default="bricklet_temperatureIR" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

} // MBrickletTemperatureIR
