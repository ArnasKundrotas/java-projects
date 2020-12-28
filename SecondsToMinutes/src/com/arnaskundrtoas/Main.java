package com.arnaskundrtoas;

// no printf() method

public class Main {

    public static void main(String[] args) {
        getDurationString(20, 51); // 20m 51s
        getDurationString(61, 51); // 1h 1m 51s
        getDurationString(350, 51); // 5h 50m 51s
        getDurationString(350); // 5m 50s
        getDurationString(350, 61); // Invalid input
        getDurationString(-350); // Invalid input
        getDurationString(-350, -59);  // Invalid input
        getDurationString(); // No parameters specified
        getDurationString(1); // 1s
        getDurationString(1,1); // 1m 1s
        getDurationString(61,1); // 1h 1m 1s


    }

    public static void getDurationString (int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value");
        } else {
            int hours = minutes / 60;
                if (hours < 1) {
                    System.out.println(minutes + "m " + seconds + "s");
                } else {
                    int minutesLeft = minutes - (hours * 60);
                    System.out.println(hours + "h " + minutesLeft + "m " + seconds + "s");
                }

        }
    }

    public static void getDurationString (int seconds) {
        if(seconds < 0) {
            System.out.println("Invalid value");
        } else {
            if (seconds < 60  ) {
                System.out.println(seconds + "s");
            } else if (seconds < 3600) {
                int minutes = seconds / 60;
                int secondsLeft = seconds - (minutes * 60);
                System.out.println(minutes + "m " + secondsLeft + "s");
            } else {
                int hours = seconds / 3600;
                int secondsLeft = seconds - (hours * 3600);
                int minutes = secondsLeft / 60;
                secondsLeft = secondsLeft - (minutes * 60);
                System.out.println(hours + "h " + minutes + "m " + secondsLeft + "s");
            }
        }
    }

    public static void getDurationString () {
        System.out.println("No parameters specified");
    }

}
