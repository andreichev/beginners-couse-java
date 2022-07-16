package oop.lesson4.example4;

public abstract class B extends A {
    B() {
        System.out.println(text);
    }

    @Override
    void func2() {
        System.out.println("FUNC 2");
    }
}
