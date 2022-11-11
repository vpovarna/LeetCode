package com.leetcode._100;

// Problem #26
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        var i = 0;
        var j = 0;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i += 1;
                nums[i] = nums[j];
            }
            j += 1;
        }
        return i + 1;
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
