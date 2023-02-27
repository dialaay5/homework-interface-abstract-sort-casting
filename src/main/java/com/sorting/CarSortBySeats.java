package com.sorting;

import java.util.Comparator;

public class CarSortBySeats implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.seats > o2.seats) {
            return 1;
        } else if (o1.seats < o2.seats) {
            return -1;
        }
        return 0;
    }
}