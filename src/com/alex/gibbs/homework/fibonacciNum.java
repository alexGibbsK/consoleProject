package com.alex.gibbs.homework;

/**
 * Created by Alex on 1/23/2017.
 */
public class fibonacciNum {
    public static void main(String[] args) {
      fibonacci(5);
    }

    private static void fibonacci(int number) {
        int a = 0;
        int b = 1;
        for (int i = 1; i < number; i++) {
            int c = a + b;
            a = b;
            b = c;
            if(c > number) break;
            System.out.println(c);
        }
    }
}
