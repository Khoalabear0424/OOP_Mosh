package com.khoaproject;

import com.khoaproject.Restaurant.Menu;
import com.khoaproject.collections.Customer;
import com.khoaproject.collections.EmailComparator;
import com.khoaproject.collections.MapDemo;
import com.khoaproject.collections.SetDemo;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject menuObj = (JSONObject) parser.parse(new FileReader("src/com/khoaproject/Restaurant/SampleMenu.json"));
            JSONArray categories = (JSONArray) menuObj.get("categorys");
            var menu = new Menu();
            for (Object category : categories) {
                JSONObject categoryObj = (JSONObject) category;
                String categoryName = (String) categoryObj.get("name");
                JSONArray categoryItems = (JSONArray) categoryObj.get("menu-items");
                menu.populateMenu(categoryName, categoryItems);
            }

            menu.presentMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*

CREATING MENU

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/com/khoaproject/Restaurant/SampleMenu.json"));
            JSONObject menuObj = (JSONObject) obj;
            JSONArray categories = (JSONArray) menuObj.get("categorys");

            Iterator<Object> iterator = categories.iterator();
            while(iterator.hasNext()) {
                JSONObject menuItemsObject = (JSONObject) iterator.next();
                JSONArray menuItems = (JSONArray) menuItemsObject.get("menu-items");
                var menu = new Menu((String) menuItemsObject.get("name"), menuItems);
            }

            System.out.println(menuObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


 */





    //generic class
//    public static void main(String[] args) {
//        var max1 = Utils.max(1,3);
//        var max2 = Utils.max(new User(10), new User(30));
//    }

    //exceptions
//    public static void main(String[] args) {
//        try {
//            ExceptionsDemo.show();
//        } catch (AccountException e) {
//            var cause = e.getCause();
//            System.out.println(cause);
//        }
//    }

//    Final and Abstract Classes and Methods
//    public static void main(String[] args) {
//        UIControl[] controls = {new TextBox(), new CheckBox()};
//        for( var control : controls)  {
//            control.render();
//        }
//    }

    //Refactoring Towards OOD
//    public static void main(String[] args) {
//        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortgageCalculator(principal, annualInterest, years);
//        var report = new MortgageReport(calculator);
//        report.printMortgage();
//        report.printPaymentSchedule();
//    }
