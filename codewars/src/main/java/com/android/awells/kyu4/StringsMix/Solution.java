package com.android.awells.kyu4.StringsMix;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Solution to the challenge at https://www.codewars.com/kata/5629db57620258aa9d000014/train/java
 */
class Solution {

  /*int value of the char 'a'*/
  private static final int a = 97;

  public static String mix(String s1, String s2) {

    /*Count the appearances of the letters in s1 and s2*/
    int[] one = letterCount(s1);
    int[] two = letterCount(s2);

    /*Create a list to hold the letters ordered by count DESC, Winner ASC, index ASC*/
    LinkedList<Letter> list = new LinkedList<>();

    for (int i = 0; i < one.length; i++) {

      /*If s1 has more of the letter, ONE is the winner*/
      if (one[i] > two[i]) {
        list.add(new Letter(i, one[i], Winner.ONE));

        /*Else if s2 has more of the letter, TWO is the winner*/
      } else if (one[i] < two[i]) {
        list.add(new Letter(i, two[i], Winner.TWO));

        /*Else if they are equal, it is a DRAW*/
      } else {
        list.add(new Letter(i, one[i], Winner.DRAW));
      }
    }

    /*Sort the three lists by count DESC, Winner ASC, index ASC*/
    Comparator<Letter> comparator = new LetterComparator();
    Collections.sort(list, comparator);

    StringBuilder sb = new StringBuilder();

    /*Print the first letter because all future letters will be preceded by a '/'*/
    if (list.peek() != null && list.peek().count >= 2) {
      Letter l = list.poll();
      sb.append(l.print());
    }

    for (Letter l : list) {
      if (l.count < 2) {
        break;
      }
      sb.append("/");

      sb.append(l.print());
    }

    return sb.toString();
  }

  /*Returns an array that counts the number of times each lowercase letter appears in a word*/
  static int[] letterCount(String s) {
    int[] counts = new int[26];

    char[] chars = s.toCharArray();

    for (char c : chars) {
      if (Character.isLowerCase(c)) {
        counts[charToIndex(c)]++;
      }
    }

    return counts;
  }

  /*Returns the index of the char in an array of size 26. For example,
  nums[0] corresponds to a, nums[1] corresponds to b, nums[25] corresponds to z.*/
  private static int charToIndex(char c) {
    return c - a;
  }

  static char indexToChar(int index) {
    return (char) (index + a);
  }

  enum Winner {
    ONE,
    TWO,
    DRAW
  }

  static class Letter {

    int index;
    int count;
    Winner winner;

    Letter(int index, int count, Winner winner) {
      this.index = index;
      this.count = count;
      this.winner = winner;
    }

    String tag() {
      switch (winner) {
        case ONE:
          return "1:";
        case TWO:
          return "2:";
        case DRAW:
          return "=:";

        default:
          return null;
      }
    }

    String print() {
      StringBuilder sb = new StringBuilder(tag());

      for (int i = 0; i < count; i++) {
        sb.append(indexToChar(index));
      }

      return sb.toString();
    }
  }

  /*order by count DESC, Winner ASC, index ASC*/
  static class LetterComparator implements Comparator<Letter> {

    public int compare(Letter one, Letter two) {
      if (one.count == two.count) {
        if (one.winner.ordinal() == two.winner.ordinal()) {
          return indexToChar(one.index) - indexToChar(two.index);
        }

        return one.winner.ordinal() - two.winner.ordinal();
      }

      return two.count - one.count;
    }
  }
}
