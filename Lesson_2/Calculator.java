public class Calculator {
    public float calculate(int a, int b, char sign) {
        switch (sign) {
        case '+' :
            return a + b;
        case '-' :
            return a - b;
        case '*' :
            return a * b;
        case '/' :
            return (float) a / b;
        case '^' :
            int tmp = a;
            for (int i = 1; i < b; i++) {
                a *= tmp;
            }
            return a;
        case '%' :
            return a % b;
        default:
            System.out.println("Неизвестный оператор");
            return 0;
        }
    }
}