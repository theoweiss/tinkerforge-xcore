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

import java.math.BigDecimal;
import org.m1theo.tinkerforge.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laser Range Finder Velocity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderVelocity#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderVelocity#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderVelocity()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderDevice org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.TFBaseConfiguration&gt; org.m1theo.tinkerforge.emf.internal.model.MSensor&lt;org.m1theo.tinkerforge.emf.internal.model.MDecimalValue&gt; org.m1theo.tinkerforge.emf.internal.model.CallbackListener"
 * @generated
 */
public interface LaserRangeFinderVelocity extends LaserRangeFinderDevice, MTFConfigConsumer<TFBaseConfiguration>, MSensor<DecimalValue>, CallbackListener {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"laser_range_finder_velocity"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderVelocity_DeviceType()
   * @model default="laser_range_finder_velocity" unique="false" changeable="false"
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
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderVelocity_Threshold()
   * @model default="0" unique="false"
   * @generated
   */
	BigDecimal getThreshold();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderVelocity#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
	void setThreshold(BigDecimal value);

} // LaserRangeFinderVelocity