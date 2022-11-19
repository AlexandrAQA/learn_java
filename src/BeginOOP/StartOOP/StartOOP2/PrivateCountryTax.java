package BeginOOP.StartOOP.StartOOP2;

public class PrivateCountryTax {
    //variables
    private String name;
    private double costOfLive;
    private int tax;

    //constructor
    public PrivateCountryTax() {

    }

    public PrivateCountryTax(String name, double costOfLive, int tax) {
        this.name = name;
        this.costOfLive = costOfLive;
        this.tax = tax;

    }

    //getters:
    public String getName() {
        return name;
    }

    public double getCostOfLive() {
        return costOfLive;
    }

    public int getTax() {
        return tax;
    }

    //setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setCostOfLive(double costOfLive) {
        this.costOfLive = costOfLive;
    }

    public void setTax(int tax, int k) {
        this.tax = tax * k;
        System.out.printf("\nOverloaded setTax is %s ", this.tax);
    }

    //we can use int... + variable for adding many values like array
    //then we can use 'for each' and do something
    public void setTax(int... arr) {
        for (int i : arr) {
            this.tax += i;
        }
    }

    // overloaded setter with 'switch'
    public void setTax(String country) {
        switch (country) {
            case "BELARUS":
                this.tax = 14;
                break;
            case "GEORGIA":
                this.tax = 20;
                break;
            case "POLAND":
                this.tax = 30;
                break;
            case "GERMANY":
                this.tax = 40;
                break;
            case "ESTONIA":
                this.tax = 53;
                break;
            default:
                this.tax = -1;
                break;

        }

    }
}
