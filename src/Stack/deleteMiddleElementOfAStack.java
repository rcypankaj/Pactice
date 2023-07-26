package Stack;

import java.util.Scanner;
import java.util.Stack;

public class deleteMiddleElementOfAStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            myStack.push(sc.nextInt());
        }

        Solution obj = new Solution();
        obj.deleteMid(myStack, n);

        while (!myStack.isEmpty()) {
            System.out.print(myStack.peek()+" ");
            myStack.pop();
        }

    }
}

class Solution {
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        if (s.isEmpty()) return;
        int mid = sizeOfStack/2;
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < mid; i++) {
            tempStack.push(s.pop());
        }
        s.pop();

        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }
}