package com.bryant.shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        HashMap<String, Double> store = new HashMap<>();
        ArrayList<String> cart = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        double bill = 0;
        String choice;

        store.put("Education Prime Set", 385.95);
        store.put("Christmas Tree", 44.99);
        store.put("Freight Train", 199.99);
        store.put("Stunt Arena", 159.99);
        store.put("Material Handler", 149.99);
        store.put("Castle Expansion Set", 129.99);

        System.out.println("Hello! Welcome to the Lego store!");
        System.out.println("Here are our featured items: " + store);

        do {
        System.out.println("What item would you like to select?");
        choice = userInput.nextLine();

        if (store.containsKey(choice)) {
            System.out.println("Your choice is available"); }

        if (! choice.equalsIgnoreCase("checkout")) {
            cart.add(choice);
        }
    }
        while (! choice.equalsIgnoreCase("checkout"));

       for (int i = 0; i < cart.size(); i++) {
           System.out.println(cart.get(i));
           Double price = store.get(cart.get(i));
           bill = Math.round(bill + price);
       }

       System.out.println("Your final bill is: " + bill);
}}
