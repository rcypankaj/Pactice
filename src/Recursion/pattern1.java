package Recursion;

public class pattern1 {
    public static void recpattern1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            System.out.print("* ");
            recpattern1(row, col + 1);
        } else {
            System.out.println();
            recpattern1(row - 1, 0);
        }
    }
    public static void recpattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            recpattern2(row, col + 1);
            System.out.print("* ");
        } else {
            recpattern2(row - 1, 0);
            if (row != 1)
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
//        recpattern1(5, 0);
        recpattern2(5, 0);
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
