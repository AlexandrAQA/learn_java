package threads;

import org.omg.CORBA.portable.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputMain {
    public static void main(String[] args) {

       try(FileOutputStream out = new FileOutputStream("C://test/testFile1.txt", true)){
                out.write(80);
                out.write(81);
                out.write(82);
                out.write(83);
       } catch (IOException ioException) {
           System.out.println("error: " + ioException.getMessage());
       }

    }
}
