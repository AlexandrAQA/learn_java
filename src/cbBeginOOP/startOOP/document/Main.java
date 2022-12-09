package cbBeginOOP.startOOP.document;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        EmployeeDocument employeeDocument =
                new EmployeeDocument("Doc.txt", new Date(), new Date(),
                new Date(), "Mark");

        ProductDocument productDocument =
                new ProductDocument("ProductDoc.txt", new Date(),
                        "Test Product", 100);
        FinanceDocument financeDocument =
                new FinanceDocument("FinanceDoc.txt", new Date(), 250, 12345);

        Register register = new Register();

        register.addDocs(employeeDocument);
        register.addDocs(productDocument);
        register.addDocs(financeDocument);

        register.printDocs();
    }
}
