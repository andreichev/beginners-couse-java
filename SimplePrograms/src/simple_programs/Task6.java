package simple_programs;

import java.util.Scanner;

public class Task6 {
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
        int number = scanner.nextInt();
        int[] digits = makeArray(number);

        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if(digits[i] == digits[j]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
