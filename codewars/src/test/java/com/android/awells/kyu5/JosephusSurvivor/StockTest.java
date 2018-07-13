package com.android.awells.kyu5.JosephusSurvivor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests written by codewars. These will only be run AFTER I have solved the problem and after I
 * have created my own tests.
 */
public class StockTest {

  @Test
  public void test1() {
    josephusTest(7, 3, 4);
  }

  @Test
  public void test2() {
    josephusTest(11, 19, 10);
  }

  @Test
  public void test3() {
    josephusTest(40, 3, 28);
  }

  @Test
  public void test4() {
    josephusTest(14, 2, 13);
  }

  @Test
  public void test5() {
    josephusTest(100, 1, 100);
  }

  private void josephusTest(final int n, final int k, final int result) {
    String testDescription = String.format("Testing where n = %d and k = %d", n, k);
    assertEquals(testDescription, result, Solution.josephusSurvivor(n, k));
  }
}
