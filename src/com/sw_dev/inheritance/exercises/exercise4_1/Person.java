package com.sw_dev.inheritance.exercises.exercise4_1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("A person with name: %s, aged: %s", this.getName(), this.getAge());
    }
}
