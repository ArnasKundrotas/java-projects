package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    hasSharedDigit(12, 23); // true
	    hasSharedDigit(9, 99); // false
	    hasSharedDigit(15, 55); // true
    }

    public static boolean hasSharedDigit (int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            System.out.println("False");
            return false;
        } else {
            if (a % 10 == b % 10){
                System.out.printf("true");
                return true;
            } else if ( a % 10 == b / 10) {
                System.out.printf("true");
                return true;
            } else if ( a / 10 == b % 10) {
                System.out.printf("true");
                return true;
            } else if ( a / 10 == b / 10 ) {
                System.out.printf("true");
                return true;
            } else {
                System.out.println("False");
                return false;
            }
        }
    }
}
