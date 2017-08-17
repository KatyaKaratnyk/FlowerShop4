package com.butterfly;

public class BasketDecorator extends ItemDecorator {
    Item item;
    public double getPrice() {
        return 4+item.getPrice();
    }
    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription()+ ", Basket";
    }
}
