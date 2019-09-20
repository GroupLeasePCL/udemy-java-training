package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("pork","basic", "white", 10);
//	    double hamburgerPrice = hamburger.itemHamburger();
	    hamburger.addHamburger1("addName1",5);
	    hamburger.addHamburger2("addName2", 5);
        System.out.println("Total price is:"+ hamburger.itemHamburger());

        HealtyBurger healtyBurger = new HealtyBurger("beef", 10);
        healtyBurger.addBurgerHealthy1("egg", 5);
        healtyBurger.addBurgerHealthy2("chiese", 4);
        System.out.println("total price is " +healtyBurger.itemHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addHamburger1("drink", 3);
        System.out.println("total price " + deluxBurger.itemHamburger());
    }
}
