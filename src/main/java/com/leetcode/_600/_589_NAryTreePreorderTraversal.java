package com.leetcode._600;


import java.util.ArrayList;
import java.util.List;
import com.leetcode.utils.Node;

public class _589_NAryTreePreorderTraversal {

    // recursive solution
    public List<Integer> preorder(Node root) {
        var result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        preorder(root, result);
        return result;
    }

    public void preorder(Node node, List<Integer> result) {
        result.add(node.val);
        node.children.forEach(n -> preorder(n, result));
    }
}
