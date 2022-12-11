package exceptions.MyExc;

public class UserValidationService {
    public void validate(User user){
        if (user.getName() == null || user.getName().isEmpty()){
            throw new UserNameValidationException(user);
           // System.out.println("User name is empty");

        } else if (user.getAge() < 18){
            throw new UserAgeValidationException(user);


        } else {
            System.out.println("User is valid");
        }
    }

}
