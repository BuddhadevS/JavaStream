package org.example;

import java.util.List;

public class StartWithName {
    public static void main(String[] args) {

        List<String> stream = List.of("apple", "anana", "orange", "grape", "kiwi", "Apricot");
        stream.stream().filter(x -> x.startsWith("a") || x.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
