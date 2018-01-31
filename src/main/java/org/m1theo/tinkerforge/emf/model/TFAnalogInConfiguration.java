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
 * A representation of the model object '<em><b>TF Analog In Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFAnalogInConfiguration#getMovingAverage <em>Moving Average</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFAnalogInConfiguration#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFAnalogInConfiguration()
 * @model
 * @generated
 */
public interface TFAnalogInConfiguration extends TFBaseConfiguration {
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
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFAnalogInConfiguration_MovingAverage()
   * @model unique="false"
   * @generated
   */
	Short getMovingAverage();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFAnalogInConfiguration#getMovingAverage <em>Moving Average</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moving Average</em>' attribute.
   * @see #getMovingAverage()
   * @generated
   */
	void setMovingAverage(Short value);

	/**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see #setRange(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFAnalogInConfiguration_Range()
   * @model unique="false"
   * @generated
   */
	Short getRange();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFAnalogInConfiguration#getRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see #getRange()
   * @generated
   */
	void setRange(Short value);

} // TFAnalogInConfiguration
