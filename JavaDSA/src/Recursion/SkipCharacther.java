package Recursion;

public class SkipCharacther {
    StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        System.out.println(removeCharacter1(" ", 'i', ans, 0));
    }

    public static String removeCharacter1(String s, char c, StringBuilder ans, int index){
        if (s.isBlank()){
            return "no string";
        }

        ans = s.charAt(index) != c ? ans.append(s.charAt(index)) : ans;

        if(index == s.length() - 1){
            return String.valueOf(ans);
        }
        return removeCharacter1(s, c, ans, index + 1);
    }

}
