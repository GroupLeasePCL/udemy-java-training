package com.company;

public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("Beef", "Delux", "brown rye", 10);
        super.addHamburger1("suger",2);
        super.addHamburger2("chilly", 1);
    }

    @Override
    public void addHamburger1(String name, double price) {
        System.out.println("can not add item to Delux Burger!");
    }

    @Override
    public void addHamburger2(String name, double price) {
        System.out.println("can not add item to Delux Burger!");
    }

    @Override
    public void addHamburger3(String name, double price) {
        System.out.println("can not add item to Delux Burger!");
    }

    @Override
    public void addHamburger4(String name, double price) {
        System.out.println("can not add item to Delux Burger!");
    }
}
