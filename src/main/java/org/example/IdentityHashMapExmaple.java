package org.example;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExmaple {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        //HashMap<String, Integer> map = new HashMap<>();
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put(a, 1);
        map.put(b, 2);

        System.out.println(map.size()); // 1
    System.out.println(map);


    }
}
