package arrays;

public class ArrayExample1 {
    static void func(int[] y) {
        y[0]++;
    }

    public static void main(String[] args) {
        int[] x = new int[1];
        x[0] = 5;
        func(x);
        System.out.println(x[0]);
    }
}
