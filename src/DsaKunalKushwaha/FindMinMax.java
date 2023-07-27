package DsaKunalKushwaha;
// Question URL: https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
import java.util.Arrays;
import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(findMinMaximum1(arr, 0)));
    }
    public static int[] findMinMaximum(int[] arr, int min, int max, int idx) {
        if (idx == arr.length) {
            int[] res = new int[2];
            res[0] = min;
            res[1] = max;
            return res;
        }

        return findMinMaximum(arr, Math.min(arr[idx], min), Math.max(arr[idx], max), idx+1);
    }

    public static int[] findMinMaximum1(int[] arr, int idx) {
        if (idx == arr.length-1) {
            int[] res = new int[2];
            res[0] = arr[idx];
            res[1] = arr[idx];
            return res;
        }
        int min = arr[idx];
        int max = arr[idx];
        int[] arr1 =  findMinMaximum1(arr,  idx+1);
        min = Math.min(min, arr1[0]);
        max = Math.max(max, arr1[1]);

        return new int[]{min, max};
    }
}
