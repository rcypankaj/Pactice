package Recursion;

import java.util.ArrayList;
import java.util.List;

public class linearSearchAndRetirnArrayList {
    private static ArrayList checkSortedArray(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index > arr.length-1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> newList = checkSortedArray(arr, index+1, target);
        list.addAll(newList);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 7, 8};
        int target = 1;
//        List<Integer> list = new ArrayList<>();
//        for (int i: arr) {
//        list.add(i);
//        }
        System.out.println(checkSortedArray(arr, 0, target));




    }
}
