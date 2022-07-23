package exceptions.lesson1.example2;

public class Example2 {
    public static void main(String[] args) {
        Controller controller = new Controller();
        UserForm form = new UserForm("Ivan", "123123", "123123");

        try {
            controller.save(form);
        } catch (ValidationException e) {
            System.out.println("NOT REGISTERED");
            return;
        }

        System.out.println("SUCCESSFULLY REGISTERED!");
    }
}
