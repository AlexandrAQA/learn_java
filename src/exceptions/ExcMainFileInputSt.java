package exceptions;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExcMainFileInputSt {
    public static void main(String[] args) {
        /*
        'try-with-resources' approach:

        if our class implements AutoClosable interface
        we don't need to close this stream,
        the stream will close itself
         */
        try(FileReader fileReader = new FileReader("C://test/testFile.txt")){
            char[] charArray = new char[100];
            fileReader.read(charArray);
            for(char i : charArray)
               System.out.println(i);
        } catch (IOException ioExc) {
            ioExc.printStackTrace();
            System.out.println("Error. File is unavailable");
        }

        System.out.println("-------------------------------------------------------------\n");

        try ( FileInputStream fileInputStream1 = new FileInputStream("C://test/AbbaThankYouFor.txt");

                FileInputStream fileInputStream2 = new FileInputStream("text.txt")
        ){
            int read1 = fileInputStream1.read();
            System.out.println(read1);

        } catch (IOException ioException){
            //#1 just print error
            System.out.println(ioException);
           System.out.println("=============================================");
            //#2 print stack trace (a lot of data about exception
            ioException.printStackTrace();


        }
    }
}
