package models;

public class Vehicle{
    private String licensePlate;
    private String brand;
    protected double ratePerDay;
    private boolean isAvailable;

    public Vehicle(String licensePlate , String brand, double ratePerDay ) {
        this.licensePlate = licensePlate;
        this.brand= brand;
        this.ratePerDay= ratePerDay;
        this.isAvailable = true;
    }

    public void displayInfo(){
    System.out.println("Rent of " + brand + " with plate number " + licensePlate + " is " + ratePerDay);
}

    public double calculateTotalRent(int days){
        return  ratePerDay * days;
    }

    public void rentout(){
        
        if(isAvailable){
            System.out.println(brand + " has been Rented out ");
            isAvailable=false;
        }
        else{
            System.out.println(brand+ "vehicle unavailable");
        }
    }

    public void returnVehicle(){
        isAvailable=true;
        System.out.println(brand+ " has been returned . ");
    }

    public double getRatePerDay(){
        return ratePerDay;
    }

    public void setRatePerDay(double ratePerDay){
        if(ratePerDay > 0){
            this.ratePerDay = ratePerDay;
        }
        else{
            System.out.println("Invalid Rate");
        }
    }
}


