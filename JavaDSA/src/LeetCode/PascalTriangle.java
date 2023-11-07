package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        printTriangle(6);
    }

    public static void printTriangle(int rows){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row;

        for(int i = 0; i < rows; i++){
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        System.out.println(triangle);
    }
}
