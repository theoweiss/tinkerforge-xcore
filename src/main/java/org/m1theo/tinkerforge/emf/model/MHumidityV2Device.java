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

import org.m1theo.tinkerforge.types.DecimalValue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MHumidity V2 Device</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMHumidityV2Device()
 * @model interface="true" abstract="true" superTypes="org.m1theo.tinkerforge.emf.model.MSubDevice&lt;org.m1theo.tinkerforge.emf.model.MBrickletHumidityV2&gt; org.m1theo.tinkerforge.emf.model.MSensor&lt;org.m1theo.tinkerforge.emf.model.MDecimalValue&gt; org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.TFBaseConfiguration&gt; org.m1theo.tinkerforge.emf.model.CallbackListener"
 * @generated
 */
public interface MHumidityV2Device extends MSubDevice<MBrickletHumidityV2>, MSensor<DecimalValue>, MTFConfigConsumer<TFBaseConfiguration>, CallbackListener {
} // MHumidityV2Device
