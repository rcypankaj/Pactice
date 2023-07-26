package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetIterative {
    public static void main(String[] args) {
//        char[] arr = {'a', 'b', 'c'};
        int[] arr = {1, 2, 3};
        List<List<Integer>> listOfList = subSet(arr);
//        List<List<Character>> listOfList = subSet1(arr);
//        for (List<Character> list : listOfList) {
//            System.out.println(list);
//        }
        for (List<Integer> list : listOfList) {
            System.out.println(list);
        }
    }
    public static List<List<Character>> subSet1(char[] arr) {
        List<List<Character>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (char num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Character> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
