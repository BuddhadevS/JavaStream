package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Annagram {
    public static void main(String[] args) {
        String[] arr={"listen","silent"};
        boolean isAnagram = Arrays.stream(arr)
                .map(str -> str.replaceAll("\\s", "").toLowerCase()) // normalize
                .map(str -> str.chars()                              // get stream of chars
                        .sorted()                                    // sort characters
                        .mapToObj(c -> String.valueOf((char) c))     // convert int → char
                        .collect(Collectors.joining()))              // join to sorted string
                .distinct()                                          // remove duplicates
                .count() == 1;                                   // if both sorted strings same, only 1 unique

        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}
