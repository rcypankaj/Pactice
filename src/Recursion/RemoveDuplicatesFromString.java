package Recursion;
// Question URL: https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
import java.util.Scanner;

public class RemoveDuplicatesFromString {
    static boolean[] arr = new boolean[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        String res = removeDuplicate(str, "");
        String res = removeConsecutiveDuplicate(str, "");
        System.out.println(res);
    }
    public static String removeDuplicate(String str, String res) {
        if (str.isEmpty()) {
            return res;
        }
        char currChar = str.charAt(0);
        if (!arr[currChar - 'a']) {
            arr[currChar - 'a'] = true;
            return removeDuplicate(str.substring(1), res + currChar);

        } else {
            return removeDuplicate(str.substring(1), res);
        }
    }
    public static String removeConsecutiveDuplicate(String str, String res) {
        if (str.isEmpty()) {
            return res;
        }
        char currChar = str.charAt(0);
        int idx = 1;
        while (str.length() > idx && currChar == str.charAt(idx)) {
            idx++;
        }
        return removeConsecutiveDuplicate(str.substring(idx), res+currChar);
    }
}
