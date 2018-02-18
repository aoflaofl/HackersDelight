package com.spamalot.hackersdelight.test.integer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.spamalot.hackersdelight.bits.BitManipulation;

import org.junit.jupiter.api.Test;

/**
 * Test BitManipulation class.
 * 
 * @author gej
 *
 */
class BitManipulationTest {

  /**
   * Test turnOffRightMostOnBit(int).
   */
  @Test
  void testTurnOffRightMostOnBitInt() {
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
  }

  /**
   * Test turnOffRightMostOnBit(long).
   */
  @Test
  void testTurnOffRightMostOnBitLong() {
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

  @Test
  void testTurnOnRightMostOffBitInt() {
    int x = 0;
    x = BitManipulation.turnOnRightMostOffBit(x);
    assertEquals(1, x);

    x = BitManipulation.turnOnRightMostOffBit(x);
    assertEquals(3, x);
  }

  @Test
  void testTurnOnRightMostOffBitLong() {
    long y = 0;
    y = BitManipulation.turnOnRightMostOffBit(y);
    assertEquals(1, y);

    y = BitManipulation.turnOnRightMostOffBit(y);
    assertEquals(3, y);
  }

  @Test
  void testTurnOffTrailingOnesInt() {
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
  }

  @Test
  void testTurnOffTrailingOnesLong() {
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

  @Test
  void testTurnOnTrailingZerosInt() {
    int i = Integer.valueOf("1000000000000000000000000010000", 2).intValue();
    int j = Integer.valueOf("1000000000000000000000000011111", 2).intValue();

    i = BitManipulation.turnOnTrailingZeros(i);

    assertEquals(j, i);

    i = Integer.valueOf("1000000000000000000000000011111", 2).intValue();
    j = Integer.valueOf("1000000000000000000000000011111", 2).intValue();

    i = BitManipulation.turnOnTrailingZeros(i);

    assertEquals(j, i);
  }

  @Test
  void testTurnOnTrailingZerosLong() {
    long l = Long.valueOf("100000000000000000000100000000000000000000000000000000001000000", 2).longValue();
    long m = Long.valueOf("100000000000000000000100000000000000000000000000000000001111111", 2).longValue();

    l = BitManipulation.turnOnTrailingZeros(l);

    assertEquals(m, l);
  }

  @Test
  void testOnBitAtPositionOfRightmostOffBitInt() {
    fail("Not yet implemented");
  }

  @Test
  void testOnBitAtPositionOfRightmostOffBitLong() {
    fail("Not yet implemented");
  }

  @Test
  void testOffBitAtPositionOfRightmostOnBitInt() {
    fail("Not yet implemented");
  }

  @Test
  void testOffBitAtPositionOfRightmostOnBitLong() {
    long l = Long.valueOf("0100000000000000000000100000000000000000000000000000000001000000", 2).longValue();
    String m = "1111111111111111111111111111111111111111111111111111111110111111";

    l = BitManipulation.offBitAtPositionOfRightmostOnBit(l);

    assertEquals(m, Long.toBinaryString(l));
  }

}
