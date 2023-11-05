package LeetCode;

import java.util.Arrays;

public class TrapWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int trap(int[] height) {
        int start = height[0];
        int vol = 0, tempVol = 0, smolVol = 0;

        for(int i = 1; i < height.length; i++){
            if(height[i] < start){
                tempVol += start - height[i];
            } else if(height[i] > start){
                start = height[i];
                vol += tempVol;
            }
        }
        return vol;
    }
}


