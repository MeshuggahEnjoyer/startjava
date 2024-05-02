package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        calculateFactorial();
        resetArrayElements();
        printLadderOfChars();
        fillWithRandomNumbers();
        hangMan();
    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        int length = numbers.length;

        System.out.print("До реверса: ");
        print(numbers);

        for (int i = 0; i < length; i++) {
            length--;
            int swap = numbers[i];
            numbers[i] = numbers[length];
            numbers[length] = swap;
        }

        System.out.print("\nПосле реверса: ");
        print(numbers);
        System.out.println();
    }

    private static void calculateFactorial() {
        System.out.println("\n2.Вычисление факториала");
        int[] multipliers = new int[10];
        int length = multipliers.length;

        // Заполнение массива
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }

        int factorial = 1;
        String resultOutput = "1";
        for (int i = 2; i <= length - 2; i++) {
            factorial *= i;
            resultOutput += (i != length - 2) ? (" * " + i) : (" * " + i + " = " + factorial);
        }
        System.out.println(resultOutput);
    }

    private static void resetArrayElements() {
        System.out.println("\n3.Удаление элементов массива");
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
        char[] chars = new char[26];
        char currentChar = 65;

        // Заполнение массива
        for (int i = 0; i < chars.length; i++) {
            chars[i] = currentChar;
            currentChar++;
        }

        // Вывод лесенки
        int currentRow = 0;
        int lastCharacterIndex = chars.length - 1;
        while (currentRow < 26) {
            for (int i = lastCharacterIndex; i >= (lastCharacterIndex - currentRow); i--) {
                System.out.printf("%s", chars[i]);
            }
            currentRow++;
            System.out.println();
        }
    }

    private static void fillWithRandomNumbers() {
        System.out.println("\n5.Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;

        // Заполнение массива
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
        // Вывод массива
        Arrays.sort(uniqueNumbers);
        print(uniqueNumbers);
    }

    private static void hangMan() {
        System.out.println("\n6.Игра “Виселица”");
        String[] words = {"Шахматы", "Игра", "Виселица", "Массив", "Геймпад"};
        String wordToGuess = words[(int) (Math.random() * 5)];
        char[] wordAsArray = wordToGuess.toCharArray();
        char[] mask = new char[wordAsArray.length];

        // заполняем маску
        Arrays.fill(mask, '_');
        print(mask);

        // стартуем игру
        int attempts = 5;
        boolean gameFinished = false;
        char[] wrongletters = new char[20];
        do {
            Scanner scanner = new Scanner(System.in);
            boolean isWrongGuess = true;

            System.out.print("\nВведите букву: ");
            char guessedLetter = scanner.next().toCharArray()[0];

            // если буква верная - заносим в маску
            for (int i = 0; i < wordAsArray.length; i++) {
                if (Character.toLowerCase(wordAsArray[i]) == Character.toLowerCase(guessedLetter)) {
                    mask[i] = Character.toUpperCase(guessedLetter);
                    isWrongGuess = false;
                }
            }
            print(mask);

            if (isWrongGuess) {
                // Записываем ошибочную букву в соотв. массив
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
            print(wrongletters);
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
                break;
            case 3:
                System.out.println("__________");
                System.out.println("        |");
                System.out.println("        O");
                System.out.println("        |  ");
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
