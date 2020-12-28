package com.arnaskundrtoas;

public class Main {

    public static void main(String[] args) {
        area(10);
        area(10,20);
    }

    public static double area (double radius){
        if (radius < 0) {
            return -1;
        }
        double circleArea = Math.pow(radius, 2) * Math.PI;
        System.out.println("Circle area is " + circleArea);
        return circleArea;
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        double rectangleArea =  x * y;
        System.out.println("Area of the rectangle is "+ rectangleArea);
        return rectangleArea;
    }

}
