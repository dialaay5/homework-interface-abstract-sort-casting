package com.sorting;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
public class Car implements Comparable<Car> {

    protected String id;
    protected String brand;
    protected String model;
    protected LocalDateTime creation;
    protected String color;
    protected int seats;


    @Override
    public int compareTo(Car o) {
        return this.id.compareTo(o.id);
    }

}
