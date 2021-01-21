package com.practice.streams;

import com.practice.beans.SmartPhone;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperations {

    public static void main(String[] args) {

        List<SmartPhone> smartPhones = Arrays.asList(
                new SmartPhone("Pixel3", "2018"),
                new SmartPhone("Pixel4", "2020"),
                new SmartPhone("Pixel3a", "2019"),
                new SmartPhone("Pixel5a", "2021"));

        // 1) allMatch() as terminal operation
        boolean allMatch = smartPhones.parallelStream().allMatch(e -> e.getName().contains("Pixel"));
        System.out.println("allMatch -- >> " + allMatch);

        // 2) anyMatch() as terminal operation
        boolean anyMatch = smartPhones.parallelStream().anyMatch(e -> e.getName().equals("Pixel3"));
        System.out.println("anyMatch -->> " + anyMatch);

        // 3) noneMatch() as terminal operation
        boolean noneMatch = smartPhones.parallelStream().noneMatch(e -> e.getName().equals("Pixel"));
        System.out.println("anyMatch -->> " + noneMatch);

        // 4) collect as terminal operation
        List<SmartPhone> collectedList = smartPhones.stream()
                .filter(e -> e.getName().contains("Pixel")).collect(Collectors.toList());

        // 5) count() as terminal operation
        long count = smartPhones.stream().filter(e -> e.getName().contains("Pixel")).count();

        // 6) min() as terminal operation
        Optional<SmartPhone> smartPhone = smartPhones.stream().filter(e -> e.getName().contains("Pixel"))
                .min((m1, m2) -> (Integer.valueOf(m1.getYearOfManufacture()) - Integer.valueOf(m2.getYearOfManufacture())));
        System.out.println("min value is -->> " + smartPhone.get().getYearOfManufacture());

        // 7) reduce() as terminal operation
        Optional<String> reducedValues = smartPhones.stream()
                .map(e -> e.getName()).reduce((s1, s2) -> s1 + "," + s2);
        System.out.println("reduced value is -->> " + reducedValues.get().toString());


    }


}