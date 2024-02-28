import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите, пожалуйста, свое имя: ");
        String name = console.next();

        System.out.println("У какого языка программирования следующий слоган:");
        System.out.print("\"Написано однажды, ");
        System.out.println("работает везде!\"");

        String answer = console.next();
        if (answer.equalsIgnoreCase("Java")) {
            System.out.println(name + ", вы угадали!");
        } else System.out.println("Увы, но - это Java");
    }
}