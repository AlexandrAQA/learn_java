package exceptions.MyExceptions;

public class UserService {
    void saveMethod(UserExc user)throws DBException{
        DBService service = new DBService();
        service.saveUser(user);

    }

}
