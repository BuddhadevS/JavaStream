package org.example;

import java.util.stream.IntStream;

public class RemoveDuplicateAndSameOrder {
    public static void main(String[] args) {
        String input = "dabcadefg";
        //o/p==> dabcefg
       input.chars().distinct().
               forEach(x-> System.out.print((char)x));
    }
}
