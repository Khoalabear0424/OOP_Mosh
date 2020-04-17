package com.khoaproject.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a","b","c","c");
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);
    }
}
