package MergeSort;

import java.util.Arrays;

/*
STEPS FOR MERGE SORT
1) Divide array in 2 parts
2) Get both parts sorted
3) Merge this 2 parts
*/
public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{23, 43, 3, 32, 54, 12, 32, 54, 35})));
    }

    static int[] mergeSort(int[] arr){
        //base condition
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right =mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] mergedArr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                mergedArr[k] = left[i];
                i++;
            } else {
                mergedArr[k] = right[j];
                j++;
            }
            k++;
        }

        //add all remaining elements in the array
        while (i < left.length){
            mergedArr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            mergedArr[k] = right[j];
            j++;
            k++;
        }

        return mergedArr;
    }


}
