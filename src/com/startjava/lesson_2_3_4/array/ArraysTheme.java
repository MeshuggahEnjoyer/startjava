package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        int length = numbers.length;

        System.out.print("До реверса: ");
        printIntArray(numbers);

        int tmp = 0;
        for (int i = 0; i < length / 2; i++) {
            tmp = numbers[i];
            numbers[i] = numbers[length - i - 1];
            numbers[length - i - 1] = tmp;
        }

        System.out.print("\nПосле реверса: ");
        printIntArray(numbers);

        System.out.println("\n\n2.Вычисление факториала");
        int[] numbersZeroToNine = new int[10];
        length = numbersZeroToNine.length;

        //Заполнение массива
        for (int i = 0; i < length; i++) {
            numbersZeroToNine[i] = i;
        }

        //Подсчет факториала
        int factorial = 1;
        for (int i = 2; i <= 8; i++) {
            factorial *= i;
        }

        //Вывод факториала
        for (int i = 1; i < length - 1; i++) {
            System.out.print(numbersZeroToNine[i] + (numbersZeroToNine[i] == 8 ? " = " + factorial : " * "));
        }

        System.out.println("\n\n3.Удаление элементов массива");
        double[] doubleNumbers = new double[15];
        length = doubleNumbers.length;

        //Заполнение массива
        for (int i = 0; i < length; i++) {
            doubleNumbers[i] = Math.random();
        }
        printDoubleArray(doubleNumbers);

        //изменение элементов массива
        double middleNumber = doubleNumbers[length / 2];
        for (int i = 0; i < length; i++) {
            if (doubleNumbers[i] <= middleNumber) {
                continue;
            }
            doubleNumbers[i] = 0;
        }
        printDoubleArray(doubleNumbers);

        System.out.println("\n4.Вывод алфавита лесенкой");
        char[][] charsLadder = new char[26][];
        length = charsLadder.length;

        //Заполнение массива
        for (int i = 0; i < length; i++) {
            charsLadder[i] = new char[i+1];
            char currentCharacter = 90;

            for (int j = 0; j < charsLadder[i].length; j++) {
                charsLadder[i][j] = currentCharacter--;
            }
        }

        //Вывод массива
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < charsLadder[i].length; j++) {
                System.out.print(charsLadder[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n5.Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        length = uniqueNumbers.length;

        //Заполнение массива
        for (int i = 0; i < length; i++) {
            boolean hasEqualNumber;
            do {
                hasEqualNumber = false;
                uniqueNumbers[i] = 60 + (int) (Math.random() * 40);

                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[i] == uniqueNumbers[j]) {
                        hasEqualNumber = true;
                        break;
                    }
                }
            } while (hasEqualNumber);

        }
        //Вывод массива
        Arrays.sort(uniqueNumbers);
        printIntArray(uniqueNumbers);

        System.out.println("\n6.Игра “Виселица”");
        String[] words = {"Шахматы", "Игра", "Виселица", "Массив", "Геймпад"};
        String wordToGuess = words[(int) (Math.random() * 5)];
        char[] wordAsArray = wordToGuess.toCharArray();
        char[] mask = new char[wordAsArray.length];

        //заполняем маску
        System.out.println(wordToGuess);
        Arrays.fill(mask, '_');
        printCharArray(mask);

        //стартуем игру
        int attempts = 5;
        boolean gameFinished = false;
        char[] wrongletters = new char[20];
        do {
            Scanner scanner = new Scanner(System.in);
            boolean isWrongGuess = true;

            System.out.print("\nВведите букву: ");
            char guessedLetter = scanner.next().toCharArray()[0];

            //если буква верная - заносим в маску
            for (int i = 0; i < wordAsArray.length; i++) {
                if (Character.toLowerCase(wordAsArray[i]) == Character.toLowerCase(guessedLetter)) {
                    mask[i] = Character.toUpperCase(guessedLetter);
                    isWrongGuess = false;
                }
            }
            printCharArray(mask);

            if (isWrongGuess) {
                //Записываем ошибочную букву в соотв. массив
                for (int i = 0; i < wrongletters.length; i++) {
                    if (wrongletters[i] == '\u0000') {
                        wrongletters[i] = Character.toUpperCase(guessedLetter);
                        attempts--;
                        break;
                    } else if (Character.toUpperCase(wrongletters[i]) == Character.toUpperCase(guessedLetter)) {
                        break;
                    }
                }
            } else if (attempts < 5) {
                    attempts++;
            }

            System.out.print("Ошибочные буквы: ");
            printCharArray(wrongletters);
            System.out.printf("Осталось попыток: %d%n", attempts);
            printGallows(attempts);
            gameFinished = !Arrays.toString(mask).contains("_");
        } while (attempts != 0 && !gameFinished);

        if (attempts == 0) {
            System.out.println("YOU DIED");
            System.out.printf("Загаданное слово: %s", wordToGuess);
        } else if (gameFinished) {
            System.out.println("YOU WON");
        }
    }

    private static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%d]", array[i]);
            } else if (i == 0) {
                System.out.printf("[%d, ", array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
            if ((i + 1) % 10 == 0) {
                System.out.printf("%n ");
            }
        }
    }

    private static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%5.3f]%n", array[i]);
            } else if (i == 0) {
                System.out.printf("[%5.3f, ", array[i]);
            } else {
                System.out.printf("%5.3f, ", array[i]);
            }

            if (i == 7) {
                System.out.printf("%n ");
            }
        }
    }

    private static void printCharArray(char[] array) {
        for (char c : array) {
            if (c != '\u0000') {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    private static void printGallows(int attempts) {
        switch (attempts) {
            case 0:
                System.out.println("__________");
                System.out.println("        |");
                System.out.println("        O");
                System.out.println("       /|\\ ");
                System.out.println("        |");
                System.out.println("       / \\ ");
                break;
            case 1:
                System.out.println("__________");
                System.out.println("        |");
                System.out.println("        O");
                System.out.println("       /|\\ ");
                System.out.println("        |");
                break;
            case 2:
                System.out.println("__________");
                System.out.println("        |");
                System.out.println("        O");
                System.out.println("       /|\\ ");
                System.out.println("        |");
                break;
            case 3:
                System.out.println("__________");
                System.out.println("        |");
                System.out.println("        O");
                System.out.println("       /|\\ ");
                break;
            case 4:
                System.out.println("__________");
                System.out.println("        |");
                System.out.println("        O");
                break;
            default:
                break;
        }
    }
}
