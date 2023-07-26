package Bitwise;

import java.util.Scanner;

public class XorRangeAtoB {
    private static int xor(int a) {
        switch (a%4) {
            case 0: return a;
            case 1: return 1;
            case 2: return a+1;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(xor(a-1) ^ xor(b));
    }

}
