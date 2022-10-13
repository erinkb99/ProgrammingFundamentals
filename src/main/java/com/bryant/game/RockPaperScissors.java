package com.bryant.game;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String opponentsMove;
        String usersMove;

        System.out.println("Welcome to Rock, Paper, Scissors! To stop playing, type quit.");

        do {
        Scanner userInput = new Scanner(System.in);

        // Generate a random
        int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);

        System.out.print("What is your move? To make a move, enter rock, paper, or scissors. : ");
        usersMove = userInput.nextLine();

        if (usersMove.equals("rock")
                || usersMove.equals("paper")
                || usersMove.equals("scissors")) {
            System.out.println("Your move is valid!");
            if (randomNumber == 1) {
                opponentsMove = "rock";
            } else if (randomNumber == 2) {
                opponentsMove = "scissors";
            } else {
                opponentsMove = "paper";
            }

            System.out.println(opponentsMove);

            if (usersMove.equalsIgnoreCase(opponentsMove)) {
                System.out.println("It's a tie!");
            } else if (usersMove.equalsIgnoreCase("rock") && opponentsMove.equalsIgnoreCase("scissors")
                    || usersMove.equalsIgnoreCase("paper") && opponentsMove.equalsIgnoreCase("rock")
                    || usersMove.equalsIgnoreCase("scissors") && opponentsMove.equalsIgnoreCase("paper"))
            {
                System.out.println("You won!");
            }
            else {
                System.out.println("You lost!");
            }
        } else {
            System.out.println("Your move is invalid!");

        }} while (! usersMove.equalsIgnoreCase("Quit"));

}}
