package org.example;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Buddhadev";
        String reversed = Arrays.stream(input.split("")).reduce("", (a, b) -> b + a).toLowerCase();
        System.out.println(reversed);
    }
}
