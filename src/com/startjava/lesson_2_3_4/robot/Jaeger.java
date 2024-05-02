package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    String modelName;
    String mark;
    float height;
    float weight;
    int strength;
    int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, float height,
            float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println(modelName + " идет");
    }

    public void scanKaiju() {
        System.out.println(modelName + " сканирует кайдзю");
    }

    public void attack() {
        if (modelName.equals("Cherno Alpha")) {
            System.out.println(modelName + " активирует Incinerator turbines");
        } else if (modelName.equals("Bracer Phoenix")) {
            System.out.println(modelName + " активирует Vortex Cannon");
        }
    }
}