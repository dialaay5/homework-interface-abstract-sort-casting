package com.example;

public class StudioApartment extends Apartment{
    protected int num_of_rooms;
    public StudioApartment(String address, int size, int num_of_rooms) {
        super(address, size);
        this.num_of_rooms = num_of_rooms;
    }

    @Override
    public String toString() {
        return "Class StudioApartment {" +
                "super:[" + super.toString() + "] " +
                ", num_of_rooms= " + num_of_rooms +
                '}';
    }
}
