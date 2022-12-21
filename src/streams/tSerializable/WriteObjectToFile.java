package streams.tSerializable;

import java.io.*;

public class WriteObjectToFile {
    public static void main(String[] args) throws IOException {
        //creating new object user
        // all classes (fields) must implements Serializable !!!
        // for Writing and Reading from file, server or whatever
        User user = new User("Vasya", "male", new Address("Tbilisi", "Georgia"), 22, new JobTitle("Developer"));

        //open Object Stream
        ObjectOutputStream objectOutputStream =
                //Object Stream can work with File Stream and real file
                new ObjectOutputStream(new FileOutputStream("C://test/user.dat"));

        //method 'write Object' can work with objects
        //writing our user to the file
        objectOutputStream.writeObject(user);
        //close the Stream
        objectOutputStream.close();



    }
}
