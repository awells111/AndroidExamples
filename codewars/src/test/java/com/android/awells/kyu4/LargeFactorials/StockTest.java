package com.android.awells.kyu4.LargeFactorials;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests written by codewars. These will only be run AFTER I have solved the problem and after I
 * have created my own tests.
 */
public class StockTest {

  @Test
  public void BasicTests() {
    assertEquals("1", Solution.Factorial(1));
    assertEquals("120", Solution.Factorial(5));
    assertEquals("362880", Solution.Factorial(9));
    assertEquals("1307674368000", Solution.Factorial(15));
  }
}
