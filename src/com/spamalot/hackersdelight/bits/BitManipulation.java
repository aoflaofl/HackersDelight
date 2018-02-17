package com.spamalot.hackersdelight.bits;

/**
 * Methods implementing functions from Hacker's Delight.
 * <p>
 * Cite the book here.
 * <p>
 * These are implementations of the functions and algorithms described in the
 * book. In each case the goal is to make them correct, not necessarily
 * efficient. E.g. in many cases you will want to implement these in-line rather
 * than as method calls.
 * 
 * @author gej
 *
 */

public final class BitManipulation {
  /**
   * No construction.
   */
  private BitManipulation() {
  }

  /**
   * Turn off the rightmost on bit in a 32 bit integer.
   * 
   * @param x
   *          32 bit integer
   * @return x with the rightmost on bit turned off.
   */
  public static int turnOffRightMostOnBit(final int x) {
    return x & (x - 1);
  }

  /**
   * Turn off the rightmost on bit in a 64 bit integer.
   * 
   * @param x
   *          64 bit integer
   * @return x with rightmost on bit turned off.
   */
  public static long turnOffRightMostOnBit(final long x) {
    return x & (x - 1);
  }

  /**
   * Turn on the rightmost off bit in a 64 bit integer.
   * 
   * @param x
   *          32 bit integer
   * @return x with the rightmost off bit turned on.
   */
  public static int turnOnRightMostOffBit(final int x) {
    return x | (x + 1);
  }

  /**
   * Turn on the rightmost off bit in a 64 bit integer.
   * 
   * @param x
   *          64 bit integer
   * @return x with the rightmost off bit turned on.
   */
  public static long turnOnRightMostOffBit(final long x) {
    return x | (x + 1);
  }

  /**
   * Turn off the trailing ones in a 32 bit integer.
   * 
   * @param x
   *          32 bit integer
   * @return x with the trailing ones turned off.
   */
  public static int turnOffTrailingOnes(final int x) {
    return x & (x + 1);
  }

  /**
   * Turn off the trailing ones in a 64 bit long integer.
   * 
   * @param x
   *          64 bit integer
   * @return x with the trailing ones turned off.
   */
  public static long turnOffTrailingOnes(final long x) {
    return x & (x + 1);
  }

  public static int turnOnTrailingZeros(int x) {
    return x | (x - 1);
  }

  public static long turnOnTrailingZeros(long x) {
    return x | (x - 1);
  }

  public static int onBitAtPositionOfRightmostOffBit(int x) {
    return ~x & (x + 1);
  }

  public static long onBitAtPositionOfRightmostOffBit(long x) {
    return ~x & (x + 1);
  }

  public static int offBitAtPositionOfRightmostOnBit(int x) {
    return ~x | (x - 1);
  }

  public static long offBitAtPositionOfRightmostOnBit(long x) {
    return ~x | (x - 1);
  }

}
