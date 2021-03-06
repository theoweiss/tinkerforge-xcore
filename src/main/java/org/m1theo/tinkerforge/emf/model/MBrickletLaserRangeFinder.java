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

import com.tinkerforge.BrickletLaserRangeFinder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Laser Range Finder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getDistanceAverageLength <em>Distance Average Length</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getVelocityAverageLength <em>Velocity Average Length</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getMode <em>Mode</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getEnableLaserOnStartup <em>Enable Laser On Startup</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLaserRangeFinder()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletLaserRangeFinder&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.LaserRangeFinderDevice&gt; org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.LaserRangeFinderConfiguration&gt;"
 * @generated
 */
public interface MBrickletLaserRangeFinder extends MDevice<BrickletLaserRangeFinder>, MSubDeviceHolder<LaserRangeFinderDevice>, MTFConfigConsumer<LaserRangeFinderConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_laser_range_finder"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLaserRangeFinder_DeviceType()
   * @model default="bricklet_laser_range_finder" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Distance Average Length</b></em>' attribute.
   * The default value is <code>"10"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Average Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Distance Average Length</em>' attribute.
   * @see #setDistanceAverageLength(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLaserRangeFinder_DistanceAverageLength()
   * @model default="10" unique="false"
   * @generated
   */
	short getDistanceAverageLength();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getDistanceAverageLength <em>Distance Average Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance Average Length</em>' attribute.
   * @see #getDistanceAverageLength()
   * @generated
   */
	void setDistanceAverageLength(short value);

	/**
   * Returns the value of the '<em><b>Velocity Average Length</b></em>' attribute.
   * The default value is <code>"10"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Average Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Velocity Average Length</em>' attribute.
   * @see #setVelocityAverageLength(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLaserRangeFinder_VelocityAverageLength()
   * @model default="10" unique="false"
   * @generated
   */
	short getVelocityAverageLength();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getVelocityAverageLength <em>Velocity Average Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Velocity Average Length</em>' attribute.
   * @see #getVelocityAverageLength()
   * @generated
   */
	void setVelocityAverageLength(short value);

	/**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLaserRangeFinder_Mode()
   * @model default="0" unique="false"
   * @generated
   */
	short getMode();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
	void setMode(short value);

	/**
   * Returns the value of the '<em><b>Enable Laser On Startup</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Laser On Startup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enable Laser On Startup</em>' attribute.
   * @see #setEnableLaserOnStartup(Boolean)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLaserRangeFinder_EnableLaserOnStartup()
   * @model default="true" unique="false"
   * @generated
   */
	Boolean getEnableLaserOnStartup();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLaserRangeFinder#getEnableLaserOnStartup <em>Enable Laser On Startup</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable Laser On Startup</em>' attribute.
   * @see #getEnableLaserOnStartup()
   * @generated
   */
	void setEnableLaserOnStartup(Boolean value);

} // MBrickletLaserRangeFinder
