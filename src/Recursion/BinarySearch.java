package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(bs(arr, 0, 0, arr.length-1));
    }

    private static int bs(int[] arr, int target,  int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return bs(arr, target, si+1, ei);
        }

        return bs(arr, target, si, ei-1);

    }
}
