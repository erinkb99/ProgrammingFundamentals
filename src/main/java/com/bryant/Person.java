package com.bryant;

public class Person {
    private String hairColor;
    private String eyeColor;
    private final int height;
    private final int weight;
    private Address homeAddress;
    private Address workAddress;
    private final Dog dog;

    public Person(int height, int weight, Dog dog) {
        this.weight = weight;
        this.height = height;
        this.dog = dog;
    }

    public void Eat() {

    }

    public void Sleep() {

    }

    public static void main(String[] args) {
        Dog spark = new Dog("Spark", 1);
        Person joe = new Person(56, 34, spark);
    }}
