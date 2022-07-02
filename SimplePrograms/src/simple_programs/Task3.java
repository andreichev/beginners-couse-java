package simple_programs;

import java.util.Scanner;

public class Task3 {
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
        int x = scanner.nextInt();
        int[] digits = makeArray(x);

        boolean isPalindrome = true;
        for (int i = 0; i <= digits.length / 2; i++) {
            if(digits[i] != digits[digits.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }
}
