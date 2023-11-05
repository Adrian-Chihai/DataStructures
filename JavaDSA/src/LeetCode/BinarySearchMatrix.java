package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,1}}, 1));
        int[][] matrix = new int[][]{{1, 1}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = findRow(matrix, target);
        int start = 0;
        int end = matrix[row].length;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (matrix[row][mid] < target) {
                start = mid + 1;
            } else if (matrix[row][mid] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int findRow(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                return i;
            }
        }
        return -1;
    }
}
