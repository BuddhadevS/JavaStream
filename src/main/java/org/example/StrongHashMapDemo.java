package org.example;

import java.util.HashMap;
import java.util.WeakHashMap;

public class StrongHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Object, String> map = new WeakHashMap<Object, String>();

        Object key = new Object();
        map.put(key, "Strong Reference");

        key = null; // remove local reference
        System.gc();

        System.out.println("HashMap size: " + map.size()); // ❗ Still 1
        System.out.println(map);
    }
}

