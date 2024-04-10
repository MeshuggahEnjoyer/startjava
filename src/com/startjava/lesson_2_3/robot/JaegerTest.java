package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setHeight(85.34F);
        chernoAlpha.setWeight(54.487F);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);

        Jaeger bracerPhoenix = new Jaeger("Bracer Phoenix", "Mark-5", 70.91F, 48.072F, 8, 9);

        chernoAlpha.move();
        bracerPhoenix.move();

        chernoAlpha.attack();
        bracerPhoenix.attack();

        chernoAlpha.scanKaiju();
        bracerPhoenix.scanKaiju();

        chernoAlpha.setModelName(bracerPhoenix.getModelName());
        System.out.println("Новый modelName объекта chernoAlpha: " + chernoAlpha.getModelName());

        bracerPhoenix.setModelName("Bracer Phoenix 2.0");
        System.out.println("Новый modelName объекта bracerPhoenix: " + bracerPhoenix.getModelName());

        bracerPhoenix.setWeight(chernoAlpha.getWeight());
        chernoAlpha.setWeight(32.05F);
        System.out.println("Новый weight объекта chernoAlpha: " + chernoAlpha.getWeight());
        System.out.println("Новый weight объекта bracerPhoenix: " + bracerPhoenix.getWeight());
    }
}