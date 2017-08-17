package com.butterfly;

public enum FlowerColor {
    GREEN, RED, BLUE, WHITE;

    @Override
    public String toString() {
        switch (this) {
            case RED:
                return "Red";
            case BLUE:
                return "Blue";
            case GREEN:
                return "Green";
            case WHITE:
                return "White";
            default:
                return "No color";
        }
    }
}
