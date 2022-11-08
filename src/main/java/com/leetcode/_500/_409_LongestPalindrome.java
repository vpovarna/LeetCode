package com.leetcode._500;

import java.util.HashSet;

public class _409_LongestPalindrome {

    public static int longestPalindrome(String s) {
        var count = 0;
        var visitedChars = new HashSet<Character>();

        var stringChar = s.toCharArray();

        for (Character c : stringChar) {
            if (visitedChars.contains(c)) {
                count += 2;
                visitedChars.remove(c);
            } else {
                visitedChars.add(c);
            }
        }

        if (!visitedChars.isEmpty()) {
            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd")); // 7
        System.out.println(longestPalindrome("s")); // 1
    }
}
