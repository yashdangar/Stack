package com.yash;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementMIMP {
    /*
     you have given an array, and you have to find the first greater element from that element
     arr = { 6, 8, 0, 1, 3}
     greater element = {8, -1, 1, 3, -1}  (ans)
    */

    //O(N) TC
    //this question has four variants(current variant is right next greater)
    /*
    next greater right
    next greater left : for loop reverse kari devu
    next smaller right : 29th line ni condition ultavi devi
    next smaller left : for loop reverse kari devu and 29th line ni condition ultavi devi
     */

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        for (int i = arr.length-1; i >= 0 ; i--) {
            //while
            while (!s.empty() && arr[s.peek()] <= arr[i]){  //  !s.empty() aetle jya sudhi stack khali no thay tya sudhi loop chalse, arr[s.peek()] this will give index of that element becoz we are adding indexes in stack
                s.pop();  // jo current element karta nano element hoi to kadhi nakhvo
            }
            // if else
            if (s.isEmpty()){
                nxtGreater[i] = -1;
            }else {
                nxtGreater[i] = arr[s.peek()];
            }
            //push
            s.push(i);
        }

        System.out.println(Arrays.toString(nxtGreater));

    }
}
