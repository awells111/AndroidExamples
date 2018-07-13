package com.android.awells.kyu4.NextSmallerNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTests {

  @Test
  public void basicTest1() {
    assertEquals(12, Solution.nextSmaller(21));
  }

  @Test
  public void basicTest2() {
    assertEquals(790, Solution.nextSmaller(907));
  }

  @Test
  public void basicTest3() {
    assertEquals(513, Solution.nextSmaller(531));
  }

  @Test
  public void basicTest4() {
    assertEquals(-1, Solution.nextSmaller(1027));
  }

  @Test
  public void basicTest5() {
    assertEquals(414, Solution.nextSmaller(441));
  }

  @Test
  public void basicTest6() {
    assertEquals(123456789, Solution.nextSmaller(123456798));
  }
}
