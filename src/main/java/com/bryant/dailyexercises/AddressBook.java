package com.bryant.dailyexercises;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    static List<Contact> contacts = new ArrayList<>();

    public static void addContact (Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added");
    }

    public static void findContact (String firstName, List<Contact> contacts) {
        for (Contact contact : contacts)
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println(contact.getFirstName());
                System.out.println(contact.getLastName());
                System.out.println(contact.getPhone());

            }
    }

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact("John", "Taylor", "561-342-2323");
        Contact contact2 = new Contact("Sarah", "Taylor", "531-342-2323");
        Contact contact3 = new Contact("Jess", "Taylor", "534-342-2323");
        Contact contact4 = new Contact("Jordan", "Taylor", "512-342-2323");
        Contact contact5 = new Contact("Lola", "Taylor", "523-342-2323");

        addContact(contact1);
        addContact(contact2);
        addContact(contact3);
        addContact(contact4);
        addContact(contact5);

        findContact("John", contacts);



    }
}
