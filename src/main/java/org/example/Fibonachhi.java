package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Fibonachhi {
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .mapToObj(i -> fib(i))
                .forEach(System.out::println);
    }

    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
