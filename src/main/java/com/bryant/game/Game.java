package com.bryant.game;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int number = (int) ((Math.random() * (100 - 1)) + 1);
        int user = 0;
        int numberOfTries = 5;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("A number is chosen randomly between 1 to 100. Can you guess the number with 5 guesses?");

        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < numberOfTries; i++) {
            System.out.println("Please provide your guess: ");
            user = userInput.nextInt();

            if (user > number) {
                System.out.println("Too high!");
            } else if (user < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations! You got it! :)");
                break;
            }}
    System.out.println("**THE END**");
    }}
