package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTheme {
    public static void main(String[] args) throws InterruptedException {
        reverseArray();
        calculateFactorial();
        resetArrayElements();
        printLadderOfChars();
        fillArrayUniqueNumbers();
        hangmanGame();
        typewriter();
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
        for (int i = 1; i < length - 1; i++) {
            factorial *= multipliers[i];
            System.out.print(multipliers[i]);
            System.out.print((multipliers[i] != length - 2) ? (" * ") : " = " + factorial);
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
        int resettedNumbersAmount = 0;
        for (int i = 0; i < length; i++) {
            if (randomDoubles[i] > middleNumber) {
                randomDoubles[i] = 0;
                resettedNumbersAmount++;
            }
        }

        System.out.println();
        print(randomDoubles);
        System.out.printf("Количество обнуленных ячеек: %s%n", resettedNumbersAmount);
    }

    private static void printLadderOfChars() {
        System.out.println("\n4.Вывод алфавита лесенкой");
        char[] alphabet = new char[26];

        // Заполнение массива
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        // Вывод лесенки
        int lastCharacterIndex = alphabet.length - 1;
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = lastCharacterIndex; j >= (lastCharacterIndex - i); j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void fillArrayUniqueNumbers() {
        System.out.println("\n5.Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;

        // Заполнение массива
        for (int i = 0; i < length; i++) {
            boolean isUnique;
            do {
                isUnique = true;
                int randomNumber = 60 + (int) (Math.random() * 40);

                for (int j = 0; j < i; j++) {
                    if (randomNumber == uniqueNumbers[j]) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    uniqueNumbers[i] = randomNumber;
                }
            } while (!isUnique);
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

        String[] gallows = {
                "__________",
                "        |",
                "        O",
                "       /|\\ ",
                "        |",
                "       / \\ "};

        int attemptsLeft = gallows.length;
        boolean gameFinished = false;
        StringBuilder wrongletters = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        do {
            boolean isWrongGuess = true;

            print(mask);
            System.out.printf("Осталось попыток: %d%n", attemptsLeft);
            System.out.print("Введите букву: ");
            char guessedLetter = Character.toUpperCase(scanner.next().charAt(0));

            // если буква отсутствует в маске
            if (String.valueOf(mask).indexOf(guessedLetter) == -1) {
                for (int i = 0; i < wordAsArray.length; i++) {
                    // если буква верная - заносим в маску
                    if (wordAsArray[i] == guessedLetter) {
                        isWrongGuess = false;
                        mask[i] = guessedLetter;
                    }
                }
            }

            // если ошибочная - записываем в wrongletters
            if (isWrongGuess) {
                if (wrongletters.indexOf(String.valueOf(guessedLetter)) == -1) {
                    wrongletters.append(guessedLetter).append(" ");
                    attemptsLeft--;
                }
            } else if (attemptsLeft < gallows.length) {
                attemptsLeft++;
            }

            System.out.print("Ошибочные буквы: ");
            System.out.println(wrongletters);

            // вывод виселицы
            for (int i = 0; i < gallows.length - attemptsLeft; i++) {
                System.out.println(gallows[i]);
            }
            System.out.println();

            gameFinished = wordToGuess.equals(String.valueOf(mask));
        } while (attemptsLeft != 0 && !gameFinished);

        if (attemptsLeft == 0) {
            System.out.println("YOU DIED");
            System.out.printf("Загаданное слово: %s", wordToGuess);
        } else if (gameFinished) {
            System.out.println("YOU WON");
        }
    }

    private static void typewriter() throws InterruptedException {
        System.out.println("\n7.Вывод текста с эффектом пишущей машинки");
        String text = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling";
        String text1 = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin";
        String textOnlyLetters = text.replaceAll("[^a-zA-Zа-яА-Я+]"," ");;
        String[] words = textOnlyLetters.split(" ");

        // Определяем самое короткое/длинное слова
        String shortestWord = words[0];
        String longestWord = words[0];
        for (String word : words) {
            if (word.isBlank()) {
                continue;
            }
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            } else if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Если самое короткое слово - это одна буква, то возникают проблемы при использовании IndexOf
        // другого решения я не придумал
        int shortestWordStartIndex = 0;
        int fromIndex = 0;
        boolean isWordFound = false;
        while (!isWordFound) {
            // ищем слово в строке
            shortestWordStartIndex = text.indexOf(shortestWord, fromIndex);
            // Если слева от искомой подстроки(или символа) - пробел, а после нее НЕ буква, то подстрока - слово
            if (!Character.isLetter(text.toCharArray()[shortestWordStartIndex + shortestWord.length()]) && text.toCharArray()[shortestWordStartIndex - 1] == ' ') {
                isWordFound = true;
            } else {
                // иначе, меняем fromIndex и ищем снова
                fromIndex = ++shortestWordStartIndex;
            }
        }

        int longestWordStartIndex = text.indexOf(longestWord);
        for (int i = 0; i < text.toCharArray().length; i++) {
            // если в строке короткое слово расположено перед длинным
            if (longestWordStartIndex - shortestWordStartIndex > 0) {
                //то от начала короткого слова до конца длинного печатаем UpperCase'ом
                if (i >= shortestWordStartIndex && i <= longestWordStartIndex + longestWord.length()) {
                    System.out.print(Character.toUpperCase(text.toCharArray()[i]));
                    Thread.sleep(50);
                    continue;
                }
            } else {
                if (i >= longestWordStartIndex && i <= shortestWordStartIndex + shortestWord.length()) {
                    System.out.print(Character.toUpperCase(text.toCharArray()[i]));
                    Thread.sleep(50);
                    continue;
                }
            }
            System.out.print(text.toCharArray()[i]);
            Thread.sleep(50);
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
