package com.bryant.dailyexercises;

import java.util.ArrayList;

public class November2 {
    public static void main(String[] args) {
        // declare an empty integer array of length = 4
        // iterate of the array and print the value to console
        int array [] = new int[4];
        for (int num : array) {
            System.out.println(num);
        }

        // fill it with the number `3`
        // print the array to the console
        int array1 [] = {3, 3, 3};

        for (int num : array1) {
            System.out.println(num);
        }

        // declare an empty integer array of length = 7
        // fill it with the number `2`
        // reassign the second value in the array to the number `23`
        // print the array to the console
        int array2 [] = new int[7];
        int myNum= 2;
        for (int i=0; i<7; i++) {
            array2[i]=myNum;
        }
        array2[1] = 23;
        for (int num : array2) {
            System.out.println(num);
        }

        // create an integer variable
        // create a second integer variable
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        int myInt=2;
        int myInt2=4;

        if (myInt == myInt2){
            System.out.println("equal");
        }

    }
}
