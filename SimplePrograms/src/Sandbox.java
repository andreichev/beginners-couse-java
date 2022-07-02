import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        int[] x = new int[] {1, 9, 5, 3, 0, 7, 4, 2, 6, 7};

        int maxIndex = x[0];
        for (int i = 0; i < x.length; i++) {
            if(x[i] >= x[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
