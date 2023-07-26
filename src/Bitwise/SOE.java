package Bitwise;

import java.util.Arrays;
import java.util.Scanner;

public class SOE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]){
                for (int j = i+i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (isPrime[i])
            System.out.println(i+ " "+isPrime[i]+" ");
        }
    }
}
