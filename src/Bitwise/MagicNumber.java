package Bitwise;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int res = 0;
        while (n > 0) {
            if ((n&1) != 0) {
                res += Math.pow(5, i);
            }
            n = n >> 1;
            i++;
        }
//        11
//                1001

        System.out.println(res);
    }
}
