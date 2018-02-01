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
import org.m1theo.tinkerforge.config.DeviceOptions;
import org.m1theo.tinkerforge.types.PercentValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percent Type Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.PercentTypeActor#getPercentValue <em>Percent Value</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getPercentTypeActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PercentTypeActor extends EObject {
	/**
   * Returns the value of the '<em><b>Percent Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Percent Value</em>' attribute.
   * @see #setPercentValue(PercentValue)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getPercentTypeActor_PercentValue()
   * @model unique="false" dataType="org.m1theo.tinkerforge.emf.model.PercentValue"
   * @generated
   */
	PercentValue getPercentValue();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.PercentTypeActor#getPercentValue <em>Percent Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percent Value</em>' attribute.
   * @see #getPercentValue()
   * @generated
   */
  void setPercentValue(PercentValue value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model newValueDataType="org.m1theo.tinkerforge.emf.model.PercentValue" newValueUnique="false" optsDataType="org.m1theo.tinkerforge.emf.model.DeviceOptions" optsUnique="false"
   * @generated
   */
  void setValue(PercentValue newValue, DeviceOptions opts);

} // PercentTypeActor
