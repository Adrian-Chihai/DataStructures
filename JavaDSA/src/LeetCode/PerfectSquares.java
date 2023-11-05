package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }
    public static int numSquares(int n) {
        int digits = 0;
        int tempN = n;
        List<Integer> list = findSqrt(n);
        return 0;
    }

    public static List<Integer> findSqrt(int limit){
        List<Integer> listRoots = new ArrayList<>();
        int nr = 2;
        int nrRoot = 1;
        while (nrRoot < limit){
            listRoots.add(nrRoot);
            nrRoot = (int) Math.pow(nr, 2);
            nr++;
        }
        return listRoots;
    }
}
