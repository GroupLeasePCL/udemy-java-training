package com.vorleak;

public class AdditionalItems {
    private String name;
    private double price;

    public AdditionalItems(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getName(){
        return name;
    }

}
