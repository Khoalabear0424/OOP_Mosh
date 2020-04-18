package com.khoaproject.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B","C","D"));

        //Union - combination of 2 sets
        set1.addAll(set2);
        System.out.println(set1);

        //Intersection - common in both sets
        set1.retainAll(set2);
        System.out.println(set1);

        //Difference - In one set but not in another set
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
