package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissing {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{3,2,5,1,7}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        List<Integer> missing = new ArrayList<>();
        int i = 0;
        int curent = nums[0];
        while (i < nums.length - 1){
            if(nums[i] == nums[i + 1]){
                curent = nums[i + 1];
                i++;
            } else if(curent + 1 != nums[i]){
                missing.add(3);
            }
        }
        return missing;
    }
}
