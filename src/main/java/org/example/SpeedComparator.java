package org.example;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return Integer.compare(o1.getSpeed(), o2.getSpeed());
    }
}
