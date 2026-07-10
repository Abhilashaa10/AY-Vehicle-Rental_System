package models;

public class Bike extends Vehicle {
    boolean hasCarrier;

    public Bike(String licensePlate, String brand, double ratePerDay){
        super(licensePlate, brand, ratePerDay);
        this.hasCarrier= hasCarrier;
    }

    @Override
    public double calculateTotalRent(int days){
        double baseCost = ratePerDay* days;
        return  baseCost;
    }
}
