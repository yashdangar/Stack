package com.yash;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
        /*
        find if it contains duplicate parentheses or not.
        contains duplicate parentheses
        "(((a+b)+(c+d)))"
        "(((a+b))+c)"
        "((((a)+(b))+c+d))"
        does not contains duplicate parentheses
        "((a+b)+(c+d))"
        "(((a+b)+)+c)"
         */
        // Microsoft, Google
        // O(N)
        String str = "(((a+b)+(c+d)))";// duplicate
        String str1 = "((a+b)+(c+d))";// not duplicate
        System.out.println(sol(str));
        System.out.println(sol(str1));
    }
    public static boolean sol(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')'){
                int cnt = 0;
                while ( s.peek() != '('){
                    s.pop();
                    cnt++;
                }
                if (cnt < 1){
                    return true;
                }else {
                    s.pop();
                }
            }else {
                s.push(ch);
            }
        }
        return false;
    }
}
