package LeetCode;

public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] mergedArr = mergeArrays(nums1, nums2);
        int mid = mergedArr.length / 2;
        return mergedArr.length % 2 != 0 ? mergedArr[mid] : (mergedArr[mid] + mergedArr[mid - 1]) / 2;
    }

    public static double[] mergeArrays(int[] arr1, int[] arr2){
        double[] mergedArr = new double[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length){
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length){
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArr;
    }
}
