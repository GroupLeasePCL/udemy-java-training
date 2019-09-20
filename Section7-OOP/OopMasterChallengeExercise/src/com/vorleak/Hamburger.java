package com.vorleak;

public class Hamburger {
    private String name;
    private String breadRollType;
    private int meat;
    private double basicPrice;
    private AdditionalItems additionalItemsOne;
    private AdditionalItems additionalItemsTwo;
    private AdditionalItems additionalItemsThree;
    private AdditionalItems additionalItemsFour;

    public Hamburger(String name, String breadRollType, int meat, double basicPrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basicPrice = basicPrice;
    }

    public void setAdditionalItemsOne(AdditionalItems additionalItemsOne) {
        this.additionalItemsOne = additionalItemsOne;
    }

    public void setAdditionalItemsTwo(AdditionalItems additionalItemsTwo) {
        this.additionalItemsTwo = additionalItemsTwo;
    }

    public void setAdditionalItemsThree(AdditionalItems additionalItemsThree) {
        this.additionalItemsThree = additionalItemsThree;
    }

    public void setAdditionalItemsFour(AdditionalItems additionalItemsFour) {
        this.additionalItemsFour = additionalItemsFour;
    }

    public double totalHamburgerPrice (){
        if(additionalItemsOne != null){
            basicPrice += additionalItemsOne.getPrice();
            System.out.println("Your additional item " + additionalItemsOne.getName() + " the price is "+additionalItemsOne.getPrice());
        }
        if(additionalItemsTwo != null){
            basicPrice += additionalItemsTwo.getPrice();
            System.out.println("Your additional item " + additionalItemsTwo.getName() + " the price is "+additionalItemsTwo.getPrice());
        }
        if(additionalItemsThree != null){
            basicPrice += additionalItemsThree.getPrice();
            System.out.println("Your additional item " + additionalItemsThree.getName() + " the price is "+additionalItemsThree.getPrice());
        }
        if(additionalItemsFour != null){
            basicPrice += additionalItemsFour.getPrice();
            System.out.println("Your additional item " + additionalItemsFour.getName() + " the price is "+additionalItemsFour.getPrice());
        }
        System.out.println("Your " + name + " burger has total price is = "+ basicPrice);
        return basicPrice;
    }
}
