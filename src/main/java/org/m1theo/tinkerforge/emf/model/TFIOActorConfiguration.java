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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFIO Actor Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFIOActorConfiguration#getDefaultState <em>Default State</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFIOActorConfiguration#isKeepOnReconnect <em>Keep On Reconnect</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFIOActorConfiguration()
 * @model
 * @generated
 */
public interface TFIOActorConfiguration extends TFConfig {
	/**
   * Returns the value of the '<em><b>Default State</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Default State</em>' attribute.
   * @see #setDefaultState(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFIOActorConfiguration_DefaultState()
   * @model unique="false"
   * @generated
   */
	String getDefaultState();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFIOActorConfiguration#getDefaultState <em>Default State</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default State</em>' attribute.
   * @see #getDefaultState()
   * @generated
   */
	void setDefaultState(String value);

	/**
   * Returns the value of the '<em><b>Keep On Reconnect</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep On Reconnect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Keep On Reconnect</em>' attribute.
   * @see #setKeepOnReconnect(boolean)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFIOActorConfiguration_KeepOnReconnect()
   * @model unique="false"
   * @generated
   */
	boolean isKeepOnReconnect();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFIOActorConfiguration#isKeepOnReconnect <em>Keep On Reconnect</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keep On Reconnect</em>' attribute.
   * @see #isKeepOnReconnect()
   * @generated
   */
	void setKeepOnReconnect(boolean value);

} // TFIOActorConfiguration
