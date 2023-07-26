package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low-1;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        j++;
        int temp = arr[high];
        arr[high] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quick(arr, low, pidx-1);
            quick(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 7, 3, 6, 4};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
