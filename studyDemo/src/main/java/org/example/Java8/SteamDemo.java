package org.example.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Monkey", "Lion", "Giraffe", "Lemur");

        List<String> list1 = list.stream().filter(s -> s.startsWith("L"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());


        System.out.println(list1);


    }
}
