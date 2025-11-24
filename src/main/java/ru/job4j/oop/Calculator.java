package ru.job4j.oop;

import java.util.SortedMap;

public class Calculator {
    private static int x = 5;
    private int y;

    public static int minus(int number) {
        return number - x;
    }

    public int divide(int number) {
        return number / x;
    }

    public int sum(int number) {
        return number + x;
    }

    public int multiply(int number) {
        return number * x;
    }

    public int sumAllOperation(int number) {
        int minusResult = minus(number);
        int divideResult = divide(number);
        int sumResult = sum(number);
        int multiplyResult = multiply(number);

        return sumResult + multiplyResult + minusResult + divideResult;
    }

    public static void main(String[] args) {
        System.out.println("Статический метод minus(10): " + Calculator.minus(10));
        Calculator calculator = new Calculator();
        System.out.println("Нестатический метод divide(20): " + calculator.divide(20));
        System.out.println("Нестатический метод sum(3): " + calculator.sum(3));
        System.out.println("Нестатический метод multiply(4): " + calculator.multiply(4));
        System.out.println("sumAllOperation(10): " + calculator.sumAllOperation(10));

    }
}
