package com.arnaskundrtoas;

public class Main {

    public static void main (String[] args){

        calcFeetAndInchesToCentimeters(1,12);
        calcFeetAndInchesToCentimeters(200);


    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double calc = (feet * 30.48) + (inches * 2.54);
            System.out.println(feet + " feet and " + inches + " inches are " + calc + " centimeters");
        }

        return -1;

    }

    public static double calcFeetAndInchesToCentimeters (double inputInches) {
        if (inputInches >= 0) {
            double feet = (inputInches - (inputInches % 12))/12;
            double inches = inputInches % 12;
            double calc = (feet * 30.48) + (inches * 2.54);
            System.out.println(inputInches + " inches are " + calc + " centimeters");;
        }
        return -1;
    }

}
