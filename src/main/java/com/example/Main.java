package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1:");
        System.out.println("In Java, method overriding occurs when a subclass has the same method as the parent class.\n" +
                "In other words, method overriding occurs when a subclass provides a particular implementation of a method declared by one of its parent classes.\n" +
                "The ability for a subclass to override a method allows a class to inherit from a superclass with near enough actions and then change it as required.\n" +
                "The name, number, and type of parameters, and return type of the overriding method are identical to those of the method it overrides.");

        System.out.println("Question 2:");
        Fruit fruit = new Fruit();
        fruit.eat();
        Orange orange = new Orange();
        orange.eat();

        System.out.println("Question 3:");
        Apartment apartment = new Apartment("haifa", 320);
        System.out.println(apartment);
        StudioApartment studioApartment = new StudioApartment("haifa", 280, 5);
        System.out.println(studioApartment);

        System.out.println("Question 4:");
        System.out.println("Polymorphism is the ability of an object to take on different forms.\n" +
                "Reference of parent class can hold the child class object.But using this reference you can call methods those are correctly overridden in the child class");

        System.out.println("Question 5:");
        Teacher mathTeacher = new MathTeacher("Mr.davis", "809543620", 100);
        System.out.println(mathTeacher);
        Teacher historyTeacher = new HistoryTeacher("Mr.tomas", "809321870", "MA in American History");
        System.out.println(historyTeacher);

        System.out.println("Question 6:");
        System.out.println(((MathTeacher) mathTeacher).math_skills);
        System.out.println("Reference of parent class can hold the child class object.But using this reference you can call methods those are correctly overridden in the child class\n");
        identifyTeacher(mathTeacher);
        identifyTeacher(historyTeacher);

        System.out.println("Question 7:");
        System.out.println("An abstract class is a special Java class that can not be initialize,meaning we can not create instances of an abstract class.\n" +
                "Abstract class only allow us to inherit from it, meaning an abstract class meant to be a super\n" +
                "class and other classes that can be initialized will inherit from this class.");
        System.out.println("Yes, You can inherit an abstract class from another abstract class.\n");

        System.out.println("Question 8:");
        System.out.println("Abstract methods are those types of methods that don’t require implementation for its declaration\n."+
                "These methods don’t have a body which means no implementation.");
        System.out.println("private abstract is an error!!\n");

        System.out.println("Question 9:");
        System.out.println("It can have abstract and non-abstract methods.");


    }

    static void identifyTeacher(Teacher teacher) {
        if (teacher instanceof HistoryTeacher) {
            System.out.println("history teacher");
            System.out.println(((HistoryTeacher) teacher).field_of_profession);
        } else if (teacher instanceof MathTeacher) {
            System.out.println("math teacher");
            System.out.println(((MathTeacher) teacher).math_skills);
        }
    }
}
