package com.bryant;

public class math {
    public static void main(String[] args) {
        int upperLimit = 100;

        System.out.println("Welcome to the program that prints all even number between 1 and 100");

        for(int num = 1; num <= upperLimit; num++) {
            if(num % 2 == 0) {
                System.out.println(num + " is an even number.");
            }
        }
    }
}
