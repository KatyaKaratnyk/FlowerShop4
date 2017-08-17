package com.butterfly;

public enum FlowerType {
    CHAMOMILE, CACTUS, ROSE;
    public String toString() {
        switch (this) {
            case CHAMOMILE:
                return "Romashka";
            case CACTUS:
                return "Cactus";
            case ROSE:
                return "Rose";
            default:
                return "No name";
        }
    }
}
