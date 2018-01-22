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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OHTF Sub Device Admin Device</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getOHTFSubDeviceAdminDevice()
 * @model IDSBounds="org.m1theo.tinkerforge.emf.internal.model.Enum"
 * @generated
 */
public interface OHTFSubDeviceAdminDevice<TFC extends TFConfig, IDS extends Enum> extends OHTFDevice<TFC, IDS> {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model unique="false" subIdUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
   * @generated
   */
	boolean isValidSubId(String subId);

} // OHTFSubDeviceAdminDevice
