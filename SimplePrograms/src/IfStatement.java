import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 5 || x < 1) {
            System.out.println("НЕВЕРНОЕ ЧИСЛО");
            return;
        }
        if (x > 4) {
            System.out.println("ОТЛИЧНО");
        } else if (x > 3) {
            System.out.println("ХОРОШО");
        } else if (x > 2) {
            System.out.println("УДОВЛЕТВОРИТЕЛЬНО");
        } else {
            System.out.println("НЕУД");
        }
    }
}
