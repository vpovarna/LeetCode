package com.leetcode._900;

import com.leetcode.utils.ListNode;

import static com.leetcode.utils.ListNodeUtils.printListNode;

public class _800_MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode halfList = middleNode(node);
        printListNode(halfList);
    }

}
