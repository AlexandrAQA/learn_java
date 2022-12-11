package exceptions.MyExceptions;

public class DBMain {
    public static void main(String[] args) {
        UserExc user2 = new UserExc("John", 18);
        DBService dbService = new DBService();
        dbService.save(user2);

        UserService userService = new UserService();

        try {
            userService.saveMethod(user2);
        } catch (DBException e) {
            e.printStackTrace();
        }


        try {
            dbService.saveUser(user2);
        } catch (DBException e) {
            e.printStackTrace();
            System.out.println("Error in DB");
        }
    }
}
