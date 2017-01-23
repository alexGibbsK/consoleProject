package com.alex.gibbs.homework;

/**
 * Created by Alex on 1/23/2017.
 */
public class fibonacciNum {
    public static void main(String[] args) {
        int number = 25;
        fibonacci(number);
    }

    private static void fibonacci(int number) {
        long a = 0;
        long b = 1;
        for (int i = 1; i < number; i++) {
            long c = a + b;
            a = b;
            b = c;
            if(c > number) break;
            System.out.println(c);
        }
    }
}
