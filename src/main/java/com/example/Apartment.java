package com.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Apartment {
    protected String address;
    protected int size;

    @Override
    public String toString() {
        return "Apartment{" +
                "address=" + address +
                ", size=" + size +
                '}';
    }
}
