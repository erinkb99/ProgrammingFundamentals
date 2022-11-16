package com.bryant.loan;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello, welcome to the car loan calculator!");

        System.out.println("What is your initial loan?");
        int initial = userInput.nextInt();

        System.out.println("What is the length of your loan in years?");
        int length = userInput.nextInt();
        if (length <= 0) {
            System.out.println("Please enter a length in years greater than 0");
            length = userInput.nextInt();
        }

        System.out.println("What is your interest rate as a decimal?");
        double interest = userInput.nextDouble();
        if (interest <= 0) {
            System.out.println("Please enter a rate greater than 0");
            interest = userInput.nextDouble();
        }

        System.out.println("What is your down payment?");
        int down = userInput.nextInt();
        if (down > initial) {
            System.out.println("Please down payment less than your initial loan");
            down = userInput.nextInt();
        } else if (down == initial) {
            System.out.println("Your car is paid in full!");}

        int balance = initial - down;

        int months = length * 12;

        int monthly = balance/months;

        double monthlyInterest = interest/12;

        double totalMonthly = monthlyInterest + monthly;

        System.out.println(totalMonthly);
}}
