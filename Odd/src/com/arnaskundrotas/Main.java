package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        sumOdd(1,100);
        sumOdd(-1,100);
        sumOdd(100,100);
        sumOdd(13,13);
        sumOdd(100, -100);
        sumOdd(100,1000);
    }

    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {
        if (start > end || start < 0 || end < 0) {
            System.out.println("-1");
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) { // start = 1, end = 11
                if (isOdd(i)){
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
        return -1;
    }

}
