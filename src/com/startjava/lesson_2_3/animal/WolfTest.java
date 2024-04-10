package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setSex("male");
        wolf1.setName("Zeus");
        wolf1.setAge(6);
        wolf1.setWeight(52.6F);
        wolf1.setColor("black");

        System.out.println("Пол: " + wolf1.getSex());
        System.out.println("Кличка: " + wolf1.getName());
        System.out.println("Возраст: " + wolf1.getAge());
        System.out.println("Вес: " + wolf1.getWeight());
        System.out.println("Окрас: " + wolf1.getColor());

        wolf1.move();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}