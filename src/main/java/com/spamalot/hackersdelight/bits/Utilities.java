package com.spamalot.hackersdelight.bits;

/**
 * Utility methods using Hacker Delight methods.
 * 
 * @author gej
 *
 */
public final class Utilities {

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

  /**
   * Check if an integer is a power of two.
   * 
   * @param x
   *          an integer to check
   * @return true if the integer is a power of two, false otherwise.
   */
  public static boolean isPowerOf2(final long x) {
    return BitManipulation.turnOffRightMostOnBit(x) == 0;
  }

}
