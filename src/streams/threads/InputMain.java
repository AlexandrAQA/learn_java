package streams.threads;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputMain {
    public static void main(String[] args) {

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("C://test/testFile.txt");

           for (int read = 0; read != -1;){
                read = inputStream.read();
                System.out.print((char) read);
            }

        } catch (IOException exception) {
            System.out.println("error: " + exception.getMessage());

        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
