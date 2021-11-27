public class Calculator {
    public static void main(String[] args) {
        char operation = '^';
        int num1 = 8;
        int num2 = 3;
        if (operation == '+') {
            System.out.println(num1 + num2);
        } else if (operation == '-') {
            System.out.println(num1 - num2);
        } else if (operation == '*') {
            System.out.println(num1 * num2);
        } else if (operation == '/') {
            System.out.println(num1 / num2);
        } else if (operation == '^') {
            double result = num1;
            for (int i = 1; i < num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        } else if (operation == '%') {
            System.out.println(num1 % num2);
        }
    }
}