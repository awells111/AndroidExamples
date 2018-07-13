package com.android.awells.kyu5.JosephusSurvivor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;

/**
 * Tests written by https://github.com/awells111. I am writing these BEFORE I write my solution in
 * order to practice Test Driven Development.
 */
public class SolutionTest {

  private static final int TEST_n = 7;
  private static final int TEST_k = 3;
  private static final int EXPECTED_SURVIVOR = 4;
  private List<Integer> list = Solution.buildList(TEST_n);

  @Test
  public void buildListSize() {
    assertEquals(TEST_n, list.size());
  }

  @Test
  public void buildListFirst() {
    assertTrue(list.get(0).equals(1));
  }

  @Test
  public void buildListLast() {
    assertTrue(list.get(TEST_n - 1).equals(TEST_n));
  }

  @Test
  public void josephusSurvivor() {
    assertTrue(Solution.josephusSurvivor(TEST_n, TEST_k) == EXPECTED_SURVIVOR);
  }
}
