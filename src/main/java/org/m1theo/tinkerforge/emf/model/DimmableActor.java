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

import java.math.BigDecimal;
import org.m1theo.tinkerforge.config.DeviceOptions;
import org.m1theo.tinkerforge.types.IncreaseDecreaseValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimmable Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DimmableActor#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.DimmableActor#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDimmableActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DimmableActor<TC extends DimmableConfiguration> extends MTFConfigConsumer<TC> {
	/**
   * Returns the value of the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' attribute.
   * @see #setMinValue(BigDecimal)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDimmableActor_MinValue()
   * @model unique="false"
   * @generated
   */
	BigDecimal getMinValue();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.DimmableActor#getMinValue <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' attribute.
   * @see #getMinValue()
   * @generated
   */
	void setMinValue(BigDecimal value);

	/**
   * Returns the value of the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' attribute.
   * @see #setMaxValue(BigDecimal)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getDimmableActor_MaxValue()
   * @model unique="false"
   * @generated
   */
	BigDecimal getMaxValue();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.DimmableActor#getMaxValue <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value</em>' attribute.
   * @see #getMaxValue()
   * @generated
   */
	void setMaxValue(BigDecimal value);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model increaseDecreaseDataType="org.m1theo.tinkerforge.emf.model.IncreaseDecreaseValue" increaseDecreaseUnique="false" optsDataType="org.m1theo.tinkerforge.emf.model.DeviceOptions" optsUnique="false"
   * @generated
   */
  void dimm(IncreaseDecreaseValue increaseDecrease, DeviceOptions opts);

} // DimmableActor
