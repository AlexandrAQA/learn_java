package symbolStreams;

import java.io.*;

public class MainApp {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("C://test/testFile.txt");
        int readingFile = reader.read();
        System.out.println((char) readingFile);

        reader.close();

        // new => open Stream
        Writer writer = new FileWriter("C://test/testFile5.txt", true);
        //append (true) => add text (writing w/o deleting)

        writer.write(readingFile);
        writer.write(" Some test String ");


       // writer2.flush(); //flush() => write in the file 100% without closing stream
        writer.close(); //close







    }
}
