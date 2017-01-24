package com.alex.gibbs.cycles;

/**
 * Created by Alex on 1/24/2017.
 */
public class Cycle {
    String name;
    int wheels = 0;

    public static void ride(Cycle i) {
        System.out.println(i.name + "is rideable " + "wheels: " + i.wheels);
    }

}
