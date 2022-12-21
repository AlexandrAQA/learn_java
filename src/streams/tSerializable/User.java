package streams.tSerializable;

import java.io.Serializable;


public class User implements Serializable {
    private String name;
    private String sex;
    public static Integer age = 18;
    private Address address;
    //if Class is not implemented Serializable we can add transient
    //we can write/read this field without implement Serializable
    //but this field always we be NULL
    private transient JobTitle jobTitle;

    public User() {

    }

    public User(String name, String sex, Address address, Integer age, JobTitle jobTitle) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                ", jobTitle=" + jobTitle +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static Integer getAge() {
        return age;
    }

    public static void setAge(Integer age) {
        User.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}