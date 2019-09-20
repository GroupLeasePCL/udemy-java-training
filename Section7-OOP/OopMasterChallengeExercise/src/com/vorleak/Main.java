package com.vorleak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic","White",1,5);
        AdditionalItems item1 = new AdditionalItems("extra 1", 2.0);
        AdditionalItems item2 = new AdditionalItems("extra 2", 2.0);
        AdditionalItems item3 = new AdditionalItems("extra 3", 2.0);
        AdditionalItems item4 = new AdditionalItems("extra 4", 2.0);
        hamburger.setAdditionalItemsOne(item1);
        hamburger.setAdditionalItemsTwo(item2);
        hamburger.setAdditionalItemsThree(item3);
        hamburger.setAdditionalItemsFour(item4);
        hamburger.totalHamburgerPrice();

        HeathyBurger heathyBurger = new HeathyBurger("Healthy",3);
        AdditionalItems item5 = new AdditionalItems("extra 5",3);
        AdditionalItems item6 = new AdditionalItems("extra 6",3);
        heathyBurger.setAdditionalItemsFive(item5);
        heathyBurger.setAdditionalItemsSix(item6);
        heathyBurger.totalHamburgerPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe",10);
        AdditionalItems chip = new AdditionalItems("Chip", 4);
        AdditionalItems drink = new AdditionalItems("Drink" ,10);
        deluxeBurger.setChip(chip);
        deluxeBurger.setDrink(drink);
        deluxeBurger.totalHamburgerPrice();

    }
}
