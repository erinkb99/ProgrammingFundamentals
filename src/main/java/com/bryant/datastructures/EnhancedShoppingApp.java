package com.bryant.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnhancedShoppingApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<String> productList = new ArrayList();
        productList.add("EDU,Education Prime Set,384.95,10");
        productList.add("CHRI,Christmas Tree,44.99,7");
        productList.add("FREI,Freight Train,199.99,6");
        productList.add("STUN,Stunt Arena,159.99,3");
        productList.add("HAND,Material Handler,149.99,2");
        productList.add("CAST,Castle Expansion Set,129.99,7");

        HashMap<String, String> products = new HashMap<>();
        HashMap<String, Double> productPrices = new HashMap<>();
        HashMap<String, Integer> inventory = new HashMap<>();

        for (String product : productList) {
            String[] list = product.split(",");
            String productCode = list[0];
            String productName = list[1];
            Double productPrice = Double.valueOf(list[2]);
            Integer quantity = Integer.valueOf(list[3]);

            products.put(productCode, productName);
            productPrices.put(productCode, productPrice);
            inventory.put(productCode, quantity);
        }

        System.out.println("Welcome to the Lego store!");
        System.out.println("Here are our featured items" + productPrices);
        HashMap<String, Integer> cart = new HashMap<>();

        String choice;
        do {
            System.out.println("What items would you like to select? Enter the product codes.");
            System.out.println("Enter 'done' when you are finished");
            System.out.println("Enter 'remove' to remove an item from the cart");
            choice = userInput.nextLine();

            int myQuantity = 1;

            if (choice.equalsIgnoreCase("remove")) {
                System.out.println("What item would you like to remove?");
                String removeItem = userInput.nextLine();
                cart.remove(removeItem);

                int removeQuantity = inventory.get(removeItem);
                int restoreQuantity = removeQuantity + 1;
                inventory.put(choice, removeQuantity);
            } else {

                if (products.containsKey(choice)) {

                    System.out.println("Your selection is available!");

                    if (cart.containsKey(choice)) {
                        myQuantity = myQuantity + 1;
                    }
                    cart.put(choice, myQuantity);
                    System.out.println("Your cart contains: " + cart);
                    int quantity = inventory.get(choice);
                    if (quantity > 0) {
                        int newQuantity = quantity - 1;
                        inventory.put(choice, newQuantity);
                    } else if (!choice.equalsIgnoreCase("done")) {
                        System.out.println("Sorry, we are currently out of stock.");
                    }
                } else if (!choice.equalsIgnoreCase("done")) {
                    System.out.println("Sorry, that product is unavailable.");
                }
            }
        }

        while (!choice.equalsIgnoreCase("done"));

        Double bill = 0.00;

        for (Map.Entry<String, Integer> cartItem : cart.entrySet()) {
            System.out.println(cartItem.getKey() + " = " + cartItem.getValue());
            Double price = productPrices.get(cartItem.getKey());
            bill = bill + price;
        }

        System.out.println("Items in checkout: " + cart);
        System.out.println("Total: $" + bill);
        System.out.println("Current inventory:" + inventory);
}}


