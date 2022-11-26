package com.leetcode._700;

public class MinCostClimbingStairs {

    // bottom up
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i ++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2]+ cost[i-2]);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
