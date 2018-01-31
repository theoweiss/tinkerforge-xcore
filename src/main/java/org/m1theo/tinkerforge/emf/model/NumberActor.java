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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getNumberActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NumberActor extends EObject {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model valueUnique="false"
   * @generated
   */
	void setNumber(BigDecimal value);

} // NumberActor
