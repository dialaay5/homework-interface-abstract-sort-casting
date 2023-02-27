package com.sorting;

import java.util.Comparator;

public class CarSortByBrandAndModel implements Comparator<Car> {
    @Override
    public int compare(Car o1,Car o2) {
        if(o1.brand.equals(o2.brand)){
            return o1.model.compareTo(o2.model);
        }
        else{
            return o1.brand.compareTo(o2.brand);
        }
    }
}
