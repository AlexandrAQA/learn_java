package exceptions.myInterface;

import exceptions.MyExceptions.UserExc;

public interface UserDB_repo {

    void save(User user) throws Exception;

    void delete(User user)throws Exception;
}
