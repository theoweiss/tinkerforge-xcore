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
import org.m1theo.tinkerforge.types.HighLowValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.DigitalActor#getDigitalState <em>Digital State</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getDigitalActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DigitalActor extends EObject {
	/**
   * Returns the value of the '<em><b>Digital State</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Digital State</em>' attribute.
   * @see #setDigitalState(HighLowValue)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getDigitalActor_DigitalState()
   * @model unique="false" dataType="org.m1theo.tinkerforge.emf.internal.model.DigitalValue"
   * @generated
   */
	HighLowValue getDigitalState();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.DigitalActor#getDigitalState <em>Digital State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digital State</em>' attribute.
   * @see #getDigitalState()
   * @generated
   */
  void setDigitalState(HighLowValue value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model digitalStateDataType="org.m1theo.tinkerforge.emf.internal.model.DigitalValue" digitalStateUnique="false"
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

} // DigitalActor
