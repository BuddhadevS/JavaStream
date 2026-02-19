package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumberReverse {
    public static void main(String[] args) {
        int number = 123456;
        String reversed = Arrays.stream(String.valueOf(number).split("")).reduce("", (a, b) -> b + a);
        System.out.println(reversed);

    }
}
