package com.butterfly;

public class PaperDecorator extends ItemDecorator{
    Item item;
    public double getPrice() {
        return 13+item.getPrice();
    }
    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription()+ ", Paper";
    }
}
