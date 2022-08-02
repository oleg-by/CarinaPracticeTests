package com.qaprosoft.carina.demo.enums;

public enum Categories {

    WOMEN("Women");

    private final String category;

    Categories(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
