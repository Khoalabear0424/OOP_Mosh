package com.khoaproject.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");
        var front = queue.peek();
        System.out.println(front);
    }
}
