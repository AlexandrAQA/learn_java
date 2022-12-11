package exceptions.MyExc;

public class UserNameValidationException extends UserValidationException{

    public UserNameValidationException (User user){
        super(user, "User name is not valid");
    }
}
