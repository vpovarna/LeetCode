package com.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

public final class ListNodeUtils {
    private ListNodeUtils() {
    }

    public static void printListNode(ListNode head) {
        System.out.println(extractLikedListToArray(head));
    }

    public static List<Integer> extractLikedListToArray(ListNode head) {
        final List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }
}
