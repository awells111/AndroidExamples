package com.android.awells.kyu5.JosephusSurvivor;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution to the challenge at https://www.codewars.com/kata/josephus-survivor/train/java
 */
class Solution {

  public static int josephusSurvivor(final int n, final int k) {
    List<Integer> list = buildList(n);

    final int increment = k - 1;
    for (int i = increment % list.size(); list.size() > 1; i = (i + increment) % list.size()) {
      list.remove(i);
    }

    return list.get(0);
  }

  static List<Integer> buildList(int n) {
    List<Integer> list = new ArrayList<>(n);

    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    return list;
  }
}
