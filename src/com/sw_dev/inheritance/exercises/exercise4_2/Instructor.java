package com.sw_dev.inheritance.exercises.exercise4_2;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s who is an Instructor earning %s", super.toString(), this.salary);
    }
}
