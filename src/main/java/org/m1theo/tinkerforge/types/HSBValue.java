/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 * Copyright (c) 2018, Thomas Weiss <theo@m1theo.org>.
 * <p>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.m1theo.tinkerforge.types;

import java.awt.Color;

public class HSBValue implements TinkerforgeValue {

  private Color color;

  public HSBValue(Color color) {
    // TODO Auto-generated constructor stub
  }

  public HSBValue(int red, int green, int blue) {
    color = new Color(red, green, blue);
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }
}
