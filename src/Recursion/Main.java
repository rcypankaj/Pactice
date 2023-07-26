package Recursion;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static int getSteps(int a, int b) {
        if (a > b) {
            return  -1;
        }
        if (a == b) {
            return 0;
        }

        int steps1 = getSteps(a*2, b);
        int steps2 = getSteps(a*3, b);
        if (steps1 == -1 && steps2 == -1) {
            return -1;
        } else if (steps1 == -1) {
            return steps2+1;
        } else {
            return steps1+1;
        }
//        return steps;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getSteps(a, b));
    }
}