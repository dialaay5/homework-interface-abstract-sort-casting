package com.example;

public class MathTeacher extends Teacher{
    protected int math_skills;
    public MathTeacher(String name, String id_number, int math_skills) {
        super(name, id_number);
        this.math_skills = math_skills;
    }

    @Override
    public String toString() {
        return "Class MathTeacher {" +
                "super:[" + super.toString() + "] " +
                ", math_skills= " + math_skills +
                '}';
    }
}
