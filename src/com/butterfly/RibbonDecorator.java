package com.butterfly;

public class RibbonDecorator extends ItemDecorator {
    Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public double getPrice() {
        return 40+item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription()+ ", Ribbon";
    }


}
