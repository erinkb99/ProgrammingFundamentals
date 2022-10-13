package com.bryant.calculator;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {

        int numberOne, numberTwo;
        int dif = 0;

        System.out.println("Hello, This is my simple calculator that finds the difference between 2 numbers");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();

        if (numberOne > numberTwo) {
            dif =  numberOne - numberTwo;
        } else {
            dif=  numberTwo - numberOne;
        }
        System.out.println("The difference between " + numberOne + " and " + numberTwo  + " is " + dif);


    }}

