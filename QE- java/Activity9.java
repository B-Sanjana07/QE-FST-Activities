package com.example;

import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sanjana");
        names.add("Deevika");
        names.add("Anita");
        names.add("Kiran");
        names.add("Priya");
        System.out.println("All names:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("\n3rd name: " + names.get(2));

        String searchName = "Kiran";
        if (names.contains(searchName)) {
            System.out.println(searchName + " exists in the list.");
        } else {
            System.out.println(searchName + " does not exist in the list.");
        }
        System.out.println("\nNumber of names: " + names.size());
        names.remove("Anita");
        System.out.println("Number of names after removal: " + names.size());
    }
}
