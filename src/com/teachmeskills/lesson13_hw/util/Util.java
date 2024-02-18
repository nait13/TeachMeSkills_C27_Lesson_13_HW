package com.teachmeskills.lesson13_hw.util;

/**
 * This method is for counting the number of numbers in a password
 */
public class Util {
    public static int countDigitsInPassword(String password) {
        int count = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
