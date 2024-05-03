package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        calculateFactorial();
        resetArrayElements();
        printLadderOfChars();
        fillArrayUniqueNumbers();
        hangmanGame();
    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        int length = numbers.length;

        System.out.print("До реверса: ");
        printWithBrackets(numbers);

        for (int i = 0; i < length; i++) {
            int swap = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = swap;
        }

        System.out.print("\nПосле реверса: ");
        printWithBrackets(numbers);
    }

    private static void printWithBrackets(int[] array) {
        System.out.print("[");
        print(array);
        System.out.print("]");
    }

    private static void calculateFactorial() {
        System.out.println("\n\n2.Вычисление факториала");
        int[] multipliers = new int[10];
        int length = multipliers.length;

        // Заполнение массива
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }

        int factorial = 1;
        System.out.print("1");
        for (int i = 2; i < length; i++) {
            factorial *= i - 1;
            System.out.print((i != length - 1) ? (" * " + i) : (" = " + factorial));
        }
    }

    private static void resetArrayElements() {
        System.out.println("\n\n3.Удаление элементов массива");
        double[] randomDoubles = new double[15];
        int length = randomDoubles.length;

        // Заполнение массива
        for (int i = 0; i < length; i++) {
            randomDoubles[i] = Math.random();
        }
        print(randomDoubles);

        // изменение элементов массива
        double middleNumber = randomDoubles[length / 2];
        int deletedNumbersAmount = 0;
        for (int i = 0; i < length; i++) {
            if (randomDoubles[i] > middleNumber) {
                randomDoubles[i] = 0;
                deletedNumbersAmount++;
            }
        }

        System.out.println();
        print(randomDoubles);
        System.out.printf("Количество обнуленных ячеек: %s%n", deletedNumbersAmount);
    }

    private static void printLadderOfChars() {
        System.out.println("\n4.Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int length = alphabet.length;

        // Заполнение массива
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        // Вывод лесенки
        int currentRow = 0;
        int lastCharacterIndex = alphabet.length - 1;
        while (currentRow < length) {
            for (int i = lastCharacterIndex; i >= (lastCharacterIndex - currentRow); i--) {
                System.out.printf("%s", alphabet[i]);
            }
            currentRow++;
            System.out.println();
        }
    }

    private static void fillArrayUniqueNumbers() {
        System.out.println("\n5.Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;

        // Заполнение массива
        for (int i = 0; i < length; i++) {
            boolean hasEqualNumber;
            do {
                hasEqualNumber = false;
                int randomInteger = 60 + (int) (Math.random() * 40);

                for (int j = 0; j < i; j++) {
                    if (randomInteger == uniqueNumbers[j]) {
                        hasEqualNumber = true;
                        break;
                    }
                }

                if (!hasEqualNumber) {
                    uniqueNumbers[i] = randomInteger;
                }
            } while (hasEqualNumber);
        }
        // Вывод массива
        Arrays.sort(uniqueNumbers);
        print(uniqueNumbers);
    }

    private static void hangmanGame() {
        System.out.println("\n6.Игра “Виселица”");
        String[] words = {"ШАХМАТЫ", "ИГРА", "ВИСЕЛИЦА", "МАССИВ", "ГЕЙМПАД"};
        String wordToGuess = words[(int) (Math.random() * words.length)];
        char[] wordAsArray = wordToGuess.toCharArray();
        char[] mask = new char[wordAsArray.length];
        Arrays.fill(mask, '_');

        // стартуем игру
        String[] gallows = new String[6];
        gallows[0] = "__________";
        gallows[1] = "        |";
        gallows[2] = "        O";
        gallows[3] = "       /|\\ ";
        gallows[4] = "        |";
        gallows[5] = "       / \\ ";

        int attemptsLeft = gallows.length;
        boolean gameFinished = false;
        String wrongletters = "";
        Scanner scanner = new Scanner(System.in);
        do {
            boolean isWrongGuess = true;

            print(mask);
            System.out.print("Введите букву: ");
            char guessedLetter = Character.toUpperCase(scanner.next().charAt(0));

            // если буква верная - заносим в маску
            for (int i = 0; i < wordAsArray.length; i++) {
                if (wordAsArray[i] == guessedLetter) {
                    mask[i] = guessedLetter;
                    isWrongGuess = false;
                }
            }

            if (isWrongGuess) {
                // Записываем ошибочную букву в wrongletters
                if (wrongletters.indexOf(guessedLetter) == -1) {
                    wrongletters += guessedLetter + " ";
                    attemptsLeft--;
                }
            } else if (attemptsLeft < gallows.length) {
                attemptsLeft++;
            }

            System.out.print("Ошибочные буквы: ");
            System.out.println(wrongletters);
            System.out.printf("Осталось попыток: %d%n", attemptsLeft);

            // вывод виселицы
            for (int i = 0; i < gallows.length - attemptsLeft; i++) {
                System.out.println(gallows[i]);
            }
            System.out.println();

            gameFinished = !Arrays.toString(mask).contains("_");
        } while (attemptsLeft != 0 && !gameFinished);

        if (attemptsLeft == 0) {
            System.out.println("YOU DIED");
            System.out.printf("Загаданное слово: %s", wordToGuess);
        } else if (gameFinished) {
            System.out.println("YOU WON");
        }
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%d", array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
            if ((i + 1) % 10 == 0) {
                System.out.printf("%n");
            }
        }
    }

    private static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%5.3f%n", array[i]);
            } else {
                System.out.printf("%5.3f, ", array[i]);
            }

            if (i == 7) {
                System.out.printf("%n");
            }
        }
    }

    private static void print(char[] array) {
        for (char c : array) {
            if (c != '\u0000') {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }
}
