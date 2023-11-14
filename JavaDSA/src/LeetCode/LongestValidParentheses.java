package LeetCode;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(")()())()()(");
        System.out.println(longestValidParentheses(")()())"));
    }
    public static int longestValidParentheses(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        Stack<Integer> indexes = new Stack<>();
        int[] arr = new int[s.length()];
        int maxCount = 0;

        //create indexes array
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push('(');
                indexes.push(i);
                arr[i] = 0;
            } else if(s.charAt(i) == ')' && !stack.empty()){
                stack.pop();
                arr[i] = 1;
                arr[indexes.pop()] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                maxCount = Math.max(maxCount, count);
                count = 0;
            } else {
                count += arr[i];
            }
        }
        return maxCount;
    }
}
