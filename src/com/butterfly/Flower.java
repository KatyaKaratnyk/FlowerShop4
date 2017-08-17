package com.butterfly;

public  abstract class  Flower {

    protected boolean fresh;
    protected FlowerSpec spec;



public Flower () {}
    public Flower(  boolean fresh, FlowerSpec spec) {
        this.fresh = fresh;
        this.spec = spec;
    }

    public FlowerSpec getSpec(){ return spec; }

   public abstract double getPrice();

    public boolean isFresh() {
        return fresh;
    }

    public String toString() {
        return "Type: " + spec.getType() + ", price is " + String.valueOf(getPrice()) + ", its color is " + spec.getColor() + ", its height " + String.valueOf(spec.getLength());
    }

}
