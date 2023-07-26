package Bitwise;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n-1)) == 0 && n != 0) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}
