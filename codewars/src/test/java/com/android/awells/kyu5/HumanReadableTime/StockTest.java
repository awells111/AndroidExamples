package com.android.awells.kyu5.HumanReadableTime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests written by codewars. These will only be run AFTER I have solved the problem and after I
 * have created my own tests.
 */
public class StockTest {
  @Test
  public void Tests() {
    assertEquals("makeReadable(0)", "00:00:00", Solution.makeReadable(0));
    assertEquals("makeReadable(5)", "00:00:05", Solution.makeReadable(5));
    assertEquals("makeReadable(60)", "00:01:00", Solution.makeReadable(60));
    assertEquals("makeReadable(86399)", "23:59:59", Solution.makeReadable(86399));
    assertEquals("makeReadable(359999)", "99:59:59", Solution.makeReadable(359999));
  }
}
