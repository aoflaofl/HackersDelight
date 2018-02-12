package com.spamalot.hackersdelight.test.integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spamalot.hackersdelight.integer.BitManipulation;

import org.junit.jupiter.api.Test;

/**
 * Test Integer Bit Manipulation.
 * 
 * @author gej
 *
 */
class BitManipulationTest {

  /**
   * Test turnOffRightMostOnBit.
   */
  @SuppressWarnings("static-method")
  @Test
  void testTurnOffRightMostOnBit() {
    // Test ints
    int x = 1;
    x = BitManipulation.turnOffRightMostOnBit(x);
    assertEquals(0, x);

    x = 2;
    x = BitManipulation.turnOffRightMostOnBit(x);
    assertEquals(0, x);

    x = 3;
    x = BitManipulation.turnOffRightMostOnBit(x);
    assertEquals(2, x);

    x = (int) Math.pow(2, 30);
    x = BitManipulation.turnOffRightMostOnBit(x);
    assertEquals(0, x);

    x = (int) Math.pow(2, 30) + 3;
    x = BitManipulation.turnOffRightMostOnBit(x);
    assertEquals(1073741826, x);

    // Test longs
    long y = 1;
    y = BitManipulation.turnOffRightMostOnBit(y);
    assertEquals(0, y);

    y = 2;
    y = BitManipulation.turnOffRightMostOnBit(y);
    assertEquals(0, y);

    y = 3;
    y = BitManipulation.turnOffRightMostOnBit(y);
    assertEquals(2, y);

    y = (int) Math.pow(2, 30);
    y = BitManipulation.turnOffRightMostOnBit(y);
    assertEquals(0, y);

    y = (int) Math.pow(2, 30) + 3;
    y = BitManipulation.turnOffRightMostOnBit(y);
    assertEquals(1073741826, y);
  }

  /**
   * Test turnOnRightMostOffBit.
   */
  @SuppressWarnings("static-method")
  @Test
  void testTurnOnRightMostOffBit() {
    int x = 0;
    x = BitManipulation.turnOnRightMostOffBit(x);
    assertEquals(1, x);

    x = BitManipulation.turnOnRightMostOffBit(x);
    assertEquals(3, x);
  }

}
