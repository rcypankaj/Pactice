package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 0;
        System.out.println(checkSortedArray(arr, 0, target));
    }

    private static int checkSortedArray(int[] arr, int index, int target) {
        if (arr.length-1 < index) {
            return -1;
        }

        return target == arr[index] ? index : checkSortedArray(arr, index+1, target);
    }
}
