package com.devraj.javaoops;

class Vehicle {
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }
    public void honk() {
        System.out.println("Honk!!!!!!!!!!");
    }

    public void printNumberOfVehicle() {
        System.out.println(numberOfVehicle);
    }
}


class Car extends Vehicle{
    public Car(String numberOfCar) {
        super(numberOfCar);
    }
}

class Bus extends Vehicle {
    public Bus(String numberOfBus) {
        super(numberOfBus);
    }
}
public class Inherit {
    public static void main(String[] args) {
        Car car = new Car("DL01AP4915");
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("DL01KA5436");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
