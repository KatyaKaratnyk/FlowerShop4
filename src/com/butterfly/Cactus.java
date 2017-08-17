package com.butterfly;

public class Cactus extends Flower  {
protected FlowerSpec flowerSpecCactus;
protected FlowerForm CactusForm;
private double price;

public Cactus (double price, FlowerForm CactusForm) {
    super(false,new FlowerSpec (FlowerColor.GREEN,0,FlowerType.CACTUS));
    this.CactusForm=CactusForm;
    this.price = price;
}

    public double getPrice() {
        return price;
    }

}
