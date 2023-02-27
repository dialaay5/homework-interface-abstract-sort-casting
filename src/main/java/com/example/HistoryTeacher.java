package com.example;

public class HistoryTeacher extends Teacher{
    protected String field_of_profession;
    public HistoryTeacher(String name, String id_number, String field_of_profession) {
        super(name, id_number);
        this.field_of_profession = field_of_profession;
    }

    @Override
    public String toString() {
        return "Class HistoryTeacher {" +
                "super:[" + super.toString() + "] " +
                ", field_of_profession= " + field_of_profession +
                '}';
    }


}
