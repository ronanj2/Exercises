package com.sw_dev.interfaces.exercises.practical1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practical1Tester {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        //Add some Person objects to the list
        people.add(new Person("Mike Smith", 24));
        people.add(new Person("Jane Smith", 19));
        people.add(new Person("John Smith", 34));
        people.add(new Person("Peter Smith", 54));
        people.add(new Person("Laura Smith", 46));
        people.add(new Person("Apple Smith", 87));

        if (people.contains(new Person("Adam Ant", 48))) {
            //Do something – e.g. print out match found
            System.out.println("Match found");
        } else {
            //Do something else – e.g. print match not found
            System.out.println("Match not found");
        }

        // By default, we will sort by name.
        Collections.sort(people);

        // provide the additional capability of sorting by age, provide a mechanism
        // that will allow this additional sorting capability.
        Collections.sort(people, Comparator.comparing(Person::getAge));
    }
}
