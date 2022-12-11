package exceptions.MyExc;

public class UserMain {
    public static void main(String[] args) {
            User user1 = new User("Vasya", 17);
            User user2 = new User(null, 18);
            UserValidationService validationService = new UserValidationService();

            try {
                validationService.validate(user2);
            } catch (UserValidationException exception){
                System.out.println(exception.getMessage());
            }
        System.out.println("End");
    }
}
