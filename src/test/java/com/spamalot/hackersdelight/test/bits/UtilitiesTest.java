package com.spamalot.hackersdelight.test.bits;

import static org.junit.Assert.assertEquals;

import com.spamalot.hackersdelight.bits.Utilities;

import org.junit.Test;

/**
 * Test the bit manipulation Utilities class.
 * 
 * @author gej
 *
 */
public class UtilitiesTest {

  /**
   * Test countOnBits.
   */
  @Test
  public void testCountOnBits() {
    int i = Integer.valueOf("0000000000000000000000000000001", 2).intValue();
    assertEquals(1, Utilities.countOnBits(i));

    i = Integer.valueOf("1000000000000000000000000000001", 2).intValue();
    assertEquals(2, Utilities.countOnBits(i));

  }

}
