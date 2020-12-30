package com.arnaskundrotas;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //getters
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        double result;
        return result = getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        double result;
        return result = getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        double result;
        if (secondNumber == 0 || firstNumber == 0) {
            return 0;
        }
        return result = getFirstNumber() / getSecondNumber();
    }

    //setters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}


