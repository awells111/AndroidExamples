package com.android.awells.kyu4.StringsMix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests written by codewars. These will only be run AFTER I have solved the problem and after I
 * have created my own tests.
 */
public class StockTest {

  @Test
  public void test_1() {

    assertEquals(
        "1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr",
        Solution.mix("A generation must confront the looming ", "codewarrs"));
  }

  @Test
  public void test_2() {
    assertEquals("2:eeeee/2:yy/=:hh/=:rr", Solution.mix("Are they here", "yes, they are here"));
  }

  @Test
  public void test_3() {
    assertEquals(
        "1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg",
        Solution.mix("looping is fun but dangerous", "less dangerous than coding"));
  }

  @Test
  public void test_4() {
    assertEquals(
        "1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt",
        Solution.mix(" In many languages", " there's a pair of functions"));
  }

  @Test
  public void test_5() {
    assertEquals("1:ee/1:ll/1:oo", Solution.mix("Lords of the Fallen", "gamekult"));
  }

  @Test
  public void test_6() {
    assertEquals("", Solution.mix("codewars", "codewars"));
  }
}
