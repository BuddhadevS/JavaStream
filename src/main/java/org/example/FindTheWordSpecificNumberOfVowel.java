package org.example;

import java.util.Arrays;

public class FindTheWordSpecificNumberOfVowel {
    public static void main(String[] args) {
        String input = "I am learning stream api in java";
        Arrays.stream(input.split(" "))
                .filter(x ->x.replaceAll("[^aeiouAEIOU]", "")
                        .length() == 2)
                .forEach(System.out::println);
    }
}
