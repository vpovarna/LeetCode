package com.leetcode._100;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        else {
            List<Integer> arr = new ArrayList<>();
            arr.add(0);
            arr.add(1);
            for (int i = 1; i <= n; i++) {
                arr.add(arr.get(i) + arr.get(i-1));
            }
            return arr.get(arr.size() -1);
        }
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(2));  // 2
        System.out.println(climbingStairs.climbStairs(3));  // 3
    }

}
