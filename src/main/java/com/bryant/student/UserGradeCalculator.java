package com.bryant.student;

import java.util.Scanner;
import java.util.ArrayList;

public class UserGradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> myGrades = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        String letter;

        System.out.println("Welcome to the grade calculator!");
        System.out.println("How many grades would you like to enter?");
        Integer numGrades = userInput.nextInt();
        System.out.println("Great! Enter your grades.");

        for (int i = 0; i < numGrades; i++) {
            int grade = userInput.nextInt();
            myGrades.add(grade);
        }

        System.out.println("Number of grades : " + myGrades.size());

        for (int grade : myGrades) {
            sum = sum + grade;
        }
        avg = (sum / numGrades);

        System.out.println("Your average is " + avg);

        if (avg >= 90) {
            letter = "A";
        } else if (avg >= 80) {
            letter = "B";
        } else if (avg >= 70) {
            letter = "C";
        } else if (avg >= 60) {
            letter = "D";
        } else {
            letter = "F";
        }

        System.out.println("Your letter grade is " + letter);

        int max = 0;
        for (int grade : myGrades) {
            if (grade > max) {
                max = grade;
            }
        }
        System.out.println("Your highest score is: " + max);
    }}


