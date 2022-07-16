package oop.lesson4.example5;

public class Car {
    int speed;
    int weight;
    boolean isEngineStarted;

    public Car() {
        this.speed = 0;
        this.weight = 1000;
        this.isEngineStarted = false;
    }

    void startEngine() {
        isEngineStarted = true;
    }

    void accelerate() {
        if (isEngineStarted == false) {
            return;
        }
        speed += 50;
    }
}
