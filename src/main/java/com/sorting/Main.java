package com.sorting;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car[] cars = { new Car("55-235-22","maserati", "granturismo", LocalDateTime.now(), "black",5),
                       new Car("90-587-67","ford", "focus", LocalDateTime.now(), "white",4),
                       new Car("14-987-53","maserati ", "levante", LocalDateTime.now(), "gray",2)};

        System.out.println("sort by id");
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        System.out.println("---------------");

        System.out.println("sort by brand");
        Arrays.sort(cars, new CarSortByBrandAndModel());
        System.out.println(Arrays.toString(cars));

        System.out.println("---------------");

        System.out.println("sort by color");
        Arrays.sort(cars, new CarSortByColor());
        System.out.println(Arrays.toString(cars));

        System.out.println("---------------");

        System.out.println("sort by seats");
        Arrays.sort(cars, new CarSortBySeats());
        System.out.println(Arrays.toString(cars));

        System.out.println("---------------");

        System.out.println("sort by creation");
        Arrays.sort(cars, new CarSortByBrandCreation());
        System.out.println(Arrays.toString(cars));

        System.out.println("---------------");


    }
}
