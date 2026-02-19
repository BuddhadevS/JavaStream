package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,1,2,3,4,4};
        int ans =Arrays.stream(arr).distinct().sum();
        System.out.println(ans);
    }
}
