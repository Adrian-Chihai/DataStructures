package Recursion;

public class CheckArrSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{2,34,4,6,7,8,19}, 0));
    }

    public static boolean isSorted(int[] arr, int index){
        if (index == arr.length - 1){
            return true;
        }

        return arr[index] > arr[index + 1] && isSorted(arr, index + 1);
    }
}
