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

import com.tinkerforge.BrickletCO2;

import java.math.BigDecimal;
import org.m1theo.tinkerforge.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet CO2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletCO2#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletCO2#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletCO2()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MDevice&lt;org.m1theo.tinkerforge.emf.internal.model.TinkerBrickletCO2&gt; org.m1theo.tinkerforge.emf.internal.model.MSensor&lt;org.m1theo.tinkerforge.emf.internal.model.MDecimalValue&gt; org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.TFBaseConfiguration&gt; org.m1theo.tinkerforge.emf.internal.model.CallbackListener"
 * @generated
 */
public interface MBrickletCO2 extends MDevice<BrickletCO2>, MSensor<DecimalValue>, MTFConfigConsumer<TFBaseConfiguration>, CallbackListener {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_co2"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletCO2_DeviceType()
   * @model default="bricklet_co2" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(BigDecimal)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMBrickletCO2_Threshold()
   * @model default="0" unique="false"
   * @generated
   */
	BigDecimal getThreshold();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MBrickletCO2#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
	void setThreshold(BigDecimal value);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
   * @generated
   */
	void init();

} // MBrickletCO2
