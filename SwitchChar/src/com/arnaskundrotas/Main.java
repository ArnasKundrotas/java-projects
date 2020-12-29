package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        char charChar = 'A';
        switch (charChar) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found A || B || C || D || E");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
