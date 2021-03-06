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

import org.m1theo.tinkerforge.types.HighLowValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Actor IO4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DigitalActorIO4#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DigitalActorIO4#getPin <em>Pin</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DigitalActorIO4#getDefaultState <em>Default State</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DigitalActorIO4#isKeepOnReconnect <em>Keep On Reconnect</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorIO4()
 * @model
 * @generated
 */
public interface DigitalActorIO4 extends DigitalActor, IO4Device, MTFConfigConsumer<TFIOActorConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"io4_actuator"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorIO4_DeviceType()
   * @model default="io4_actuator" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pin</em>' attribute.
   * @see #setPin(int)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorIO4_Pin()
   * @model unique="false"
   * @generated
   */
	int getPin();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.DigitalActorIO4#getPin <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin</em>' attribute.
   * @see #getPin()
   * @generated
   */
	void setPin(int value);

	/**
   * Returns the value of the '<em><b>Default State</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Default State</em>' attribute.
   * @see #setDefaultState(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorIO4_DefaultState()
   * @model unique="false"
   * @generated
   */
	String getDefaultState();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.DigitalActorIO4#getDefaultState <em>Default State</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default State</em>' attribute.
   * @see #getDefaultState()
   * @generated
   */
	void setDefaultState(String value);

	/**
   * Returns the value of the '<em><b>Keep On Reconnect</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep On Reconnect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Keep On Reconnect</em>' attribute.
   * @see #setKeepOnReconnect(boolean)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorIO4_KeepOnReconnect()
   * @model default="false" unique="false"
   * @generated
   */
	boolean isKeepOnReconnect();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.DigitalActorIO4#isKeepOnReconnect <em>Keep On Reconnect</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keep On Reconnect</em>' attribute.
   * @see #isKeepOnReconnect()
   * @generated
   */
	void setKeepOnReconnect(boolean value);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model digitalStateDataType="org.m1theo.tinkerforge.emf.model.DigitalValue" digitalStateUnique="false"
   * @generated
   */
  void turnDigital(HighLowValue digitalState);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model
   * @generated
   */
	void fetchDigitalValue();

} // DigitalActorIO4
