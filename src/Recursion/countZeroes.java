package Recursion;

import java.util.Scanner;

public class countZeroes {
    private static int zeroesInN(int n, int count) {
        if (n <= 0) {
            return count;
        }

        int lastDigit = n%10;
        if (lastDigit == 0)
            ++count;
        return zeroesInN(n/10, count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = zeroesInN(n, 0);
        System.out.println(count);
    }

}
