package com.butterfly;

public class PayPalPaymentStrategy implements IPayment {
    @Override
    public void pay(double price) {
        System.out.println("Paid "+price+" by Pal");
    }
}
