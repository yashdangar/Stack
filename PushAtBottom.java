package com.yash;

import java.util.Stack;
//  Amazon ma aavelo

public class PushAtBottom {
    public static void main(String[] args) {
        //push at bottom of the stack

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(s,4);

//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
        System.out.println(s);
    }
    public static void pushBottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); // store top's value
        pushBottom(s,data); // call for next level
        s.push(top); //je element kadhyo hato aene pachho push karyo
    }
}
