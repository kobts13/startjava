public class MyFirstGame {
    public static void main(String[] args) {
        int guessedNumber = 50;
        for(int i = 0; i <= 100; i++) {
            if (i < guessedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (i > guessedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю, число угадано!");
                break;
            }
        }
    }
}