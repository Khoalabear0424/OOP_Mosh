package com.khoaproject.Restaurant;

import org.json.simple.JSONArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Menu {
    Map<String, MenuItem> appetizers = new HashMap<>();
    Map<String, MenuItem> entres = new HashMap<>();
    Map<String, MenuItem> deserts = new HashMap<>();

    public Menu(JSONArray menuItems) {
        Iterator<Object> menuItemsIterator = menuItems.iterator();
        while(menuItemsIterator.hasNext()) {
            System.out.println(menuItemsIterator.next());
        }
    }
//
//    private void populateMenu(List<MenuItem>) {
//
//    }
//
//    public void showAppetizers() {
//        for()
//    }
}
