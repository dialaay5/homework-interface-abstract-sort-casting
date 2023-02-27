package com.sorting;

import java.util.Comparator;

public class CarSortByBrandCreation implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.creation.compareTo(o2.creation);
    }
}

