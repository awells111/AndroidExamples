package com.android.awells.kyu5.HumanReadableTime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests written by https://github.com/awells111. I am writing these BEFORE I write my solution in
 * order to practice Test Driven Development.
 */
public class SolutionTest {

  private static final String EXPECTED_STRING = "99:59:59";
  private static final String TIME_STRING_ZERO = "00";
  private static final String TIME_STRING_NINE = "09";
  private static final String TIME_STRING_TEN = "10";
  private static final int TEST_SECONDS = 359999;
  private static final int TEST_MINUTES = 5999;
  private static final int TEST_HOURS = 99;
  private static final int LEFTOVER_SECONDS = 59;
  private static final int LEFTOVER_MINUTES = 59;

  @Test
  public void secondsToMinutes() {
    assertEquals(TEST_MINUTES, Solution.secondsToMinutes(TEST_SECONDS));
  }

  @Test
  public void leftoverSeconds() {
    assertEquals(LEFTOVER_SECONDS, Solution.leftoverSeconds(TEST_SECONDS));
  }

  @Test
  public void minutesToHours() {
    assertEquals(TEST_HOURS, Solution.minutesToHours(TEST_MINUTES));
  }

  @Test
  public void leftoverMinutes() {
    assertEquals(LEFTOVER_MINUTES, Solution.leftoverMinutes(TEST_MINUTES));
  }

  @Test
  public void makeReadable() {
    assertEquals(EXPECTED_STRING, Solution.makeReadable(TEST_SECONDS));
  }

  @Test
  public void timeToStringZero() {
    assertEquals(TIME_STRING_ZERO, Solution.timeToString(0));
  }

  @Test
  public void timeToStringNine() {
    assertEquals(TIME_STRING_NINE, Solution.timeToString(9));
  }

  @Test
  public void timeToStringTen() {
    assertEquals(TIME_STRING_TEN, Solution.timeToString(10));
  }
}
