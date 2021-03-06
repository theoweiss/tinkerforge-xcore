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

import com.tinkerforge.BrickletRemoteSwitch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBricklet Remote Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletRemoteSwitch#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletRemoteSwitch#getTypeADevices <em>Type ADevices</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletRemoteSwitch#getTypeBDevices <em>Type BDevices</em>}</li>
 *   <li>{@link org.m1theo.tinkerforge.emf.model.MBrickletRemoteSwitch#getTypeCDevices <em>Type CDevices</em>}</li>
 * </ul>
 *
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletRemoteSwitch()
 * @model superTypes="org.m1theo.tinkerforge.emf.model.MDevice&lt;org.m1theo.tinkerforge.emf.model.TinkerBrickletRemoteSwitch&gt; org.m1theo.tinkerforge.emf.model.MSubDeviceHolder&lt;org.m1theo.tinkerforge.emf.model.RemoteSwitch&gt; org.m1theo.tinkerforge.emf.model.SubDeviceAdmin org.m1theo.tinkerforge.emf.model.MTFConfigConsumer&lt;org.m1theo.tinkerforge.emf.model.BrickletRemoteSwitchConfiguration&gt;"
 * @generated
 */
public interface MBrickletRemoteSwitch extends MDevice<BrickletRemoteSwitch>, MSubDeviceHolder<RemoteSwitch>, SubDeviceAdmin, MTFConfigConsumer<BrickletRemoteSwitchConfiguration> {
	/**
   * Returns the value of the '<em><b>Device Type</b></em>' attribute.
   * The default value is <code>"bricklet_remote_switch"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Type</em>' attribute.
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletRemoteSwitch_DeviceType()
   * @model default="bricklet_remote_switch" unique="false" changeable="false"
   * @generated
   */
	String getDeviceType();

	/**
   * Returns the value of the '<em><b>Type ADevices</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type ADevices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type ADevices</em>' attribute.
   * @see #setTypeADevices(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletRemoteSwitch_TypeADevices()
   * @model unique="false"
   * @generated
   */
	String getTypeADevices();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletRemoteSwitch#getTypeADevices <em>Type ADevices</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type ADevices</em>' attribute.
   * @see #getTypeADevices()
   * @generated
   */
	void setTypeADevices(String value);

	/**
   * Returns the value of the '<em><b>Type BDevices</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type BDevices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type BDevices</em>' attribute.
   * @see #setTypeBDevices(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletRemoteSwitch_TypeBDevices()
   * @model unique="false"
   * @generated
   */
	String getTypeBDevices();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletRemoteSwitch#getTypeBDevices <em>Type BDevices</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type BDevices</em>' attribute.
   * @see #getTypeBDevices()
   * @generated
   */
	void setTypeBDevices(String value);

	/**
   * Returns the value of the '<em><b>Type CDevices</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type CDevices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type CDevices</em>' attribute.
   * @see #setTypeCDevices(String)
   * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getMBrickletRemoteSwitch_TypeCDevices()
   * @model unique="false"
   * @generated
   */
	String getTypeCDevices();

	/**
   * Sets the value of the '{@link org.m1theo.tinkerforge.emf.model.MBrickletRemoteSwitch#getTypeCDevices <em>Type CDevices</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type CDevices</em>' attribute.
   * @see #getTypeCDevices()
   * @generated
   */
	void setTypeCDevices(String value);

} // MBrickletRemoteSwitch
