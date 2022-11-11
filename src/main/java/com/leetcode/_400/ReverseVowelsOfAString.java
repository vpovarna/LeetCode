package com.leetcode._400;

import java.util.Set;

// Problem #354
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        final Set<Character> vowelsSet = Set.of(
                'a', 'e', 'i', 'o', 'u', 'A', 'E',
                'I', 'O', 'U'
        );
        var chars = s.toCharArray();

        var start = 0;
        var end = chars.length-1;

        while (start < end) {
            var charA = chars[start];
            var charB = chars[end];
            if ((!vowelsSet.contains(charA) && !vowelsSet.contains(charB)) || (vowelsSet.contains(charA) && vowelsSet.contains(charB) && charA == charB)){
                // both chars are not vowels, increment both
                start += 1;
                end -= 1;
            } else if (!vowelsSet.contains(charA) && vowelsSet.contains(charB)) {
                // second element is a vowels, increment start
                start += 1;
            } else if (vowelsSet.contains(charA) && !vowelsSet.contains(charB)) {
                // second element is a vowels, decrease end
                end -= 1;
            } else {
                chars[start] = charB;
                chars[end] = charA;
                start += 1;
                end -= 1;
            }
        }

        return buildStringFromArray(chars);
    }

    private String buildStringFromArray(char[] arr) {
        var resultString = new StringBuilder();
        for (int i = 0; i <= arr.length - 1; i++) {
            resultString.append(arr[i]);
        }
        return resultString.toString();
    }

}
