import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // simple cycle
        int x = 10;
        while (x > 8) {
            System.out.println("Hello from cycle");
            x--;
        }

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;

        }

        //while user print only numbers the cycle is running
        System.out.println("Please enter any Integer");
        Scanner console = new Scanner(System.in);
        while (console.hasNextInt()) {
            int y = console.nextInt();
        }


    }
}
