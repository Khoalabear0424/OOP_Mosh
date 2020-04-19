package com.khoaproject.Restaurant;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MenuObjectParser {
    public static double getPrice(JSONObject menuItemObj) {
        JSONArray subItems = (JSONArray) menuItemObj.get("sub-items");
        JSONObject subItemsObj = (JSONObject) subItems.get(0);
        return Double.parseDouble((String) subItemsObj.get("price"));
    }
}
