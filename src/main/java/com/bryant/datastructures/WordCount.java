package com.bryant.datastructures;

import java.util.*;

public class WordCount {

    public static void main(String[] args) {


        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Nothing is so necessary for a young man as the company of intelligent women");
        wordList.add("The strongest of all warriors are these two — Time and Patience");
        wordList.add("If everyone fought for their own convictions there would be no war");
        wordList.add("There is no greatness where there is not simplicity, goodness, and truth");
        wordList.add("A limit has been set to human life, which cannot be overstepped");
        wordList.add("Well, what makes you go to war?");

        int sum = 0;
        HashMap<String, Integer> wordMap = new HashMap();
        for (String line : wordList) {
            String[] words = line.split("\\W+");

            sum = sum + words.length;

            for (String word : words) {
                Integer count = wordMap.get(word);
                if (count == null) {
                    count = 0;
                }
                count++;
                wordMap.put(word, count);
            }
        }
        TreeSet<String> wordTree = new TreeSet();

        System.out.println("Using forEach");
        wordMap.forEach((word, count) -> {
            wordTree.add(word);
        });


        System.out.println(sum);
        System.out.println(wordMap);
        System.out.println(wordTree);
        System.out.println(wordTree.first());
        System.out.println(wordTree.last());

        wordMap.forEach((word, count) -> {
            if (count == 1) {
                System.out.println(word);
            }

        });
    }}

