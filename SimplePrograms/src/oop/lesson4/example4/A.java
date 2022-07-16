package oop.lesson4.example4;

public abstract class A {
    String text;

    A() {
        System.out.println("A CREATED");
        text = "HELP";
    }

    void func1() {
        System.out.println("FUNC 1");
    }

    abstract void func2();

    abstract void func3();
}
