package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Zudio","Amazon","Flipkart","Myntra","Ajio");
        // List<String> sortedList=list.stream().sorted().collect(Collectors.toList());
        List<String> sortedList=list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
