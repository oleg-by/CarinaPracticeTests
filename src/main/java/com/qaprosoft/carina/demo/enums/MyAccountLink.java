package com.qaprosoft.carina.demo.enums;

public enum MyAccountLink {

    ORDERS("My orders"),

    CREDIT("My credit slips"),

    ADDRESSES("My addresses"),

    PERSONAL("My personal info"),

    SIGN_OUT("Sign out");

    private final String accountLink;


    MyAccountLink(String accountLink) {
        this.accountLink = accountLink;
    }

    public String getAccountLink() {
        return accountLink;
    }
}
