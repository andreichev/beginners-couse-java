package basic_collections.lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            if(x == 0) {
                break;
            }
            list.add(x);
        }

        System.out.println();
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
