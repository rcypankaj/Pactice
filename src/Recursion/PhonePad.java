package Recursion;

public class PhonePad {
    public static void main(String[] args) {
        String str = "23";
        printPhonePad(str, "");

    }
    public static void printPhonePad(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }
        int start = str.charAt(0) - '0';

        for (int i = (start - 1) * 3; i < start * 3; i++) {
            char curChar = (char)('a' + i);
            printPhonePad(str.substring(1), res + curChar );
        }
    }
}
