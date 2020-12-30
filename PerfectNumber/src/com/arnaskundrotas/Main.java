package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    isPerfectNumber(6);
	    isPerfectNumber(28);
	    isPerfectNumber(5);
	    isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber (int number) {
        if (number >= 1) {
            int sum = 0;
            int divisor = 1;
            while ( number > divisor) {
                if (number % divisor == 0) {
                    sum = sum + divisor;
                }
                divisor++;
            }
            if (sum == number) {
                System.out.println("True");
                return true;
            }else {
                System.out.println("False");
                return false;
            }
        } else {
            System.out.println("False");
            return false;
        }
    }
}
