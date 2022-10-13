package com.bryant.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        int numberOne, numberTwo;
        int dif = 0;

        System.out.println("Hello, This is my simple calculator that subtracts two numbers");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();

        dif = numberOne - numberTwo;
        System.out.println("The difference of " + numberOne + " and " + numberTwo + " is " + dif);
    }}

