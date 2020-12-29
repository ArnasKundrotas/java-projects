package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        sumDigits(10);
    }

    public static int sumDigits (int number) {
        if (number < 10 || number < 0) {
            return -1;
        } else if (number > 0 && number < 10) {
            return -1;
        } else {
            int sum = 0;
            while ( number > 0) {
                System.out.println(number % 10);
                sum = sum + (number % 10);
                number = number / 10;
            }
            System.out.println("Sum = " + sum);

        }
        return -1;
    }
}
