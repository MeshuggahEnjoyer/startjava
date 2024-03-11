public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера");
        byte cpuCoreAmount = 6;
        System.out.println("количество ядер: " + cpuCoreAmount);
        short ramCapacity = 16;
        System.out.println("объем ОЗУ (Gb): " + ramCapacity);
        int gpuRamCapacity = 8;
        System.out.println("объем памяти видеокарты (Gb): " + gpuRamCapacity);
        long gpuRamFrequency = 14000;
        System.out.println("частота памяти видеокарты (MHz): " + gpuRamFrequency);
        float gpuFrequency = 1.770F;
        System.out.println("частота графического процессора (GHz): " + gpuFrequency);
        double cpuCoreFrequency = 3.700;
        System.out.println("частота ядра процессора (GHz): " + cpuCoreFrequency);
        char motherBoardSerie = 'Z';
        System.out.println("линейка материнской платы: " + motherBoardSerie);
        boolean isDesktop = true;
        System.out.println("стационарный компьютер?: " + isDesktop);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        float penPrice = 100.0F;
        float bookPrice = 200.0F;
        float fullPrice = penPrice + bookPrice;
        float discountFullPrice = fullPrice * 0.89F;
        float discountSum = fullPrice - discountFullPrice;
        System.out.println("общая стоимость товаров без скидки: " + fullPrice);
        System.out.println("сумма скидки: " + discountSum);
        System.out.println("общая стоимость товаров со скидкой: " + discountFullPrice);

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte maxByteValue = 127;
        System.out.println("Byte. Первоначальное значение: " + maxByteValue);
        System.out.println("Byte. значение после инкремента на единицу: " + ++maxByteValue);
        System.out.println("Byte. значение после декремента на единицу: " + --maxByteValue);
        short maxShortValue = 32_767;
        System.out.println("Short. Первоначальное значение: " + maxShortValue);
        System.out.println("Short. значение после инкремента на единицу: " + ++maxShortValue);
        System.out.println("Short. значение после декремента на единицу: " + --maxShortValue);
        int maxIntegerValue = 2_147_483_647;
        System.out.println("Integer. Первоначальное значение: " + maxIntegerValue);
        System.out.println("Integer. значение после инкремента на единицу: " + ++maxIntegerValue);
        System.out.println("Integer. значение после декремента на единицу: " + --maxIntegerValue);
        long maxLongValue = 9_223_372_036_854_775_807L;
        System.out.println("Long. Первоначальное значение: " + maxLongValue);
        System.out.println("Long. значение после инкремента на единицу: " + ++maxLongValue);
        System.out.println("Long. значение после декремента на единицу: " + --maxLongValue);

        System.out.println("\n5.Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.printf("исходные значения переменных: num1 = %d, num2 = %d%n", num1, num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.printf("новые значения переменных: num1 = %d, num2 = %d%n", num1, num2);
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.printf("исходные значения переменных: num1 = %d, num2 = %d%n", num1, num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.printf("новые значения переменных: num1 = %d, num2 = %d%n", num1, num2);
        System.out.println("Перестановка с помощью побитовой операции ^");
        System.out.printf("новые значения переменных: num1 = %d, num2 = %d%n", num1, num2);
        num1 = (num1 ^ num2);
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.printf("новые значения переменных: num1 = %d, num2 = %d%n", num1, num2);

        System.out.println("\n6.Вывод символов и их кодов");
        char char1 = '$';
        System.out.printf("код символа : %d, соответствующий коду символ: %c%n", 
                (int) char1, char1);
        char char2 = '*';
        System.out.printf("код символа : %d, соответствующий коду символ: %c%n", 
                (int) char2, char2);
        char char3 = '@';
        System.out.printf("код символа : %d, соответствующий коду символ: %c%n", 
                (int) char3, char3);
        char char4 = '|';
        System.out.printf("код символа : %d, соответствующий коду символ: %c%n", 
                (int) char4, char4);
        char char5 = '~';
        System.out.printf("код символа : %d, соответствующий коду символ: %c%n", 
                (int) char5, char5);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char bracketLeft = '(';
        char bracketRight = ')';
        char underscore = '_';
        System.out.println("    " + slash + backSlash + "    ");
        System.out.println("   " + slash + "  " + backSlash + "   ");
        System.out.println("  " + slash + underscore + bracketLeft + " "
                + bracketRight + backSlash + "  ");
        System.out.println(" " + slash + "      " + backSlash + " ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore
                + slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sumOfDigits = hundreds + tens + ones;
        int multiplicationOfDigits = hundreds * tens * ones;
        System.out.printf("Число %d содержит :%n  сотен - %d%n  десятков - %d%n  единиц - %d%n" +
                "Сумма его цифр = %d%nПроизведение = %d%n",
                number, hundreds, tens, ones, sumOfDigits, multiplicationOfDigits);

        System.out.println("\n9.Вывод времени");
        int timeInSeconds = 86399;
        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds % 3600) / 60;
        int seconds = (timeInSeconds % 3600) % 60;
        System.out.printf("%d секунд в формате ЧЧ:ММ:СС %d:%d:%d",
                timeInSeconds, hours, minutes, seconds);
    }
}