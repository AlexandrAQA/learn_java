package exceptions.MyExc;

public class UservalidationException extends  RuntimeException{

    private User user;

    public UservalidationException(User user, String message) {
        super(message);
        this.user = user;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " User is not correct " + user;
    }
}
