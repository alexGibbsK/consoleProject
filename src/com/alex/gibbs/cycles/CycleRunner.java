package com.alex.gibbs.cycles;

/**
 * Created by Alex on 1/24/2017.
 */
public class CycleRunner {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle.ride(unicycle);
        Cycle.ride(bicycle);
        Cycle.ride(tricycle);
    }
}
