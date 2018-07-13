package com.android.awells.kyu4.StringsMix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests written by https://github.com/awells111. I am writing these BEFORE I write my solution in
 * order to practice Test Driven Development.
 */
public class SolutionTest {

  @Test
  public void mix() {
    System.out.println(Solution.mix("aaaaabbbb", "bbbbccccc"));
  }

  @Test
  public void letterCount() {
    assertTrue(Solution.letterCount("ddd")[3] == 3);
  }


}
