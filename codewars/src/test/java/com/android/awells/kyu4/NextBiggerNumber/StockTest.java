package com.android.awells.kyu4.NextBiggerNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests written by codewars. These will only be run AFTER I have solved the problem and after I
 * have created my own tests.
 */
public class StockTest {

  @Test
  public void basicTests_1() {
    assertEquals(21, Solution.nextBiggerNumber(12));
  }

  @Test
  public void basicTests_2() {
    assertEquals(531, Solution.nextBiggerNumber(513));
  }

  @Test
  public void basicTests_3() {

    assertEquals(2071, Solution.nextBiggerNumber(2017));
  }

  @Test
  public void basicTests_4() {

    assertEquals(441, Solution.nextBiggerNumber(414));
  }

  @Test
  public void basicTests_5() {
    assertEquals(414, Solution.nextBiggerNumber(144));
  }
}
