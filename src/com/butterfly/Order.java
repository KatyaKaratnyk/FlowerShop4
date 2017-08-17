package com.butterfly;
import java.util.LinkedList;

public class Order {
    LinkedList<Item> order;
    IDelivery deliver;
    IPayment payment;
    Order () {
        order = new LinkedList<Item>();
    }

    public void addItems(Item item) {
        order.add(item);
    }
    public void setDeliverStrategy(IDelivery deliver) {
        this.deliver = deliver;
    }
    public void performDeliver() {
        deliver.delivery();
    }
    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }
    public void performPayment() {
        payment.pay(this.calculateTotalPrice());
    }
    public double calculateTotalPrice() {
        double price =0;
        for (Item e : order) {
            price = price+e.getPrice();
        }
        return price;
    }
    public void removeItem(Item item) {
        order.remove(item);
    }
    public void processOrder() {
        if(order.size()>1)
            System.out.println("Order contains "+order.size()+" items");
        if (order.size()==1)
            System.out.println("Order contains "+order.size()+" item");
        if(order.size()==0)
            System.out.println("Your order is empty");
        }
    }

