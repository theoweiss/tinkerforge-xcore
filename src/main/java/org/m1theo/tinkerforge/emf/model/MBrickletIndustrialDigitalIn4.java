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

import com.tinkerforge.BrickletIndustrialDigitalIn4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Industrial Digital In4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletIndustrialDigitalIn4#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletIndustrialDigitalIn4()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.MIndustrialDigitalIn&gt; org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.MTinkerBrickletIndustrialDigitalIn4&gt; org.m1theo.tinkerforge.emf.model.InterruptListener org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.TFInterruptListenerConfiguration&gt;"
 * @generated
 */
public interface MBrickletIndustrialDigitalIn4 extends MSubDeviceHolder<MIndustrialDigitalIn>, MDevice<BrickletIndustrialDigitalIn4>, InterruptListener, MTFConfigConsumer<TFInterruptListenerConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_industrial_digital_4in"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletIndustrialDigitalIn4_DeviceType()
   * @model default="bricklet_industrial_digital_4in" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

} // MBrickletIndustrialDigitalIn4
