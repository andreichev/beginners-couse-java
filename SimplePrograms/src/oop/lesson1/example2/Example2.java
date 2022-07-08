package oop.lesson1.example2;

public class Example2 {
    public static void main(String[] args) {
        Position p1 = new Position();
        p1.x = 10;
        p1.y = 20;

        Position p2 = null;

        System.out.println(p1.distance(p2));

        int[] x = null;
        System.out.println(x[1]);
    }
}
