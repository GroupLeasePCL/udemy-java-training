package com.timbuchalka;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition("Chips", 2.75);
        super.addHamburgerAddition("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

}
