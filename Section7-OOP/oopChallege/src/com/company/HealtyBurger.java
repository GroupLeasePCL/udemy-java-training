package com.company;

public class HealtyBurger extends Hamburger {
    private String healtyExtraName1;
    private double healtyExtraPrice1;
    private String healtyExtraName2;
    private double healtyExtraPrice2;

    public HealtyBurger(String meat, double price) {
        super(meat, "Healty", "Brown rye", price);
    }
    public void addBurgerHealthy1(String name, double price){
        this.healtyExtraName1 = name;
        this.healtyExtraPrice1 = price;
    }
    public void addBurgerHealthy2(String name, double price){
        this.healtyExtraName2 = name;
        this.healtyExtraPrice2 = price;
    }

    @Override
    public double itemHamburger() {
        double healthyBurgerPrice = super.itemHamburger();
        if(healtyExtraName1 != null){
            healthyBurgerPrice += this.healtyExtraPrice1;
            System.out.println("Added " + this.healtyExtraName1 + " extra price " + this.healtyExtraPrice1);
        }
        if(healtyExtraName2 != null) {
            healthyBurgerPrice += this.healtyExtraPrice2;
            System.out.println("Added " + this.healtyExtraName2 + " extra price " + this.healtyExtraPrice2);
        }
        return healthyBurgerPrice;
    }
}
