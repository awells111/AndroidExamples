package com.android.awells.datastructures.linkedlist;

import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {

  private static final int[] EXPECTED_INTS = {-42, 0, 71};
  private MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

  @Test
  public void sizeZero() {
    assertTrue(myLinkedList.isEmpty());
  }

  @Test
  public void sizeThree() {
    addTestData();
    assertTrue(myLinkedList.size() == 3);
  }

  @Test
  public void removeHead() {
    addTestData();

    myLinkedList.remove(0);

    assertTrue(myLinkedList.get(0).equals(EXPECTED_INTS[1]));
  }

  @Test
  public void removeMiddle() {
    addTestData();

    myLinkedList.remove(1);

    assertTrue(myLinkedList.get(1).equals(EXPECTED_INTS[2]));
  }

  @Test
  public void removeTail() {
    addTestData();

    myLinkedList.remove(2);

    assertTrue(myLinkedList.get(1).equals(EXPECTED_INTS[1]));
  }

  @Test
  public void removeSizeEmpty() {
    addTestData();

    myLinkedList.remove(0);
    myLinkedList.remove(0);
    myLinkedList.remove(0);

    assertTrue(myLinkedList.isEmpty());
  }

  @Test
  public void removeSizeNotEmpty() {
    addTestData();

    myLinkedList.remove(0);

    assertTrue(myLinkedList.size() == 2);
  }

  @Test
  public void getHead() {
    addTestData();

    assertTrue(myLinkedList.get(0).equals(EXPECTED_INTS[0]));
  }

  @Test
  public void getMiddle() {
    addTestData();

    assertTrue(myLinkedList.get(1).equals(EXPECTED_INTS[1]));
  }

  @Test
  public void getTail() {
    addTestData();

    assertTrue(myLinkedList.get(2).equals(EXPECTED_INTS[2]));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void getNodeNegativeIndex() {
    addTestData();

    myLinkedList.get(-1);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void getNodeSize() {
    addTestData();
    myLinkedList.get(myLinkedList.size());
  }

  private void addTestData() {
    myLinkedList.add(EXPECTED_INTS[0]);
    myLinkedList.add(EXPECTED_INTS[1]);
    myLinkedList.add(EXPECTED_INTS[2]);
  }
}
