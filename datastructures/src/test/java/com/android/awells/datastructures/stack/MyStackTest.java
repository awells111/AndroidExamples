package com.android.awells.datastructures.stack;

import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

public class MyStackTest {

  private static final int[] EXPECTED_INTS = {-42, 0, 71};
  private MyStack<Integer> MyStack = new MyStack<>();

  @Test
  public void sizeZero() {
    assertTrue(MyStack.isEmpty());
  }

  @Test
  public void sizeThree() {
    addTestData();
    assertTrue(MyStack.size() == 3);
  }

  @Test
  public void peekEmpty() {
    assertTrue(MyStack.peek() == null);
  }

  @Test
  public void peekNotEmpty() {
    addTestData();

    assertTrue(MyStack.peek().equals(EXPECTED_INTS[2]));
  }

  @Test
  public void popEmpty() {
    assertTrue(MyStack.pop() == null);
  }

  @Test
  public void popNotEmpty() {
    addTestData();

    assertTrue(MyStack.pop().equals(EXPECTED_INTS[2]));
  }

  @Test
  public void popSizeEmpty() {
    addTestData();

    MyStack.pop();
    MyStack.pop();
    MyStack.pop();

    assertTrue(MyStack.isEmpty());
  }

  @Test
  public void popSizeNotEmpty() {
    addTestData();

    MyStack.pop();

    assertTrue(MyStack.size() == 2);
  }

  private void addTestData() {
    MyStack.add(EXPECTED_INTS[0]);
    MyStack.add(EXPECTED_INTS[1]);
    MyStack.add(EXPECTED_INTS[2]);
  }
}
