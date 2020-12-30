package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    getDigitCount(001);
    }

    public static void numberToWords (int number) {

    }

    public static void getDigitCount (int number) {
        int count = 0;
        while (number != 0){
            number /= 10;
            ++count;
        }
        System.out.println(count);
    }

    public static void extractNumbers (int number) {
        while (number != 0) {
            int lastNumber = number % 10; // 6
            switch (lastNumber){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            number = number / 10;

        }
    }

}
