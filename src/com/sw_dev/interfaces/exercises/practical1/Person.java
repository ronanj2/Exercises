package com.sw_dev.interfaces.exercises.practical1;

import java.util.Objects;

public class Person implements Comparable
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("A person with name: %s, aged: %s", this.name, this.age);
    }

    @Override
    public int compareTo(Object o) {
        Person comparesTo = (Person) o;
        return this.name.compareTo(comparesTo.getName());
    }
}