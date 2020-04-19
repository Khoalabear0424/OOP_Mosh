package com.khoaproject.Restaurant;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.*;

public class Menu {
    private Map<String, MenuItem> appetizers;
    private Map<String, MenuItem> entres;
    private Map<String, MenuItem> desserts;
    private HashMap<Set<String>, Map<String, MenuItem>> categoryMapping;


    public Menu() {
        this.appetizers = new HashMap<>();
        this.entres = new HashMap<>();
        this.desserts = new HashMap<>();
        this.categoryMapping = new HashMap<>();
        categoryMapping.put(new HashSet<>(Arrays.asList("Appeteasers","Fino sides", "Sides", "Salads")) ,appetizers);
        categoryMapping.put(new HashSet<>(Arrays.asList("Peri-peri chicken","Sharing platters", "Burgers, pitas, wraps", "Try someting new")) ,entres);
        categoryMapping.put(new HashSet<>(Arrays.asList("Dessert","Fino sides")) ,desserts);
    }

    public void populateMenu(String category, JSONArray menuItems) {
        for(Set<String> categories: categoryMapping.keySet()) {
            if(categories.contains(category)) {
                for(Object menuItem : menuItems) {
                    JSONObject menuItemObj = (JSONObject) menuItem;
                    String itemId = (String) menuItemObj.get("id");
                    String itemName = (String) menuItemObj.get("name");
                    double itemPrice = MenuObjectParser.getPrice(menuItemObj);
                    categoryMapping.get(categories).put(itemName, new MenuItem(itemId, "test", itemPrice));
                }
            };
        }
    }

    public void presentMenu() {
        Map<String, Map> wholeMenu = new HashMap<>();
        wholeMenu.put("Appetizers", appetizers);
        wholeMenu.put("Entres", entres);
        wholeMenu.put("Desserts", desserts);
        System.out.println("This is our menu for tonight: \n");

        for(String menuSection : wholeMenu.keySet()){
            System.out.println("For " + menuSection + ", we have:");
            System.out.println(wholeMenu.get(menuSection) + "\n");
        }
    }
}
