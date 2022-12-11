package exceptions.MyExceptions;

public class DBService {
    //this method tries to handle errors
    void save(UserExc user){
        try {
            throw new DBException();
        } catch (DBException dbException){
            System.out.println("can not save user");
        }
    }

    //this method just throws Error (without handling)
    //if someone wants to use the method they must try-catch
    void saveUser (UserExc user) throws DBException {
        throw  new DBException();
    }
}
