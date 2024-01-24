package com.yash;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        // aa print thase
        // 3
        // 2
        // 1

        reverseStack(s);
        printStack(s);

    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void pushBottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushBottom(s,top);
    }
}
