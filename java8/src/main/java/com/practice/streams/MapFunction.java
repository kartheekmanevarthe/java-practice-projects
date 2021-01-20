package com.practice.streams;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapFunction {

    public static void main(String[] args) {

        //List of city names
        List<String> cities = Arrays.asList("London", "HongKong", "Bangalore", "NewYork", "Paris");

        // 1) Using map to convert string elements to lower case
        List<String> lowerCaseCities = cities.stream()
                .map(e -> e.toLowerCase()).collect(Collectors.toList());
        System.out.println("converted to lower case : ->> " + lowerCaseCities);

        // 1) Using String & :: operator in java 8
        List<String> upperCaseCities = cities.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        upperCaseCities.forEach(e -> System.out.println("converted to upper case using :: ->> " + e));

        // 2) Using flatMap() in java to combine or aggregate lists
        List<List<String>> combinedCityList = Arrays.asList(cities, lowerCaseCities, upperCaseCities);
        List<String> aggregatedList = combinedCityList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        aggregatedList.forEach(e -> System.out.println(aggregatedList.indexOf(e) + 1 + ")" + e));


    }

}
