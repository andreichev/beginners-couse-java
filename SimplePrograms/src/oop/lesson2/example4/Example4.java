package oop.lesson2.example4;

public class Example4 {
    // Bird
    // FlyingBird (Bird)
    // Pigeon (FlyingBird (Bird))
    public static void main(String[] args) {
//        float x = 3.7f;
//        System.out.println("X: " + x);
//        int y = (int) x;
//        System.out.println("Y: " + y);

        // Bird object2 = new Pigeon();
        // object2.printName();

        Bird[] array = {
                new Pigeon(),
                new Chicken(),
                new Pigeon(),
                new Chicken(),
                new Chicken()
        };
        for(Bird bird : array) {
            bird.printName();
        }

        System.out.println(howManyChickens(array));
        // Chicken chicken = new Chicken();
        // needFlyingBird(chicken);
    }

    static void needFlyingBird(FlyingBird flying) {
        flying.printName();
    }

    static void needBird(Bird b) {
        b.printName();
    }

    static int howManyChickens(Bird[] birds) {
        int result = 0;
        for (int i = 0; i < birds.length; i++) {
            if(birds[i] instanceof Chicken) {
                result++;
            }
        }
        return result;
    }
}
