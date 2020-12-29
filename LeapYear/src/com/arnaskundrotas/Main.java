package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    isLeapYear(-1600); // False
	    isLeapYear(1600); // True
	    isLeapYear(2017); // False
	    isLeapYear(2000); // True

        System.out.println("-----------------------------");

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);

    }

    public static String isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Not a leap year");
            return "-1";
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap year");
            return "1";
        } else {
            System.out.println("Not a leap year");
            return "-1";
        }
    }

    public static String getDaysInMonth (int month, int year) {
        String isLeapYear = isLeapYear(year);
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Invalid input");
        } else if ( isLeapYear == "1" && month == 2){
            System.out.println("29");
        } else {
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        return "-1";    }
}
