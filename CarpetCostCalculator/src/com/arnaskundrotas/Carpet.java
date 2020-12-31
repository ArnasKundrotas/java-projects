package com.arnaskundrotas;

public class Carpet {

    // FIELDS

    private double cost;

    // CONSTRUCTORS

    public Carpet(double cost) {
        this.cost = cost;
    }

    // SETTERS GETTERS


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (this.cost < 0 ) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
}
