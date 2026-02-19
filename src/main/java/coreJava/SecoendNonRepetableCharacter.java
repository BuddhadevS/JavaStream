package coreJava;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecoendNonRepetableCharacter {
    public static void main(String[] args) {

        String s = "swiss ice";
        char x =s.chars().mapToObj(c -> (char)c).filter(c->c !=' ').collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1).skip(1)
                .map(b -> b.getKey()).findFirst()
                .get();
        System.out.println(x);

    }
}
