package main.Stack;

import java.util.Stack;

public class offerMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(12);
        stack.push(1);

//        System.out.println(stack.peek());
//        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
