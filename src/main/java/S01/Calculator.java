package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return dividend / divisor;
    }


    public int calculateDiscount(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return dividend + (dividend /100 * divisor) ;
    }

// Допустим, у вас есть и другие методы калькулятора
}
