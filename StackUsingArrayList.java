package com.yash;

import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push -> add element from last 1<-2<-3<-4   we stared adding from 1 to 4 here 4 is top
        public static void push(int data){
            list.add(data);
        }

        //pop -> first return the value of top and remove last
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek -> return the value of top
        public static int peek(){
            if (isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
        }


    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);



        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
