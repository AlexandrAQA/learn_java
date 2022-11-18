package StartOOP;

public class Start_OOP {
    public static void main(String[] args) {
        Product productDef = new Product();
        System.out.println(productDef);
        System.out.println("==========================================");


        Product prod = new Product("Phone");
        System.out.printf("Product name is %s",prod.name);
        System.out.println("\n" + "==========================================");

        Product prodP = new Product(123);
        System.out.printf("Product cost is %s",prodP.cost);
        System.out.println("\n" + "==========================================");


        Product product = new Product("Monitor 27", 1000);
        System.out.printf("Product name is %s and cost is %d",product.name, product.cost);

        System.out.println("\n" + "==========================================");

        Product product2 = new Product("Monitor 24");
        System.out.printf("Product name is %s and cost is %d",product2.name, product2.cost);
    }
}
