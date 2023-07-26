package Recursion;

public class SumOfDigit {
    private static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        int lastDigit = n%10;
        return lastDigit + sum(n/10);
    }
    public static void main(String[] args) {
        int n = 3421;
        System.out.println(sum(n));
    }
}
