package com.bryant.Stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciseTwo {
    public static void main(String[] args) {
        int[] nums = {5, 6, 4, 2, 7, 8, 9, 12};

        Set<Integer> multiply2 = IntStream.of(nums)
                .filter(num -> num % 2==0)
                .mapToObj(x -> x*2)
                .collect(Collectors.toSet());

        System.out.println("Even numbers multiplied by 2: " + multiply2);
    }
}
