package arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[11];

        while (true) {
            int x = scanner.nextInt();
            s[x]++;
            if(x == 0) {
                break;
            }
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(i + ": " + s[i] + " times");
        }
    }
}
