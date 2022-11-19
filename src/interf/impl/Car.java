package interf.impl;

import interf.InterfaceCar;

public class Car implements InterfaceCar {

    @Override
    public void drive() {
        System.out.println("I can take you from one point to another");

    }

    @Override
    public void printMyModel() {

        System.out.println("I'm a car");
    }
}
