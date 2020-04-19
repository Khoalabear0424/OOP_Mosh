package com.khoaproject.Restaurant;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Menu {
    private Map<String, MenuItem> appetizers = new HashMap<>();
    private Map<String, MenuItem> entres = new HashMap<>();
    private Map<String, MenuItem> deserts = new HashMap<>();

    public Menu(String category, JSONArray menuItems) {
        switch (category) {
            case "Appeteasers" :
                for(Object menuItem : menuItems) {
                    JSONObject menuItemObj = (JSONObject) menuItem;
                    String itemId = (String) menuItemObj.get("id");
                    String itemName = (String) menuItemObj.get("name");
                    String itemPrice = (String) menuItemObj.get("price");
                    appetizers.put(itemName, new MenuItem(itemId, "Appeteasers", itemPrice));
                }
                break;
            case "Fino sides" :
                System.out.println("These are fino sides");
                break;
            case "Dessert" :
                System.out.println("These are desserts");
                break;
            default:
                System.out.println("Sorry, we dont serve that here");
        }
    }


    public void showAppetizers() {
        Iterator it = appetizers.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue().toString());
            it.remove();
        }
    }
}
