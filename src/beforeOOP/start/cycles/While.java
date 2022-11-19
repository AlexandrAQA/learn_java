package beforeOOP.start.cycles;

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
        System.out.println("Print few Integers and then print String");
            Scanner console = new Scanner(System.in);
            while(console.hasNextInt())
            {
                int y = console.nextInt();
            }

            //printing user's string while user STOP is printed.
        System.out.println("Print few Strings and then print STOP");
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
        System.out.println("====================================================");
        System.out.println("====================================================");

        int j = 20;
        int m = 100;
        while (j < m){
            j*=2;
            System.out.println("j = " + j);

        }

    }
}

