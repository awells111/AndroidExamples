package com.android.awells.kyu4.LargeFactorials;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests written by https://github.com/awells111. I am writing these BEFORE I write my solution in
 * order to practice Test Driven Development.
 */
public class SolutionTest {

  private static final int TEST_FACTORIAL = 7;
  private static final String EXPECTED_FACTORIAL = "5040";

  @Test
  public void factorialTest() {
    assertTrue(Solution.Factorial(TEST_FACTORIAL).equals(EXPECTED_FACTORIAL));
  }
}
