package DsaKunalKushwaha;
// Question Url: https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
import java.util.Scanner;

public class FirstUpperCaseLetter {
    public static char firstUpperCase(String str) {
        if (str.isEmpty()) {
            return '1';
        }
        char currChar = str.charAt(0);
        if (Character.isUpperCase(currChar)) {
            return currChar;
        } else {
            return firstUpperCase(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(firstUpperCase(str));
    }
}
