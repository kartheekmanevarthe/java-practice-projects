package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterFunction {

    public static void main(String[] args) {

        // List of numbers from 1 to 10
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usage of streams & filter function to print even numbers

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0).collect(Collectors.toList());

        System.out.println(evenNumbers);

    }
}
