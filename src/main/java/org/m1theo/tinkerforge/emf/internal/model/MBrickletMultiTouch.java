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

import com.tinkerforge.BrickletMultiTouch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Multi Touch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch#getRecalibrate <em>Recalibrate</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch#getSensitivity <em>Sensitivity</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletMultiTouch()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MDevice&lt;org.m1theo.tinkerforge.emf.internal.model.TinkerBrickletMultiTouch&gt; org.m1theo.tinkerforge.emf.internal.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.internal.model.MultiTouchDevice&gt; org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.BrickletMultiTouchConfiguration&gt;"
 * @generated
 */
public interface MBrickletMultiTouch extends MDevice<BrickletMultiTouch>, MSubDeviceHolder<MultiTouchDevice>, MTFConfigConsumer<BrickletMultiTouchConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_multitouch"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletMultiTouch_DeviceType()
   * @model default="bricklet_multitouch" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

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
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletMultiTouch_Recalibrate()
   * @model unique="false"
   * @generated
   */
	Boolean getRecalibrate();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch#getRecalibrate <em>Recalibrate</em>}' attribute.
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
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletMultiTouch_Sensitivity()
   * @model unique="false"
   * @generated
   */
	Short getSensitivity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch#getSensitivity <em>Sensitivity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensitivity</em>' attribute.
   * @see #getSensitivity()
   * @generated
   */
	void setSensitivity(Short value);

} // MBrickletMultiTouch
