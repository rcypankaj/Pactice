package Recursion;

import java.util.Arrays;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "([]){}";
//        String str = "[{()}]()";
//        String str = "(())";
        System.out.println(isValid(str.toCharArray(), str.length()));
    }

    private static boolean isValid(char[] expr, int n) {
        if (n == 0) {
            return true;
        } else if (n == 1) {
            return false;
        } else if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']') {
            return false;
        }

        char closing = findClosing(expr[0]);
        int i, count = 0;
        for (i = 1; i < n; i++) {
            if (expr[0] == expr[i]) {
                count++;
            } else if (expr[i] == closing) {
                if (count == 0) {
                    break;
                }
                count--;
            }
        }

        if (i == n) {
            return false;
        }
        if (i == 1) {
            return isValid(Arrays.copyOfRange(expr, i+1, n), n-2);
        }
        return isValid(Arrays.copyOfRange(expr, 1, i), i-1) && isValid(Arrays.copyOfRange(expr, (i+1), n), n-i-1);
    }
    private static char findClosing(char ch) {
        if (ch == '(') {
            return ')';
        } else if (ch == '{') {
            return '}';
        } else if (ch == '['){
            return ']';
        } else {
            return Character.MIN_VALUE;
        }
    }
}
