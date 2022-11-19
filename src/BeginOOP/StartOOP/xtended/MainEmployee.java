package BeginOOP.StartOOP.xtended;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vasiliy", "frontend developer", 1900);
        Employee employee3 = new Employee("Andrew", "devOps", 2200);
        Manager manager = new Manager("John", "PM", 3000.99, 5000.99);

        System.out.println(employee1);
        employee1.increaseSalary(30);
        System.out.println(employee1.getSalary());

        System.out.println("\n");

        System.out.println(employee3);
        employee3.increaseSalary(9);
        System.out.println(employee3.getSalary());

        System.out.println("\n");

        manager.increaseSalary(10);
        System.out.println(manager);
    }
}
