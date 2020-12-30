package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    canPack(1, 0, 4); // false
	    canPack(1, 0, 5); // true
	    canPack(0, 5, 4); // true
	    canPack(2, 2, 11); // true
	    canPack(-3, 2, 12); // false
        canPack(1, 0, 6); // false
        canPack(5, 3, 24); // false
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("false");
            return false;
        }

        if (goal % 5 != 0 && bigCount * 5 < goal) {
            System.out.println("false");
            return false;
        }

        if (goal / 5 < 1 && bigCount >= 1) {
            System.out.println("false");
            return false;
        }

        if ((bigCount * 5 < goal) && (smallCount < (goal - bigCount *5))){
            System.out.println("false");
            return false;
        }

        if (bigCount == 0 && goal > smallCount ) {
            System.out.println("false");
            return false;
        }

        System.out.println("true");
        return true;

    }
}
