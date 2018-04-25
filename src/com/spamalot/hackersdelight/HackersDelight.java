package com.spamalot.hackersdelight;

import com.spamalot.hackersdelight.bits.*;

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
    long i = Long.valueOf("000000000000000000000000000000000000000000000000000000011110000", 2).longValue();
    System.out.println(Long.bitCount(i));
    System.out.println(Long.toBinaryString(i));
    
    i = BitManipulation.snoob(i);
    System.out.println(Long.bitCount(i));
    System.out.println(Long.toBinaryString(i));
    
    // 1073741824

    i = -65L;
    System.out.println("i: " + i + " = " + Long.toBinaryString(i));

    System.out.println(Utilities.countOnBits(i));

  }

}
