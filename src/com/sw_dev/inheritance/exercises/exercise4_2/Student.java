package com.sw_dev.inheritance.exercises.exercise4_2;

public class Student extends Person {
    private String degree;

    public Student(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    @Override
    public String toString() {
        return String.format("%s who is an student studying %s", super.toString(), this.degree);
    }
}
