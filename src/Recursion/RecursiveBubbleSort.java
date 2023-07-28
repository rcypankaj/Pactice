package Recursion;

import java.util.Arrays;
// Question Url: https://www.geeksforgeeks.org/recursive-bubble-sort/
public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int row, int col) {
        if (row  == 0) {
            return;
        }

        if (row > col) {
            if (arr[col] > arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1]  = temp;
            }
//            System.out.print(arr[col] +" ");
            bubbleSort(arr, row, col+1);
        } else {
            bubbleSort(arr, row - 1, 0);
        }
    }
}
