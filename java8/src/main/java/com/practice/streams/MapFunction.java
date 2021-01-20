package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapFunction {

    public static void main(String[] args) {

        //List of city names
        List<String> cities = Arrays.asList("London", "HongKong", "Bangalore", "NewYork", "Paris");

        List<String> lowerCaseCities = cities.stream()
                .map(e -> e.toLowerCase()).collect(Collectors.toList());

        System.out.println("converted to lower case : ->> " + lowerCaseCities);

    }

}
