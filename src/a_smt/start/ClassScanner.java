package a_smt.start;

import java.util.Scanner;

public class ClassScanner {

    public static void main(String[] args) {

        System.out.println("Enter text or numbers:");
        Scanner sc = new Scanner(System.in);
        int i;
        String str;
        if (sc.hasNextInt()){
            i = sc.nextInt();
            System.out.println("number i = " + i);
        }else {
            str = sc.nextLine();
            System.out.println("String str = " + str);

        }
        //sc.close();

        //Your rate per an hour
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter number of working hours:");
        double hours = sc.nextDouble();
        double hourRate = salary/hours;
        System.out.println("Your hour rate is " + hourRate);
        sc.close(); // we have to close Scanner!!!

    }
}
