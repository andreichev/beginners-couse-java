package oop.lesson1.example1;

public class Example1 {
    public static void main(String[] args) {
        Cat dendy = new Cat("Dendy", "Black", 1, true, 2);
        Cat perchik = new Cat("Perchik", "Orange", 1, true, 2);
        Cat iriska = new Cat("Iriska", "Grey", 12, true, 4);

        Bowl bowl = new Bowl();
        bowl.fill(100);
        bowl.tryFeed(dendy);

        System.out.println(perchik.isFriendlyTo(dendy));

        dendy.voice();

        Cat.printDescription();
    }
}
