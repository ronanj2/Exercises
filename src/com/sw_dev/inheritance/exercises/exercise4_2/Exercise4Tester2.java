package com.sw_dev.inheritance.exercises.exercise4_2;

import java.util.ArrayList;

public class Exercise4Tester2 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Mike Smith", 24));

        people.add(new Student("Mary Jones", 19, "Applied Computing"));

        people.add(new Instructor("John Jacobs", 55, 41500.70));

        for (Person person : people)
        {
            System.out.println(person.toString());
        }
    }
}