package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Move_Zero_to_end {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12}; // it returen InsStream type, but in collect we need to convert it into List type
        // so we use boxed() method to convert int to Integer type
        List<Integer> list = Arrays.stream(arr).filter(x->x==0).boxed().collect(Collectors.toList());
        List<Integer> list1 = Arrays.stream(arr).filter(x->x!=0).boxed().collect(Collectors.toList());
        List<Integer> finalList= new ArrayList<>();
        finalList.addAll(list1);
        finalList.addAll(list);
        System.out.println(finalList);

    }
}
