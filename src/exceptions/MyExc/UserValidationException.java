package exceptions.MyExc;

public class UserValidationException extends  RuntimeException{

    private User user;

    public UserValidationException(User user, String message) {
        super(message);
        this.user = user;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " User is not correct " + user;
    }
}
