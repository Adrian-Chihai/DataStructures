package LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,0,1});
    }

    public static void moveZeroes(int[] nums) {
        int end = nums.length - 1;

        while (nums[end] == 0){
            end--;
        }

        for (int i = 0; i <= end; i++){
            if(nums[i] == 0){
                nums = moveLeft(nums, i + 1, end + 1);
                nums[end] = 0;
                end--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int[] moveLeft(int[] nums, int start, int end){
        for (int i = start; i < end; i++){
            nums[i - 1] = nums[i];
        }
        return nums;
    }

}
