package oop.lesson3;

public class Bus implements Transport {
    @Override
    public void driveToWork() {
        System.out.println("Идти на остановку");
        System.out.println("Дождаться автобуса");
        System.out.println("Сесть в автобус");
        System.out.println("Заплатить за билет");
        System.out.println("Выйти у работы");
    }
}
