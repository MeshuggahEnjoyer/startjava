package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public float calculate(int a, int b, char sign) {
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return (float) a / b;
            case '^':
                int result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                return result;
            case '%':
                return a % b;
            default:
                System.out.println("Неизвестный оператор");
                return 0;
        }
    }
}