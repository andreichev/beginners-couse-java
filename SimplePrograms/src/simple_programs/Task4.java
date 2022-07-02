package simple_programs;

import java.util.Scanner;


public class Task4 {
    static int digitsCount(int number) {
        int result = 0;
        for (; number > 0; result++) {
            number /= 10;
        }
        return result;
    }

    static int[] makeArray(int number) {
        int digitsCount = digitsCount(number);
        int[] digits = new int[digitsCount];
        for (int i = 0; number > 0; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dig = scanner.nextInt();

        int [] num = makeArray(dig);

        for (int i = 0; i < num.length; i++) {
            int c = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j])
                    c++;
            }
            if (c == 3){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");




    }
}
