package com.android.awells.datastructures.queue;

import com.android.awells.datastructures.MyCollection;

public class MyQueue<E> implements MyCollection<E> {

  private int size;
  private Node head;
  private Node tail;

  @Override
  public int size() {
    return size;
  }

  @Override
  public void add(E data) {
    Node node = new Node(data);

    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = tail.next;
    }

    size++;
  }

  public E peek() {
    if (head == null) {
      return null;
    }

    return head.data;
  }

  public E poll() {
    if (head == null) {
      return null;
    }

    E data = head.data;
    head = head.next;

    if (head == null) {
      tail = null;
    }

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
