package oop.lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Выйти на улицу");
        Transport transport = new Bus();
        transport.driveToWork();
        System.out.println("Зайти в офис");
    }
}
