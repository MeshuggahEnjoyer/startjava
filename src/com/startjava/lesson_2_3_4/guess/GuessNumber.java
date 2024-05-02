package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int numberToGuess;
    private int startRange = 1;
    private int endRange = 100;
    
    public GuessNumber(Player player1, Player player2) {
        Random r = new Random();
        numberToGuess = r.nextInt(startRange, endRange);

        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Player currentPlayer = player1;
        boolean isGameFinished;
        
        do {
            makeNextGuess(currentPlayer);
            isGameFinished = isGuessed(currentPlayer);
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        } while (!isGameFinished);
    }

    private void makeNextGuess(Player player) {
        Scanner scanner = new Scanner(System.in);
        int playerGuess = 0;

        do {
            System.out.printf("Введите число в диапазоне %d-%d: ", startRange, endRange);
            playerGuess = scanner.nextInt();
            player.setNumber(playerGuess);
        } while (!(playerGuess > 0 && playerGuess <= 100));
    }

    public boolean isGuessed(Player currentPlayer) {
        int playerGuess = currentPlayer.getNumber();

        if (playerGuess == numberToGuess) {
            System.out.printf("%s, Вы победили! Загаданное число: %d%n%n",
                    currentPlayer.getName(), playerGuess);
            return true;
        }

        if (playerGuess < numberToGuess) {
            System.out.printf("%s, число %d меньше того, что загадал компьютер%n",
                    currentPlayer.getName(), playerGuess);
        } else if (playerGuess > numberToGuess) {
            System.out.printf("%s, число %d больше того, что загадал компьютер%n",
                    currentPlayer.getName(), playerGuess);
        }

        return false;
    }
}