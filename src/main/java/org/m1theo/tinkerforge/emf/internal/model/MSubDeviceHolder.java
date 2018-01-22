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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSub Device Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder#getMsubdevices <em>Msubdevices</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMSubDeviceHolder()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MSubDeviceHolder<S extends MSubDevice<?>> extends EObject {
	/**
   * Returns the value of the '<em><b>Msubdevices</b></em>' containment reference list.
   * It is bidirectional and its opposite is '{@link org.m1theo.tinkerforge.emf.internal.model.MSubDevice#getMbrick <em>Mbrick</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msubdevices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Msubdevices</em>' containment reference list.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMSubDeviceHolder_Msubdevices()
   * @see org.m1theo.tinkerforge.emf.internal.model.MSubDevice#getMbrick
   * @model opposite="mbrick" containment="true"
   * @generated
   */
	EList<S> getMsubdevices();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model
   * @generated
   */
	void initSubDevices();

} // MSubDeviceHolder
