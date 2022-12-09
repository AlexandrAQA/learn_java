package cbBeginOOP.startOOP.taskCreditCard;

import java.util.Scanner;

public class CardTester {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(1, 1000);
        CreditCard card2 = new CreditCard(2, 2000);
        CreditCard card3 = new CreditCard(3, 3000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount for adding money card1: ");
        double amount = scanner.nextDouble();
        card1.increaseSum(amount);
        System.out.println(card1);

        System.out.println("Enter amount for adding money card 2 : ");
        double amount2 = scanner.nextDouble();
        card2.increaseSum(amount2);
        System.out.println(card2);

        System.out.println("Enter amount for transfer money from card 3 to another one: ");
        double amount3 = scanner.nextDouble();
        card3.minusSum(amount3);
        System.out.println(card3);





    }

}
