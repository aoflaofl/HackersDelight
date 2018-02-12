package com.spamalot.hackersdelight;

import com.spamalot.hackersdelight.integer.BitManipulation;

/**
 * Utility methods using Hacker Delight methods.
 * 
 * @author gej
 *
 */
final class Utilities {

  /**
   * Nothing.
   */
  private Utilities() {
  }

  /**
   * Count the number of bits that are on in a long integer.
   * 
   * @param x
   *          the long integer to count
   * @return the number of on bits.
   */
  public static int countOnBits(final long x) {
    int count = 0;
    for (long y = x; y != 0; y = BitManipulation.turnOffRightMostOnBit(y)) {
      count++;
    }

    return count;
  }

}
