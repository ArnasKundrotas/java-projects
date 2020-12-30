package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {
        getGreatestCommonDivisor(12, 30); // 6
        getGreatestCommonDivisor(25, 15); // 5
        getGreatestCommonDivisor(12, 30); // 6
        getGreatestCommonDivisor(9, 18); // -1
        getGreatestCommonDivisor(81, 153); // 9
        getGreatestCommonDivisor(201, 153); // 3
        getGreatestCommonDivisor(10, 35); // 5

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int divisor = 1;
            int lastDivisor = 1;
            while (first > divisor && second > divisor) {

                if (first % divisor == 0 && second % divisor == 0) {
                    lastDivisor = divisor;
                }
                divisor += 1;
            }
            System.out.println(lastDivisor);
            return lastDivisor;
        } else {
            return -1;
        }
    }
}
