package com.tek;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Sample2 {
    public static void main(String[] args) {
        Integer[] arr = {0, 1, 0, 3, 12};
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] !=0) {
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        while (index < arr.length) {
//            arr[index] = 0;
//            index++;
//        }
//        System.out.println(Arrays.toString(arr));


        Stream.concat(
                Arrays.stream(arr).filter(a->a!=0),
            Arrays.stream(arr).filter(a->a==0)
        ).forEach(System.out::println);
    }
}
