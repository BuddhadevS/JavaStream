package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3,6,9,12,15,18,21);

//        List<Integer> list2=list1.stream().filter(x->x%2==0).collect(Collectors.toList());
//
//        System.out.println(list2);


                List<Integer> list2=list1.stream().filter(x->x%2==0).collect(Collectors.toList());
//
    System.out.println(list2);
    }
}
