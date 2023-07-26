import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Integer> findMissings(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i]-1;
            if (arr[i] != i + 1 && arr[i] != arr[current]){
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                list.add(j+1);
            }
        }

        return list;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {

        return findMissings(nums);
    }

    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        System.out.println(findMissings(arr).toString());
    }
}

// 7 3 2 4 8 2 3 1
// 3 3 2 4 8 2 7 1
// 2 3 3 4 8 2 7 1
// 3 2 3 4 8 2 7 1
// 3 2 3 4 1 2 7 8
// 1 2 3 4 3 2 7 8
