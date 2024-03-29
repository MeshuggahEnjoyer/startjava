public class Person {
    String sex = "male";
    String firstName = "Alex";
    float height = 1.80F;
    float weight = 75.5F;
    int age = 29;

    public void move(){
        System.out.println("move");
    }

    public void sit(){
        System.out.println("sit");
    }

    public void run(){
        System.out.println("run");
    }

    public void say(String phrase){
        System.out.println(phrase);
    }

    public void learnJava(){
        System.out.println("learnJava");
    }
}