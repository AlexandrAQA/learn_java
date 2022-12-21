package streams.threads;

import java.io.IOException;

public class RomeoJulietaMain {
    public static void main(String[] args) {

        RomeoJulieta romeoJulieta = new RomeoJulieta();
        try {
            romeoJulieta.readRomeoJulieta();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
           ioException.printStackTrace();
        }
        catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
            nullPointerException.printStackTrace();
        }
    }
}
