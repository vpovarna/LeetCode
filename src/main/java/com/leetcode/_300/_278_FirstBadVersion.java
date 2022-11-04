package com.leetcode._300;

import java.util.Map;

public class _278_FirstBadVersion {

    // Using recursion
    public int firstBadVersion(int n) {
        return bsfFindFirstBadVersion(1, n);
    }

    private int bsfFindFirstBadVersion(int i, int j) {
        if (i >= j) return i;

        var mid = (i + (j - i) / 2);
        if (isBadVersion(mid)) {
            return bsfFindFirstBadVersion(i, mid);
        } else {
            return bsfFindFirstBadVersion(mid + 1, j);
        }
    }

    // Using while
    public int firstBadVersion_v2(int n) {
        // bst impl
        int low = 0;
        int high = n - 1;
        while (low < high) {
            var mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isBadVersion(int i) {
        var map = Map.of(1, true, 2, true, 3, true, 4, false, 5, false);
        return map.get(i);
    }

    public static void main(String[] args) {
        _278_FirstBadVersion firstBadVersion = new _278_FirstBadVersion();
        System.out.println(firstBadVersion.firstBadVersion(5));
    }
}
