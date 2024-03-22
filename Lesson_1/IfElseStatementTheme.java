public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("пол: женский");
        } else {
            System.out.println("пол: мужской");
        }

        int age = 29;
        if (age >= 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("несовершеннолетний");
        }

        float height = 1.8F;
        if (height > 1.8) {
            System.out.println("великан");
        } else {
            System.out.println("коротышка");
        }

        char firstLetterOfName = "Alex".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается на M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Имя начинается на " + firstLetterOfName);
        }

        System.out.println("\n2.Поиск большего числа");
        int num1 = 7;
        int num2 = 4;

        if (num1 > num2) {
            System.out.printf("%d больше %d%n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("%d больше %d%n", num2, num1);
        } else {
            System.out.printf("числа %d и %d равны%n", num1, num2);
        }

        System.out.println("\n3.Проверка числа");
        int num3 = -7;
        String resultOutput = "Число " + num3 + " является";

        if (num3 == 0) {
            System.out.println("Число равно 0");
        } else {
            if (num3 % 2 == 0) {
                resultOutput += " четным";
            } else {
                resultOutput += " нечетным";
            }
            if (num3 < 0) {
                resultOutput += " отрицательным";
            } else {
                resultOutput += " положительным";
            }
            System.out.println(resultOutput);
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num4 = 123;
        int num5 = 223;
        boolean isEqualHundreds = num4 / 100 == num5 / 100;
        boolean isEqualTens = (num4 / 10) % 10 == (num5 / 10) % 10;
        boolean isEqualOnes = num4 % 10 == num5 % 10;
        boolean hasEqualDigits = isEqualHundreds || isEqualTens || isEqualOnes;
        String equalDigits = "";
        String placeOfDigits = "";

        if (hasEqualDigits) {
            if (isEqualOnes) {
                equalDigits += num4 % 10 + " ";
                placeOfDigits += "1 ";
            }
            if (isEqualTens) {
                equalDigits += ((num4 / 10) % 10) + " ";
                placeOfDigits += "2 ";
            }
            if (isEqualHundreds) {
                equalDigits += num4 / 100 + " ";
                placeOfDigits += "3 ";
            }
            System.out.printf("Исходные числа :%d и %d%n", num4, num5);
            System.out.println("Одинаковые в них цифры: " + equalDigits);
            System.out.println("Номера разрядов: " + placeOfDigits);
        } else {
            System.out.println("Нет одинаковых цифр в соответствующих разрядах");
        }

        System.out.println("\n5.Определение символа по его коду");
        char char1 = '\u0057';
        boolean isDigit = (char1 >= '0') && (char1 <= '9');
        boolean isUpperLetter = (char1 >= 'A') && (char1 <= 'Z');
        boolean isLowerLetter = (char1 >= 'a') && (char1 <= 'z');

        System.out.printf("Символ %c является ", char1);
        if (isDigit) {
            System.out.println("цифрой");
        } else if (isUpperLetter) {
            System.out.println("большой буквой");
        } else if (isLowerLetter) {
            System.out.println("маленькой буквой");
        } else {
            System.out.println("не буквой и не цифрой");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 301_000;
        int rate = 10;

        if (depositAmount < 300_000) {
            if (depositAmount < 100_000) {
                rate = 5;
            } else {
                rate = 7;
            }
        }

        float rateAmount = depositAmount * (rate / 100F);
        float depositAmountWithRate = depositAmount + rateAmount;
        System.out.printf("Сумма вклада: %d%nСумма начисленного %%: %.2f%n" +
                "Итоговая сумма с %%: %.2f%n",
                depositAmount, rateAmount, depositAmountWithRate);

        System.out.println("\n7.Определение оценки по предметам");
        int historyGradePercent = 59;
        int historyGrade = 2;

        if (historyGradePercent > 91) {
            historyGrade = 5;
        } else if (historyGradePercent > 73) {
            historyGrade = 4;
        } else if (historyGradePercent > 60) {
            historyGrade = 3;
        }

        int csGradePercent = 92;
        int csGrade = 2;

        if (csGradePercent > 91) {
            csGrade = 5;
        } else if (csGradePercent > 73) {
            csGrade = 4;
        } else if (csGradePercent > 60) {
            csGrade = 3;
        }

        float avgGrade = (historyGrade + csGrade) / 2F;
        float avgGradePercent = (historyGradePercent + csGradePercent) / 2F;
        System.out.printf("Информатика: %d, %d%%%nИстория: %d, %d%%%n" +
                "Средний балл по предметам: %.1f%nСредний %% по предметам: %.1f%n",
                csGrade, csGradePercent, historyGrade, historyGradePercent,
                avgGrade, avgGradePercent);

        System.out.println("\n8.Расчет годовой прибыли");
        int monthlyReceipts = 13_000;
        int monthlyRent = 5000;
        int monthlyProductionCost = 9000;
        int annualIncome = (monthlyReceipts - (monthlyRent + monthlyProductionCost)) * 12;
        
        if (annualIncome > 0) {
            System.out.printf("Прибыль за год: +%d руб.", annualIncome);
        } else {
            System.out.printf("Прибыль за год: %d руб.", annualIncome);
        }
    }
}