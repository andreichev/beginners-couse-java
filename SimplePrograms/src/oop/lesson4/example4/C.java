package oop.lesson4.example4;

public class C extends B {
    C() {
        super();
        System.out.println("C CREATED");
    }

    @Override
    void func1() {
        super.func1();
        System.out.println("FUNC11");
    }

    @Override
    void func3() {
        System.out.println("FUNC3");
    }
}
