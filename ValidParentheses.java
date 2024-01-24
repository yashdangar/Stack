package com.yash;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String str = "({[]{)";

        System.out.println(sol(str));
    }
    public static boolean sol(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }else {
                if (s.empty()){
                    return false;
                }
                if ((s.peek() == '(' && str.charAt(i) == ')') || (s.peek() == '{' && str.charAt(i) == '}') || (s.peek() == '{' && str.charAt(i) == ']')){
                    s.pop();
                }else {
                    return false;
                }
            }
        }
        if (s.empty()){
            return true;
        }else {
            return false;
        }
    }
}
