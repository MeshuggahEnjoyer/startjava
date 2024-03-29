public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.sex = "male";
        wolf1.name = "Zeus";
        wolf1.age = 6;
        wolf1.weight = 52.6F;
        wolf1.color = "black";

        System.out.println("Пол: " + wolf1.sex);
        System.out.println("Кличка: " + wolf1.name);
        System.out.println("Возраст: " + wolf1.age);
        System.out.println("Вес: " + wolf1.weight);
        System.out.println("Окрас: " + wolf1.color);

        wolf1.move();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}