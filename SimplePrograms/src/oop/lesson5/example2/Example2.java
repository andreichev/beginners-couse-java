package oop.lesson5.example2;

public class Example2 {
    // A - funcA
    // B (A) - funcA, funcB
    public static void main(String[] args) {
        A refToA;
        refToA = new B();

        if (refToA instanceof B) {
            B refToB = (B) refToA;
            refToB.funcB();
        }

        float x = 3.7f;
        System.out.println("X: " + x);
        int y = (int) x;
        System.out.println("Y: " + y);
    }
}
