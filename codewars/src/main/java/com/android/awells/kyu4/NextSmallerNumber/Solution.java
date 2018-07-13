package com.android.awells.kyu4.NextSmallerNumber;

/*Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.

For example:

nextSmaller(21) == 12
nextSmaller(531) == 513
nextSmaller(2071) == 2017
Return -1 (for Haskell: return Nothing), when there is no smaller number that contains the same digits. Also return -1 when the next smaller number with the same digits would require the leading digit to be zero.

nextSmaller(9) == -1
nextSmaller(111) == -1
nextSmaller(135) == -1
nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
some tests will include very large numbers.
test data only employs positive integers.
The function you write for this challenge is the inverse of this kata: "Next bigger number with the same digits."*/

/**
 * Solution to the challenge at https://www.codewars.com/kata/next-smaller-number-with-the-same-digits/train/java
 */
class Solution {

  public static long nextSmaller(long n) {
    /*This array works as a map. We will count the number of times the numbers 0-9 appear in n.*/
    int[] nums = new int[10];

    /*For each digit in n*/
    while (n > 0) {

      /*Get the last digit of n*/
      int lastDigit = (int) (n % 10);

      /*Remove that digit from n*/
      n /= 10;

      /*Increment the count of the most recent digit*/
      nums[lastDigit]++;

      /*nextBiggestDigit is the highest digit that is still less than lastDigit*/
      int nextBiggestDigit = findNextBiggestDigit(nums, lastDigit);

      /*If we have seen a smaller digit, then we know there is a possible smaller number that we can return.*/
      if (nextBiggestDigit > -1) {

        /*This codewars challenge does not want any numbers that have a leading zero. This if statement
         * is written to make sure we do not return a number that has a leading zero.*/
        if (n == 0 && nextBiggestDigit == 0) {
          return -1;
        }

        /*Add the next biggest digit back to n*/
        n = addDigit(n, nextBiggestDigit);

        /*Decrement the count of nextBiggestDigit*/
        nums[nextBiggestDigit]--;

        /*The next smallest number is build using buildNextSmallestNumber(nums).*/
        return buildSmallestNumber(nums, n);
      }
    }

    /*No smaller number has been found*/
    return -1;
  }

  public static int findNextBiggestDigit(int[] nums, int limit) {
    /*Check if any number between (limit - 1) and 0 has been spotted. */
    while (--limit >= 0) {

      /*If a number between (limit - 1) and 0 has been spotted, return that number*/
      if (nums[limit] > 0) {
        return limit;
      }
    }

    /*Else, return -1*/
    return limit;
  }

  private static long buildSmallestNumber(int[] nums, long n) {

    /*For each number between 9 and 0, add that number back to n to create the next smallest number*/
    for (int i = 9; i >= 0; ) {
      if (nums[i] > 0) {

        n = addDigit(n, i);

        /*Subtract the count of i from nums*/
        nums[i]--;

      } else {

        /*No digit of value i has been found. Decrement i and try again until we reach 0*/
        i--;
      }
    }

    return n;
  }

  public static long addDigit(long n, int digit) {
    /*Add a 0 to the end of n so we can add our digit to it*/
    n *= 10;

    /*Add the digit to n*/
    n += digit;

    return n;
  }
}
