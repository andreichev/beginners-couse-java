package functions;

public class RecursionExample {
    static void func1(int x) {
        System.out.println("FUNC 1 START " + x);
        if (x < 10) {
            func1(x + 1);
        }
        System.out.println("FUNC 1 END");
    }

    public static void main(String[] args) {
        func1(1);
        System.out.println("THE END");
    }
}
