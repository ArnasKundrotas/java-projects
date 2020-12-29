package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        isPolindrome(1235); // False
        isPolindrome(1221); // True
        isPolindrome(3443); // True
        isPolindrome(123321); // True
        isPolindrome(-11111); // True

    }

    public static int reverseNumber (int number) {
        int last;
        int reverse = 0;
        while (number != 0){
            last = number % 10;
            number = number / 10;
            reverse = reverse * 10 + last;
        }
        return reverse;
    }

    public static int isPolindrome (int number) {

        if (number == reverseNumber(number)){
            System.out.println(reverseNumber(number) + " is a Polindrome");
        } else {
            System.out.println(reverseNumber(number) + " is not Polindrome");
        }
        return -1;
    }
}
