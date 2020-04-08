package com.khoaproject.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A","B","C");
        for(var item : collection)
            System.out.println(item);
    }
}
