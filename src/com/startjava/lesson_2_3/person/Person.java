package com.startjava.lesson_2_3.person;

public class Person {
    String sex = "male";
    String firstName = "Alex";
    float height = 1.80F;
    float weight = 75.5F;
    int age = 29;

    void move() {
        System.out.println("move");
    }

    void sit() {
        System.out.println("sit");
    }

    void run() {
        System.out.println("run");
    }

    void say(String phrase) {
        System.out.println(phrase);
    }

    void learnJava() {
        System.out.println("learnJava");
    }
}