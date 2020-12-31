package com.arnaskundrotas;

public class Calculator {

    // FIELDS

    private Floor floor;
    private Carpet carpet;

    // CONSTRUCTORS

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // SETTERS GETTERS


    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    // METHODS

    public double getTotalCost () {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
