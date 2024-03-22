public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int rangeStart = -10;
        int rangeEnd = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        int rangeStartCopy = rangeStart;
        do {
            if (rangeStartCopy % 2 == 0) {
                sumEvenNumbers += rangeStartCopy;
            } else {
                sumOddNumbers += rangeStartCopy;
            }
            rangeStartCopy++;
        } while (rangeStartCopy <= rangeEnd);

        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n",
                rangeStart, rangeEnd, sumEvenNumbers, sumOddNumbers);

        System.out.println("\n2.Вывод чисел в порядке убывания");
        int num1 = 5;
        int num2 = 10;
        int num3 = -1;

        int min = num1;
        if (num2 < num1 && num2 < num3) {
            min = num2;
        } else if (num3 < num1 && num3 < num2) {
            min = num3;
        }

        int max = num1;
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }

        System.out.printf("min: %d, max: %d%n", min, max);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sumOfDigits = 0;

        int reversedNum4 = 0;
        while (num4 > 0) {
            reversedNum4 = (reversedNum4 * 10) + (num4 % 10);
            sumOfDigits += num4 % 10;
            num4 /= 10;
        }

        System.out.printf("исходное число в обратном порядке: %d%n", reversedNum4);
        System.out.printf("сумма цифр: %d%n", sumOfDigits);

        System.out.println("\n4.Вывод чисел в несколько строк");
        int startRange = 1;
        int endRange = 24;
        int colCounter = 0;

        for (int i = startRange; i < endRange; i++) {
            if (i % 2 > 0) {
                System.out.printf("%5d", i);
                colCounter++;
            }
            if (colCounter % 5 == 0) {
                System.out.println();
            }
        }

        if (colCounter % 5 > 0) {
            while (colCounter % 5 > 0) {
                System.out.printf("%5d", 0);
                colCounter++;
            }
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность");
        int num5 = 3_242_592;
        int amountOfTwos = 0;

        int num5Copy = num5;
        while (num5Copy > 0) {
            if (num5Copy % 10 == 2) {
                amountOfTwos++;
            }
            num5Copy /= 10;
        }

        if (amountOfTwos % 2 == 0) {
            System.out.printf("В %d четное количество двоек - %d%n", num5, amountOfTwos);
        } else {
            System.out.printf("В %d нечетное количество двоек - %d%n", num5, amountOfTwos);
        }
        
        System.out.println("\n6.Отображение геометрических фигур");
        //Прямоугольник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Прямоугольный треугольник
        int rowCounter = 0;
        colCounter = 0;
        while (rowCounter < 5) {
            colCounter = rowCounter;

            while (colCounter < 5) {
                System.out.print("#");
                colCounter++;
            }

            rowCounter++;
            System.out.println();
        }
        System.out.println();

        //Треугольник
        rowCounter = 0;
        do {
            if (rowCounter < 2) {
                colCounter = 4 - rowCounter;
            } else {
                colCounter = rowCounter;
            }

            do {
                System.out.print("$");
                colCounter++;
            } while (colCounter < 5);

            rowCounter++;
            System.out.println();
        } while (rowCounter < 5);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%-8s %-10s %-12s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        char currentChar = 0;
        for (int i = 33; i < 123; i++) {
            if (i >= 48 && i <= 96) {
                continue;
            } else if ((i < 48 && i % 2 != 0) || (i > 96 && i % 2 == 0)) {
                currentChar = (char) i;
                System.out.printf("%4d %9c           %-25s%n",
                    (int) currentChar, currentChar, Character.getName(currentChar));
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int num6 = 1234321;
        int numOfDigits = 0;

        //Кол-во цифр в исходном числе
        int num6Copy = num6;
        while (num6Copy > 0) {
            num6Copy /= 10;
            numOfDigits++;
        }

        num6Copy = num6;
        int tmp = 0;
        int powOfTen = 0;
        int lastDigit = 0;
        int firstDigit = 0;
        boolean isPalyndrome = true;

        while (numOfDigits > 1) {
            //Получение последней цифры
            lastDigit = num6Copy % 10;

            //Получение первой цифры 
            tmp = num6Copy;
            while (tmp > 0) {
                firstDigit = tmp;
                tmp /= 10;
            }

            //Если 1-я и последняя цифры равны
            if (lastDigit == firstDigit) {
                //получаем 10 в нужной степени
                powOfTen = 1;
                for (int i = 1; i <= (numOfDigits -1); i++) {
                    powOfTen *= 10;
                }
                //и обрезаем цифры
                num6Copy = (num6Copy % powOfTen) / 10;
                numOfDigits -= 2;
            } else {
                isPalyndrome = false;
                break;
            }
        }

        if (isPalyndrome) {
            System.out.printf("число %d является палиндромом%n", num6);
        } else {
            System.out.printf("число %d не является палиндромом%n", num6);
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        int num7 = 123222;
        int leftSum = 0;
        int rightSum = 0;

        int num7Copy = num7;
        for (int i = 0; i < 3; i++) {
            rightSum += num7Copy % 10;
            num7Copy /= 10;
        }

        for (int i = 0; i < 3; i++) {
            leftSum += num7Copy % 10;
            num7Copy /= 10;
        }

        if (leftSum == rightSum) {
            System.out.printf("Число %d является счастливым%n" +
                    "Сумма цифр %d = %d, сумма цифр %d = %d%n", 
                    num7, num7 / 1000, leftSum, num7 % 1000, rightSum);
        } else {
            System.out.printf("Число %d не является счастливым%n" +
                    "Сумма цифр %d = %d, сумма цифр %d = %d%n", 
                    num7, num7 / 1000, leftSum, num7 % 1000, rightSum);
        }

        System.out.println("\n10.Отображение таблицы умножения Пифагора");
        System.out.printf("%n%23S%n", "таблица пифагора");
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 && j == 1) {
                    System.out.printf("    |");
                } else if (i == 1 && j == 9) {
                    System.out.printf("%3d%n", i * j);
                    System.out.printf("%S", "-----------------------------");
                } else if (j == 1) {
                    System.out.printf("%3d |", i * j);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}