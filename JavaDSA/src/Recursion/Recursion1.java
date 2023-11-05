package Recursion;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println("Fibonacci -> " + fibNr(3));
        System.out.println("Factorial -> " + fact(4));
        System.out.println("Sum -> " + sumToN(3));
        int[] arr = new  int[]{3, 43, 56, 59, 345};
        System.out.println("Binary Search -> " + binarySearchRec(arr, 9, 0, arr.length - 1));
        System.out.print("Print rev -> "); printRev(5);
        System.out.println();

        System.out.println("Sum of digits -> " + sumDigits(1342));
        System.out.println("Product of digits -> " + productOfDigits(33));
        System.out.println("Rev nr -> " + revNrRecursive(-23));
        System.out.println("Rev nr 2-> " + revNrRecursive2(236469));

        System.out.println("Palindrome -> " + palindrome(131));
        System.out.println("Count zeros -> " + countZeros(100001, 0));

    }

    static void printRec(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printRec(n + 1);
    }

    static void printRev(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }

        printRev(n - 1);
        System.out.print(n + " ");
    }

    static int fibNr(int n){
        if(n < 2){
            return n;
        }
        return fibNr(n - 1) + fibNr(n - 2);
    }

    static int fact(int n){
        if(n == 1){
            return n;
        }
        return n * fact(n - 1);
    }

    static int sumToN(int n){
        if (n == 1){
            return n;
        }

        return n + sumToN(n - 1);
    }

    static int sumDigits(int n){
        if(n == n % 10){
            return n;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    static int productOfDigits(int n){
        if(n == n % 10){
            return n;
        }

        return (n % 10) * sumDigits(n / 10);
    }

    static int revNrRecursive(int n){
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE){
            return 0;
        }
        int modN = Math.abs(n);
        if(modN < 10){
            return n;
        }

        int len = (int) (Math.log10(modN) + 1);
        int last = (int) (modN % 10 * Math.pow(10, len - 1));

        if(n < 0){
            int nr = last + revNrRecursive(modN / 10);
            return -1 * nr;
        }
        System.out.println(last);
        return last + revNrRecursive(modN / 10);
    }

    static int revNrRecursive2(int n){
        if(n < 10){
            return n;
        }

        int last = n % 10;

        return Integer.parseInt(last + "" + revNrRecursive2(n / 10));
    }

    static boolean palindrome(int n){
        if(n % 10 == n){
            return true;
        }
        int len = (int) Math.log10(n) + 1;
        return n == helpPalindrome(n, len);
    }

    static int helpPalindrome(int n, int len){
        if(n % 10 == n){
            return n;
        }
        return n % 10 * (int) (Math.pow(10, len - 1)) + helpPalindrome(n / 10, len - 1);
    }

    static int countZeros(int nr, int count){
        if(nr % 10 == nr){
            return nr == 0 ? ++count : count;
        }
        if(nr % 10 == 0){
            return countZeros(nr / 10, ++count);
        }
        return countZeros(nr / 10, count);
    }

    static int binarySearchRec(int[] arr, int search, int start, int end){

//        if(start > end){
//            return -1;
//        }

        int mid;

//        if (arr[mid] == search){
//            return mid;
//        } else if (arr[mid] > search){
//            return binarySearchRec(arr, search, start, mid - 1);
//        } else if (arr[mid] < search){
//            return binarySearchRec(arr, search, mid + 1,  end);
//        }


        while(start <= end){
            mid = start + (end - start) / 2;
            if(arr[mid] == search){
                return mid;
            } else if(arr[mid] > search){
                end = mid - 1;
            } else if(arr[mid] < search){
                start = mid + 1;
            }
        }

        return -1;
    }
}
