package Recursion;

public class isSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(checkSortedArray(arr, 0));
    }

    private static boolean checkSortedArray(int[] arr, int i) {
        if (arr.length-1 <= i+1) {
            return true;
        }

        return arr[i] < arr[i+1] && checkSortedArray(arr, i+1);
    }
}
