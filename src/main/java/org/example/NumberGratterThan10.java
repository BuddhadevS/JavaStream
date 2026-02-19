package org.example;

import java.util.List;

public class NumberGratterThan10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 12, 7, 20, 3, 15, 8, 21);
        List<Integer> list1=list.stream().filter(x->x>10).toList();
        System.out.println(list1);

    }
}
