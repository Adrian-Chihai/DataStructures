package LeetCode;

public class RBS {
    public static void main(String[] args) {
        System.out.println(rotatedBS(new int[]{4,5,6,7,0,1,2}, 3));
    }

    static int rotatedBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end){
            mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            //check if first part is sorted from start to mid
            if(arr[start] <= arr[mid]){
                //check if target is in this part
                if(target >= arr[start] && target <= arr[mid]){
                    end = mid - 1;
                }
                //else we move start to mid + 1
                else {
                    start = mid + 1;
                }
            //check if target is in second part
            } else if(target >= arr[mid] && target <= arr[end]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
