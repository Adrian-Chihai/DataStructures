package LeetCode;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "mnagraa"));
    }
    public static boolean isAnagram(String s, String t) {
        String[] arr1 = s.split("");
        String[] arr2 = t.split("");
        return Arrays.equals(Arrays.stream(arr1).sorted().toArray(), Arrays.stream(arr2).sorted().toArray());
    }
}
