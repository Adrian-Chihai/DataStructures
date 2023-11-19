package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        return String.valueOf(stringBuilder.reverse()).equals(s.toLowerCase());
    }
}
