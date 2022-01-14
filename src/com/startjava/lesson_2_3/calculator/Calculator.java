package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private char operation;

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public String calculate(int num1, int num2) {
        return switch (operation) {
            case '+' -> String.valueOf(num1 + num2);
            case '-' -> String.valueOf(num1 - num2);
            case '*' -> String.valueOf(num1 * num2);
            case '/' -> String.valueOf(num1 / num2);
            case '^' -> String.valueOf(Math.pow(num1, num2));
            case '%' -> String.valueOf(num1 % num2);
            default -> null;
        };
    }
}