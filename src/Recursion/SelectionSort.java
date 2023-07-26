package Recursion;

public class SelectionSort {
    public static void selectionSort(int[] arr, int row, int col, int index) {
        if (row == 0) {
            return;
        }
        if (row >= col) {
            if (arr[col] > arr[index]) {
                selectionSort(arr, row, col + 1, col);
            } else {
//            System.out.print(index+" ");
                selectionSort(arr, row, col + 1, index);
            }
        } else  {
                int temp = arr[row];
                arr[row] = arr[index];
                arr[index] = temp;
//            System.out.println();
            selectionSort(arr, row-1, 0, 0);
        }
    }
    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 1};
//        int[] arr = {5, 2, 8, 1, 7, 3, 6, 4};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        // 5, 2, 4, 1, 3, 6, 7, 8
        // 3, 2, 4, 1, 5, 6, 7, 8
        // 3, 2, 1, 4, 5, 6, 7, 8
        // 1, 2, 3, 4, 5, 6, 7, 8
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println();
        for (int e: arr) {
            System.out.print(e+" ");
        }
    }
}
