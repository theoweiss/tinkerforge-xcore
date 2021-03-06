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
package org.m1theo.tinkerforge.emf.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.m1theo.tinkerforge.emf.model.ModelPackage;
import org.m1theo.tinkerforge.emf.model.OHTFDevice;
import org.m1theo.tinkerforge.emf.model.OHTFSubDeviceAdminDevice;
import org.m1theo.tinkerforge.emf.model.TFConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OHTF Sub Device Admin Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OHTFSubDeviceAdminDeviceImpl<TFC extends TFConfig, IDS extends Enum> extends OHTFDeviceImpl<TFC, IDS>
        implements OHTFSubDeviceAdminDevice<TFC, IDS> {
    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected OHTFSubDeviceAdminDeviceImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ModelPackage.eINSTANCE.getOHTFSubDeviceAdminDevice();
  }

				/**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public boolean isValidSubId(final String subId) {
    return true;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
    if (baseClass == OHTFDevice.class) {
      switch (baseOperationID) {
        case ModelPackage.OHTF_DEVICE___IS_VALID_SUB_ID__STRING: return ModelPackage.OHTF_SUB_DEVICE_ADMIN_DEVICE___IS_VALID_SUB_ID__STRING;
        default: return super.eDerivedOperationID(baseOperationID, baseClass);
      }
    }
    return super.eDerivedOperationID(baseOperationID, baseClass);
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case ModelPackage.OHTF_SUB_DEVICE_ADMIN_DEVICE___IS_VALID_SUB_ID__STRING:
        return isValidSubId((String)arguments.get(0));
    }
    return super.eInvoke(operationID, arguments);
  }

} // OHTFSubDeviceAdminDeviceImpl
