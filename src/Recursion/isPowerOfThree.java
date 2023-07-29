package Recursion;
// Question URL: https://www.geeksforgeeks.org/find-whether-given-integer-power-3-not/
import java.util.*;

import static java.lang.Math.log;

public class isPowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double val = Math.log10(num)/Math.log10(3);
//
        System.out.println(val%1 == 0); // Output: int
//        System.out.println(log(25));
//        System.out.println(recursivePowerOfThree(num, 3));
    }
    public static boolean recursivePowerOfThree(int num, int x) {
        if (num == 1) {
            return true;
        }
        if (num % x != 0) {
            return false;
        }
        return recursivePowerOfThree(num/x, x);
    }
}