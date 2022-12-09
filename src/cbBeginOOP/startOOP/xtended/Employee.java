package cbBeginOOP.startOOP.xtended;

public class Employee {
    protected String firstName;
    protected String title;
    protected double salary;

    public Employee(String firstName, String title, double salary) {
        this.firstName = firstName;
        this.title = title;
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        double increasedSalary = salary * (percent / 100);
        salary += increasedSalary;
        if(percent < 10){
            insultManager();
        }
    }
    //when an employee is not satisfied with his salary increasing,
    // this employee always scolds his manager,
    // but manager don't know about it (private method)
    private void insultManager(){
        System.out.println("Bla-Bla_bla about manager ... without him");
    }

    @Override
    public String toString() {
    return "Employee's name is " + firstName + "\nthe position is " + title + "\n" + firstName + "'s salary is " + salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
