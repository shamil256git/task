package com.itemmanagement;

public class Item {
    private String itemName;

    public Item (String itemName) {
        this.itemName = itemName;
    }

    public String getItemInfo() {
        return "Item: " + itemName;
    }
}


