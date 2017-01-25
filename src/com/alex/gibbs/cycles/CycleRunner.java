package com.alex.gibbs.cycles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 1/24/2017.
 */
public class CycleRunner {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        List<Cycle> list = new ArrayList<>();
        list.add(unicycle);
        list.add(bicycle);
        list.add(tricycle);

        for (Cycle cycles : list) {
            Cycle.ride(cycles);
        }
    }
}
