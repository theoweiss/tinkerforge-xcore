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

import org.eclipse.emf.ecore.EObject;
import org.m1theo.tinkerforge.types.OnOffValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.SwitchSensor#getSwitchState <em>Switch State</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getSwitchSensor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SwitchSensor extends EObject {
	/**
   * Returns the value of the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Switch State</em>' attribute.
   * @see #setSwitchState(OnOffValue)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getSwitchSensor_SwitchState()
   * @model unique="false" dataType="org.m1theo.tinkerforge.emf.internal.model.SwitchState"
   * @generated
   */
	OnOffValue getSwitchState();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.SwitchSensor#getSwitchState <em>Switch State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch State</em>' attribute.
   * @see #getSwitchState()
   * @generated
   */
  void setSwitchState(OnOffValue value);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model
   * @generated
   */
	void fetchSwitchState();

} // SwitchSensor
