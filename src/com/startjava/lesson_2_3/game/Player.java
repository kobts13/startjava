package com.startjava.lesson_2_3.game;

public class Player {
    private final String name;
    private int number;

    private final int[] enteredNumbers;

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[10];
    }

    public void setNumber(int number, int index) {
        this.number = number;
        enteredNumbers[index] = number;
    }

    public String getName() {
        return name;
    }
}