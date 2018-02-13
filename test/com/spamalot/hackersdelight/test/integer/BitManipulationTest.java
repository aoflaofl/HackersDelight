package com.spamalot.hackersdelight.test.integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spamalot.hackersdelight.bits.BitManipulation;

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
    int i = Integer.valueOf("0000000000000000000000000000001", 2).intValue();
    int j = Integer.valueOf("0000000000000000000000000000000", 2).intValue();

    i = BitManipulation.turnOffRightMostOnBit(i);

    assertEquals(j, i);

    i = Integer.valueOf("0000000000000000000000000000010", 2).intValue();
    j = Integer.valueOf("0000000000000000000000000000000", 2).intValue();

    i = BitManipulation.turnOffRightMostOnBit(i);

    assertEquals(j, i);

    i = Integer.valueOf("0000000000000000000000000000011", 2).intValue();
    j = Integer.valueOf("0000000000000000000000000000010", 2).intValue();

    i = BitManipulation.turnOffRightMostOnBit(i);

    assertEquals(j, i);

    i = (int) Math.pow(2, 30);
    i = BitManipulation.turnOffRightMostOnBit(i);
    assertEquals(0, i);

    i = (int) Math.pow(2, 30) + 3;
    i = BitManipulation.turnOffRightMostOnBit(i);
    assertEquals(1073741826, i);

    // Test longs
    long l = 1;
    l = BitManipulation.turnOffRightMostOnBit(l);
    assertEquals(0, l);

    l = 2;
    l = BitManipulation.turnOffRightMostOnBit(l);
    assertEquals(0, l);

    l = 3;
    l = BitManipulation.turnOffRightMostOnBit(l);
    assertEquals(2, l);

    l = (int) Math.pow(2, 30);
    l = BitManipulation.turnOffRightMostOnBit(l);
    assertEquals(0, l);

    l = (int) Math.pow(2, 30) + 3;
    l = BitManipulation.turnOffRightMostOnBit(l);
    assertEquals(1073741826, l);
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

    long y = 0;
    y = BitManipulation.turnOnRightMostOffBit(y);
    assertEquals(1, y);

    y = BitManipulation.turnOnRightMostOffBit(y);
    assertEquals(3, y);
  }

  /**
   * Test testTurnOffTrailingOnes.
   */
  @SuppressWarnings("static-method")
  @Test
  void testTurnOffTrailingOnes() {

    // Test ints

    int i = Integer.valueOf("1000000000000000000000000010111", 2).intValue();
    int j = Integer.valueOf("1000000000000000000000000010000", 2).intValue();

    i = BitManipulation.turnOffTrailingOnes(i);

    assertEquals(j, i);

    i = Integer.valueOf("1111111111111111111111111111111", 2).intValue();
    j = Integer.valueOf("0000000000000000000000000000000", 2).intValue();

    i = BitManipulation.turnOffTrailingOnes(i);

    assertEquals(j, i);

    i = Integer.valueOf("1000000000000000000000000000000", 2).intValue();
    j = Integer.valueOf("1000000000000000000000000000000", 2).intValue();

    i = BitManipulation.turnOffTrailingOnes(i);

    assertEquals(j, i);

    i = Integer.valueOf("0000000000000000000000000000000", 2).intValue();
    j = Integer.valueOf("0000000000000000000000000000000", 2).intValue();

    i = BitManipulation.turnOffTrailingOnes(i);

    assertEquals(j, i);

    // Test longs

    long l = Long.valueOf("100000000000000000000000000101111111111111111111111111111111111", 2).longValue();
    long m = Long.valueOf("100000000000000000000000000100000000000000000000000000000000000", 2).longValue();

    l = BitManipulation.turnOffTrailingOnes(l);

    assertEquals(m, l);

    l = Long.valueOf("111111111111111111111111111111111111111111111111111111111111111", 2).longValue();
    m = Long.valueOf("000000000000000000000000000000000000000000000000000000000000000", 2).longValue();

    l = BitManipulation.turnOffTrailingOnes(l);

    assertEquals(m, l);

    l = Long.valueOf("100000000000000000000000000000000000000000000000000000000000000", 2).longValue();
    m = Long.valueOf("100000000000000000000000000000000000000000000000000000000000000", 2).longValue();

    l = BitManipulation.turnOffTrailingOnes(l);

    assertEquals(m, l);

    l = Long.valueOf("000000000000000000000000000000000000000000000000000000000000000", 2).longValue();
    m = Long.valueOf("000000000000000000000000000000000000000000000000000000000000000", 2).longValue();

    l = BitManipulation.turnOffTrailingOnes(l);

    assertEquals(m, l);
  }

}
