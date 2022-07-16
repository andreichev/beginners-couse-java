package oop.lesson4.example5;

public class Furniture {
    private int position = 0;

    Furniture(int position) {
        this.position = position;
    }

    int getPosition() {
        return position;
    }

    void updateWithTruck(Truck truck) {
        if(truck.speed != 0) {
            position++;
        }
    }
}
