package models;

public class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String licensePlate , String brand , double ratePerDay , double loadCapacity){
        super(licensePlate,brand, ratePerDay);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public double calculateTotalRent(int days){
        double baseCost = ratePerDay *days;
        double extraCharge = loadCapacity*100;
        return baseCost + extraCharge; //35000

        
    }
}
