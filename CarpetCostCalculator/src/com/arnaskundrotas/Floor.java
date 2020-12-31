package com.arnaskundrotas;

public class Floor {

    // FIELDS

    private double width;
    private  double height;

    // CONSTRUCTOR

    public Floor(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // GETTERS SETTER


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (this.width < 0 ){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (this.height < 0 ) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // METHODS

    public double getArea () {
        return width * height;
    }
}
