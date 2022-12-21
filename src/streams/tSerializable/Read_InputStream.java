package streams.tSerializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read_InputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        we set user age by default = 18
        than we set age = 22 and write (serialize) to a file
        here in Main we set age = 30 and read from file, so we get 30!
        because static is NOT Serializable!!! it's NOT HEAP!
        static is a Class property NOT object property!!!
        */

        User.age = 30;
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("C://test/user.dat"));
                Object o = ois.readObject();

                if (o instanceof User) {
                    User user = (User) o;
                    System.out.println("user age is " + user.age);
                    System.out.println(user);
                }
    }
}
