package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySortedOrder {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        // Sort the array in ascending order
        Arrays.stream(arr).mapToObj(i -> "Number: " + i)
                .sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
