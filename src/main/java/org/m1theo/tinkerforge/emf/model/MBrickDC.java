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

import com.tinkerforge.BrickDC;

import java.math.BigDecimal;
import org.m1theo.tinkerforge.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBrick DC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getMaxVelocity <em>Max Velocity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getMinVelocity <em>Min Velocity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getTargetvelocity <em>Targetvelocity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getCurrentVelocity <em>Current Velocity</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getPwmFrequency <em>Pwm Frequency</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getDriveMode <em>Drive Mode</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MSensor&lt;org.m1theo.tinkerforge.emf.model.MDecimalValue&gt; org.m1theo.tinkerforge.emf.model.ProgrammableSwitchActor org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.MTinkerBrickDC&gt; org.m1theo.tinkerforge.emf.model.MoveActor org.m1theo.tinkerforge.emf.model.SetPointActor&lt;org.m1theo.tinkerforge.emf.model.TFBrickDCConfiguration&gt; org.m1theo.tinkerforge.emf.model.CallbackListener"
 * @generated
 */
public interface MBrickDC extends MSensor<DecimalValue>, ProgrammableSwitchActor, MDevice<BrickDC>, MoveActor, SetPointActor<TFBrickDCConfiguration>, CallbackListener {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"brick_dc"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_DeviceType()
   * @model default="brick_dc" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * The default value is <code>"10"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(BigDecimal)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_Threshold()
   * @model default="10" unique="false"
   * @generated
   */
	BigDecimal getThreshold();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
	void setThreshold(BigDecimal value);

	/**
   * Returns the value of the '<em><b>Max Velocity</b></em>' attribute.
   * The default value is <code>"32767"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Max Velocity</em>' attribute.
   * @see #setMaxVelocity(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_MaxVelocity()
   * @model default="32767" unique="false"
   * @generated
   */
	Short getMaxVelocity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getMaxVelocity <em>Max Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Velocity</em>' attribute.
   * @see #getMaxVelocity()
   * @generated
   */
	void setMaxVelocity(Short value);

	/**
   * Returns the value of the '<em><b>Min Velocity</b></em>' attribute.
   * The default value is <code>"-32767"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Min Velocity</em>' attribute.
   * @see #setMinVelocity(Short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_MinVelocity()
   * @model default="-32767" unique="false"
   * @generated
   */
	Short getMinVelocity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getMinVelocity <em>Min Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Velocity</em>' attribute.
   * @see #getMinVelocity()
   * @generated
   */
	void setMinVelocity(Short value);

	/**
   * Returns the value of the '<em><b>Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Velocity</em>' attribute.
   * @see #setVelocity(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_Velocity()
   * @model unique="false"
   * @generated
   */
	short getVelocity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getVelocity <em>Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Velocity</em>' attribute.
   * @see #getVelocity()
   * @generated
   */
	void setVelocity(short value);

	/**
   * Returns the value of the '<em><b>Targetvelocity</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetvelocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Targetvelocity</em>' attribute.
   * @see #setTargetvelocity(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_Targetvelocity()
   * @model default="0" unique="false"
   * @generated
   */
	short getTargetvelocity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getTargetvelocity <em>Targetvelocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Targetvelocity</em>' attribute.
   * @see #getTargetvelocity()
   * @generated
   */
	void setTargetvelocity(short value);

	/**
   * Returns the value of the '<em><b>Current Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Current Velocity</em>' attribute.
   * @see #setCurrentVelocity(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_CurrentVelocity()
   * @model unique="false"
   * @generated
   */
	short getCurrentVelocity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getCurrentVelocity <em>Current Velocity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Velocity</em>' attribute.
   * @see #getCurrentVelocity()
   * @generated
   */
	void setCurrentVelocity(short value);

	/**
   * Returns the value of the '<em><b>Acceleration</b></em>' attribute.
   * The default value is <code>"10000"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceleration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Acceleration</em>' attribute.
   * @see #setAcceleration(int)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_Acceleration()
   * @model default="10000" unique="false"
   * @generated
   */
	int getAcceleration();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getAcceleration <em>Acceleration</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acceleration</em>' attribute.
   * @see #getAcceleration()
   * @generated
   */
	void setAcceleration(int value);

	/**
   * Returns the value of the '<em><b>Pwm Frequency</b></em>' attribute.
   * The default value is <code>"15000"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwm Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pwm Frequency</em>' attribute.
   * @see #setPwmFrequency(int)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_PwmFrequency()
   * @model default="15000" unique="false"
   * @generated
   */
	int getPwmFrequency();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getPwmFrequency <em>Pwm Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pwm Frequency</em>' attribute.
   * @see #getPwmFrequency()
   * @generated
   */
	void setPwmFrequency(int value);

	/**
   * Returns the value of the '<em><b>Drive Mode</b></em>' attribute.
   * The default value is <code>"BRAKE"</code>.
   * The literals are from the enumeration {@link org.m1theo.tinkerforge.emf.model.DCDriveMode}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drive Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Drive Mode</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.DCDriveMode
   * @see #setDriveMode(DCDriveMode)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickDC_DriveMode()
   * @model default="BRAKE" unique="false"
   * @generated
   */
	DCDriveMode getDriveMode();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickDC#getDriveMode <em>Drive Mode</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Drive Mode</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.DCDriveMode
   * @see #getDriveMode()
   * @generated
   */
	void setDriveMode(DCDriveMode value);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
   * @generated
   */
	void init();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model unique="false" velocityUnique="false" accelerationUnique="false" drivemodeUnique="false"
   * @generated
   */
	boolean setSpeed(Short velocity, int acceleration, String drivemode);

} // MBrickDC
