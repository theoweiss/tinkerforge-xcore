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

import com.tinkerforge.BrickletIndustrialDual020mA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Industrial Dual020m A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletIndustrialDual020mA#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletIndustrialDual020mA()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MDevice&lt;org.m1theo.tinkerforge.emf.internal.model.TinkerBrickletIndustrialDual020mA&gt; org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.internal.model.Dual020mADevice&gt; org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.TFIndustrialDual020mAConfiguration&gt;"
 * @generated
 */
public interface MBrickletIndustrialDual020mA extends MDevice<BrickletIndustrialDual020mA>, MSubDeviceHolder<Dual020mADevice>, MTFConfigConsumer<TFIndustrialDual020mAConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_industrialdual020ma"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletIndustrialDual020mA_DeviceType()
   * @model default="bricklet_industrialdual020ma" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
   * @generated
   */
	void init();

} // MBrickletIndustrialDual020mA
