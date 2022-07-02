package functions;

public class StackTraceExample {
    static void func1(int x) {
        System.out.println("FUNC 1 START " + x);
        func2(x + 1);
        System.out.println("FUNC 1 END");
    }

    static void func2(int x) {
        System.out.println("FUNC 2 START " + x);
        func3(x + 10);
        System.out.println("FUNC 2 END");
    }

    static void func3(int x) {
        System.out.println("FUNC 3 START " + x);
        System.out.println(1 / 0);
        System.out.println("FUNC 3 END");
    }

    public static void main(String[] args) {
        func1(1);
        System.out.println("THE END");
    }
}
