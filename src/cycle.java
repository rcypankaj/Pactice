import java.util.Scanner;

public class cycle {
    public static void cycleSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            while (arr[i] != i+1) {
//                int temp = arr[i];
//                arr[i] = arr[temp-1];
//                arr[temp-1] = temp;
//            }
//        }
        int i = 0;
        while (i < arr.length) {
            int current = arr[i];
            if (arr[i] < arr.length && arr[i] != i) {
//                if (arr[current] == 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[current];
//                    arr[current] = temp;
//                } else {
                    int temp = arr[i];
                    arr[i] = arr[current];
                    arr[current] = temp;
//                }
            } else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,0,1};
        cycleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
