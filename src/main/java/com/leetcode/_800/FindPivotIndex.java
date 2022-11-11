package com.leetcode._800;

// Problem #724
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum = totalSum + num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) leftSum += nums[i - 1];
            if (totalSum - leftSum - nums[i] == leftSum) {
                return i;
            }
        }

        return -1;
    }

}