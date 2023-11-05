package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class CheckDubs {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,1,3,4}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
                .boxed() // Convert int to Integer
                .collect(Collectors.toSet());

        return set.size() != nums.length;
    }
}
