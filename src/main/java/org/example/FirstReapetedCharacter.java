package org.example;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstReapetedCharacter {
    public static void main(String[] args) {
        String input = "Hello World";

        //o/p==> l
        char x =input.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(a->a.getValue()>1)
                .map(b->b.getKey())
                .findFirst()
                .get();
        System.out.println(x);

    }
}
