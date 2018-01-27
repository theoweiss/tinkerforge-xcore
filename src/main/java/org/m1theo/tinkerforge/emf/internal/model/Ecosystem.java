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

import org.slf4j.Logger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecosystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.Ecosystem#getLogger <em>Logger</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.Ecosystem#getMbrickds <em>Mbrickds</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getEcosystem()
 * @model
 * @generated
 */
public interface Ecosystem extends EObject {
	/**
   * Returns the value of the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Logger</em>' attribute.
   * @see #setLogger(Logger)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getEcosystem_Logger()
   * @model unique="false" dataType="org.m1theo.tinkerforge.emf.internal.model.MLogger"
   * @generated
   */
	Logger getLogger();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.Ecosystem#getLogger <em>Logger</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logger</em>' attribute.
   * @see #getLogger()
   * @generated
   */
	void setLogger(Logger value);

	/**
   * Returns the value of the '<em><b>Mbrickds</b></em>' containment reference list.
   * The list contents are of type {@link org.m1theo.tinkerforge.emf.internal.model.MBrickd}.
   * It is bidirectional and its opposite is '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickd#getEcosystem <em>Ecosystem</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mbrickds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mbrickds</em>' containment reference list.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getEcosystem_Mbrickds()
   * @see org.m1theo.tinkerforge.emf.internal.model.MBrickd#getEcosystem
   * @model opposite="ecosystem" containment="true"
   * @generated
   */
	EList<MBrickd> getMbrickds();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model unique="false" hostUnique="false" portUnique="false"
   * @generated
   */
	MBrickd getBrickd(String host, int port);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model unique="false" uidUnique="false" subIdUnique="false"
   * @generated
   */
	MBaseDevice getDevice(String uid, String subId);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model unique="false" uidUnique="false" genericIdUnique="false"
   * @generated
   */
	EList<MSubDevice<?>> getDevices4GenericId(String uid, String genericId);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model
   * @generated
   */
	void disconnect();

} // Ecosystem
