package com.spamalot.hackersdelight.test.integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spamalot.hackersdelight.bits.Utilities;

import org.junit.jupiter.api.Test;

class UtilitiesTest {

  /**
   * Test countOnBits.
   */
  @SuppressWarnings("static-method")
  @Test
  void testCountOnBits() {
    int i = Integer.valueOf("0000000000000000000000000000001", 2).intValue();
    assertEquals(1, Utilities.countOnBits(i));

    i = Integer.valueOf("1000000000000000000000000000001", 2).intValue();
    assertEquals(2 , Utilities.countOnBits(i));

  }

}
