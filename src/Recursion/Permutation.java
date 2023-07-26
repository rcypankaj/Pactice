package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "abcd";
//        printPermutation(str, 0, "");
//        System.out.println(printPermutation2(str,  ""));
//        System.out.println(printPermutation3(str,  0, ""));
        int count = 0;

        System.out.println(countPermutation(str,  0, ""));
    }
    public static void printPermutation(String str, int idx, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPermutation(newStr, idx+1, res + currChar);
        }
    }
    public static int countPermutation(String str, int idx, String res) {
        if (str.isEmpty()) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            int count1 = countPermutation(newStr, idx+1, res + currChar);
            count += count1;
//            System.out.println(count1);
        }
        return count;
    }
    public static ArrayList<String> printPermutation3(String str, int idx, String res) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            ArrayList<String> list1 = printPermutation3(newStr, idx + 1, res + currChar);
            result.addAll(list1);
        }
        return result;
    }
    public static void printPermutation1(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }

        char currChar = str.charAt(0);
        for (int i = 0; i <= res.length(); i++){
            String first = res.substring(0,i);
            String second = res.substring(i);
            printPermutation1(str.substring(1), first + currChar + second);
        }
    }

    public static ArrayList<String> printPermutation2(String str, String res) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        char currChar = str.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= res.length(); i++){
            String first = res.substring(0,i);
            String second = res.substring(i);
            List<String> list1 = printPermutation2(str.substring(1), first + currChar + second);
            result.addAll(list1);
        }
        return result;
    }
}
