package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(1); // Monday
        printDayOfTheWeek(2); // Tuesday
        printDayOfTheWeek(3); // Wednesday
        printDayOfTheWeek(4); // Thursday
        printDayOfTheWeek(5); // Friday
        printDayOfTheWeek(6); // Saturday
        printDayOfTheWeek(7); // Sunday
        printDayOfTheWeek(0); // Invalid input
        printDayOfTheWeek(20); // Invalid input
        printDayOfTheWeek(-1); // Invalid input

        System.out.println("----------------------------");

        printDayOfTheWeek(true, 1); // Monday
        printDayOfTheWeek(true, 2); // Tuesday
        printDayOfTheWeek(true, 3); // Wednesday
        printDayOfTheWeek(true, 4); // Thursday
        printDayOfTheWeek(true, 5); // Friday
        printDayOfTheWeek(true, 6); // Saturday
        printDayOfTheWeek(true, 7); // Sunday
        printDayOfTheWeek(true, 0); // Invalid input
        printDayOfTheWeek(true, 20); // Invalid input
        printDayOfTheWeek(true, -1); // Invalid input


    }

    public static void printDayOfTheWeek (int day) {
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void printDayOfTheWeek (boolean bool, int day) {
        if ( day < 1 || day > 7 ) {
            System.out.println("Invalid input");
        } else if ( day == 1) {
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }
}
