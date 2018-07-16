package com.android.awells.kyu5.WeightForWeight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests written by codewars. These will only be run AFTER I have solved the problem and after I
 * have created my own tests.
 */
public class StockTest {

  @Test
  public void BasicTests_1() {
    assertEquals("2000 103 123 4444 99", Solution.orderWeight("103 123 4444 99 2000"));
  }

  @Test
  public void BasicTests_2() {
    assertEquals(
        "11 11 2000 10003 22 123 1234000 44444444 9999",
        Solution.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
  }
}
