class Vehicle{
    private String licensePlate;
    private String brand;
    private double ratePerDay;
    private boolean isAvailable;

    Vehicle(String licensePlate , String brand, int ratePerDay ) {
        this.licensePlate = licensePlate;
        this.brand= brand;
        this.ratePerDay= ratePerDay;
        this.isAvailable = true;
    }

    void displayInfo(){
    System.out.println("Rent of " + brand + " with plate number " + licensePlate + " is " + ratePerDay);
}

    double calculateTotalRent(int days){
        return  ratePerDay * days;
    }

    void rentout(){
        if(isAvailable){
            System.out.println(brand + " has been Rented out ");
            isAvailable=false;
        }
        else{
            System.out.println(brand+ "vehicle unavailable");
        }
    }

    void returnVehicle(){
        isAvailable=true;
        System.out.println(brand+ " has been returned . ");
    }
}


