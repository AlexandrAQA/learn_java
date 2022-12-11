package exceptions.MyExc;

public class UserMain {
    public static void main(String[] args) {
            User user = new User("Vasya", 17);
            User user2 = new User(null, 17);
            UserValidationService validationService = new UserValidationService();

            try {
                validationService.validate(user2);
            } catch (UservalidationException uservalidationException){
                System.out.println(uservalidationException.getMessage());
            }
        System.out.println("End");
    }
}
