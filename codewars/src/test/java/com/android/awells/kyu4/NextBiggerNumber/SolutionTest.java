package com.android.awells.kyu4.NextBiggerNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests written by https://github.com/awells111. I am writing these BEFORE I write my solution in
 * order to practice Test Driven Development.
 */
public class SolutionTest {

  private static final long TEST_NUMBER_ONE_DIGIT = 8;
  private static final long EXPECTED_NUMBER_ONE_DIGIT = -1;

  private static final long TEST_NUMBER_TWO_DIGITS = 12;
  private static final long EXPECTED_NUMBER_TWO_DIGITS = 21;

  private static final long TEST_NUMBER_THREE_DIGITS = 513;
  private static final long EXPECTED_NUMBER_THREE_DIGITS = 531;

  private static final long TEST_NUMBER_FOUR_DIGITS = 2017;
  private static final long EXPECTED_NUMBER_FOUR_DIGITS = 2071;

  private static final int[] TEST_VALUES = new int[10];

  private static final long TEST_ADD_N = 12309;
  private static final int TEST_ADD_DIGIT = 5;
  private static final long EXPECTED_ADD_N = 123095;

  @Before
  public void setUp() {
    /*We are using a setUp method to make it clear that TEST_VALUES must have 10 total values*/
    TEST_VALUES[3] = 2;
    TEST_VALUES[4] = 2;
    TEST_VALUES[7] = 1;
    TEST_VALUES[9] = 1;
  }

  @Test
  public void nextBiggerNumberOneDigit() {
    assertTrue(Solution.nextBiggerNumber(TEST_NUMBER_ONE_DIGIT) == EXPECTED_NUMBER_ONE_DIGIT);
  }

  @Test
  public void nextBiggerNumberTwoDigits() {
    assertTrue(Solution.nextBiggerNumber(TEST_NUMBER_TWO_DIGITS) == EXPECTED_NUMBER_TWO_DIGITS);
  }

  @Test
  public void nextBiggerNumberThreeDigits() {
    assertTrue(Solution.nextBiggerNumber(TEST_NUMBER_THREE_DIGITS) == EXPECTED_NUMBER_THREE_DIGITS);
  }

  @Test
  public void nextBiggerNumberFourDigits() {
    assertTrue(Solution.nextBiggerNumber(TEST_NUMBER_FOUR_DIGITS) == EXPECTED_NUMBER_FOUR_DIGITS);
  }

  @Test
  public void findNextBiggestDigit() {
    assertTrue(Solution.findNextBiggestDigit(TEST_VALUES, 4) == 7);
  }

  @Test
  public void addDigit() {
    assertTrue(Solution.addDigit(TEST_ADD_N, TEST_ADD_DIGIT) == EXPECTED_ADD_N);
  }
}
