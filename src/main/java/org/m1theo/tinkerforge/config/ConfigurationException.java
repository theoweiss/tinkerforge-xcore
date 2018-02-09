/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 * Copyright (c) 2018, Thomas Weiss <theo@m1theo.org>.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.m1theo.tinkerforge.config;

public class ConfigurationException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 5636062194838247647L;

    public ConfigurationException(String message) {
        super(message);
    }

}
