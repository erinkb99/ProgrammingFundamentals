package com.bryant.student;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Declaring variables
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};
        String[] students = {"Student One", "Student Two", "Student Three"};
        int[] grades = null;
        String final_grade;


        Scanner userInput = new Scanner(System.in);
        System.out.println("Student Names: " + students.toString());
        System.out.print("Enter a student's name:");

        String selectedStudentName = userInput.nextLine();

        if (selectedStudentName.equalsIgnoreCase("Student One")) {
            grades = studentOneGrades;
        } else if (selectedStudentName.equalsIgnoreCase("Student Two")) {
            grades = studentTwoGrades;
        } else if (selectedStudentName.equalsIgnoreCase("Student Three")) {
            grades = studentThreeGrades;
        } else {
            System.out.println("There is no student with that name");
            System.exit(1);
        }

        // Calculate sum
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        double numberOfGrades = grades.length;
        double average = sum / numberOfGrades;

        System.out.println("Sum " + sum);
        System.out.println("Average " + average);

        // Letter grades
        if (average >= 90) {
            final_grade = "A";
            System.out.println("A");
        } else if (average >= 80) {
            final_grade = "B";
            System.out.println("B");
        } else if (average >= 70) {
            final_grade = "C";
            System.out.println("C");
        } else if (average >= 60) {
            final_grade = "D";
            System.out.println("D");
        } else {
            final_grade = "F";
            System.out.println("F");
        }
        switch (final_grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Well done");
                break;
            case "C":
                System.out.println("You passed");
                break;
            case "D":
                System.out.println("Try again");
                break;
            case "F":
                System.out.println("Try again!");
                break;
            default:
                System.out.println("Invalid grade");
                break;
    }


    }


}
