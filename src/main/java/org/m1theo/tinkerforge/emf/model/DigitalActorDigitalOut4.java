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
 * A representation of the model object '<em><b>Digital Actor Digital Out4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DigitalActorDigitalOut4#getPin <em>Pin</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DigitalActorDigitalOut4#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorDigitalOut4()
 * @model
 * @generated
 */
public interface DigitalActorDigitalOut4 extends DigitalActor, MSubDevice<MBrickletIndustrialDigitalOut4> {
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
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorDigitalOut4_Pin()
   * @model unique="false"
   * @generated
   */
	int getPin();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.DigitalActorDigitalOut4#getPin <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin</em>' attribute.
   * @see #getPin()
   * @generated
   */
	void setPin(int value);

	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"digital_4out"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDigitalActorDigitalOut4_DeviceType()
   * @model default="digital_4out" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

} // DigitalActorDigitalOut4
