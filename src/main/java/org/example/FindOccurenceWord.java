package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindOccurenceWord {
    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple grape";
        Map<String,Long> map=Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
