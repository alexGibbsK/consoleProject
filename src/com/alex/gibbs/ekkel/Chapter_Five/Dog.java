package com.alex.gibbs.ekkel.Chapter_Five;

/**
 * Created by Alex on 1/25/2017.
 */
public class Dog {
    void bark(int x, byte b) {
        System.out.println("Собака лает.");
    }

    void bark(byte b, int x) {
        System.out.println("Собака скулит.");
    }

    void bark(float f) {
        System.out.println("Собака завывает.");
    }
}
