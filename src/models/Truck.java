package models;

public class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String licensePlate , String brand , double ratePerDay , double loadCapacity){
        super(licensePlate,brand, ratePerDay);
        this.loadCapacity=loadCapacity;
    }
}
