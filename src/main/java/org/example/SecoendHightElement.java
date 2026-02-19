package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SecoendHightElement {
    public static void main(String[] args) {
        String s = "Hi i am learning stream api";
        Arrays.stream(s.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).skip(2)
        .findFirst().ifPresent(System.out::println);
    }
}
