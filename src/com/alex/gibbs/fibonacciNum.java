package com.alex.gibbs;

/**
 * Created by Alex on 1/23/2017.
 */
public class fibonacciNum {
    void Fibonacci(int x){
        int a = 0;
        int b = 1;
        for (int i = 0; i < x; i++) {
            System.out.printf("Fibonacci " + (b+=i));
        }
    }

    public static void main(String[] args) {
        fibonacciNum fn = new fibonacciNum();
        fn.Fibonacci(5);
    }
}
