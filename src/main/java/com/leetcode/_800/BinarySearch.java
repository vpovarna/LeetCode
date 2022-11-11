package com.leetcode._800;

// Problem #704
public class BinarySearch {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            var m = i + (j - i) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                i = m + 1;
            } else {
                j = m -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        var binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[]{-1,0,3,5,9,12}, 9)); // 4
        System.out.println(binarySearch.search(new int[]{-1,0,3,5,9,12}, 2)); // 2
        System.out.println(binarySearch.search(new int[]{5}, 5)); // 0
    }
}
