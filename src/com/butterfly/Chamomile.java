package com.butterfly;

public class Chamomile extends Flower{
    protected FlowerSpec flowerSpecCactus;
    private double price;

    public Chamomile (double price) {
        super(true,new FlowerSpec (FlowerColor.WHITE,32,FlowerType.CACTUS));
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
