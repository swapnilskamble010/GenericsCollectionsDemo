package DesignPrinciplesAndPatterns.SOLID.BirdV0;

public class Client {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.setAge(10);
        bird1.setType("Peacock");
        bird1.setName("Bird 1");
        bird1.eat();
        bird1.makeSound();

        Bird bird2 = new Bird();
        bird2.setAge(10);
        bird2.setType("Crow");
        bird2.setName("Bird 2");
        bird2.eat();
        bird2.makeSound();


    }
}
