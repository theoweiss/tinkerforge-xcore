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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.InterruptListener#getDebouncePeriod <em>Debounce Period</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getInterruptListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InterruptListener extends EObject {
	/**
   * Returns the value of the '<em><b>Debounce Period</b></em>' attribute.
   * The default value is <code>"100"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debounce Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Debounce Period</em>' attribute.
   * @see #setDebouncePeriod(long)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getInterruptListener_DebouncePeriod()
   * @model default="100" unique="false"
   * @generated
   */
	long getDebouncePeriod();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.InterruptListener#getDebouncePeriod <em>Debounce Period</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debounce Period</em>' attribute.
   * @see #getDebouncePeriod()
   * @generated
   */
	void setDebouncePeriod(long value);

} // InterruptListener
