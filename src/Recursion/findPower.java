package Recursion;

import java.util.Scanner;

public class findPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int res = findWhichPower(n, a, 0);
        System.out.println(res);
//        System.out.println(findPowerValue(n, a));
    }
    public static int findWhichPower(int n, int a, int pow) {
        int val = findPowerValue(a, pow);
//        System.out.println(val);
        if (val > n || a < 2) {
            return -1;
        }
        if (val == n) {
            return pow;
        }
        return findWhichPower(n, a, pow+1);
    }
    public static int findPowerValue(int num, int x) {
        if (num <= 0) return 0;
        if (x == 1) {
            return num;
        }
        if (x == 0) {
            return 1;
        }
        return num * findPowerValue(num, x-1);
    }
}
