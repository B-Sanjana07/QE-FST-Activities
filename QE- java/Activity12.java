package com.example;

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}

public class Activity12 {

    public static void main(String[] args) {

        Addable add = (a, b) -> a + b;
        int result = add.add(10, 20);
        System.out.println("Result: " + result);
    }
}

