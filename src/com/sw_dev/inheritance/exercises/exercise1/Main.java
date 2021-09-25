package com.sw_dev.inheritance.exercises.exercise1;

// ****************************************************************
// Main.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class Main {
    public static void main(String[] args) {
        Dog dog = new Yorkshire("Spike");
        outputDetails(dog);

        Dog dog2 = new Labrador("Lucky", "Golden");
        outputDetails(dog2);
    }

    public static void outputDetails(Dog dog) {
        //Note: our classes do not have toString() methods. Don't add
        //any for these exercises
        System.out.println(dog.getName() + " says " + dog.speak() +
                " and has an average breed weight of " + dog.avgBreedWeight());
    }
}

