package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayGame {
    public static void main(String[] args) {
        System.out.println(getWinner(new int[]{2,1,3,5,4,6,7}, 2));
    }

    public static int getWinner(int[] arr, int k) {
        int gamesWon = 0;
        while (gamesWon < k){
            if(arr[0] > arr[1]){
                arr = moveRight(1, arr.length, arr[1], arr);
                gamesWon++;
            } else {
                gamesWon = 0;
                arr = moveRight(0, arr.length, arr[0], arr);
                gamesWon++;
            }

            if(arr[0] == Arrays.stream(arr).max().getAsInt()){
                break;
            }
        }
        return arr[0];
    }

    public static int[] moveRight(int start, int end, int lastPos,int[] arr){
        for (int i = start; i < end - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[end - 1] = lastPos;
        return arr;
    }
}
