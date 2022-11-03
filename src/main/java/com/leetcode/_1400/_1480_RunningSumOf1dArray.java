package com.leetcode._1400;

import java.util.Arrays;

public class _1480_RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i <= nums.length - 1; i++) {
            int tmpSum = nums[i - 1] + nums[i];
            nums[i] = tmpSum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums1))); // 1,3,6,10
        int[] nums2 = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums2))); // 1,2,3,4,5
    }
}
