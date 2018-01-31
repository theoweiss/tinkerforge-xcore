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
 * A representation of the model object '<em><b>Bricklet Multi Touch Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.BrickletMultiTouchConfiguration#getRecalibrate <em>Recalibrate</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.BrickletMultiTouchConfiguration#getSensitivity <em>Sensitivity</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getBrickletMultiTouchConfiguration()
 * @model
 * @generated
 */
public interface BrickletMultiTouchConfiguration extends TFConfig {
	/**
   * Returns the value of the '<em><b>Recalibrate</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recalibrate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Recalibrate</em>' attribute.
   * @see #setRecalibrate(Boolean)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getBrickletMultiTouchConfiguration_Recalibrate()
   * @model unique="false"
   * @generated
   */
	Boolean getRecalibrate();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.BrickletMultiTouchConfiguration#getRecalibrate <em>Recalibrate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recalibrate</em>' attribute.
   * @see #getRecalibrate()
   * @generated
   */
	void setRecalibrate(Boolean value);

	/**
   * Returns the value of the '<em><b>Sensitivity</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sensitivity</em>' attribute.
   * @see #setSensitivity(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getBrickletMultiTouchConfiguration_Sensitivity()
   * @model unique="false"
   * @generated
   */
	Short getSensitivity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.BrickletMultiTouchConfiguration#getSensitivity <em>Sensitivity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensitivity</em>' attribute.
   * @see #getSensitivity()
   * @generated
   */
	void setSensitivity(Short value);

} // BrickletMultiTouchConfiguration
