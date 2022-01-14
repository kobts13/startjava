package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String result;
        do {
            System.out.print("Введите математическое выражение: ");
            String[] mathExpression = scanner.nextLine().split(" ");

            int num1 = Integer.parseInt(mathExpression[0]);
            char operation = mathExpression[1].charAt(0);
            int num2 = Integer.parseInt(mathExpression[2]);
            calculator.setOperation(operation);
            System.out.println(calculator.calculate(num1, num2));

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                result = scanner.nextLine();
            } while (!result.equals("yes") && !result.equals("no"));
        } while (!result.equals("no"));
    }
}