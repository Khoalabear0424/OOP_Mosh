package com.khoaproject.OOP;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public int capacity;
    public int size = 0;
    private ListNode head = null;
    private ListNode tail = null;
    Map<String, ListNode> cache = new HashMap<String, ListNode>();

    public void printCache() {
        System.out.println("Printing new...");
        ListNode curr = head;
        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
        System.out.println("\n");
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    //methods: write, delete, read, ensureCap
    public void write(String key, int val) {
        var node = new ListNode(key, val);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
        cache.put(key, node);
    }

    public void delete(String key) {
        if(!cache.containsKey(key)) {
            System.out.println("Key "+ key + " does not exist");
            return;
        };

        ListNode node = cache.get(key);
        ListNode next = node.next;
        ListNode prev = node.prev;

        if (next == null) tail = prev;
        else next.prev = prev;

        if (prev == null) head = next;
        else prev.next = next;

        size--;
        cache.remove(key);
    }

    public int read(String key) {
        if(!cache.containsKey(key)) return -1;

        ListNode node = cache.get(key);
        delete(node.key);
        write(node.key, node.val);
        return node.val;
    }

    private class ListNode {
        public String key;
        public int val;
        public ListNode next = null;
        public ListNode prev = null;

        public ListNode(String key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
