package com.leetcode._700;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        } else {
            var rowNr = image.length;
            var colNr = image[0].length;

            Queue<List<Integer>> queue = new ArrayDeque<>();
            queue.add(List.of(sr, sc));
            var initialColor = image[sr][sc];

            while (!queue.isEmpty()) {
                var arr = queue.poll();
                var x = arr.get(0);
                var y = arr.get(1);
                if (x < 0 || x >= rowNr || y < 0 || y >= colNr || image[x][y] != initialColor) {
                    continue;
                }
                image[x][y] = color;
                queue.add(List.of(x - 1, y));
                queue.add(List.of(x + 1, y));
                queue.add(List.of(x, y - 1));
                queue.add(List.of(x, y + 1));
            }
        }

        return image;
    }
}
