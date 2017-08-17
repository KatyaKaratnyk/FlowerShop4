package com.butterfly;

public abstract class ItemDecorator extends Item{
    Item itm;

    public ItemDecorator(Item itm) {
        this.itm = itm;
    }
    public ItemDecorator() {}

    public abstract String getDescription();




}
