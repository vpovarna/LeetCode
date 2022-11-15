package com.leetcode._100;

import com.leetcode.utils.TreeNode;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, long minValue, long maxValue) {
        if (node == null) {
            return true;
        }

        if (node.val < minValue || node.val > maxValue) {
            return false;
        }

        return dfs(node.left, minValue, node.val - 1L) && dfs(node.right, node.val + 1L, maxValue);
    }

}
