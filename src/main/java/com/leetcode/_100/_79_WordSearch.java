package com.leetcode._100;

public class _79_WordSearch {
    public boolean exist(char[][] board, String word) {
        int rowNr = board.length;
        int columnNr = board[0].length;

        for (int r= 0; r < rowNr; r++) {
            for (int c = 0; c < columnNr; c++) {
                if (word.charAt(0) == board[r][c]) {
                    if(dfs(board, word, r, c, 0)) return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i) {
        if (word.length() == i) return true;
        else if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || word.charAt(i) != board[r][c]) return false;
        else {
            var tmp = board[r][c];
            board[r][c] = ' '; // dummy Character;  prevent to not go back

            var res =
                    (dfs(board, word, r - 1, c, i + 1) ||
                    dfs(board, word, r + 1, c, i + 1) ||
                    dfs(board, word, r, c -1, i + 1) ||
                    dfs(board, word, r, c + 1, i + 1));
            board[r][c] = tmp;
            return res;
        }

    }
}
