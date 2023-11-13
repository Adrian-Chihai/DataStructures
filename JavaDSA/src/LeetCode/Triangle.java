package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<Integer> r1 = new ArrayList<>(List.of(2));
        List<Integer> r2 = new ArrayList<>(List.of(3,4));
        List<Integer> r3 = new ArrayList<>(List.of(6,5,7));
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(r1);
        triangle.add(r2);
        triangle.add(r3);
        System.out.println(minimumTotal(triangle));
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1){
            return triangle.get(0).get(0);
        }
        return 0;
    }
}
