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
 * A representation of the model object '<em><b>Button Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.ButtonConfiguration#isTactile <em>Tactile</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getButtonConfiguration()
 * @model
 * @generated
 */
public interface ButtonConfiguration extends TFConfig {
	/**
   * Returns the value of the '<em><b>Tactile</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tactile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Tactile</em>' attribute.
   * @see #setTactile(boolean)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getButtonConfiguration_Tactile()
   * @model default="false" unique="false"
   * @generated
   */
	boolean isTactile();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.ButtonConfiguration#isTactile <em>Tactile</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tactile</em>' attribute.
   * @see #isTactile()
   * @generated
   */
	void setTactile(boolean value);

} // ButtonConfiguration
