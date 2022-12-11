package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcMain {
    public static void main(String[] args) {

        int v1 = 10;
        int v2 = 0;
        int res = 0;

        try {
            res = v1/v2;
            System.out.println(res);
            FileInputStream stream = new FileInputStream("test.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
            System.out.println("file Not Found :-( ");

        } catch (ArithmeticException | OutOfMemoryError exc){
                System.out.println(exc);
                System.out.println("we can't divide by zero :-(");
        } finally {
            System.out.println("Finally. This code is executed anyway");
        }

    }
}
