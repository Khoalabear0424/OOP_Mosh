package com.khoaproject.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("A", "E1");
        var c2 = new Customer("B", "E2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.get("E1");
        System.out.println(customer);
    }
}
