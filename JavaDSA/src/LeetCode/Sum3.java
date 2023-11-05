package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        System.out.println(sum3nr(new int[]{-1,0,1}));
    }
    public static List<List<Integer>> sum3nr(int[] nums){
        List<Integer> array = new ArrayList(List.of(nums));
        List<List <Integer>> listSums = new ArrayList<>();
        if(nums.length == 3){
            if(Arrays.stream(nums).sum() == 0){
                listSums.addAll(new ArrayList(List.of(nums)));
            }
        }else{
            for (int i = 0; i < nums.length - 2; i++){
                int sum = Arrays.stream(nums).skip(i).limit(3).sum();
                if(sum == 0){
                    listSums.add(new ArrayList(List.of(Arrays.stream(nums).skip(i).limit(3).toArray())));
                }
            }
        }
        return listSums;
    }
}
