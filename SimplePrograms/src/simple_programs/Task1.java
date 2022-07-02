package simple_programs;

import java.util.Scanner;

public class Task1 {
    static int max(int x, int y) {
        if(x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(max(x, max(y, z)));
    }
}
