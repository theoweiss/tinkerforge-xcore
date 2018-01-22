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
 * A representation of the model object '<em><b>PTC Connected</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.PTCConnected#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getPTCConnected()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.PTCDevice org.m1theo.tinkerforge.emf.internal.model.MSensor&lt;org.m1theo.tinkerforge.emf.internal.model.DigitalValue&gt;"
 * @generated
 */
public interface PTCConnected extends PTCDevice, MSensor<HighLowValue> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"ptc_connected"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getPTCConnected_DeviceType()
   * @model default="ptc_connected" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

} // PTCConnected
