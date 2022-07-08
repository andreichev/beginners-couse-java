package functions;

public class Functions2 {
    static int func(int y) {
        y++;
        return y;
    }

    public static void main(String[] args) {
        int x = 10;
        func(x);
        System.out.println(x);
    }
}
