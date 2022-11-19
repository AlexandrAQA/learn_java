package BeginOOP.StartOOP.xtended;

public class Manager extends Employee{
    //new variable for manager
    private double bonus;
    //Alt + insert => Generate Constructor/getters/setters
    //ctrl + O => Override Methods
    //constructor from Employee Class

    public Manager(String firstName, String title, double salary, double bonus) {

        //constructor from parent(super) class Employee
        super(firstName, title, salary);
            this.bonus = bonus;

    }

    @Override
    public void increaseSalary(double percent) {
        double increasedSalary = salary * (percent / 100);
        salary += increasedSalary + this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
