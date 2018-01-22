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

import com.tinkerforge.BrickletDualButton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Dual Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletDualButton#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletDualButton()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MDevice&lt;org.m1theo.tinkerforge.emf.internal.model.TinkerBrickletDualButton&gt; org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.internal.model.DualButtonDevice&gt;"
 * @generated
 */
public interface MBrickletDualButton extends MDevice<BrickletDualButton>, MSubDeviceHolder<DualButtonDevice> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_dualbutton"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletDualButton_DeviceType()
   * @model default="bricklet_dualbutton" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

} // MBrickletDualButton
