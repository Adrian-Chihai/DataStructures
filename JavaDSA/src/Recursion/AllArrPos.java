package Recursion;

import java.util.Arrays;
import java.util.HashMap;

public class AllArrPos {
    public static void main(String[] args) {
//        System.out.println(createMap(new int[]{1,3,2}));
        System.out.println(3 * (3 - 1));
    }

    public static HashMap createMap(int[] arr){
        arr = Arrays.stream(arr).sorted().toArray();
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < fact(arr.length); i++){
            map.put(i, addInMap(arr, arr[i]));
        }
        return map;
    }

    public static int[] addInMap(int[] arr, int nr){
        return null;
    }

    public static int fact(int n){
        if(n == 1){
            return n;
        }

        return n * fact(n - 1);
    }

}
