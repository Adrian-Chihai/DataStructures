package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{2,34,4,6,7,8,19}, 0, 6));
        System.out.println(searchIndex1(new ArrayList<>(), new int[]{2,34,4,6,7,8,6}, 0, 6));
        System.out.println(searchIndex2(new int[]{2,34,6,6,7,8,6}, 0, 6));
    }

    public static int linearSearch(int[] arr, int index, int target){
        if(index == arr.length - 1 && arr[index] != target){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr, index + 1, target);
    }

    public static ArrayList<Integer> searchIndex1(ArrayList<Integer> list, int[] arr, int index, int target){
        if (arr[index] == target){
            list.add(index);
        }

        if(index == arr.length - 1){
            return list;
        }

        return searchIndex1(list, arr, index + 1, target);
    }

    public static ArrayList<Integer> searchIndex2(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> listData = searchIndex2(arr, index + 1, target);

        list.addAll(listData);
        return list;

    }
}
