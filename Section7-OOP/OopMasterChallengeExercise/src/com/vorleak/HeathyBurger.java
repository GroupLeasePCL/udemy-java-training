package com.vorleak;

public class HeathyBurger extends Hamburger {

    private AdditionalItems additionalItemsFive;
    private AdditionalItems additionalItemsSix;
    private double totalPrice;

    public HeathyBurger(String name, double basicPrice) {
        super(name, "Brown rye bread roll", 0 , basicPrice);
    }

    public void setAdditionalItemsFive(AdditionalItems additionalItemsFive) {
        this.additionalItemsFive = additionalItemsFive;
    }

    public void setAdditionalItemsSix(AdditionalItems additionalItemsSix) {
        this.additionalItemsSix = additionalItemsSix;
    }
    @Override
    public double totalHamburgerPrice() {
        double totalHealthyPrice = super.totalHamburgerPrice();

        if(additionalItemsFive != null){
            System.out.println("Your additional item " + additionalItemsFive.getName() + " the price is "+additionalItemsFive.getPrice());
            totalHealthyPrice += additionalItemsFive.getPrice();
        }
        if(additionalItemsSix != null){
            System.out.println("Your additional item " + additionalItemsSix.getName() + " the price is "+additionalItemsSix.getPrice());
            totalHealthyPrice += additionalItemsSix.getPrice();
        }
        System.out.println("Total healthy hamburger has price " + totalHealthyPrice);
        return totalHealthyPrice;
    }
}
