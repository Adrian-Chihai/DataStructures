package LeetCode;

public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(34.00515, -3));
    }
    public static double myPow(double x, int n) {
        if(n < 0){
            for (int i = 1; i < Math.abs(n); i++){
                x *= Math.abs(n);
            }
            return 1/x;
        }
        double pow = x;
        for(int i = 1; i < n; i++){
            x *= pow;
        }
        return x;
    }
}

