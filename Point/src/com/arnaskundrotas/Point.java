package com.arnaskundrotas;

public class Point {

    // FIELDS

    private int x;
    private  int y;

    // CONSTRUCTORS

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTERS SETTER

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // METHODS

    public double distance () {
        double distance = Math.sqrt((0 - this.x)*(0 - this.x)+(0-this.y)*(0-this.y));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt((x - this.x)*(x - this.x)+(y-this.y)*(y-this.y));
        return distance;
    }

    public double distance(Point another) {
        double distance = Math.sqrt((x - this.x)*(x - this.x)+(y-this.y)*(y-this.y));
        return distance;
    }

}
