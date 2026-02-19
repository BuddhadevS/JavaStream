package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberFromString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a1b2c3","1a2bc3","123abc");
        // output like = 123, 123, 123 using stream
        List<String> list1 =list.stream()
                .map(x->x.replaceAll("\\D","")).toList();

System.out.println(list1);
    }
}
