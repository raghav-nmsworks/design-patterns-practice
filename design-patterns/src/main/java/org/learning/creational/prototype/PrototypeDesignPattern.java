package org.learning.creational.prototype;

public class PrototypeDesignPattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.setShopName("CCD");
        coffeeShop.loadStock();
        System.out.println(coffeeShop);

        //we have multiple shops with same menu, better to clone
        CoffeeShop coffeeShop2 = (CoffeeShop) coffeeShop.clone();
        coffeeShop2.setShopName("CCD London");
        System.out.println(coffeeShop2);
        //System.out.println(coffeeShop);
        System.out.println("=========================");

        //change in one shop should not reflect in other shop (as we are using shallow copy)
        //both coffee shop have same reference of coffee types
        //to make it deep copy, we need to override clone method
        coffeeShop.getCoffeeTypes().remove(0);
        System.out.println("After removing first coffee from CCD");
        System.out.println(coffeeShop);
        System.out.println(coffeeShop2);

    }
}
