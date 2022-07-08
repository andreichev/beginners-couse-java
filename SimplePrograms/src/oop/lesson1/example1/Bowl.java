package oop.lesson1.example1;

public class Bowl {
    int foodCount;

    Bowl() {
        this.foodCount = 0;
    }

    void fill(int amount) {
        this.foodCount += amount;
    }

    boolean tryFeed(Cat cat) {
        if(cat.isHungry == false) {
            return false;
        }
        int needToFeed = 10 * cat.weight;
        if(this.foodCount < needToFeed) {
            return false;
        }
        this.foodCount -= needToFeed;
        cat.isHungry = false;
        return true;
    }

    static void printDescription() {
        System.out.println("Bowl for cats");
    }
}
