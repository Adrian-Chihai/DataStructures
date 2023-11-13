package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(18/10);
    }

    public static int[] plusOne(int[] digits){
        int len = digits.length;
        int[] digitsPlus = new int[len];
        int i = digits.length - 1;
        int digitsI = len - 1;
        int inMind = 0;
        int nrSum = digits[i] + 1;

        while (i >= 0){
            if(nrSum > 9){
                inMind = nrSum / 10;
                nrSum %= 10;
            } else {
                inMind = 0;
            }

            digitsPlus[digitsI] = nrSum;
            i--;
            digitsI--;
            nrSum = i >= 0 ? digits[i] + inMind : inMind;
        }

        if(inMind != 0){
            int[] digitsExpand = new int[digitsPlus.length + 1];
            digitsExpand[0] = inMind;
            for (int ind = 1; i < digitsExpand.length; i++){
                digitsExpand[ind] = digitsPlus[ind - 1];
            }
            return digitsExpand;
        }
        return digitsPlus;
    }
}
