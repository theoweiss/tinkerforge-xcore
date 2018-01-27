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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callback Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.internal.model.CallbackListener#getCallbackPeriod <em>Callback Period</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getCallbackListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CallbackListener extends EObject {
	/**
   * Returns the value of the '<em><b>Callback Period</b></em>' attribute.
   * The default value is <code>"1000"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Callback Period</em>' attribute.
   * @see #setCallbackPeriod(long)
   * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getCallbackListener_CallbackPeriod()
   * @model default="1000" unique="false"
   * @generated
   */
	long getCallbackPeriod();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.internal.model.CallbackListener#getCallbackPeriod <em>Callback Period</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callback Period</em>' attribute.
   * @see #getCallbackPeriod()
   * @generated
   */
	void setCallbackPeriod(long value);

} // CallbackListener
