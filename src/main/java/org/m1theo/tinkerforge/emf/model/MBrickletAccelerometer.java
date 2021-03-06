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

import com.tinkerforge.BrickletAccelerometer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Accelerometer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletAccelerometer#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletAccelerometer#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletAccelerometer#getFullScale <em>Full Scale</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletAccelerometer#getFilterBandwidth <em>Filter Bandwidth</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletAccelerometer()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletAccelerometer&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.AccelerometerDevice&gt; org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.BrickletAccelerometerConfiguration&gt;"
 * @generated
 */
public interface MBrickletAccelerometer extends MDevice<BrickletAccelerometer>, MSubDeviceHolder<AccelerometerDevice>, MTFConfigConsumer<BrickletAccelerometerConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_accelerometer"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletAccelerometer_DeviceType()
   * @model default="bricklet_accelerometer" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Data Rate</b></em>' attribute.
   * The default value is <code>"6"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Data Rate</em>' attribute.
   * @see #setDataRate(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletAccelerometer_DataRate()
   * @model default="6" unique="false"
   * @generated
   */
	Short getDataRate();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletAccelerometer#getDataRate <em>Data Rate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Rate</em>' attribute.
   * @see #getDataRate()
   * @generated
   */
	void setDataRate(Short value);

	/**
   * Returns the value of the '<em><b>Full Scale</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Full Scale</em>' attribute.
   * @see #setFullScale(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletAccelerometer_FullScale()
   * @model default="1" unique="false"
   * @generated
   */
	Short getFullScale();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletAccelerometer#getFullScale <em>Full Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Full Scale</em>' attribute.
   * @see #getFullScale()
   * @generated
   */
	void setFullScale(Short value);

	/**
   * Returns the value of the '<em><b>Filter Bandwidth</b></em>' attribute.
   * The default value is <code>"2"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Bandwidth</em>' attribute.
   * @see #setFilterBandwidth(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletAccelerometer_FilterBandwidth()
   * @model default="2" unique="false"
   * @generated
   */
	Short getFilterBandwidth();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletAccelerometer#getFilterBandwidth <em>Filter Bandwidth</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Bandwidth</em>' attribute.
   * @see #getFilterBandwidth()
   * @generated
   */
	void setFilterBandwidth(Short value);

} // MBrickletAccelerometer
