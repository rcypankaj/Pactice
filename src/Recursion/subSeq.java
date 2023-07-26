package Recursion;

import java.util.ArrayList;

public class subSeq {
    public static ArrayList<String> subSeqFunction2(String str, String res) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subSeqFunction2(str.substring(1), res);
        ArrayList<String> right = subSeqFunction2(str.substring(1), res + ch);
        left.addAll(right);
        return left;
    }
    public static void subSeqFunction1(String str, String res, ArrayList<String> res1) {
        if (str.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(res);
//            System.out.println(res);
            res1.add(res);
            return;
        }
        char ch = str.charAt(0);
        subSeqFunction1(str.substring(1), res, res1);
        subSeqFunction1(str.substring(1), res + ch, res1);
    }
    public static void subSeqFunction(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }
        char ch = str.charAt(0);
        subSeqFunction(str.substring(1), res);
        subSeqFunction(str.substring(1), res + ch);
    }
    public static void main(String[] args) {
        String str = "abc";
//        subSeqFunction(str, "");
//        ArrayList<String> list = new ArrayList<>();
//        System.out.println(subSeqFunctionRet(str, "", list));
//        subSeqFunction1(str, "", list);
//        System.out.println(list);
        System.out.println(subSeqFunction2(str, ""));
    }

}
