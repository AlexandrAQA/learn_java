package smt.start;

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

        sc.close(); // we have to close Scanner!!!

    }
}
