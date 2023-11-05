package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countValidWords {
    public static void main(String[] args) {
        System.out.println(countValidWords("he bought 2 pencils, 3 erasers, and 1  pencil-sharpener."));
    }
    public static int countValidWords(String sentence) {
        String str = sentence.replaceAll(",","");
        String[] strArr = str.split(" ");
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("[a-zA-Z]+")){
                count++;
            }
        }
        return count;
    }
}
