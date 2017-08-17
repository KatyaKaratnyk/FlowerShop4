package com.butterfly;

public class PostDeliveryStrategy implements IDelivery {
    @Override
    public  void delivery() {
        System.out.println("You order was sent by Post");
    }
}
