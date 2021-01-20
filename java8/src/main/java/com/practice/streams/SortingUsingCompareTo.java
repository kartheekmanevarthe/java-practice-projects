package com.practice.streams;

import com.practice.beans.SmartPhone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCompareTo {

    public static void main(String[] args) {

        List<SmartPhone> smartPhones = Arrays.asList(
                new SmartPhone("Pixel3", "2018"),
                new SmartPhone("Pixel4", "2020"),
                new SmartPhone("Pixel3a", "2019"),
                new SmartPhone("Pixel5a", "2021"));

        System.out.println("Smart phones before sorting : ");
        smartPhones.forEach(e -> System.out.println(e.getName()));

        System.out.println("\n" + "Smart phones after sorting : ");
        Collections.sort(smartPhones, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        smartPhones.forEach(e -> System.out.println(e.getName()));

    }

}
