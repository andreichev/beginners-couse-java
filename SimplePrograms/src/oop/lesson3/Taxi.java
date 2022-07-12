package oop.lesson3;

public class Taxi implements Transport {
    @Override
    public void driveToWork() {
        System.out.println("Заказать такси");
        System.out.println("Сесть в такси");
        System.out.println("Выйти из такси");
    }
}
