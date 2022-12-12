package symbolStreams;

import java.io.*;

public class MainLineReader {
    public static void main(String[] args) throws IOException {

        //print the first doc's string
        LineNumberReader lnr = new LineNumberReader(new FileReader("C://test/testFile.txt"));
        String str = lnr.readLine();
        System.out.println(str);
        System.out.println("--------------------------");

        //print all doc's string
        LineNumberReader lnr2 = new LineNumberReader(new BufferedReader
                (new FileReader("C://test/testFile1.txt")));
        String str2 = lnr.readLine();

       while ( str2 != null){
            str2 = lnr2.readLine();
            System.out.println(str2);
        }

        lnr.close(); //we must close each stream
        lnr2.close(); //we must close each stream

        PrintWriter printWriter = new PrintWriter(new FileOutputStream("C://test/testFile4.txt"));
        printWriter.println("First string");
        printWriter.println("Some TEST string");

        printWriter.close();

    }
}
