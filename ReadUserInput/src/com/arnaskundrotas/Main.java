package com.arnaskundrotas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        while (true) {
            System.out.println("Enter number #" + count + ":");

            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                int number = scanner.nextInt();
                count++;
                sum = sum + number;
                System.out.println(number);
                if (count == 11) {
                    break;
                }
            } else {
                System.out.println("Invalid Input");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of all the input numbers = " + sum);
        scanner.close();
    }
}
