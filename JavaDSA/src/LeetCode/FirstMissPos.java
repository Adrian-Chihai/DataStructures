package LeetCode;

import java.util.Arrays;

public class FirstMissPos {

    public static void main(String[] args) {
        System.out.println(findSum(1, 15));
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }
    public static int firstMissingPositive(int[] nums) {
        nums = Arrays.stream(nums).sorted().distinct().filter(e -> e > 0).toArray();

        if(nums.length == 0){
            return 1;
        }

        if(nums[0] > 1){
            return 1;
        }

        System.out.println(nums[nums.length - 1]);
        double sumDouble = (double) (nums.length * (1 + nums[nums.length - 1]))/2;
        int sumCorrect = (int) Math.round(sumDouble);
        int arraySum = Arrays.stream(nums).sum();

        System.out.println(sumCorrect);
        System.out.println(arraySum);
        if (sumCorrect == arraySum){
            return nums[nums.length - 1] + 1;
        }
        return sumCorrect - arraySum;
    }

    public static int findSum(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        return sum;
    }
}
