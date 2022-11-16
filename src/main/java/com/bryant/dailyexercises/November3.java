package com.bryant.dailyexercises;

public class November3 {
    static void longestString(String[] array){
        String longest = new String();
        for (int i=0; i<array.length; i++){
            if (array[i].length() > array[0].length()){
                longest = array[i];
            }
        }
        System.out.println(longest);
    }

    public static void main(String[] args) {
        // create a string variable
        // create a second string variable which has the same value as the first
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        // create an `if` statement which compares the two variables and prints to the console if they are equal ignoring case
        String myString = "Hello";
        String myString2 = "Hello";
        if (myString.equals(myString2)){
            System.out.println("Equal");
        }
        if (myString.equalsIgnoreCase(myString2)){
            System.out.println("Equal");
        }
        /*
        Write a method that finds the longest string in any given array.
        sample data to call the method with
        i.e. [] -> ""
        i.e. ["cat", "dog", "lion", "tiger"] -> lion and tiger
        i.e. ["word", "count", "diamond", "blue", "green"] -> diamond
        i.e. ["board", "jack", "java", "oop", "spring"] -> board
        */
        String[] myArray = {"dog", "lion", "tiger"};
        longestString(myArray);






    }

}
