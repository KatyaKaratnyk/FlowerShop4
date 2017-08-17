package com.butterfly;



public abstract class Item {
    String description = "Unknown item";

    public String getDescription() {
        return description;
    }
    public abstract double getPrice();
    public void addFlower(Flower flower) {}

    public void searchFlower(String name) {
    };
    public void searchFlower(double price) {
    };
    public void searchFlower(FlowerColor color) {
    };

}
