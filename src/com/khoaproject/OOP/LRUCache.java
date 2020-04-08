package com.khoaproject.OOP;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {
    public int capacity;
    public int size = 0;
    private ListNode head = null;
    private ListNode tail = null;
    Map<String, ListNode> cache = new HashMap<String, ListNode>();

    public void printCache() {
        ListNode curr = head;
        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
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

    }

    private class ListNode {
        public String key;
        public int val;
        private ListNode next = null;
        private ListNode prev = null;

        public ListNode(String key, int val) {
            this.key = key;
            this.val = val;
        }

        public ListNode next() {
            return next;
        }

        public ListNode prev() {
            return prev;
        }
    }
}
