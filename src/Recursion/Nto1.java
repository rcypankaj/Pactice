package Recursion;

import java.util.Scanner;

public class Nto1 {
    private static void recu(int n) {
        if (n == 0) {
            return;
        }
        recu(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recu(n);
    }
}
