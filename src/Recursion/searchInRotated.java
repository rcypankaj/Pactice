package Recursion;

import java.util.Scanner;

public class searchInRotated {
    public static int findPivot(int[] arr) {
        int l = 0, r = arr.length-1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            
            if (mid+1 < arr.length && arr[mid] > arr[mid+1]) {
                return mid;
            } else if (mid - 1 >= 0 && arr[mid-1] > arr[mid]) {
                return mid-1;
            } else if (arr[l] < arr[mid]) {
                l = mid+1;
            } else {
                r = mid-1;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr = {7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
        int[] arr = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = 0, r = arr.length-1;
        System.out.println(findPivot(arr));
    }
}


