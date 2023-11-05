package LeetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindWord {
    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                stringBuilder.append(board[i][j]);
            }
        }
        return false;
    }
}
