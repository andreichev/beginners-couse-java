package exceptions.lesson1.example1;

public class Example1 {
    static void func(A object) {
        object.x = 20;
        throw new ExampleException();
    }

    // Exception
    // RuntimeException (Exception)
    // NullPointerException (RuntimeException (Exception))
    public static void main(String[] args) {
        A object = null;
        func(object);
        object = new A();
        object.x = 10;
        System.out.println(object.x);
    }
}
