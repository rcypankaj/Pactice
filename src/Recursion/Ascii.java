package Recursion;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(printSeqWithAscii(str, ""));
    }

    private static ArrayList<String> printSeqWithAscii(String str, String res) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> first = printSeqWithAscii(str.substring(1), res);
        ArrayList<String> second = printSeqWithAscii(str.substring(1), res + ch);
        ArrayList<String> third = printSeqWithAscii(str.substring(1), res + (ch+0));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
