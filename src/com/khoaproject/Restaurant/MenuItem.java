package com.khoaproject.Restaurant;

public class MenuItem {
    String id;
    String type;
    double price;

    public MenuItem(String id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + id + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
