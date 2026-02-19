package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfTheElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum =Arrays.stream(arr).boxed().reduce(0,(a, b)->a+b);
        System.out.println(sum);
    }
}
