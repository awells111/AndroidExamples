package com.android.awells.kyu4.NextSmallerNumber;

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

        /*The next smallest number is built using buildSmallestNumber(nums).*/
        return buildSmallestNumber(nums, n);
      }
    }

    /*No smaller number has been found*/
    return -1;
  }

  /**
   * @param nums An array of ints that contains the count of each digit seen in long n
   * @param limit Only check numbers less than limit
   * @return The greatest value that is present in nums but less than limit, or -1 if no value is
   * found.
   */
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

  /**
   * @param nums An array of ints that contains the count of each digit seen in long n
   * @param n The number that will receive the seen digits in nums
   * @return The greatest possible number, which will still be less than the initial Kata input
   */
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

  /**
   * @param n The number that will receive an extra digit
   * @param digit The single digit integer that will be added to n
   * @return The new value of n, after digit is added to it
   */
  public static long addDigit(long n, int digit) {
    /*Add a 0 to the end of n so we can add our digit to it*/
    n *= 10;

    /*Add the digit to n*/
    n += digit;

    return n;
  }
}
