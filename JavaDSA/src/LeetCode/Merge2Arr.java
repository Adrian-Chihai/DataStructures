package LeetCode;

import java.util.Arrays;

public class Merge2Arr {
    public static void main(String[] args) {
        merge(new int[]{2,0}, 1, new int[]{1}, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }

        int i = 0;
        int j = 0;
        int temp;
        while (i < m) {
            if (nums1[i] > nums2[j]) {
                nums1 = moveRight(nums1, i);
                nums1[i] = nums2[j];
                i++;
                j++;
            } else {
                i++;
            }
        }

        while (i < nums1.length - 1) {
            if (nums1[i] > nums2[j] || nums1[i] == 0) {
                nums1 = moveRight(nums1, i);
                nums1[i] = nums2[j];
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static int[] moveRight(int[] arr, int start){
        for (int i = arr.length - 1; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        return arr;
    }
}
