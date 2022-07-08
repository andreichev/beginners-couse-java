package oop.lesson1.example2;

public class Position {
    double x;
    double y;

    Position() {
        System.out.println("POSITION CREATE");
        this.x = 1;
        this.y = 2;
    }

    double distance(Position other) {
        return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }
}
