package com.startjava.lesson_1.base;

import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите, пожалуйста, свое имя: ");
        String name = console.nextLine();

        System.out.println("\n1. У какого языка программирования следующий слоган:");
        System.out.print("\"Написано однажды, ");
        System.out.println("работает везде!\"");

        String answer = console.nextLine();
        if (answer.equalsIgnoreCase("Java")) {
            System.out.println(name + ", вы угадали!");
        } else System.out.println("Увы, но - это Java");

        System.out.println("\n2. Какая фамилия у автора языка Java?");

        answer = console.nextLine();
        if (answer.equals("Гослинг") || answer.equals("Gosling")) {
            System.out.println(name + ", вы угадали!");
        } else System.out.println("Увы, но - это Гослинг (Gosling)");
    }
}