package com.leetcode._200;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        var nrOfIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfsMark(grid, i, j);
                    nrOfIslands += 1;
                }

            }
        }

        return nrOfIslands;
    }

    private void dfsMark(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
        if (grid[i][j] != '1') return;

        grid[i][j] = '0';
        dfsMark(grid, i - 1, j);
        dfsMark(grid, i + 1, j);
        dfsMark(grid, i, j - 1);
        dfsMark(grid, i, j + 1);

    }

    public static void main(String[] args) {
        var inputGrid = new char[][]{
                new char[]{'1', '1', '1', '1', '0'},
                new char[]{'1', '1', '0', '1', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '0', '0', '0'}
        };
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        System.out.println(numberOfIslands.numIslands(inputGrid));
    }
}
