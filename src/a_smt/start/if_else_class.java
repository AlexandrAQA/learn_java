package a_smt.start;

import java.util.Scanner;

public class if_else_class {
    public static void main(String[] args) {
        System.out.println("Enter any Integer: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 10) System.out.println("i > 10, i = " + i);
        else System.out.println("i <= 10 " + i);

        System.out.println("random numbers is running: ");
        //we can use a lot of if-else-if but that's not best practice
        double r = Math.random();
    if (r < 0.45){
        System.out.println("r < 0.45");
    }if (r < 0.399){
            System.out.println("r < 0.399");
        }if (r > 0.1){
            System.out.println("r > 0.1");
        }
    else {
        System.out.println("NO");
    } if (r > 0.2) {
            System.out.println(r);
        }

    int a = 5;
    int b = 10;
    int c= 15;
    int d = a > 4 ? b + 10 : c - 5;
        System.out.println("ternary operator is working, d = " + d);

    if ( a < b && b < c){
        System.out.println("WOW!");
    } else {
        System.out.println("Not bad");
    }

        if ( !(a < b) && !(b < c)){
            System.out.println("WOW!");
        } else {
            System.out.println("Not bad");
        }
    //



    }
}
