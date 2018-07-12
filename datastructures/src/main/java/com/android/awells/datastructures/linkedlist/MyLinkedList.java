package com.android.awells.datastructures.linkedlist;

public class MyLinkedList<E> {

  private int size;
  private Node head;

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  private Node getNode(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    }

    Node node = head;

    while (index-- > 0) {
      node = node.next;
    }

    return node;
  }

  public void add(E e) {
    Node newNode = new Node(e);

    /*If our list is empty, we will just set head as the new node.*/
    if (size() == 0) {
      head = newNode;

      /*Else, we need to add our node to the end of the list.*/
    } else {
      /**/
      getNode(size() - 1).next = newNode;
    }

    size++;
  }

  public E remove(int index) {
    /*Make a temporary node called 'removed' to hold the removed node*/
    Node removed;

    /*If index is 0, remove the head*/
    if (index == 0) {

      /*Store the node that will be removed*/
      removed = head;

      /*Update our head*/
      head = head.next;

    } else {
      /*Find the previous node*/
      Node prev = getNode(index - 1);

      /*Store the node that will be removed*/
      removed = prev.next;

      /*Remove the node by deleting all references to it*/
      prev.next = removed.next;
    }

    /*Decrement size*/
    size--;

    /*Return the data of the removed node*/
    return removed.data;
  }

  public E get(int index) {
    Node node = getNode(index);

    return node.data;
  }

  class Node {

    E data;
    Node next;

    Node(E data) {
      this.data = data;
    }
  }
}
