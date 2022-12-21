package streams.tSerializable;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private String country;

    public Address(){

    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
