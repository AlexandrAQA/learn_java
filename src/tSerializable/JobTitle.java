package tSerializable;

public class JobTitle {
    private String jobTitle;
    private double salary;
    private Integer yearsOfExperience;

    public JobTitle(String jobTitle, double salary, Integer yearsOfExperience) {
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public JobTitle(){};

    public JobTitle(String jobTitle){};


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
