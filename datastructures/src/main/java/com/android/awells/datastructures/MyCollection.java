package com.android.awells.datastructures;

public interface MyCollection<E> {

  int size();

  void add(E data);

  default boolean isEmpty() {
    return size() == 0;
  }

}

