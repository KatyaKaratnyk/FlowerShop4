package com.butterfly;

public class CreditCartPaymentStrategy implements IPayment {

    @Override
    public void pay(double price) {
        System.out.println("Paid "+price+" by CreditCart");
    }
}
