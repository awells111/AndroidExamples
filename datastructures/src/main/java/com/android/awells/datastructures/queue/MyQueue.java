package com.android.awells.datastructures.queue;

import com.android.awells.datastructures.MyCollection;

public class MyQueue<E> implements MyCollection<E> {

  class Node {
    E data;
    Node next;

    Node(E data) {
      this.data = data;
    }
  }

  int size;
  Node head;

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
      head.next = node;
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
    size--;

    return data;
  }
}
