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

import org.m1theo.tinkerforge.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Current Device</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.m1theo.tinkerforge.emf.internal.model.ModelPackage#getVoltageCurrentDevice()
 * @model interface="true" abstract="true" superTypes="org.m1theo.tinkerforge.emf.internal.model.MSensor&lt;org.m1theo.tinkerforge.emf.internal.model.MDecimalValue&gt; org.m1theo.tinkerforge.emf.internal.model.MSubDevice&lt;org.m1theo.tinkerforge.emf.internal.model.MBrickletVoltageCurrent&gt; org.m1theo.tinkerforge.emf.internal.model.CallbackListener org.m1theo.tinkerforge.emf.internal.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.internal.model.TFBaseConfiguration&gt;"
 * @generated
 */
public interface VoltageCurrentDevice extends MSensor<DecimalValue>, MSubDevice<MBrickletVoltageCurrent>, CallbackListener, MTFConfigConsumer<TFBaseConfiguration> {
} // VoltageCurrentDevice
