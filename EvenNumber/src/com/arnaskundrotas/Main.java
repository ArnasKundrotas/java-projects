package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        isEvenNumber(1); // false
        isEvenNumber(2); // true
    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }
}
