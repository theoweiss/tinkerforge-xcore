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

import com.tinkerforge.BrickletLCD20x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet LCD2 0x4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#getPositionPrefix <em>Position Prefix</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#getPositonSuffix <em>Positon Suffix</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#isDisplayErrors <em>Display Errors</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#getErrorPrefix <em>Error Prefix</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLCD20x4()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.MTinkerBrickletLCD20x4&gt; org.m1theo.tinkerforge.emf.model.MTextActor org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.MLCDSubDevice&gt;"
 * @generated
 */
public interface MBrickletLCD20x4 extends MDevice<BrickletLCD20x4>, MTextActor, MSubDeviceHolder<MLCDSubDevice> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_LCD20x4"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLCD20x4_DeviceType()
   * @model default="bricklet_LCD20x4" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Position Prefix</b></em>' attribute.
   * The default value is <code>"TFNUM<"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Position Prefix</em>' attribute.
   * @see #setPositionPrefix(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLCD20x4_PositionPrefix()
   * @model default="TFNUM&lt;" unique="false"
   * @generated
   */
	String getPositionPrefix();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#getPositionPrefix <em>Position Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position Prefix</em>' attribute.
   * @see #getPositionPrefix()
   * @generated
   */
	void setPositionPrefix(String value);

	/**
   * Returns the value of the '<em><b>Positon Suffix</b></em>' attribute.
   * The default value is <code>">"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positon Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Positon Suffix</em>' attribute.
   * @see #setPositonSuffix(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLCD20x4_PositonSuffix()
   * @model default="&gt;" unique="false"
   * @generated
   */
	String getPositonSuffix();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#getPositonSuffix <em>Positon Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Positon Suffix</em>' attribute.
   * @see #getPositonSuffix()
   * @generated
   */
	void setPositonSuffix(String value);

	/**
   * Returns the value of the '<em><b>Display Errors</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Display Errors</em>' attribute.
   * @see #setDisplayErrors(boolean)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLCD20x4_DisplayErrors()
   * @model default="true" unique="false"
   * @generated
   */
	boolean isDisplayErrors();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLCD20x4#isDisplayErrors <em>Display Errors</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Errors</em>' attribute.
   * @see #isDisplayErrors()
   * @generated
   */
	void setDisplayErrors(boolean value);

	/**
   * Returns the value of the '<em><b>Error Prefix</b></em>' attribute.
   * The default value is <code>"openhab Error:"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Error Prefix</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLCD20x4_ErrorPrefix()
   * @model default="openhab Error:" unique="false" changeable="false"
   * @generated
   */
	String getErrorPrefix();

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
   * @model unique="false"
   * @generated
   */
	boolean clear();

} // MBrickletLCD20x4
