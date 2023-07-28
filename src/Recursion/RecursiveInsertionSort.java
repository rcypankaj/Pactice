package Recursion;

import java.util.Arrays;
// Question Url: https://www.geeksforgeeks.org/recursive-insertion-sort/
public class RecursiveInsertionSort {
    public static void main(String[] args) {
//        int[] arr = {5, 1, 4, 2, 8};
        int[] arr = {5, 1, 8, 2, 4};
//        int[] arr = {5, 4, 1, 2, 8};
//        insertionSort(arr);
        if (arr.length > 1)
            recursiveInsertion(arr, 1, arr.length, 0, arr[1]);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void recursiveInsertion(int[] arr, int currRow, int maxRow, int j, int current) {
        if (currRow >= maxRow) {
            return;
        }

        if (j >= 0 && current < arr[j]) {
            arr[j+1] = arr[j];
            recursiveInsertion(arr, currRow, maxRow, j-1, current);
        } else {
            arr[j+1] = current;
            if (currRow + 1 >= maxRow) return;
            recursiveInsertion(arr, currRow + 1, maxRow, currRow, arr[currRow+1]);
        }
    }
}
