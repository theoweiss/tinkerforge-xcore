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
 * A representation of the model object '<em><b>Remote Switch CConfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.RemoteSwitchCConfiguration#getSystemCode <em>System Code</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.RemoteSwitchCConfiguration#getDeviceCode <em>Device Code</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.RemoteSwitchCConfiguration#getRepeats <em>Repeats</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getRemoteSwitchCConfiguration()
 * @model
 * @generated
 */
public interface RemoteSwitchCConfiguration extends TFConfig {
	/**
   * Returns the value of the '<em><b>System Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>System Code</em>' attribute.
   * @see #setSystemCode(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getRemoteSwitchCConfiguration_SystemCode()
   * @model unique="false"
   * @generated
   */
	String getSystemCode();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.RemoteSwitchCConfiguration#getSystemCode <em>System Code</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>System Code</em>' attribute.
   * @see #getSystemCode()
   * @generated
   */
	void setSystemCode(String value);

	/**
   * Returns the value of the '<em><b>Device Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Code</em>' attribute.
   * @see #setDeviceCode(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getRemoteSwitchCConfiguration_DeviceCode()
   * @model unique="false"
   * @generated
   */
	Short getDeviceCode();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.RemoteSwitchCConfiguration#getDeviceCode <em>Device Code</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device Code</em>' attribute.
   * @see #getDeviceCode()
   * @generated
   */
	void setDeviceCode(Short value);

	/**
   * Returns the value of the '<em><b>Repeats</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Repeats</em>' attribute.
   * @see #setRepeats(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getRemoteSwitchCConfiguration_Repeats()
   * @model unique="false"
   * @generated
   */
	Short getRepeats();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.RemoteSwitchCConfiguration#getRepeats <em>Repeats</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeats</em>' attribute.
   * @see #getRepeats()
   * @generated
   */
	void setRepeats(Short value);

} // RemoteSwitchCConfiguration
