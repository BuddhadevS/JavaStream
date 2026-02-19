package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HighestLengthString {
    public static void main(String[] args) {
        String strings = "apple banana cherry date elderberry fig grape" ;
//        String longestString = Stream.of(strings.split(" "))
//                .reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2)
//                .orElse("")
//                ;
//        System.out.println("The longest string is: " + longestString);


        String s=Arrays.stream(strings.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(s);

    }
}
