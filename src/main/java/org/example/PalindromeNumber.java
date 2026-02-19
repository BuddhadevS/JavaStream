package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 1441;
        String reversed = Arrays.stream(String.valueOf(num).split("")).reduce("", (a, b) -> b + a);
        if (String.valueOf(num).equals(reversed)) {
            System.out.println(num + " is a palindrome number");
        }
        else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
