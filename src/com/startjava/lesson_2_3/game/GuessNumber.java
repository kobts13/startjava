package com.startjava.lesson_2_3.game;

import java.util.Arrays;
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
        System.out.println("У каждого игрока по 10 попыток");
        int attempt = 0;
        while(!guessed(player1, attempt) && !guessed(player2, attempt)) {
            attempt++;
            if (attempt == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }
        }
        int [] attemptsOfPlayer1;
        int [] attemptsOfPlayer2;
        if (attempt == 10) {
            attemptsOfPlayer1 = player1.getEnteredNumbers();
            attemptsOfPlayer2 = player2.getEnteredNumbers();
        } else {
            attemptsOfPlayer1 = Arrays.copyOf(player1.getEnteredNumbers(), attempt + 1);
            attemptsOfPlayer2 = Arrays.copyOf(player2.getEnteredNumbers(), attempt + 1);
        }
        for (int i : attemptsOfPlayer1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : attemptsOfPlayer2) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.fill(player1.getEnteredNumbers(), 0, attempt, 0);
        Arrays.fill(player2.getEnteredNumbers(), 0, attempt, 0);
    }

    private boolean guessed(Player player, int attempt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        int number = scanner.nextInt();
        player.setNumber(number, attempt);
        if (number < guessedNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (number > guessedNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, число угадано!");
            System.out.println("Игрок " + player.getName() + " угадал число " + guessedNumber + " с " + (attempt + 1) + " попытки");
            return true;
        }
        return false;
    }
}