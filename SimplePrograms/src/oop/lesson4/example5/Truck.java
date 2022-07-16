package oop.lesson4.example5;

public class Truck extends Car {
    static final int capacity = 4;

    Furniture[] furniture;
    int furnitureCount;

    Truck() {
        furnitureCount = 0;
        furniture = new Furniture[capacity];
    }

    void putFurniture(Furniture furniture) {
        if (furnitureCount == capacity) {
            System.out.println("Больше не влезет");
            return;
        }
        this.furniture[furnitureCount] = furniture;
        furnitureCount++;
    }

    @Override
    void accelerate() {
        super.accelerate();
        for(int i = 0; i < furnitureCount; i++) {
            furniture[i].updateWithTruck(this);
        }
    }
}
