package com.vorleak;

public class DeluxeBurger extends Hamburger {
    private AdditionalItems chip;
    private AdditionalItems drink;

    public DeluxeBurger(String name, double basicPrice) {
        super(name,  "White", 0, basicPrice);
    }

    public void setChip(AdditionalItems chip) {
        this.chip = chip;
    }

    public void setDrink(AdditionalItems drink) {
        this.drink = drink;
    }

    @Override
    public void setAdditionalItemsOne(AdditionalItems additionalItemsOne) {
        System.out.println("Not allow to add item " + additionalItemsOne.getName());
    }

    @Override
    public void setAdditionalItemsTwo(AdditionalItems additionalItemsTwo) {
        System.out.println("Not allow to add item " + additionalItemsTwo.getName());
    }

    @Override
    public void setAdditionalItemsThree(AdditionalItems additionalItemsThree) {
        System.out.println("Not allow to add item " + additionalItemsThree.getName());
    }

    @Override
    public void setAdditionalItemsFour(AdditionalItems additionalItemsFour) {
        System.out.println("Not allow to add item " + additionalItemsFour.getName());
    }

    @Override
    public double totalHamburgerPrice() {
        double totalDeluxeBurger = super.totalHamburgerPrice();

        if(chip != null){
            totalDeluxeBurger += chip.getPrice();
            System.out.println("Item "+chip.getName() + " the price "+ chip.getPrice());
        }
        if(drink != null){
            totalDeluxeBurger += drink.getPrice();
            System.out.println("Item "+drink.getName() + " the price "+ drink.getPrice());
        }
        System.out.println("Total Deluxe hamburger has price " + totalDeluxeBurger);
        return totalDeluxeBurger;
    }
}
