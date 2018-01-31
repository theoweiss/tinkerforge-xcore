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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OH Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.OHConfig#getOhTfDevices <em>Oh Tf Devices</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getOHConfig()
 * @model
 * @generated
 */
public interface OHConfig extends EObject {
	/**
   * Returns the value of the '<em><b>Oh Tf Devices</b></em>' containment reference list.
   * The list contents are of type {@link org.m1theo.tinkerforge.emf.model.OHTFDevice}<code>&lt;?, ?&gt;</code>.
   * It is bidirectional and its opposite is '{@link org.m1theo.tinkerforge.emf.model.OHTFDevice#getOhConfig <em>Oh Config</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oh Tf Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Oh Tf Devices</em>' containment reference list.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getOHConfig_OhTfDevices()
   * @see org.m1theo.tinkerforge.emf.model.OHTFDevice#getOhConfig
   * @model opposite="ohConfig" containment="true"
   * @generated
   */
	EList<OHTFDevice<?, ?>> getOhTfDevices();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model unique="false" uidUnique="false" subidUnique="false"
   * @generated
   */
	OHTFDevice<?, ?> getConfigByTFId(String uid, String subid);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model unique="false" ohidUnique="false"
   * @generated
   */
	OHTFDevice<?, ?> getConfigByOHId(String ohid);

} // OHConfig
