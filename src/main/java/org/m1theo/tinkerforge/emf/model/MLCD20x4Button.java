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

import org.m1theo.tinkerforge.types.OnOffValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MLCD2 0x4 Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MLCD20x4Button#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MLCD20x4Button#getButtonNum <em>Button Num</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMLCD20x4Button()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MSensor&lt;org.m1theo.tinkerforge.emf.model.SwitchState&gt; org.m1theo.tinkerforge.emf.model.MLCDSubDevice org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.ButtonConfiguration&gt;"
 * @generated
 */
public interface MLCD20x4Button extends MSensor<OnOffValue>, MLCDSubDevice, MTFConfigConsumer<ButtonConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"lcd_button"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMLCD20x4Button_DeviceType()
   * @model default="lcd_button" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Button Num</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Button Num</em>' attribute.
   * @see #setButtonNum(short)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMLCD20x4Button_ButtonNum()
   * @model unique="false"
   * @generated
   */
	short getButtonNum();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MLCD20x4Button#getButtonNum <em>Button Num</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Button Num</em>' attribute.
   * @see #getButtonNum()
   * @generated
   */
	void setButtonNum(short value);

} // MLCD20x4Button
