package BeginOOP.StartOOP.interf.impl;

import BeginOOP.StartOOP.interf.InterfaceCar;
import BeginOOP.StartOOP.interf.InterfaceNoise;

public class SuperCar implements InterfaceCar, InterfaceNoise {
    @Override
    public void drive() {
        System.out.println("I can drive so fast");

    }

    @Override
    public void printMyModel() {
        System.out.println("I'm a super car");

    }
    public void makeSomeNoise(){
        System.out.println("Really GOOD SuperCar's Noise!!!");
    }
}
