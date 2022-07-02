package simple_programs;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int i = 0;
        int s = 0;
        for (; x > 0; i++) {
            s += x % 10;
            x /= 10;
        }
        System.out.println(s);
    }
}
