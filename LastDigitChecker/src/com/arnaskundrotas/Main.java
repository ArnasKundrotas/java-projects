package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    hasSameLastDigit(41, 22, 71);
	    hasSameLastDigit(23, 32, 42);
	    hasSameLastDigit(9, 99, 999);
        System.out.println("-----------------");
        isValid(10);
        isValid(468);
        isValid(1051);
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {
        if ( isValid(a) && isValid(b) && isValid(c)) {
            int aLast = a % 10;
            int bLast = b % 10;
            int cLast = c % 10;

            if (aLast == bLast || aLast == cLast || bLast == cLast) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
                return false;
            }

        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean isValid (int a) {
        if ( a < 10 || a > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
