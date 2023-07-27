package Recursion;
// Question Url: https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
import java.util.Scanner;

public class CountLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countLength(str));
    }
    public static int countLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return countLength(str.substring(1)) + 1;
    }
}
