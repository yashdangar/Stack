package com.yash;

import java.util.Stack;

public class StackUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
