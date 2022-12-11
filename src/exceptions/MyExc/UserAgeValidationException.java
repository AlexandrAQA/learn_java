package exceptions.MyExc;

public class UserAgeValidationException extends UserValidationException{

    public UserAgeValidationException(User user){
        super(user, "user Age is not valid");
    }
}
