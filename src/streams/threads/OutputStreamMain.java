package streams.threads;

import java.io.*;

public class OutputStreamMain {
    public static void main(String[] args) {

        //#1 reading & writing per 1 byte
        try (InputStream inputStream1 = new FileInputStream("C://test/testFile.txt");
                FileOutputStream outStream1 = new FileOutputStream("C://test/testFile1.txt")){
                    for (int read = 0; read !=-1;){
                        read = inputStream1.read();
                        if (read != -1){
                            outStream1.write(read);
                        }
                    }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        //#2 reading & writing per bytes Array
        try (InputStream inputStream2 = new FileInputStream("C://test/testFile.txt");
             FileOutputStream outStream2 = new FileOutputStream("C://test/testFile2.txt")){

            byte[] bytes = new byte[inputStream2.available()];
            inputStream2.read(bytes);
            outStream2.write(bytes);

        }catch (IOException exception) {
            exception.printStackTrace();
        }

        //#3 reading & writing with Decorator pattern (BufferedInputStream)
        try {
            OutputStream os = new BufferedOutputStream(new FileOutputStream("C://test/testFile3.txt"));
            os.write(100);
            os.write(100);
            os.close();

            InputStream in = new BufferedInputStream(new FileInputStream("C://test/testFile1.txt"));
            in.read();
            in.read();
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
