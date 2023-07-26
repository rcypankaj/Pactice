package Recursion;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }

        if (row > col) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSort(arr, row, col + 1);
        } else {
            bubbleSort(arr, row-1, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 7, 3, 6, 4};
        bubbleSort(arr, arr.length-1, 0);
        for (int e: arr) {
            System.out.print(e+" ");
        }
    }
}
