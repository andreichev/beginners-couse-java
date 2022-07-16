package oop.lesson4.example5;

public class Example5 {
    public static void main(String[] args) {
        Furniture sofa = new Furniture(0);
        Furniture cupboard = new Furniture(0);

        Truck truck = new Truck();
        truck.putFurniture(sofa);
        truck.putFurniture(cupboard);

        truck.startEngine();
        truck.accelerate();

        System.out.println(sofa.getPosition());
    }
}
