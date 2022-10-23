package cycles;

import java.util.Scanner;

public class While {
    public static void main (String[] args)
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

            //printing user's string while user STOP is printed.
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit)
        {
        String str = sc.nextLine();
        isExit = str.equals("STOP");

        }

        int  n = 0;
        while (n < 4)
        {
            System.out.println("Java");
            n++;
        }
        int in = 10;
        while (n > 7){
            System.out.println(in * 10);
            in--;
        }



    }
}

