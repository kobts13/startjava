import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int guessedNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        guessedNumber = random.nextInt(100);
    }

    public void play() {
        while(!guessed(player1) && !guessed(player2)) {}
    }

    private boolean guessed(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        int number = scanner.nextInt();
        player.setNumber(number);
        if (number < guessedNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (number > guessedNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, число угадано!");
            return true;
        }
        return false;
    }
}