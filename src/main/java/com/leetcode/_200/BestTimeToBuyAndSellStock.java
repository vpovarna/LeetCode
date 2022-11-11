package com.leetcode._200;

// Problem #121
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        var maxProfit = 0;
        var minValue = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minValue) {
                minValue = price;
            } else if (price - minValue > maxProfit) {
                maxProfit = price - minValue;
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
