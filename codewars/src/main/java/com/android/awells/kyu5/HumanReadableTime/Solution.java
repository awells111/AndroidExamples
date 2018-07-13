package com.android.awells.kyu5.HumanReadableTime;

/**
 * Solution to the challenge at https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
 */
class Solution {
  /* Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

  HH = hours, padded to 2 digits, range: 00 - 99
  MM = minutes, padded to 2 digits, range: 00 - 59
  SS = seconds, padded to 2 digits, range: 00 - 59
  The maximum time never exceeds 359999 (99:59:59)*/

  public static String makeReadable(int seconds) {
    int minutes = secondsToMinutes(seconds);
    int hours = minutesToHours(minutes);

    int leftoverSeconds = leftoverSeconds(seconds);
    int leftoverMinutes = leftoverMinutes(minutes);

    return timeToString(hours)
        + ":"
        + timeToString(leftoverMinutes)
        + ":"
        + timeToString(leftoverSeconds);
  }

  static int secondsToMinutes(int seconds) {
    return seconds / 60;
  }

  static int leftoverSeconds(int seconds) {
    return seconds % 60;
  }

  static int minutesToHours(int minutes) {
    return minutes / 60;
  }

  static int leftoverMinutes(int minutes) {
    return minutes % 60;
  }

  static String timeToString(int num) {
    if (num == 0) {
      return "00";
    } else if (num < 10) {
      return "0" + Integer.toString(num);
    } else {
      return Integer.toString(num);
    }
  }
}
