package arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] x = new int[] {3, 4, 5, 2, 3, 5, 2, 1};
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        System.out.println(max);
    }
}
