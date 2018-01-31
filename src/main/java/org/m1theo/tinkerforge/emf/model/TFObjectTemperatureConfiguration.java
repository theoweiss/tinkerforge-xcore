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
 * A representation of the model object '<em><b>TF Object Temperature Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.TFObjectTemperatureConfiguration#getEmissivity <em>Emissivity</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFObjectTemperatureConfiguration()
 * @model
 * @generated
 */
public interface TFObjectTemperatureConfiguration extends TFBaseConfiguration {
	/**
   * Returns the value of the '<em><b>Emissivity</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emissivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Emissivity</em>' attribute.
   * @see #setEmissivity(int)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getTFObjectTemperatureConfiguration_Emissivity()
   * @model unique="false"
   * @generated
   */
	int getEmissivity();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.TFObjectTemperatureConfiguration#getEmissivity <em>Emissivity</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Emissivity</em>' attribute.
   * @see #getEmissivity()
   * @generated
   */
	void setEmissivity(int value);

} // TFObjectTemperatureConfiguration
