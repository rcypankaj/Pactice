package Recursion;

import java.util.Scanner;

public class removeCharacter {
    public static void remove(String str, char ch, StringBuilder sb, int index) {
        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) != ch) {
            sb.append(str.charAt(index));
        }
        remove(str, ch, sb, index+1);
    }
    public static void remove1(String str, String res, char ch) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }
        if (str.charAt(0) == ch) {
            remove1(str.substring(1), res, ch);
        }else {
            remove1(str.substring(1), res+ str.charAt(0),ch);
        }
    }
    public static String remove2(String str, char ch) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.charAt(0) == ch) {
            return remove2(str.substring(1), ch);
        }else {
            return  str.charAt(0) + remove2(str.substring(1) ,ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder();
//        remove(str, ch, sb, 0);
//        System.out.println(sb);
//        remove1(str, "", ch);
        System.out.println(remove2(str, ch));



    }
}
