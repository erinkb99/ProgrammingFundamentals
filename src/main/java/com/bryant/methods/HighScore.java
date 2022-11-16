package com.bryant.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) {
        ArrayList<Integer> myScores = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        int sum = 0;

        System.out.println("Welcome to the high score calculator!");
        System.out.println("How many scores would you like to enter?");
        Integer numScores= userInput.nextInt();
        System.out.println("Great! Enter your scores.");

        for (int i = 0; i < numScores; i++) {
            int score = userInput.nextInt();
            myScores.add(score);
        }

        System.out.println("Number of scores : " + myScores.size());

        for (int score : myScores) {
            sum = sum + score;
        }

        int max = 0;
        for (int score : myScores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("Your highest score is: " + max);
    }}


