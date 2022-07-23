package exceptions.lesson1.example2;

public class Controller {
    Validator validator = new Validator();

    void save(UserForm form) throws ValidationException {
        if(!validator.checkRegisterForm(form)) {
            throw new ValidationException();
        }
        // SAVE
    }
}
