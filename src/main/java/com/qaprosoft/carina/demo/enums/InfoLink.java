package com.qaprosoft.carina.demo.enums;

public enum InfoLink {

    SPECIALS("Specials"),

    NEW_PRODUCTS("New products"),

    BEST_SELLERS("Best sellers"),

    OUR_STORES("Our stores"),

    CONTACT_US("Contact us"),

    TERMS("Terms and conditions of use"),

    ABOUT_US("About us"),

    SITEMAP("Sitemap");

    private final String infolink;

    InfoLink(String infolink) {
        this.infolink = infolink;
    }

    public String getInfolink() {
        return infolink;
    }
}
