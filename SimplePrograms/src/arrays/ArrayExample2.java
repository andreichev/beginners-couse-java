package arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
