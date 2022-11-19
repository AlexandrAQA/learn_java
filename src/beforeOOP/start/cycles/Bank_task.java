package beforeOOP.start.cycles;

import java.util.Scanner;

public class Bank_task {
    //calculating bank deposit if client has +7% every month
    public static final int PERCENT = 7; // 7% for a month


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your deposit amount:");
        float deposit = scanner.nextFloat();

        System.out.println("Enter count of month: ");
        int monthCount = scanner.nextInt();

        if (validating(deposit, monthCount)) {
            System.out.printf("Final deposit on %d month = %f"
                    , monthCount, getFinalValue(deposit, monthCount));

        }


    }

    public static boolean validating(float deposit, int monthCount) {
        if (deposit <= 0 || monthCount <= 0) {
            System.out.println("You Entered invalid number");
            return false;
        }
        return true;
    }

    public static float getFinalValue(float deposit, int monthCount) {
        for (int i = 1; i <= monthCount; i++) {
            deposit += (deposit * PERCENT / 100.0);

        }

        return deposit;
    }
}
