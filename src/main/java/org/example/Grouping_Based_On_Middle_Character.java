package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping_Based_On_Middle_Character {
    public static void main(String[] args) {
        String s [] = {"abc","aba","xya","xy","xyc","mnop","mnopq","xxyy"};
        Stream.of(s).collect(Collectors.groupingBy(x->x.toString().substring(1,x.length()-1)))
                .forEach((k,v)-> System.out.println(k+" "+v));
    }
}
