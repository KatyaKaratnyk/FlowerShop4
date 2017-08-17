package com.butterfly;

public class Rose extends Flower{
    protected FlowerSpec flowerSpecCactus;
    private double price;

    public Rose (double price) {
        super(true,new FlowerSpec (FlowerColor.RED,45,FlowerType.ROSE));
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
