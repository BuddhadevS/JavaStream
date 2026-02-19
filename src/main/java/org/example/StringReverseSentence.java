package org.example;

import java.util.Arrays;

public class StringReverseSentence {
    public static void main(String[] args) {
        String input = "Buddhadev is a good boy";
        //o/p==>boy good a is Buddhadev

        Arrays.stream(input.split(" "))
                .reduce((a, b) -> b + " " + a)
                .ifPresent(System.out::println);

//        String reversedSentence = String.join(" ",
//                Arrays.stream(input.split(" "))
//                        .reduce("", (a, b) -> b + " " + a).trim());
//        System.out.println(reversedSentence);
    }
}
