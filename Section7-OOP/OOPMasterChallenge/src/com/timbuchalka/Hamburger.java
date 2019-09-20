package com.timbuchalka;

import java.util.ArrayList;
import java.util.Iterator;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

//    private String addition1Name;
//    private double addition1Price;
//
//    private String addition2Name;
//    private double addition2Price;
//
//    private String addition3Name;
//    private double addition3Price;
//
//    private String addition4Name;
//    private double addition4Price;

    private ArrayList<HamburgerAddition> Additions ;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        Additions = new ArrayList<HamburgerAddition>();
    }

    public void addHamburgerAddition(String name,double price) {
        if (this.Additions.size()<4){
            this.Additions.add(new HamburgerAddition(name,price));
        }else{
            System.out.println("you can add only 4 additions");
        }
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                    + "with " + this.meat + ", price is "  + this.price);

        Iterator<HamburgerAddition> iterator = this.Additions.iterator();
        while (iterator.hasNext()){
            HamburgerAddition addition ;
            addition = iterator.next();
            hamburgerPrice += addition.getAdditionPrice();
            System.out.println("Added " + addition.getAdditionName() + " for an extra " + addition.getAdditionPrice());
        }
        return hamburgerPrice;
    }

}
