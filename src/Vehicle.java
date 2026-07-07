class Vehicle{
    private String licensePlate;
    private String brand;
    private double ratePerDay;

    Vehicle(String licensePlate , String brand, int ratePerDay) {
        this.licensePlate = licensePlate;
        this.brand= brand;
        this.ratePerDay= ratePerDay;
    }

    void displayInfo(){
    System.out.println("Rent of " + brand + " with plate number " + licensePlate + " is " + ratePerDay);
}

    double calculateTotalRent(int days){
        return  ratePerDay * days;
    }
}


