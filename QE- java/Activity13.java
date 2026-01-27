package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Enter integers (type any non-integer to stop):");

        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }

        if (numbers.size() > 0) {
            int randomIndex = random.nextInt(numbers.size());
            System.out.println("Random index: " + randomIndex);
            System.out.println("Value at that index: " + numbers.get(randomIndex));
        } else {
            System.out.println("No numbers entered!");
        }

        scan.close();
    }
}
