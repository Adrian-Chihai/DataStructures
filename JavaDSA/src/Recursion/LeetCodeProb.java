package Recursion;

public class LeetCodeProb {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
    public static int climbStairs(int n) {
        if(n < 40){
            return fibRecStairs(n + 1);
        } else {
            return fibStairs(n);
        }
    }

    public static int fibRecStairs(int n){
        if(n < 2){
            return n;
        }
        return fibRecStairs(n - 1) + fibRecStairs(n - 2);
    }

    public static int fibStairs(int n){
        int s = 1;
        int e = 1;
        int fib = 0;
        for(int i = 0; i < n; i++){
            fib = s + e;
            s = e;
            e = fib;
        }
        return fib;
    }
}
