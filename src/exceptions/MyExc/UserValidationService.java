package exceptions.MyExc;

public class UserValidationService {
    public void validate(User user){
        if (user.getName() == null || user.getName().isEmpty()){
            throw new UservalidationException(user, "Name is empty");
           // System.out.println("User name is empty");

        } else if (user.getAge() < 18){
            throw new UservalidationException(user, "Age must be 18+");


        } else {
            System.out.println("User is valid");
        }
    }

}
