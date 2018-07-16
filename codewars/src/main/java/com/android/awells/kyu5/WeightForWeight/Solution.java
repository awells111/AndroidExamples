package com.android.awells.kyu5.WeightForWeight;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/** Solution to the challenge at https://www.codewars.com/kata/weight-for-weight/train/java */
class Solution {

  public static String orderWeight(String s) {
    List<Pair> list = buildList(s);

    if (list.size() == 0) {
      return "";
    }

    Collections.sort(list, new PairComparator());

    StringBuilder sb = new StringBuilder();

    sb.append(list.get(0).num);

    /*Start at 1 because we are preceding every string with a space*/
    for (int i = 1; i < list.size(); i++) {
      sb.append(" ");
      sb.append(list.get(i).num);
    }

    return sb.toString();
  }

  static List<Pair> buildList(String s) {
    List<Pair> list = new LinkedList<>();

    int start = -1;

    for (int i = 0; i < s.length(); i++) {
      if (!Character.isDigit(s.charAt(i))) {
        if (start != -1) {
          list.add(new Pair(s.substring(start, i)));

          start = -1;
        }
      } else if (start == -1) {
        start = i;
      }
    }

    if (start != -1) {
      list.add(new Pair(s.substring(start)));
    }

    return list;
  }

  static class Pair {
    String num;
    int weight;

    Pair(String num) {
      this.num = num;
      this.weight = findWeight(num);
    }

    private static int findWeight(String num) {
      int total = 0;

      for (int i = 0; i < num.length(); i++) {
        total += Character.getNumericValue(num.charAt(i));
      }

      return total;
    }
  }

  /*order by weight ASC, num ASC*/
  static class PairComparator implements Comparator<Pair> {

    public int compare(Pair one, Pair two) {
      if (one.weight == two.weight) {
        return one.num.compareTo(two.num);
      }

      return one.weight - two.weight;
    }
  }
}
