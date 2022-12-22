package tSetCollections.sets;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return Objects.equals(name, child.name) && Objects.equals(age, child.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
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
