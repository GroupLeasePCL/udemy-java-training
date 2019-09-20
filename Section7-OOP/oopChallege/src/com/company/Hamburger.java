package com.company;

public class Hamburger {
    private String meat, name, breadRollType;
    private double price;
    private String addName1;
    private double addPrice1;
    private String addName2;
    private double addPrice2;
    private String addName3;
    private double addPrice3;
    private String addName4;
    private double addPrice4;

    public Hamburger(String meat, String name, String breadRollType, double price) {
        this.meat = meat;
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburger1(String name, double price){
        this.addName1 = name;
        this.addPrice1 = price;
    }
    public void addHamburger2(String name, double price){
        this.addName2 = name;
        this.addPrice2 = price;
    }
    public void addHamburger3(String name, double price){
        this.addName3 = name;
        this.addPrice3 = price;
    }
    public void addHamburger4(String name, double price){
        this.addName4 = name;
        this.addPrice4 = price;
    }

    public double itemHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll price is " + this.price);
        if(this.addName1 != null){
            hamburgerPrice += this.addPrice1;
            System.out.println("Added " + this.addName1 + " for extra price " + this.addPrice1);
        }
        if(this.addName2 != null){
            hamburgerPrice += this.addPrice2;
            System.out.println("Added " + this.addName2 + " for extra price " + this.addPrice2);
        }
        if(this.addName3 != null){
            hamburgerPrice += this.addPrice3;
            System.out.println("Added " + this.addName3 + " for extra price " + this.addPrice3);
        }
        if(this.addName4 != null){
            hamburgerPrice += this.addPrice4;
            System.out.println("Added " + this.addName4 + " for extra price " + this.addPrice4);
        }

        return hamburgerPrice;
    }
}
