package com.leetcode._200;

import com.leetcode.utils.ListNode;

// Problem #206
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            // save the next current element to tmpNode for further assignment
            ListNode tmpNode = cur.next;
            // node rotation
            cur.next = prev;
            prev = cur;
            cur = tmpNode;
        }

        return prev;
    }

    public ListNode reverseList_v2(ListNode head) {
        return reverseListRecursive(null, head);

    }

    private ListNode reverseListRecursive(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode tail = reverseListRecursive(cur, cur.next);
        cur.next = prev;

        return tail;
    }
}
