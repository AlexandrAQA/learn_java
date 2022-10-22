import java.util.Scanner;

public class While {
    public static void main (String[] args) throws java.lang.Exception
    {
        // simple cycle
        int x = 10;
        while (x > 8 ) {
            System.out.println("Hello from cycle");
            x--;
        }

        //while user print only numbers the cycle is running
            Scanner console = new Scanner(System.in);
            while(console.hasNextInt())
            {
                int y = console.nextInt();
            }

            //Программа будет вводить строки с клавиатуры,
        //пока не будет введена строка STOP.

        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit)
        {
        String str = sc.nextLine();
        isExit = str.equals("STOP");

        }
    }
}

