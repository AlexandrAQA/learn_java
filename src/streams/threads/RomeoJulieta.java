package streams.threads;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class RomeoJulieta {

    public  void readRomeoJulieta () throws IOException
    {
        //creating reader from file
        LineNumberReader reader = new LineNumberReader(new FileReader("C://test/testFile4.txt"));
        //creating 2 writers to the file
        FileWriter romeoWriter = new FileWriter("C://test/romeoJulieta.txt");
        FileWriter julietaWriter = new FileWriter("C://test/romeoJulieta.txt");

        //variable for current line
        String currentLine = reader.readLine();

        //writer for current line
        FileWriter writer = null;

        //cycle where we parse strings if the string is romeo
        //we set writer to romeo else julieta
        while ( currentLine != null){
            if(currentLine.startsWith("Romeo:")){
                writer = romeoWriter;
            } else if(currentLine.startsWith("Julieta:")){
                writer = julietaWriter;
            }

            writer.write(currentLine);
            currentLine = reader.readLine();

        }

        reader.close();;
        romeoWriter.close();
        julietaWriter.close();
    }}
