package com.alex.gibbs.ekkel.Chapter_Five;

/**
 * Created by Alex on 1/25/2017.
 */
public class Main {
    public static void main(String[] args) {
        String_Class stc = new String_Class();
        System.out.println(stc.toString());

        System.out.println("=======================");

        String_Class stc2 = new String_Class("stc2");
        System.out.println(stc2.toString());

        System.out.println("=======================");

        Def_Constuctor dc = new Def_Constuctor();
        Def_Constuctor dc2 = new Def_Constuctor("Hello World!");

        System.out.println("=======================");

        Dog dog = new Dog();
        dog.bark((byte) 1, 1);
        dog.bark(1, (byte) 1);
        dog.bark((float) 1.0);

        System.out.println("=======================");

        ClsWithoutConstructor cwc = new ClsWithoutConstructor();
        System.out.println(cwc.toString());

        System.out.println("=======================");


    }
}
