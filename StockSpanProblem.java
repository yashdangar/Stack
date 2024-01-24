package com.yash;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    //Amazon, adobe, flipkart, microsoft, samsung
    public static void main(String[] args) {
        // span : current stock pela ketla mota stocks aavya hata
        // if you don't understand than check  geeks for geeks
        //span = currPrice - maxPrice  Before that stock
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        // ans = { 1, 1, 1, 2, 1, 5, 6}
        int[] span = new int[stocks.length];

        stockSpan(stocks,span);

        System.out.println(Arrays.toString(span));
    }
    public static void stockSpan(int[] stocks,int[] span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1; // 1st span will be always = 1
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]){ // stack ne khali karyo
                s.pop();
            }

            if (s.isEmpty()){
                span[i] = i+1;
            }else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i); // push index at end
        }

    }

}
