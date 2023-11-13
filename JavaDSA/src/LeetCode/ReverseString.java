package LeetCode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int start = 0;
        int end = s.length - 1;
        char temp;

        while (start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(s));
    }
}
