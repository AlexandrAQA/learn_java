package exceptions.a_start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcMainFileIn {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("test.txt");

            int read = fileInputStream.read();

        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("File Not Found");
        } catch (IOException ioException) {
            System.out.println(ioException);

        } finally {
            try {
                fileInputStream.close(); //.close() throws Exception as well, we must try-catch for .close()
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("FileInputStream can't be Closed");
            } finally {

            }

        }
    }
}
