package cbBeginOOP.sStartOOP.sStartOOP2;

public class Product {
    String name;
    int cost;

    //constructor
    public Product() {
        System.out.println("I am a custom constructor without params");

    }

    //constructor 2
    public Product(String name) {
        this.name = name;

    }
    //constructor 3
    public Product(int cost) {
        this.cost = cost;

    }

        //constructor 4
    public Product(String name, int cost) {
        //this.name - it's Class variable
        // =name - it's constructor's variable
        this.name = name;
        this.cost = cost;

    }


}
