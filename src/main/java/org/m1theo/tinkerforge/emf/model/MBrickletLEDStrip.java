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

import com.tinkerforge.BrickletLEDStrip;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet LED Strip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLEDStrip#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletLEDStrip#getColorMapping <em>Color Mapping</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLEDStrip()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.ProgrammableColorActor org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletLEDStrip&gt; org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.LEDStripConfiguration&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.LEDGroup&gt;"
 * @generated
 */
public interface MBrickletLEDStrip extends ProgrammableColorActor, MDevice<BrickletLEDStrip>, MTFConfigConsumer<LEDStripConfiguration>, MSubDeviceHolder<LEDGroup> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_ledstrip"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLEDStrip_DeviceType()
   * @model default="bricklet_ledstrip" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Color Mapping</b></em>' attribute.
   * The default value is <code>"rgb"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color Mapping</em>' attribute.
   * @see #setColorMapping(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletLEDStrip_ColorMapping()
   * @model default="rgb" unique="false"
   * @generated
   */
	String getColorMapping();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletLEDStrip#getColorMapping <em>Color Mapping</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Mapping</em>' attribute.
   * @see #getColorMapping()
   * @generated
   */
	void setColorMapping(String value);

} // MBrickletLEDStrip
