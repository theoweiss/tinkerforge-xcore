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
 * A representation of the model object '<em><b>TF Distance US Bricklet Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFDistanceUSBrickletConfiguration#getMovingAverage <em>Moving Average</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFDistanceUSBrickletConfiguration()
 * @model
 * @generated
 */
public interface TFDistanceUSBrickletConfiguration extends TFBaseConfiguration {
	/**
   * Returns the value of the '<em><b>Moving Average</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moving Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Moving Average</em>' attribute.
   * @see #setMovingAverage(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFDistanceUSBrickletConfiguration_MovingAverage()
   * @model unique="false"
   * @generated
   */
	Short getMovingAverage();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFDistanceUSBrickletConfiguration#getMovingAverage <em>Moving Average</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moving Average</em>' attribute.
   * @see #getMovingAverage()
   * @generated
   */
	void setMovingAverage(Short value);

} // TFDistanceUSBrickletConfiguration
