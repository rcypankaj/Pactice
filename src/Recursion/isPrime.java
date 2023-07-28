package Recursion;
// Question URL: https://www.geeksforgeeks.org/recursive-program-prime-number/
public class isPrime {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(checkPrime(num, 2));
    }
    public static boolean checkPrime(int num, int i) {
        if (Math.sqrt(num) < i) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return checkPrime(num, i+1);
    }
}
