package com.alex.gibbs.ekkel.Chapter_Five;

/**
 * Created by Alex on 1/25/2017.
 */
public class String_Class {
    String name;
    String_Class(){
    }

    String_Class(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "String_Class{" +
                "name='" + name + '\'' +
                '}';
    }
}
