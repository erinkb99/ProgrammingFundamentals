package com.bryant.methods;

public class Address {
    private final String street;
    private String city;
    private String state;
    private final int zip;

    public Address (String street, int zip) {
        this. street = street;
        this.zip = zip;
    }

    public static void main(String[] args) {
        Address joe = new Address("101 Main St", 33467 );
        System.out.println(joe);
    }
}
