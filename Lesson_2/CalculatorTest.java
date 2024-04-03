import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String userAnswer;
        do {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            System.out.println(calculator.calculate(a, b, sign));

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.next();
            } while (!(userAnswer.equals("yes") || userAnswer.equals("no")));
        } while (userAnswer.equals("yes"));
    }
}