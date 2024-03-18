public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java\n");
        boolean isMale = true;
        int age = 29;
        float height = 1.8F;
        String firstName = "Alex";
        char firstLetterOfName = firstName.charAt(0);

        if (!isMale) {
            System.out.println("пол: женский");
        } else {
            System.out.println("пол: мужской");
        }
        if (age >= 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("несовершеннолетний");
        }
        if (height > 1.8) {
            System.out.println("великан");
        } else {
            System.out.println("коротышка");
        }
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается на M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Имя начинается на " + firstLetterOfName);
        }

        System.out.println("\n2.Поиск большего числа\n");
        int num1 = 7;
        int num2 = 4;

        if (num1 > num2) {
            System.out.printf("%d больше %d%n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("%d больше %d%n", num2, num1);
        } else {
            System.out.printf("числа %d и %d равны%n", num1, num2);
        }

        System.out.println("\n3.Проверка числа\n");
        int number = -7;
        boolean isZero = number == 0;
        boolean isEvenNumber = number % 2 == 0;
        boolean isNegativeNumber = number < 0;
        String resultOutput = "Число " + number + " является";

        if (isZero) {
            System.out.println("Число равно 0");
        } else {
            if (isEvenNumber) {
                resultOutput += " четным";
            } else {
                resultOutput += " нечетным";
            }
            if (isNegativeNumber) {
                resultOutput += " отрицательным";
            } else {
                resultOutput += " положительным";
            }
            System.out.println(resultOutput);
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах\n");
        int num3 = 123;
        int num4 = 223;
        boolean isHundredsEqual = num3 / 100 == num4 / 100;
        boolean isTensEqual = (num3 / 10) % 10 == (num4 / 10) % 10;
        boolean isOnesEqual = num3 % 10 == num4 % 10;
        boolean hasEqualDigits = isHundredsEqual | isTensEqual | isOnesEqual;
        String equalDigits = "";
        String placeOfDigits = "";

        if (hasEqualDigits) {
            if (isOnesEqual) {
                equalDigits += num3 % 10 + " ";
                placeOfDigits += "1 ";
            }
            if (isTensEqual) {
                equalDigits += ((num3 / 10) % 10) + " ";
                placeOfDigits += "2 ";
            }
            if (isHundredsEqual) {
                equalDigits += num3 / 100 + " ";
                placeOfDigits += "3 ";
            }
            System.out.printf("Исходные числа :%d и %d%n", num3, num4);
            System.out.println("Одинаковые в них цифры: " + equalDigits);
            System.out.println("Номера разрядов: " + placeOfDigits);
        } else {
            System.out.println("Нет одинаковых цифр в соответствующих разрядах");
        }

        System.out.println("\n5.Определение символа по его коду\n");
        char char1 = '\u0057';
        boolean isDigit = (char1 > '/') & (char1 < ':');
        boolean isUpperLetter = (char1 > '@') & (char1 < '[');
        boolean isLowerLetter = (char1 > '`') & (char1 < '{');

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

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %\n");
        int depositAmount = 301_000;
        int depositPercent = 0;

        if (depositAmount < 300_000) {
            if (depositAmount < 100_000) {
                depositPercent = 5;
            } else {
                depositPercent = 7;
            }
        } else {
            depositPercent = 10;
        }

        float percentAmount = depositAmount * ((float) depositPercent / 100);
        float depositAmountWithPercent = depositAmount + percentAmount;
        System.out.printf("Сумма вклада: %d%nСумма начисленного %%: %.2f%n" +
                "Итоговая сумма с %%: %.2f%n",
                depositAmount, percentAmount, depositAmountWithPercent);

        System.out.println("\n7.Определение оценки по предметам\n");
        int historyGradePercent = 59;
        int informaticsGradePercent = 92;
        int historyGrade = 0;
        int informaticsGrade = 0;

        if (historyGradePercent > 91) {
            historyGrade = 5;
        } else if (historyGradePercent > 73) {
            historyGrade = 4;
        } else if (historyGradePercent > 60) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        }
        if (informaticsGradePercent > 91) {
            informaticsGrade = 5;
        } else if (informaticsGradePercent > 73) {
            informaticsGrade = 4;
        } else if (informaticsGradePercent > 60) {
            informaticsGrade = 3;
        } else {
            informaticsGrade = 2;
        }

        float averageGrade = (float) (historyGrade + informaticsGrade) / 2;
        float averageGradePercent = (float) (historyGradePercent + informaticsGradePercent) / 2;
        System.out.printf("Информатика: %d, %d%%%nИстория: %d, %d%%%n" +
                "Средний балл по предметам: %.1f%nСредний %% по предметам: %.1f%n",
                informaticsGrade, informaticsGradePercent, historyGrade, historyGradePercent,
                averageGrade, averageGradePercent);

        System.out.println("\n8.Расчет годовой прибыли\n");
        int monthlyReceipts = 13_000;
        int monthlyRent = 5000;
        int monthlyProductionCost = 9000;
        int monthlyExpenses = monthlyRent + monthlyProductionCost;
        int monthlyIncome = monthlyReceipts - monthlyExpenses;
        int annualIncome = monthlyIncome * 12;
        
        if (annualIncome > 0) {
            System.out.printf("Прибыль за год: +%d руб.", annualIncome);
        } else {
            System.out.printf("Прибыль за год: %d руб.", annualIncome);
        }
    }
}