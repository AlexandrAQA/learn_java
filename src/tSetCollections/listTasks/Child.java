package tSetCollections.listTasks;

public class Child {

    private String name;
    private Integer age;

    public Child(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Child(){}

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
