package DsaKunalKushwaha;
// Question Link: https://www.geeksforgeeks.org/sum-triangle-from-array/
import java.util.Arrays;
import java.util.Scanner;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findSumTriangle(arr);
    }
    public static void findSumTriangle(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] arr1 = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            arr1[i] = arr[i] + arr[i+1];
        }
        findSumTriangle(arr1);
        System.out.println(Arrays.toString(arr));
    }
}
