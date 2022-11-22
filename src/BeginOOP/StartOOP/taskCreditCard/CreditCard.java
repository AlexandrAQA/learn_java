package BeginOOP.StartOOP.taskCreditCard;

public class CreditCard {

    private  int accountNumber;
    private double sum;

    //constructor
    public CreditCard(int accountNumber, double sum) {
        this.accountNumber = accountNumber;
        this.sum = sum;
    }

    public void increaseSum(double newAmount){
        if (newAmount <= 0 ){
            System.out.println("Wrong amount");
            return;
        }
        this.sum += newAmount;
        System.out.println("The sum " + newAmount + " was added to your card");

    }

    public void minusSum(double minusAmount){
        if (minusAmount <= 0 || minusAmount > sum){
            System.out.println("Wrong amount");
            return;
        }
        this.sum -= minusAmount;
        System.out.println("The sum " + minusAmount + " was decreased from your card");

    }

    @Override
    public String toString() {
        return "CreditCard info: \n" +
                "accountNumber = " + this.accountNumber +
                ", \n sum = " + this.sum;
    }

    //getters & setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
