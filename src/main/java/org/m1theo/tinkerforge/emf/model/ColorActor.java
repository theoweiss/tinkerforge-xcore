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
import org.m1theo.tinkerforge.types.HSBValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.ColorActor#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getColorActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ColorActor extends EObject {
	/**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(HSBValue)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getColorActor_Color()
   * @model unique="false" dataType="org.m1theo.tinkerforge.emf.model.HSBValue"
   * @generated
   */
	HSBValue getColor();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.ColorActor#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
  void setColor(HSBValue value);

} // ColorActor
