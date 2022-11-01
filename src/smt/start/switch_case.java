package smt.start;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        System.out.println("Enter any word for start: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println(str);

        switch (str) {
            case "hello" :
                System.out.println("Your word is hello");
                break;
            case "Hey":
                System.out.println("our word is Hey");
                break;
            case "whatsup":
                System.out.println("our word is whatsup");
                break;
            default:
                System.out.println("oops!...");
                break;
        }

        //#1
        System.out.println("Enter Integer from 0 to 5 included: ");
        Scanner scanner = new Scanner(System.in);
        Integer scan = scanner.nextInt();

        //#2
        //for(int i = 0; i <=5; i++)

        switch (scan) {
            case 0:
                System.out.println("You have entered 0");
                break;
            case 1:
                System.out.println("You have entered 1");
                break;
            case 2:
                System.out.println("You have entered 2");
                break;
            case 3:
                System.out.println("You have entered 3");
                break;
            case 4:
            case 5:
                System.out.println("You have entered 4 or 5");
                break;
            default:
                System.out.println("OOPS! :( " +
                        "You have not entered integer from 0 to 5");

        }
    }


}
