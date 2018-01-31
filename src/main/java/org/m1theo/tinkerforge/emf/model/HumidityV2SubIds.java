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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Humidity V2 Sub Ids</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.m1theo.tinkerforge.emf.model.ModelPackage#getHumidityV2SubIds()
 * @model
 * @generated
 */
public enum HumidityV2SubIds implements Enumerator {
	/**
   * The '<em><b>Humidity</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #HUMIDITY_VALUE
   * @generated
   * @ordered
   */
	HUMIDITY(0, "humidity", "humidity"),

	/**
   * The '<em><b>Temperature</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TEMPERATURE_VALUE
   * @generated
   * @ordered
   */
	TEMPERATURE(0, "temperature", "temperature");

	/**
   * The '<em><b>Humidity</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Humidity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #HUMIDITY
   * @model name="humidity"
   * @generated
   * @ordered
   */
	public static final int HUMIDITY_VALUE = 0;

	/**
   * The '<em><b>Temperature</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TEMPERATURE
   * @model name="temperature"
   * @generated
   * @ordered
   */
	public static final int TEMPERATURE_VALUE = 0;

	/**
   * An array of all the '<em><b>Humidity V2 Sub Ids</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final HumidityV2SubIds[] VALUES_ARRAY =
		new HumidityV2SubIds[] {
      HUMIDITY,
      TEMPERATURE,
    };

	/**
   * A public read-only list of all the '<em><b>Humidity V2 Sub Ids</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<HumidityV2SubIds> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Humidity V2 Sub Ids</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HumidityV2SubIds get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      HumidityV2SubIds result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Humidity V2 Sub Ids</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HumidityV2SubIds getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      HumidityV2SubIds result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Humidity V2 Sub Ids</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HumidityV2SubIds get(int value) {
    switch (value) {
      case HUMIDITY_VALUE: return HUMIDITY;
    }
    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final int value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String name;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String literal;

	/**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private HumidityV2SubIds(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //HumidityV2SubIds