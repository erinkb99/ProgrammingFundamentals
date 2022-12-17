package com.bryant.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ExerciseThree {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "green", "purple"};

        List<String> result = new ArrayList<>();

        for (int i =0; i < colors.length; i++){
            if (colors[i].length() > 5){
                result.add(colors[i]);
            }
        }
        System.out.println(result.size());
}}
