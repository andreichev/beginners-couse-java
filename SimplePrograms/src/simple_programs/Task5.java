package simple_programs;

import java.util.Scanner;

public class Task5 {
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

    static boolean numberHas3SimilarDigits(int number) {
        int[] num = makeArray(number);

        for (int i = 0; i < num.length; i++) {
            int c = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    c++;
                }
            }
            if (c == 3){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            int number = scanner.nextInt();
            if(number == 0) { break; }
            if(numberHas3SimilarDigits(number)) {
                flag = true;
            }
        }
        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
