package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(printFibonacci(5));
    }

    private static int printFibonacci(int n) {

        if(n == 2) {
            return 1;
        }
        if (n < 1) {
            return 0;
        }

        return printFibonacci(n-1)+ printFibonacci(n-2);
    }
}
