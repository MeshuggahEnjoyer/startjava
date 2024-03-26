public class Calculator {
    public static void main(String[] args) {
        char sign = '/';
        int a = 6;
        int b = 5;
        float result = a;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = (float) a / b;
        } else if (sign == '^') {
            for (int i = 0; i < b - 1; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}