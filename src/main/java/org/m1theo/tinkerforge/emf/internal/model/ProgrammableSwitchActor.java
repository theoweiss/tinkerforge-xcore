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

import org.m1theo.tinkerforge.internal.config.DeviceOptions;
import org.m1theo.tinkerforge.types.OnOffValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programmable Switch Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getProgrammableSwitchActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProgrammableSwitchActor extends SwitchSensor {
	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model stateDataType="org.m1theo.tinkerforge.emf.internal.model.SwitchState" stateUnique="false" optsDataType="org.m1theo.tinkerforge.emf.internal.model.DeviceOptions" optsUnique="false"
   * @generated
   */
  void turnSwitch(OnOffValue state, DeviceOptions opts);

} // ProgrammableSwitchActor
