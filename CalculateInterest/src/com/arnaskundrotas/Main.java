package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    calculateInterest(100000);
        System.out.println("---------");
        calculateInterestDown(100000);
        System.out.println("---------");
        isPrimePrintOut(10);


    }

    public static void calculateInterest (double amount) {
        for (double interest = 2; interest < 9; interest++) {
            System.out.println(amount + " with a " + interest + " percent interest is " + String.format("%.2f",(amount * (interest / 100))));
        }
    }

    public static void calculateInterestDown (double amount) {
        for (double interest = 8; interest > 1; interest--) {
            System.out.println(amount + " with a " + interest + " percent interest is " + String.format("%.2f",(amount * (interest / 100))));
        }
    }

    public static void isPrimePrintOut (int amount) {
        int count = 0;
        for (int i = 1; i < amount; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is prime number");
                if (count == 3) {
                    System.out.println("Exited loop with prime number count value " + count);
                    break;
                }
            }
        }
    }

    public static boolean isPrime (int n) {
        if ( n == 1) {
            return false;
        }

        for ( int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
