package com.android.awells.datastructures.queue;

import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

public class MyQueueTest {

  private static final int[] EXPECTED_INTS = {-42, 0, 71};
  private MyQueue<Integer> MyQueue = new MyQueue<>();

  @Test
  public void sizeZero() {
    assertTrue(MyQueue.isEmpty());
  }

  @Test
  public void sizeThree() {
    addTestData();
    assertTrue(MyQueue.size() == 3);
  }

  @Test
  public void peekEmpty() {
    assertTrue(MyQueue.peek() == null);
  }

  @Test
  public void peekNotEmpty() {
    addTestData();

    assertTrue(MyQueue.peek().equals(EXPECTED_INTS[0]));
  }

  @Test
  public void pollEmpty() {
    assertTrue(MyQueue.poll() == null);
  }

  @Test
  public void pollNotEmpty() {
    addTestData();

    assertTrue(MyQueue.poll().equals(EXPECTED_INTS[0]));
  }

  @Test
  public void pollSizeEmpty() {
    addTestData();

    MyQueue.poll();
    MyQueue.poll();
    MyQueue.poll();

    assertTrue(MyQueue.isEmpty());
  }

  @Test
  public void pollSizeNotEmpty() {
    addTestData();

    MyQueue.poll();

    assertTrue(MyQueue.size() == 2);
  }

  private void addTestData() {
    MyQueue.add(EXPECTED_INTS[0]);
    MyQueue.add(EXPECTED_INTS[1]);
    MyQueue.add(EXPECTED_INTS[2]);
  }
}
