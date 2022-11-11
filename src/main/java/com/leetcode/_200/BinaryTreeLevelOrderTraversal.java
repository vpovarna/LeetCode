package com.leetcode._200;


import com.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Problem #102
public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (root == null) return resultList;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var tmpList = new ArrayList<Integer>();
            var queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                    tmpList.add(node.val);
                }
            }
            if (!tmpList.isEmpty()) {
                resultList.add(tmpList);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        final TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(levelOrder(node));
    }
}
