package com.example;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Mango");
        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Pineapple");
        System.out.println("Size of HashSet: " + hs.size());
        hs.remove("Mango");
        boolean removed = hs.remove("Papaya");
        System.out.println("Trying to remove Papaya: " + removed);

        if (hs.contains("Apple")) {
            System.out.println("Apple is in the set.");
        } else {
            System.out.println("Apple is not in the set.");
        }

        System.out.println("Updated HashSet: " + hs);
    }
}
