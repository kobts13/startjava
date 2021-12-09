public class Calculator {
    private char operation;

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate(int num1, int num2) {
        switch(operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '^':
                 double result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                System.out.println(result);
                break;
            case '%':
                System.out.println(num1 % num2);
        }
    }
}