/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CPP
{
    static int calculateSum(int d, int n) {
        if (d == 0)
            return n;
        if (n == 1) return 1;

        n  += calculateSum(d, n - 1);
        return calculateSum (d-1,n);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(calculateSum(d,n));
        }
    }
}
