package com.spamalot.hackersdelight;

import com.spamalot.hackersdelight.bits.Utilities;

/**
 * Testing and what-not for Hacker's Delight classes.
 * 
 * @author gej
 *
 */
public final class HackersDelight {

  /**
   * Construct nothing.
   */
  private HackersDelight() {
    // Look... nothing to do!
  }

  /**
   * Do something.
   * 
   * @param args
   *          things to do something with
   */
  public static void main(final String[] args) {
    int i = 0;
    System.out.println(Integer.bitCount(i));

    System.out.println(Integer.toBinaryString(i));

    i = (int) Math.pow(2, 30) + 3;

    // 1073741824
    System.out.println("i: " + i + " = " + Integer.toBinaryString(i));

    System.out.println(Utilities.countOnBits(i));

  }

}
