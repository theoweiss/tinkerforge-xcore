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
 * A representation of the model object '<em><b>TFPTC Bricklet Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFPTCBrickletConfiguration#getNoiseRejectionFilter <em>Noise Rejection Filter</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFPTCBrickletConfiguration#getWireMode <em>Wire Mode</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFPTCBrickletConfiguration()
 * @model
 * @generated
 */
public interface TFPTCBrickletConfiguration extends TFConfig {
	/**
   * Returns the value of the '<em><b>Noise Rejection Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noise Rejection Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Noise Rejection Filter</em>' attribute.
   * @see #setNoiseRejectionFilter(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFPTCBrickletConfiguration_NoiseRejectionFilter()
   * @model unique="false"
   * @generated
   */
	Short getNoiseRejectionFilter();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFPTCBrickletConfiguration#getNoiseRejectionFilter <em>Noise Rejection Filter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Noise Rejection Filter</em>' attribute.
   * @see #getNoiseRejectionFilter()
   * @generated
   */
	void setNoiseRejectionFilter(Short value);

	/**
   * Returns the value of the '<em><b>Wire Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Wire Mode</em>' attribute.
   * @see #setWireMode(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFPTCBrickletConfiguration_WireMode()
   * @model unique="false"
   * @generated
   */
	Short getWireMode();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFPTCBrickletConfiguration#getWireMode <em>Wire Mode</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wire Mode</em>' attribute.
   * @see #getWireMode()
   * @generated
   */
	void setWireMode(Short value);

} // TFPTCBrickletConfiguration
