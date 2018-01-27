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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laser Range Finder Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getDistanceAverageLength <em>Distance Average Length</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getVelocityAverageLength <em>Velocity Average Length</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getMode <em>Mode</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getEnableLaserOnStartup <em>Enable Laser On Startup</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderConfiguration()
 * @model
 * @generated
 */
public interface LaserRangeFinderConfiguration extends TFConfig {
	/**
   * Returns the value of the '<em><b>Distance Average Length</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Average Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Distance Average Length</em>' attribute.
   * @see #setDistanceAverageLength(short)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderConfiguration_DistanceAverageLength()
   * @model unique="false"
   * @generated
   */
	short getDistanceAverageLength();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getDistanceAverageLength <em>Distance Average Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance Average Length</em>' attribute.
   * @see #getDistanceAverageLength()
   * @generated
   */
	void setDistanceAverageLength(short value);

	/**
   * Returns the value of the '<em><b>Velocity Average Length</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Average Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Velocity Average Length</em>' attribute.
   * @see #setVelocityAverageLength(short)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderConfiguration_VelocityAverageLength()
   * @model unique="false"
   * @generated
   */
	short getVelocityAverageLength();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getVelocityAverageLength <em>Velocity Average Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Velocity Average Length</em>' attribute.
   * @see #getVelocityAverageLength()
   * @generated
   */
	void setVelocityAverageLength(short value);

	/**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(short)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderConfiguration_Mode()
   * @model unique="false"
   * @generated
   */
	short getMode();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
	void setMode(short value);

	/**
   * Returns the value of the '<em><b>Enable Laser On Startup</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Laser On Startup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enable Laser On Startup</em>' attribute.
   * @see #setEnableLaserOnStartup(Boolean)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getLaserRangeFinderConfiguration_EnableLaserOnStartup()
   * @model unique="false"
   * @generated
   */
	Boolean getEnableLaserOnStartup();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.LaserRangeFinderConfiguration#getEnableLaserOnStartup <em>Enable Laser On Startup</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable Laser On Startup</em>' attribute.
   * @see #getEnableLaserOnStartup()
   * @generated
   */
	void setEnableLaserOnStartup(Boolean value);

} // LaserRangeFinderConfiguration
