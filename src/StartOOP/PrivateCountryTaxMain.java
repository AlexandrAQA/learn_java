package StartOOP;

public class PrivateCountryTaxMain {
    public static void main(String[] args) {

        PrivateCountryTax privateCountryTax = new PrivateCountryTax("Georgia", 1500.99, 20);
        System.out.printf("Our country is %s and tax= %d",
                privateCountryTax.getName(), privateCountryTax.getTax());

        System.out.println("\n");

        privateCountryTax.setName("POLAND");
        privateCountryTax.setTax("POLAND");
        System.out.printf("Our NEW country is %s and tax= %d",
                privateCountryTax.getName(), privateCountryTax.getTax());

        privateCountryTax.setTax(10, 2 );

        System.out.println("\n");
        privateCountryTax.setTax(1, 3, 5, 8, 13, 21);
        System.out.printf("Our country TAX is %s", privateCountryTax.getTax());




    }



}
