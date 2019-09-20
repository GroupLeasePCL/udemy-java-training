package com.timbuchalka;

public class HamburgerAddition {
    private String additionName;
    private double additionPrice;

    public HamburgerAddition(String additionName, double additionPrice) {
        this.additionName = additionName;
        this.additionPrice = additionPrice;
    }

    public String  getAdditionName(){
        return this.additionName;
    }

    public double getAdditionPrice() {
        return this.additionPrice;
    }

}
