package oop.lesson2.example5;

public class Example5 {
    public static void main(String[] args) {
        Cat dendy = new Cat("Dendy", "Black", 1, true, 2);
        Cat perchik = new Cat("Perchik", "Orange", 1, true, 2);
        Cat iriska = new Cat("Iriska", "Grey", 12, true, 4);
        Dog charlie = new Dog("Charlie", "White", 5, true, 5);

        Pet[] pets = {dendy, perchik, iriska, charlie};

        for (int i = 0; i < pets.length; i++) {
            pets[i].voice();
        }

        System.out.println("Pets are eating...");
        Bowl whiteBowl = new Bowl();
        whiteBowl.fill(80);
        System.out.println("Bowl is empty");

        for (int i = 0; i < pets.length; i++) {
            whiteBowl.tryFeed(pets[i]);
        }

        for (int i = 0; i < pets.length; i++) {
            pets[i].voice();
        }
    }
}
