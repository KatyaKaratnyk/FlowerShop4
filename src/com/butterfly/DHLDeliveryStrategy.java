package com.butterfly;

public class DHLDeliveryStrategy implements IDelivery {
    @Override
    public void delivery() {
        System.out.println("You order was sent by DHL");
    }
}
