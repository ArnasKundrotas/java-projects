package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(252); // 4
        System.out.println("-------");
        sumFirstAndLastDigit(257); // 9
        System.out.println("-------");
        sumFirstAndLastDigit(0); // 0
        System.out.println("-------");
        sumFirstAndLastDigit(5); // 10
        System.out.println("-------");
        sumFirstAndLastDigit(-10); // -1
        System.out.println("-------");
        sumFirstAndLastDigit(100); // 1
        System.out.println("-------");
        sumFirstAndLastDigit(1045645464564640); // 1

    }

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            System.out.println("-1");
            return -1;
        } else if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
            System.out.println("Intger too large or too small");
        }else if (number == 0) {
            System.out.println("0");
            return -1;
        }else {

            int firsNumber = number % 10;
            System.out.println("First digit = " + firsNumber);

            while (number != 0) {

                int lastNumber = number % 10;
                number = number / 10;

                if (number == 0) {
                    int sum = firsNumber + lastNumber;
                    System.out.println("Last digit = " + lastNumber);
                    System.out.println("Sum = " + sum);
                    return lastNumber;
                }

            }
        }
        return -1;
    }
}
