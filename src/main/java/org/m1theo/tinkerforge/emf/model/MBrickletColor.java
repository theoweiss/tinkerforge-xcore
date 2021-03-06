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

import com.tinkerforge.BrickletColor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletColor#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletColor#getGain <em>Gain</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletColor#getIntegrationTime <em>Integration Time</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletColor()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletColor&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.BrickletColorDevice&gt; org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.BrickletColorConfiguration&gt;"
 * @generated
 */
public interface MBrickletColor extends MDevice<BrickletColor>, MSubDeviceHolder<BrickletColorDevice>, MTFConfigConsumer<BrickletColorConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_color"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletColor_DeviceType()
   * @model default="bricklet_color" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Gain</b></em>' attribute.
   * The default value is <code>"3"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Gain</em>' attribute.
   * @see #setGain(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletColor_Gain()
   * @model default="3" unique="false"
   * @generated
   */
	Short getGain();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletColor#getGain <em>Gain</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gain</em>' attribute.
   * @see #getGain()
   * @generated
   */
	void setGain(Short value);

	/**
   * Returns the value of the '<em><b>Integration Time</b></em>' attribute.
   * The default value is <code>"3"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Integration Time</em>' attribute.
   * @see #setIntegrationTime(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletColor_IntegrationTime()
   * @model default="3" unique="false"
   * @generated
   */
	Short getIntegrationTime();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletColor#getIntegrationTime <em>Integration Time</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integration Time</em>' attribute.
   * @see #getIntegrationTime()
   * @generated
   */
	void setIntegrationTime(Short value);

} // MBrickletColor
