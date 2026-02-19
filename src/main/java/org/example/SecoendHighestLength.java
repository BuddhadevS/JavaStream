package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SecoendHighestLength {
    public static void main(String[] args) {
        String s = "Hi i am learning streams api";
        int no =Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(no);

    }
}
