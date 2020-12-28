package com.arnaskundrtoas;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(-2000000);
        printYearsAndDays(0);
        printYearsAndDays(1440);


    }

    public static void printYearsAndDays (long minutes) {
        if ( minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long days = minutes / 1440; // % ex 1280 min
            long remainingMinutes = minutes % 1440; // 1280 min
            long years = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

    }
}
