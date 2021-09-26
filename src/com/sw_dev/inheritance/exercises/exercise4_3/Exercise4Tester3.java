package com.sw_dev.inheritance.exercises.exercise4_3;

import java.util.ArrayList;

public class Exercise4Tester3 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Mike Smith", 24));

        people.add(new Student("Mary Jones", 19, "Applied Computing"));
        people.add(new Student("Tester Mc Testington", 20, "Software Development"));

        for (Person person : people)
        {
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println(String.format("Student %s is studying %s", student.getName(), student.getDegree()));
            }
        }
    }
}