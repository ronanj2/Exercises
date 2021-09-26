package com.sw_dev.inheritance.exercises.exercise5;

import java.util.ArrayList;

public class Exercise5Tester {
    public static void main(String[] args) {
        Coin c1 = new Coin(10, "Ten Cent");
        Coin c2 = new Coin(20, "Twenty Cent");
        Coin c3 = new Coin(10, "Ten Cent");

        ArrayList<Coin> coins = new ArrayList<Coin>();
        coins.add(c1);
        coins.add(c2);
        coins.add(c3);
        coins.add(new Coin(50, "Fifty Cent"));

        // Check if the array contains a 20c coin
        Coin searchFor = new Coin(20, "Twenty Cent");
        Boolean isCoinFound = coins.contains(searchFor);
        System.out.println(String.format("Coin found: %s", isCoinFound));

        // Check for a coin we know isn't there
        searchFor = new Coin(5, "Five Cent");
        isCoinFound = coins.contains(searchFor);
        System.out.println(String.format("Coin found: %s", isCoinFound));
    }
}
