package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
	    getEvenDigitSum(123456789); // 2 + 4 + 6 + 8 = 20
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            while (number !=0 ) {
                int lastNumber = number % 10;
                if (lastNumber % 2 == 0){
                    sum = sum + lastNumber;
                }
                number = number / 10;
            }
            System.out.println(sum);
            return sum;
        }
    }
}
