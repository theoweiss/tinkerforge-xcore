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

import org.m1theo.tinkerforge.types.HighLowValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Touch Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MultiTouchDevice#getPin <em>Pin</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.MultiTouchDevice#getDisableElectrode <em>Disable Electrode</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMultiTouchDevice()
 * @model superTypes="org.m1theo.tinkerforge.emf.internal.model.MSubDevice&lt;org.m1theo.tinkerforge.emf.internal.model.MBrickletMultiTouch&gt; org.m1theo.tinkerforge.emf.internal.model.MSensor&lt;org.m1theo.tinkerforge.emf.internal.model.DigitalValue&gt; org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.MultiTouchDeviceConfiguration&gt;"
 * @generated
 */
public interface MultiTouchDevice extends MSubDevice<MBrickletMultiTouch>, MSensor<HighLowValue>, MTFConfigConsumer<MultiTouchDeviceConfiguration> {
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
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMultiTouchDevice_Pin()
   * @model unique="false"
   * @generated
   */
	int getPin();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MultiTouchDevice#getPin <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin</em>' attribute.
   * @see #getPin()
   * @generated
   */
	void setPin(int value);

	/**
   * Returns the value of the '<em><b>Disable Electrode</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Electrode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Disable Electrode</em>' attribute.
   * @see #setDisableElectrode(Boolean)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getMultiTouchDevice_DisableElectrode()
   * @model unique="false"
   * @generated
   */
	Boolean getDisableElectrode();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.MultiTouchDevice#getDisableElectrode <em>Disable Electrode</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disable Electrode</em>' attribute.
   * @see #getDisableElectrode()
   * @generated
   */
	void setDisableElectrode(Boolean value);

} // MultiTouchDevice
