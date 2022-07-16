package oop.lesson4.example4;

public class Example4 {
    //          A    B    C
    // func1    +    +    +
    // func2    -    +    +
    // func3    -    -    +

    // Object
    // A (Object)
    // B (A (Object))
    // C (B (A (Object)))
    public static void main(String[] args) {
        Object object = new C();
    }
}
