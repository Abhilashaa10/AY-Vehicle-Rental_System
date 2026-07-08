package models;

public class Car extends Vehicle{

    private int numSeats;

    public Car(String licensePlate , String brand , double ratePerDay , int numSeats ){
        super(licensePlate, brand, ratePerDay);  
        this.numSeats= numSeats;
    }
}