/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 * Copyright (c) 2018, Thomas Weiss <theo@m1theo.org>.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.m1theo.tinkerforge.types;

import java.math.BigDecimal;

public class PercentValue implements TinkerforgeValue {

    private BigDecimal value;


	public PercentValue(BigDecimal value) {
		validateValue(value);
    		this.value = value;
    }

    public BigDecimal getValue() {
		return value;
	}

	private void validateValue(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 0 || new BigDecimal(100).compareTo(value) < 0) {
            throw new IllegalArgumentException("Value must be between 0 and 100");
        }
    }

	public Short shortValue() {
		return value.shortValue();
	}

}
