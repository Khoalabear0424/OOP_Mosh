package com.khoaproject.Restaurant;

public class MenuItem {
    String name;
    String type;
    String price;

    public MenuItem(String name, String type, String price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
