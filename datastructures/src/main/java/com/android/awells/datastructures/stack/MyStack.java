package com.android.awells.datastructures.stack;

import com.android.awells.datastructures.MyCollection;

public class MyStack<E> implements MyCollection<E> {

  private int size;
  private Node head;

  @Override
  public int size() {
    return size;
  }

  @Override
  public void add(E data) {
    Node node = new Node(data);

    if (head == null) {
      head = node;
    } else {
      node.next = head;
      head = node;
    }

    size++;
  }

  public E peek() {
    if (head == null) {
      return null;
    }

    return head.data;
  }

  public E pop() {
    if (head == null) {
      return null;
    }

    E data = head.data;
    head = head.next;
    size--;

    return data;
  }

  class Node {
    E data;
    Node next;

    Node(E data) {
      this.data = data;
    }
  }
}
