package com.arnaskundrtoas;

public class Main {

    public static void main(String[] args) {
        isCatPlaying(true,45);
        isCatPlaying(false, 35);
        isCatPlaying(false, 25);
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {

        if (temperature >= 25 && temperature <= 35){
            return true;
        } else if (summer && temperature >= 25 && temperature <=45){
            return true;
        } else {
            return false;
        }

    }
}
