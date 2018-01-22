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

import com.tinkerforge.BrickletIO16;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet IO16</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIO16#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletIO16()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MDevice&lt;org.m1theo.tinkerforge.emf.internal.model.TinkerBrickletIO16&gt; org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.internal.model.IODevice&gt; org.m1theo.tinkerforge.emf.internal.model.InterruptListener org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.TFInterruptListenerConfiguration&gt;"
 * @generated
 */
public interface MBrickletIO16 extends MDevice<BrickletIO16>, MSubDeviceHolder<IODevice>, InterruptListener, MTFConfigConsumer<TFInterruptListenerConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_io16"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletIO16_DeviceType()
   * @model default="bricklet_io16" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

} // MBrickletIO16
