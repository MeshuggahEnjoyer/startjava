public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера");
        byte cpuCoreAmount = 6;
        short ramCapacity = 16;
        int vramCapacity = 8;
        long vramFrequency = 14000;
        float gpuFrequency = 1.770F;
        double cpuCoreFrequency = 3.700;
        char motherBoardSerie = 'Z';
        boolean isDesktop = true;

        System.out.println("количество ядер: " + cpuCoreAmount);
        System.out.println("объем ОЗУ: " + ramCapacity);
        System.out.println("объем памяти видеокарты: " + vramCapacity);
        System.out.println("частота памяти видеокарты: " + vramFrequency);
        System.out.println("частота графического процессора: " + gpuFrequency);
        System.out.println("частота ядра процессора: " + cpuCoreFrequency);
        System.out.println("линейка материнской платы: " + motherBoardSerie);
        System.out.println("стационарный компьютер?: " + isDesktop);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        float penPrice = 100.0F;
        float bookPrice = 200.0F;
        float fullPrice = penPrice + bookPrice;
        float discountFullPrice = fullPrice * 0.89F;
        float discountSum = fullPrice - discountFullPrice;

        System.out.println("общая стоимость без скидки: " + fullPrice);
        System.out.println("сумма скидки: " + discountSum);
        System.out.println("общая стоимость со скидкой: " + discountFullPrice);

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte maxByte = 127;

        System.out.println("Byte:");
        System.out.println("Первоначальное значение: " + maxByte);
        System.out.println("После инкремента: " + ++maxByte);
        System.out.println("После декремента: " + --maxByte);

        short maxShort = 32_767;

        System.out.println("Short:");
        System.out.println("Первоначальное значение: " + maxShort);
        System.out.println("После инкремента: " + ++maxShort);
        System.out.println("После декремента: " + --maxShort);

        int maxInteger = 2_147_483_647;

        System.out.println("Integer:");
        System.out.println("Первоначальное значение: " + maxInteger);
        System.out.println("После инкремента: " + ++maxInteger);
        System.out.println("После декремента: " + --maxInteger);

        long maxLong = 9_223_372_036_854_775_807L;

        System.out.println("Long:");
        System.out.println("Первоначальное значение: " + maxLong);
        System.out.println("После инкремента: " + ++maxLong);
        System.out.println("После декремента: " + --maxLong);

        System.out.println("\n5.Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;

        System.out.println("С помощью третьей переменной");
        System.out.printf("исходные значения: num1 = %d, num2 = %d%n", num1, num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.printf("новые значения: num1 = %d, num2 = %d%n", num1, num2);

        System.out.println("С помощью арифметических операций");
        System.out.printf("исходные значения: num1 = %d, num2 = %d%n", num1, num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.printf("новые значения: num1 = %d, num2 = %d%n", num1, num2);

        System.out.println("С помощью побитовой операции ^");
        System.out.printf("исходные значения: num1 = %d, num2 = %d%n", num1, num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.printf("новые значения: num1 = %d, num2 = %d%n", num1, num2);

        System.out.println("\n6.Вывод символов и их кодов");
        char dollar = '$';

        System.out.printf("код символа: %d, соответствующий символ: %c%n", 
                (int) dollar, dollar);

        char asterisk = '*';

        System.out.printf("код символа: %d, соответствующий символ: %c%n", 
                (int) asterisk, asterisk);

        char at = '@';

        System.out.printf("код символа: %d, соответствующий символ: %c%n", 
                (int) at, at);

        char pipe = '|';

        System.out.printf("код символа: %d, соответствующий символ: %c%n", 
                (int) pipe, pipe);

        char tilde = '~';
        
        System.out.printf("код символа: %d, соответствующий символ: %c%n", 
                (int) tilde, tilde);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char bracketLeft = '(';
        char bracketRight = ')';
        char underscore = '_';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + bracketLeft + " "
                + bracketRight + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore
                + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sumOfDigits = hundreds + tens + ones;
        int multiplicationOfDigits = hundreds * tens * ones;

        System.out.printf("Число %d содержит :%n  сотен - %d%n  десятков - %d%n  единиц - %d%n" +
                "Сумма цифр = %d%nПроизведение = %d%n",
                number, hundreds, tens, ones, sumOfDigits, multiplicationOfDigits);

        System.out.println("\n9.Вывод времени");
        int timeInSeconds = 86399;
        int hh = timeInSeconds / 3600;
        int mm = (timeInSeconds % 3600) / 60;
        int ss = timeInSeconds % 60;

        System.out.printf("%d секунд в формате ЧЧ:ММ:СС %d:%d:%d",
                timeInSeconds, hh, mm, ss);
    }
}