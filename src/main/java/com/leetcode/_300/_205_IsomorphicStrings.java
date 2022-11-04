package com.leetcode._300;

import java.util.HashMap;
import java.util.Map;

public class _205_IsomorphicStrings {
    private static String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);

            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }

            builder.append(indexMapping.get(c1));
            builder.append(" ");
        }
        return builder.toString();
    }

    public static boolean isIsomorphic(String s, String t) {
        String s1 = transformString(s);
        String s2 = transformString(t);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("bbbaaaba" ,"aaabbbba"));
    }
}