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

import org.eclipse.emf.ecore.EObject;
import org.m1theo.tinkerforge.types.TinkerforgeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MSensor#getSensorValue <em>Sensor Value</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMSensor()
 * @model interface="true" abstract="true" DeviceValueBounds="org.m1theo.tinkerforge.emf.model.MTinkerforgeValue"
 * @generated
 */
public interface MSensor<DeviceValue extends TinkerforgeValue> extends EObject {
	/**
   * Returns the value of the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor Value</em>' attribute.
   * @see #setSensorValue(TinkerforgeValue)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMSensor_SensorValue()
   * @model unique="false"
   * @generated
   */
	DeviceValue getSensorValue();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MSensor#getSensorValue <em>Sensor Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor Value</em>' attribute.
   * @see #getSensorValue()
   * @generated
   */
	void setSensorValue(DeviceValue value);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model
   * @generated
   */
	void fetchSensorValue();

} // MSensor
