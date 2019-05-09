package com.leo.recyclerviewupdated;

public class ModelClass {
    private String title;
    private String price;

    public ModelClass(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public ModelClass() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
