package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(")()())()()(");
        System.out.println(longestValidParentheses(")()())()()("));
    }
    public static int longestValidParentheses(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        Stack<Integer> indexes = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push('(');
                indexes.push(i);
                arr.set(i, 0);
            } else if(s.charAt(i) == ')' && !stack.empty()){
                stack.pop();
                arr.set(i, 1);
                arr.set(indexes.pop(), 1);
                count += 2;
            }
        }
        System.out.println(arr);
        System.out.println(indexes);
//        int limit = arr.length;
//
//        while (limit != -1){
//            if(indexes.empty()){
//                count = Arrays.stream(arr).limit(limit).sum();
//                System.out.println(count);
//                maxCount = Math.max(count, maxCount);
//                limit = -1;
//            } else {
//                count = Arrays.stream(arr).skip(indexes.peek() + 1).limit(limit).sum();
//                System.out.println(count);
//                maxCount = Math.max(count, maxCount);
//                limit = indexes.pop();
//            }
//        }
        return maxCount;
    }
}
