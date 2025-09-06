package com.devraj.javaoops;

class Vehiclee {
    String numberOfVehicle;
    public Vehiclee(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }
    public void honk() {
        System.out.println("Honk!!!!!!!!!!");
    }

    public void printNumberOfVehicle() {
        System.out.println(numberOfVehicle);
    }
}


class Carr extends Vehiclee{
    public Carr(String numberOfCar) {
        super(numberOfCar);
    }

    @Override
    public void honk() {
        System.out.println("Give me way");
    }
}

class Buss extends Vehiclee{
    public Buss(String numberOfBus) {
        super(numberOfBus);
    }
}
public class Poly {
    public static void main(String[] args) {
        Carr car = new Carr("DL01AP4915");
        car.printNumberOfVehicle();
        car.honk();

        Buss bus = new Buss("DL01KA5436");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
