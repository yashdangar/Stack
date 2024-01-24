package com.yash;

import java.util.Stack;

public class ReverseAString {
    // Amazon, flipkart, adobe, paytm, microsoft
    public static void main(String[] args) {
        //Reverse a string using stack
        Stack<Character> s = new Stack<>();
        s.push('a');
        s.push('b');
        s.push('c');

        StringBuilder sb = new StringBuilder();

        while (!s.isEmpty()){
            sb.append(s.pop());
        }

        System.out.println(sb);
    }
}
