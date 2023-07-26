package Recursion;

public class factorial {
    private static int fact(int n) {
        if (n <= 1) {
            return n;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(fact(n));
    }
}
