package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String result;
        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            char operation = scanner.next().charAt(0);;
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            calculator.setOperation(operation);
            calculator.calculate(num1, num2);

            scanner.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                result = scanner.nextLine();
            } while(!result.equals("yes") && !result.equals("no"));
        } while(!result.equals("no"));
    }
}