package cbBeginOOP.startOOP.interf;

import cbBeginOOP.startOOP.interf.impl.Car;
import cbBeginOOP.startOOP.interf.impl.SuperCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceCar infCar = new Car();
        infCar.printMyModel();
        infCar.drive();

        InterfaceCar superCar = new SuperCar();
        superCar.printMyModel();
        superCar.drive();

        //we can implement one Interface in different classes
        //depending on which data we get
        //create a variable type of Interface:
        InterfaceCar car1;

        //from console we are getting 2 types of data
        System.out.println("Please Enter 'car' or 'super'");
        Scanner scanner = new Scanner(System.in);
        String car = scanner.nextLine();

        //in switch we create or car or supercar object
        switch (car){
            case "car":
                car1 = new Car();
                car1.printMyModel();
                car1.drive();
                break;
            case "super":
                car1 = new SuperCar();
                car1.printMyModel();
                car1.drive();
                break;
            default:
                System.out.println("default case");
        }

       SuperCar scar = new SuperCar();
       scar.makeSomeNoise();
    }
}
