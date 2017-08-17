package com.butterfly;
import java.util.*;

public class FlowerBucket extends Item {

    ArrayList<Flower> bouquet;
    FlowerBucket () {
        bouquet = new ArrayList<Flower>();
    }

    public double getPrice() {
        double price =0;
        for (Flower e : bouquet) {
            price = price+e.getPrice();
        }
        return price;
    }
    public void addFlower(Flower myFlower) {
        bouquet.add(myFlower);
    }

    public void searchFlower(String name) {
        String message = "";
        for (Flower e : bouquet) {
            if (e.getSpec().getType().toString().compareToIgnoreCase(name) == 0) {
                message = "There is a flower with name: "+name+" in this bouquet";
                break;
            } else message = "There is no flower with name: "+ name+" in this bouquet";
        }
        System.out.println(message);
    }


    public void searchFlower(double price) {
        String message = "";
        for (Flower e : bouquet) {
            if (e.getPrice() == price) {
                message = "There is a flower with price: "+price+" in this bouquet";
                break;
            } else message = "There is no flower with price:"+price+" in this bouquet";
        }
        System.out.println(message);
    }

    public void searchFlower(FlowerColor color) {
        String message = "";
        for (Flower e : bouquet) {
            if (e.spec.getColor().equals(color)) {
                message = "There is a flower with color: "+color+" in this bouquet";
                break;
            } else message = "There is no flower with color: "+color+" in this bouquet";
        }
        System.out.println(message);
    }
}
