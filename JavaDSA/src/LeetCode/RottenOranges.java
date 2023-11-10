//package LeetCode;
//
//import java.util.Arrays;
//
//public class RottenOranges {
//    public static void main(String[] args) {
//        System.out.println(orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
//    }
//
//    public static int orangesRotting(int[][] grid) {
//        int min = 0;
//        int[] rottenPos = findRotten(grid);
//
//        if (rottenPos.length == 0){
//            return -1;
//        }
//    }
//
//    public static int[] findRotten(int[][] grid) {
//        for(int i = 0; i < grid.length; i++){
//            for(int j = 0; j < grid[i].length; j++){
//                if(grid[i][j] == 2){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//}
