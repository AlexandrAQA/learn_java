package exceptions.myInterface;

import exceptions.myInterface.UserServiceRepo;

public class UserServiceRepoMain {
    public static void main(String[] args) {

        User user = new User("Mark", 22);
        UserServiceRepo repo = new UserServiceRepo();
        try {
            repo.save(user);
            repo.delete(user);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }
}
