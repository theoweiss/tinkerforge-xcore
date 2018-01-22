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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Switch BConfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration#getAddress <em>Address</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration#getRepeats <em>Repeats</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getRemoteSwitchBConfiguration()
 * @model
 * @generated
 */
public interface RemoteSwitchBConfiguration extends DimmableConfiguration {
	/**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(Long)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getRemoteSwitchBConfiguration_Address()
   * @model unique="false"
   * @generated
   */
	Long getAddress();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
	void setAddress(Long value);

	/**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(Short)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getRemoteSwitchBConfiguration_Unit()
   * @model unique="false"
   * @generated
   */
	Short getUnit();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
	void setUnit(Short value);

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
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getRemoteSwitchBConfiguration_Repeats()
   * @model unique="false"
   * @generated
   */
	Short getRepeats();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.RemoteSwitchBConfiguration#getRepeats <em>Repeats</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeats</em>' attribute.
   * @see #getRepeats()
   * @generated
   */
	void setRepeats(Short value);

} // RemoteSwitchBConfiguration
