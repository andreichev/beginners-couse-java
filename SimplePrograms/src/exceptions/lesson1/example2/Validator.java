package exceptions.lesson1.example2;

public class Validator {
    boolean checkRegisterForm(UserForm form) {
        if(form.getName() == null ||
                form.getPassword() == null ||
                form.getConfirmPassword() == null) {
            return false;
        }
        if (form.getName().length() < 2) {
            return false;
        }
        if(!form.getPassword().equals(form.getConfirmPassword())) {
            return false;
        }
        return true;
    }
}
