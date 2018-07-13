package com.android.awells.kyu4.LargeFactorials;

import java.math.BigInteger;

/**
 * Solution to the challenge at https://www.codewars.com/kata/557f6437bf8dcdd135000010/train/java
 */
class Solution {

  public static String Factorial(int n) {
    BigInteger num = BigInteger.ONE;

    while (n-- > 0) {
      num = num.add(num.multiply(new BigInteger(Integer.toString(n))));
    }

    return num.toString();
  }
}
