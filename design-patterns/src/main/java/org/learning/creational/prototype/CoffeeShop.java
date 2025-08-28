package org.learning.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements Cloneable{
    String shopName;
    List<Coffee> coffeeTypes = new ArrayList<>();

    public CoffeeShop() {
    }

    public CoffeeShop(String shopName, List<Coffee> coffeeTypes) {
        this.shopName = shopName;
        this.coffeeTypes = coffeeTypes;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Coffee> getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(List<Coffee> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    public void loadStock(){
        for(int i=0;i<=2;i++){
            Coffee coffee = new Coffee();
            coffee.setCoffeeId(i);
            coffee.setCoffeeName("CoffeeName" + i);
            getCoffeeTypes().add(coffee);
        }
    }

    @Override
    protected CoffeeShop clone() throws CloneNotSupportedException {
        //return super.clone();
        CoffeeShop coffeeShop = (CoffeeShop) super.clone();
        coffeeShop.setCoffeeTypes(new ArrayList<>(this.coffeeTypes));
        return coffeeShop;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" +
                "shopName='" + shopName + '\'' +
                ", coffeeTypes=" + coffeeTypes +
                '}';
    }
}
